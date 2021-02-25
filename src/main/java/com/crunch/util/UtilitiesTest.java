package com.crunch.util;

import com.crunch.model.User;

public class UtilitiesTest {
    public static void main(String[] args){
        GymHashSet hashSetTest = new GymHashSet();
        User user = new User("bob");
        User user2 = new User("tracy");
        System.out.println(hashSetTest.isEmpty());
        try{
            System.out.println(hashSetTest.size());
            hashSetTest.add(user);
            System.out.println(hashSetTest.size());
            hashSetTest.add(user); // test duplication
            System.out.println(hashSetTest.size());
//            user.setUsername("phil"); //test if the object is modified if i can be readded
//            hashSetTest.add(user); // throws index out of bounds
//            System.out.println(hashSetTest.size());
            hashSetTest.add(user2);
            System.out.println(hashSetTest.size());
            hashSetTest.remove(user2);
            System.out.println(hashSetTest.size());
            hashSetTest.remove(user);
            System.out.println(hashSetTest.size());


        } catch(Exception e){
            e.printStackTrace();
        }
        System.out.println(hashSetTest.isEmpty());
    }
}
