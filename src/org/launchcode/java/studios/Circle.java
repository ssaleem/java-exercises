//https://education.launchcode.org/skills-back-end-java/studios/area/

package org.launchcode.java.studios;

import java.util.Scanner;

public class Circle {
    private double radius = 0;
    private double area = 0;

    private static Scanner input = new Scanner(System.in);

    public Circle(){
        System.out.println("New circle created");
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius() {
        boolean valid = false;
        do{
            System.out.println("Enter circle radius: ");
//            Read stdin only if there a double input
//            prevent type mismatch
            if(input.hasNextDouble()){
                this.radius = input.nextDouble();
//                Retake input if negative input
                if(this.radius >= 0) {
                    valid = true;
                }
            }
            else {
                System.out.println("Radius must be a number!");
                input.next();
            }

        }while(!valid);
    }

    public double getArea(){
        this.area = Math.PI * this.radius * this.radius;
        return this.area;
    }
}
