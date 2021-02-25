package com.crunch.util;

import com.crunch.model.User;

import java.util.Arrays;
import java.util.Objects;

public class GymTreeSet extends GymSet{

    private int max_capacity = 10;
    private User users[];
    private int current_occupancy = 0;

    User[] users = new User[max_capacity];


    @Override
    public boolean equals(Object o) {
        try{
            /**
             *
             * Im not really sure how to handle a throwable
             * TODO: How to handle a Throwable;
            **/
            Throwable throwing = new Throwable("Something went wrong");
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            GymTreeSet that = (GymTreeSet) o;
            return max_capacity == that.max_capacity && current_occupancy == that.current_occupancy && Arrays.equals(users, that.users);
        }
        catch(Throwable th  ){
            System.out.println(th.getMessage());
            return false;
        }

    }

    @Override
    public int hashCode() {
        int result = Objects.hash(max_capacity, current_occupancy);
        result = 31 * result + Arrays.hashCode(users);
        return result;
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
        // TODO : Not if to make it say something like NO USERs or something;
        if(this.isEmpty()){
            return "";
        }
        String tempStr = "";

        // go through the array until you hit the last user
        for(int i = 0; i <= current_occupancy ; i++){
            if(i == 0){
                tempStr = users[i].getUsername();
            }
            else {
                tempStr += " " + users[i].getUsername();

            }
        }

        return tempStr;
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
       

        for(int i = 0 ; i <= current_occupancy ; i++){
            for(int j = 1 ; j <=current_occupancy;j++){
             if (users[i] == null || users[j) == null{
                // Something is wrong if there is a null in the tree
                break;
            }
               if(i == j){
               return true;
              }
               if(users[i].getUsername().equals(users[j].getUsername())){
                return true;
               }                             
                                
           
            
        }

        return false;
    }
}
