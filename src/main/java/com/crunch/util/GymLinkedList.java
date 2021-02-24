package com.crunch.util;

import com.crunch.model.User;
import com.sun.javaws.exceptions.CacheAccessException;
import jdk.nashorn.internal.ir.WhileNode;

public class GymLinkedList extends GymList {

    GymNode head;
    GymNode tail;
    private int size = 0;

    @Override
    public User get(Object s) throws ClassCastException {
        if (!(s instanceof String)) {
            throw new ClassCastException("Expected a username (String), got " + s.getClass());
        }
            if (head == null) {
                return null;
            }
            if (((String) s).equals((head.getU().getUsername()))) {
                return head.getU();
            } else if (head.getNext()== null) {
                return null;
            }
            return get(s, this.head.getNext());
    }

    private User get(Object s, GymNode n) {
        if (n == null) {
            return null;
        }
        if (((String) s).equals((n.getU().getUsername()))) {
            return n.getU();
        } else if (n.getNext()== null) {
            return null;
        }
        return get(s, n.getNext());
    }

    @Override
    public void add(User u) throws Exception {
        if (head == null) {
            head = new GymNode(u);
            tail = head;
        } else {
            if (u.getUsername().equals(head.getU().getUsername())) {
                throw new IllegalArgumentException("User Already Exists");
            }
            GymNode n = head;
            GymNode previous = null;
            while (n.getNext() != null) {
                if (n.getU().getUsername().equals(u.getUsername())) {
                    throw new IllegalArgumentException("User Already Exists");
                }
                n = n.getNext();
            }
            GymNode newNode = new GymNode(u);
            newNode.setPrevious(n);
            tail.setNext(newNode);
            tail = tail.getNext();
        }
        size++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void remove(Object o) {
        if (!(o instanceof User)) {
            throw new ClassCastException("Expected a username (String), got " + o.getClass());
        }
        if (head == null) {
            return;
        }
        if (((User) o).equals((head.getU()))) {
            head = head.getNext();
            if (head!=null) {
                head.setPrevious(null);
            }
            size--;
            return;
        }
        remove(o, this.head.getNext());

    }
    private void remove(Object o, GymNode n) {
        if (n == null) {
            return;
        }
        if (((User) o).equals((n.getU()))) {
            n.getPrevious().setNext(n.getNext());
            n.getNext().setPrevious(n.getPrevious());
            size--;
        } else {
            remove(o, n.getNext());
        }

    }
    @Override
    public User next() {
        return null;
    }

    @Override
    public User previous() {
        return null;
    }

    @Override
    public String toString() {
        if (head == null) {
            return "Empty List";
        }
        StringBuilder returnBuilder = new StringBuilder();
        GymNode n = head;
        do {
            returnBuilder.append(n.getU().getUsername() + "\n");
            n = n.getNext();
        } while(n != null);
        return returnBuilder.toString();
    }

    @Override
    public boolean isEmpty() {
        return head==null;
    }

    @Override
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public void order() {

    }

    @Override
    public int indexOf(User u) {
        int returnvalue = 0;
        if (head ==null) {
            return -1;
        }
        GymNode n = head;
        while (n!=null) {
            returnvalue++;
            if (n.getU().equals(u)) {
                return returnvalue;
            }
            n=n.getNext();
        }
        return -1;
    }
}
