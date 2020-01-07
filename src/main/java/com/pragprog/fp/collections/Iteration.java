package com.pragprog.fp.collections;

public class Iteration{
    public static void main(String[] args) {
        Friends friends = new Friends();

        friends.retrieveList();

        // traditional for-loop
        System.out.println("traditional for-loop: ");
        System.out.println("----------------------");
        for(int i = 0; i < friends.retrieveList().size(); i++){
            System.out.println(friends.retrieveList().get(i));
        }

        System.out.println("\nenhanced for-loop: ");
        System.out.println("----------------------");
        for(String name : friends.retrieveList()){
            System.out.println(name);
        }

        System.out.println("\nlambda forEach() method: ");
        System.out.println("-------------------------");
        friends.retrieveList().forEach(System.out::println);
    }

}
