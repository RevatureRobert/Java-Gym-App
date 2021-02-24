package com.crunch;

import com.crunch.model.User;
import com.crunch.util.GymLinkedList;

public class GymLinkedListTestClass {
    public static void main (String[] args) throws Exception {
        GymLinkedList gls = new GymLinkedList();
        System.out.println("Testing isempty()");
        System.out.println(gls.isEmpty());
        System.out.println("Testing size()");
        System.out.println(gls.size());
        User u = new User("bob","pass","555-12345","bob@bobmail.com");
        System.out.println("Testing add()");
        gls.add(u);
        System.out.println("Testing tostring()");
        System.out.println(gls.toString());
        System.out.println("Testing isempty()");
        System.out.println(gls.isEmpty());
        System.out.println("Testing size()");
        System.out.println(gls.size());
        System.out.println("Testing clear()");
        gls.clear();
        System.out.println("Testing isempty()");
        System.out.println(gls.isEmpty());
        System.out.println("Testing size()");
        System.out.println(gls.size());
        User u2 = new User("bob2","pass","555-12345","bob@bobmail.com");
        gls.add(u);
        gls.add(u2);
        System.out.println("Testing tostring()");
        System.out.println(gls.toString());
        System.out.println("Testing isempty()");
        System.out.println(gls.isEmpty());
        System.out.println("Testing size()");
        System.out.println(gls.size());
        System.out.println("Testing remove()");
        gls.remove(u);
        System.out.println("Testing isempty()");
        System.out.println(gls.isEmpty());
        System.out.println("Testing size()");
        System.out.println(gls.size());
        System.out.println("Testign Indexof");
        gls.add(u);
        System.out.println(gls.indexOf(u));
        System.out.println(gls.indexOf(u2));
        User u3 = new User("bob3","pass","555-12345","bob@bobmail.com");
        System.out.println(gls.indexOf(u3));
        gls.clear();
        System.out.println(gls.indexOf(u));
    }
}
