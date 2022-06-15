/* The marks obtained by a student in 5 different subjects are input through the keyboard. 
The student gets a division as per the following rules:
I. Percentage above or equals to 60-first division
II. Percentage between 50 to 59-second division
III. Percentage between 40 and 49-Third division
IV. Percentage less than 40-fail
Write a program to calculate the division obtained by the student. */

import java.util.Scanner;
public class studentdivision{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter youre OOP subject mark's = ");
        int OOP = sc.nextInt();

        System.out.print("Enter youre DBMS subject mark's = ");
        int DBMS = sc.nextInt();

        System.out.print("Enter youre OAT subject mark's = ");
        int OAT = sc.nextInt();

        System.out.print("Enter youre WD subject mark's = ");
        int WD = sc.nextInt();

        System.out.print("Enter youre CP subject mark's = ");
        int CP = sc.nextInt();

        float percentage = (OOP + DBMS + OAT + WD + CP)/5;

        System.out.println("Youre perccentage is = "+percentage);

        if(percentage<40)
        System.out.print("Fail");

        else if(percentage>=40 && percentage<50)
        System.out.println("Third Division");

        else if(percentage>=50 && percentage<60)
        System.out.println("Second Division");

        else 
        System.out.println("First division");

    }
}