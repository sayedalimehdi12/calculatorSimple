package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number ");
        String s= sc.nextLine();
        System.out.println("Enter number ");
        String s2= sc.nextLine();
        double a= Double.parseDouble(s);
        double b= Double.parseDouble(s2);
        System.out.println(a+b);

    }
}
