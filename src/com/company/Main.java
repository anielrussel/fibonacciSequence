package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int firstTerm = 0;
        int secondTerm = 1;
        System.out.println("FIBONACCI SEQUENCE");

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scan.nextInt();
        System.out.println("The fibonacci of " + num + "th number is:");
        for (int i = 0;i<=num; i++) {
            System.out.println(firstTerm + ", ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
