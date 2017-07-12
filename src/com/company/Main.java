package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("Welcome to Grand Circus' Room Detail Generator");
        System.out.println();
        System.out.println("Enter Length");


        Scanner scan = new Scanner(System.in);

                double length = 0.0;
                double width = 0.0;
                double area = 0.0;
                double perimeter = 0.0;

        System.out.println("Please enter a number:");
        length = scan.nextInt();
        scan.nextLine();

        System.out.println("Please enter a number:");
        width = scan.nextInt();
        scan.nextLine();

        System.out.println("Please enter a number:");
        area = scan.nextInt();
        scan.nextLine();

        System.out.println("Please enter a number:");
        perimeter = scan.nextInt();
        scan.nextLine();

        //processing

        double result = 2*length + 2*width;

        //output

        System.out.println("The area is " +area);
        System.out.println("The Perimeter is " +perimeter );

    }
}
