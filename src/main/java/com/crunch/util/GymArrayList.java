package com.crunch.util;

import com.crunch.model.User;

public class GymArrayList extends GymList {
    protected User[] array;
    protected int currentIndex = 0;

    public GymArrayList() {
        array = new User[0];
    }

    public GymArrayList(User[] array) {
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

    // removes any element of the internal array that matches o by making a new array of reduced size without those elements
    public void remove(Object o) {
        int removalIndex = -1;
        // number of items removed
        int removalCount = 0;
        boolean loop = true;
        User[] modArray = array;
        User[] result = array;
        do {
            for (int i = removalIndex+1; i < array.length; i++) {
                // check if this is last loop
                if (i == array.length-1) {
                    loop = false;
                }
                if (array[i].equals(o)) {
                    removalIndex = i;
                    removalCount++;
                    break;
                }
            }
            if(true){
                result = new User[result.length-removalCount];
                System.arraycopy(modArray, 0, result, 0, removalIndex-removalCount+1);
                System.arraycopy(modArray, removalIndex-removalCount+2, result, removalIndex-removalCount+1, array.length-1);
            }
        } while(loop);
        array = result;
    }

    @Override
    public User next() {
        if (array[currentIndex + 1] != null) {
            return array[currentIndex + 1];
        }
        return null;
    }

    @Override
    public User previous() {
        if (array[currentIndex - 1] != null) {
            return array[currentIndex - 1];
        }
        return null;
    }

    public void nextIndex() {
        if (array[currentIndex + 1] != null && (currentIndex + 1) < array.length) {
            currentIndex++;
        }
    }

    public void previousIndex() {
        if (array[(currentIndex - 1)] != null && (currentIndex - 1) > 0) {
            currentIndex--;
        }
    }

    @Override
    public String toString() {
        String[] strings = getStringArray();
        String result = "";
        for (String s : strings) {
            result.concat(s+System.getProperty("line.separator"));
        }
        return result;
    }

    @Override
    boolean isEmpty() {
        for (User eachUser : array) {
            if (eachUser != null) {
                return false;
            }
        }
        return true;
    }

    @Override
    protected void clear() {
        for (int i = 0; i < array.length; i++) {
            array[i] = null;
        }
    }


    @Override
    public void order() {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].getUsername().compareTo(array[j].getUsername()) > 0) {
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
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(u)) {
                return i;
            } else {
                return -1;
            }
        }

        return -1;
    }

    // returns the array
    public Object[] toArray() {
        return array;
    }

    // returns a String array of the .toString() of each element
    public String[] getStringArray(){
        String[] result = new String[array.length];
        for (int i = 0; i < array.length; i++){
            result[i] = array[i].toString();
        }
        return result;
    }
}
