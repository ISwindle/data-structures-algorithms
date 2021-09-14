package com.techex.datastructures.linear;
import java.util.*;
import java.util.HashSet;

public class hashSet {
    public static void hash() {
        HashSet<String> nameList = new HashSet<String>();
        //Adding elements to HashSet
        nameList.add("Jamal");
        nameList.add("Joey");
        nameList.add("Bob");
        nameList.add("John");
        //Print elements in HashSet
        System.out.println(nameList);
        System.out.println("List contains Jamal or not:" + nameList.contains("Jamal"));
        //Removing items from HashSet
        nameList.remove("John");
        System.out.println("List after removing John" + nameList);

        //Going through all items in hash set
        System.out.println("Iterating over list:");
        Iterator<String> i = nameList.iterator();
        while(i.hasNext())
            System.out.println(i.next());
    }
}
