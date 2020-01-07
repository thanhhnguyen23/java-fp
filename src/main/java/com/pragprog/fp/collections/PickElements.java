package com.pragprog.fp.collections;

import java.util.ArrayList;
import java.util.List;

public class PickElements {
    public static void main(String[] args) {

        Friends friends = new Friends();

        final List<String> startsWithN = new ArrayList<>();

        pickElementsImperatively(friends, startsWithN);
    }

    private static void pickElementsImperatively(Friends friends, List<String> startsWithN) {
        for (String name : friends.retrieveList()) {
            if (name.startsWith("N")) {
                startsWithN.add(name);
            }
        }
        System.out.println(startsWithN);
    }
}
