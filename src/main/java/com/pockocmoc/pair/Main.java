package com.pockocmoc.pair;

public class Main {
    public static void main(String[] args) {
        Pair<Integer, String> pair1 = new Pair<>(1, "one");
        System.out.println(pair1.first());
        System.out.println(pair1.second());
        System.out.println(pair1);

        Pair<String, Double> pair2 = new Pair<>("hello", 3.14);
        System.out.println(pair2.first());
        System.out.println(pair2.second());
        System.out.println(pair2);
    }
}
