package com.pragprog.fp.collections;

import java.util.ArrayList;
import java.util.List;

public class Transform {

    public static void main(String[] args) {
        Friends friends = new Friends();

        final List<String> uppercaseNames = new ArrayList<>();

        for(String name : friends.retrieveList()){
            uppercaseNames.add(name.toUpperCase());
        }
    }
}
