package com.company;
public class Date2 {
    public static void main(String[] args) {

        System.out.println("The values of the calculation are:");
        int a = 10, b = 5;
        int addResult=sum(a,b);
        int subResult=difference(a,b);
        int mulResult=multiply(a,b);
        int divResult=divide(a,b);
        System.out.println("The sum is:"+" "+addResult);
        System.out.println("The difference is:"+" "+subResult);
        System.out.println("The product is:"+" "+mulResult);
        System.out.println("The division is:"+" "+divResult);
    }
        public static int sum(int a, int b)
        {
            return a + b;

        }
        public static int difference ( int a, int b)
        {
            return a - b;

        }
        public static int multiply ( int a, int b)
        {
            return a * b;

        }
        public static int divide ( int a, int b)
        {
            return a / b;

        }
    }

