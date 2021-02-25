package com.crunch.util;

import com.crunch.model.User;

public abstract class GymArrayListTest {
    public static void testArray() {

        GymArrayList al = new GymArrayList();

        User kevin = new User("Kevin");
        User luke = new User("Luke");
        User mikayla = new User("Mikayla");
        User nate = new User("Nate");
        User noel = new User("Noel");
        User ronald = new User("Ronald");
        User steven = new User("Steven");

        System.out.println("ArrayList is empty: " + al.isEmpty() + "\n");

        al.add(ronald);
        al.add(steven);
        al.add(kevin);

        printArray(al);

        System.out.println("ArrayList is empty: " + al.isEmpty() + "\n");

        al.add(nate);
        al.add(noel);
        al.add(luke);
        al.add(mikayla);

        printArray(al);

        al.remove(noel);

        printArray(al);


        al.order();

        printArray(al);

        System.out.println(al);

        al.clear();

        // Can't print null values
        //System.out.println(al);
    }

    public static void printArray(GymArrayList al) {

        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i) + ",\tIndex = " + al.indexOf(al.get(i)));
        }

        System.out.println("Size: " + al.size() + "\n");
    }
}
