package com.company;

public class Demo {
    public static void main(String[] args) {
        int firstNum=12,secNum=45,thirdNum=60;
        if(firstNum>secNum && firstNum>thirdNum)
        {
            System.out.println(firstNum+" is the largest number");
        }
        else if(secNum>firstNum && secNum>thirdNum) {
            System.out.println(secNum+" is the largest number");
                    }
        else
        {
            System.out.println(thirdNum+" is the largest number");
        }
    }
}
