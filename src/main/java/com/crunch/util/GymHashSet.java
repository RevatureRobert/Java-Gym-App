package com.crunch.util;

import com.crunch.model.User;

import javax.xml.soap.Node;
import java.util.HashSet;

public class GymHashSet extends GymSet{
    //TODO: this class needs and Iterator!!
    private static final int INITIAL_CAPACITY = 8;
    private int size;
    private MyNode<User>[] nodes;


    public GymHashSet(){
        this(INITIAL_CAPACITY);
    }

    public GymHashSet(int capacity){
        this.nodes = new MyNode[capacity];
        this.size = 0;
    }

    public void add(User u) throws Exception{
        int index = u.hashCode() % nodes.length;

        MyNode current = nodes[index];
        MyNode<User> newNode = new MyNode<>(u);

        if(current == null){ // the list is empty
            nodes[index] = newNode;
            size++;
            return;
        }
        while(current.next != null){
            if(current.data.equals(u)){
                return;
            }
            current = current.next;
        }

        if(!current.data.equals(u)){
            current.next = newNode;
            size++;
        }
    }

    /**
     *  curent.data.equals(newNode)
     *  prevNode = currentNode
     *  curentNode = currentNode.next
     *
     */

    @Override
    boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public int size() {
        return this.size;
    }
    //TODO: convert to boolean
    @Override
    public void remove(Object o) {
        int index = o.hashCode() % nodes.length;

        MyNode current = nodes[index];
        MyNode<User> newNode = new MyNode(o);
        MyNode<User> prevNode = null;

        //TODO: provide more semantic messages when converting to boolean
        if(current == null){ // the list is empty
            return;
        }
        while(current.next != null){
            if(current.data.equals(o)){ // current is the node we want to remove
                if(prevNode != null){
                    prevNode.next = current.next;
                }else{
                    current = current.next;
                }
                size--;
                return;
            }
            prevNode = current;
            current = current.next;
        }
        if(!current.data.equals(o)){
            prevNode.next = null;
            size--;
        }


    }

    @Override
    public String toString() {
        return null;
    }


    @Override
    protected void clear() {

    }


    //TODO: Do we need this!?!?!?!
    @Override
    public User get(Object o) {
        return null;
    }

    // TODO: remove from ancestry.com.
    @Override
    protected boolean checkDuplicates() {
        return false;
    }

    @Override
    public User next() {
        return null;
    }

    @Override
    public User previous() {
        return null;
    }
}

class MyNode<T> {
    T data;
    MyNode<T> next;

    public MyNode(T data) {
        this.data = data;
        this.next = null;
    }
}


