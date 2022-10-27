package com.company;

public class Project3 {
    public static void main(String[] args) {
        testEvenOrOdd(23);
    }

    public static void testEvenOrOdd(int x) {
        if (x % 2 == 0) {
            System.out.println("It is an even number");
        } else {
            System.out.println("It is an odd number");
        }
    }
}
