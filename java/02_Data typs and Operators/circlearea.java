// Write a program to calculate the area of circle

import java.util.Scanner;
public class circlearea {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of r = ");
        float r = sc.nextFloat();

        System.out.println(3.14*r*r);
    }
}
