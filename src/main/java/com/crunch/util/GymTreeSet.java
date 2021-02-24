package com.crunch.util;

import com.crunch.model.User;

public class GymTreeSet extends GymSet{

    private int max_capacity = 10;


    User users[max_capacity];



    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @Override
    public User get(Object o) {

        return null;
    }

    @Override
    public void add(User u) throws Exception {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void remove(Object o) {

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
        return null;
    }

    @Override
    boolean isEmpty() {
        return false;
    }

    @Override
    protected void clear() {

    }

    @Override
    protected boolean checkDuplicates() {
        return false;
    }
}
