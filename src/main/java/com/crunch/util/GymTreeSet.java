package com.crunch.util;

import com.crunch.model.User;

public class GymTreeSet extends GymSet{

    private int max_capacity = 10;
    private int current_occupancy = 0;

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
        if(current_occupancy < max_capacity){
            users[current_occupancy] = u;
        }
    }

    @Override
    public int size() {
        return current_occupancy;
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
        if(users[0] == null){
            return true;
        }
        return false;
    }

    @Override
    protected void clear() {
        users = new User[max_capacity];
        current_occupancy = 0;
    }

    @Override
    protected boolean checkDuplicates() {
        String tempUserName = "";

        for(int i = 0 ; i <= current_occupancy ; i++){
            if (users[i] == null){
                // Something is wrong if there is a null in the tree
                break;
            }
            if ( i == 0){
                tempUserName = users[i].getUsername();
            }
            else {

                if(tempUserName.equals(users[i].getUsername())){
                    return true;
                }
                else {
                    tempUserName = users[i].getUsername();
                }

            }
        }

        return false;
    }
}
