package com.crunch.util;

import com.crunch.model.User;

public class GymArrayList extends GymList{
    protected User[] array;

    @Override
    // Get User at index i of the internal array
    public User get(int i) {
        return array[i];
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
    public void order() {

    }

    @Override
    public int indexOf(User u) {
        return 0;
    }
}
