package com.crunch.util;

import com.crunch.model.User;

public class GymNode {
    private User u;
    private GymNode next;
    private GymNode previous;

    public GymNode(User u) {
        this.u = u;
        this.next = null;
        this.previous = null;
    }
    public GymNode(User u, GymNode next, GymNode previous) {
        this.u = u;
        this.next = next;
        this.previous = previous;
    }

    public User getU() {
        return u;
    }

    public GymNode getNext() {
        return next;
    }

    public GymNode getPrevious() {
        return previous;
    }

    public void setU(User u) {
        this.u = u;
    }

    public void setNext(GymNode next) {
        this.next = next;
    }

    public void setPrevious(GymNode previous) {
        this.previous = previous;
    }
}
