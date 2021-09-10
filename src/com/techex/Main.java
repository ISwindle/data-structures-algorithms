package com.techex;

import com.techex.algorithms.sort.Bubble;
import com.techex.algorithms.search.Linear;

public class Main {

    public static void main(String[] args) {

        // Check for 0 (0)
        System.out.println(Linear.search(new int[]{}, 5));

        // Check for 1 (1)
        System.out.println(Linear.search(new int[]{5,4,2,1,9,6}, 6));

        // Check for Multiple (3)
        System.out.println(Linear.search(new int[]{5,4,2,1,9,6,5,5}, 5));

        // Check for cases that do not exist
        System.out.println(Linear.search(new int[]{5,4,2,1,9,6,5,5}, 22));

    }
}
