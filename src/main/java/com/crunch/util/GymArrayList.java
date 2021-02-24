package com.crunch.util;

import com.crunch.model.User;

public class GymArrayList extends GymList{
    protected User[] array;

    public GymArrayList(){
        array = new User[0];
    }
    public GymArrayList(User[] array){
        this.array = array;
    }

    @Override
    public User get(Object o) {
        return null;
    }

    // Get User at index i of the internal array
    public User get(int i) {
        return array[i];
    }

    @Override
    public void add(User u) throws Exception {
        User[] newArray = new User[array.length + 1];
        System.arraycopy(array, 0, newArray, 0, array.length);
        // add new element
        newArray[array.length] = u;
        array = newArray;
    }

    // add a User array to the end of the current
    public void add(User[] u) {
        User[] newArray = new User[array.length + u.length];
        System.arraycopy(array, 0, newArray, 0, array.length);
        System.arraycopy(u, 0, newArray, array.length, u.length);
        // add new elements
        array = newArray;
    }

    @Override
    public int size() {
        return array.length;
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
        for (User eachUser: array) {
            if (eachUser != null){
                return false;
            }
        }
        return true;
    }

    @Override
    protected void clear() {
        for(int i = 0; i < array.length; i++){
            array[i] = null;
        }
    }



    @Override
    public void order() {
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i].getUsername().compareTo(array[j].getUsername()) > 0) {
                    User temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    //Returns index of user in array or -1 if user isn't found
    @Override
    public int indexOf(User u) {
        for(int i = 0; i < array.length; i++) {
            if(array[i].equals(u)) {
                return i;
            } else {
                return -1;
            }
        }
    }
}
