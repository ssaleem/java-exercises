//https://education.launchcode.org/skills-back-end-java/studios/area/
package org.launchcode.java.studios;

import java.util.Scanner;

public class Area {
//    make it a class field so is it reusable
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        final double PI = 3.14;
        double radius = 0;
        double area = 0;
        boolean valid = false;
        do{
            System.out.println("Enter a radius: ");
//            Read stdin only if there a double input
//            prevent type mismatch
            if(input.hasNextDouble()){
                radius = input.nextDouble();
//                Retake input if negative input
                if(radius >= 0) {
                    valid = true;
                }
            }
            else {
                System.out.println("Radius must be a number!");
                input.next();
            }

        }while(!valid);

        area = PI * radius * radius;
        System.out.println("The area of a circle of radius " + radius + " is: " + area);
    }
}
