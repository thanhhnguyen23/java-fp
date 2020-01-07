package com.pragprog.fp.collections;

import java.util.ArrayList;
import java.util.List;

public class Transform {

    public static void main(String[] args) {
        Friends friends = new Friends();

        final List<String> uppercaseNames = new ArrayList<>();

//        transformImperatively(friends, uppercaseNames);

        transformDeclaratively(friends);
    }

    private static void transformDeclaratively(Friends friends) {
        friends.retrieveList().stream()
                // count number of letters in each name
                .map(name -> name.length())
                .forEach(count -> System.out.println(count + " "));

                // upercasenames
//                .map(name -> name.toUpperCase())
//                .forEach(name -> System.out.println(name + " "));
    }

    private static void transformImperatively(Friends friends, List<String> uppercaseNames) {
        for(String name : friends.retrieveList()){
            uppercaseNames.add(name.toUpperCase());
        }
    }
}
