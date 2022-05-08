// Write a program to convert temperature from Fahrenheit to Celsius. (Formula : c = f-32*5/9 )

import java.util.Scanner;
public class f_to_c{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Temprature in Fahenheit = ");
        float f = sc.nextFloat();

        float c = f-32*(5/9f);
        System.out.print("Temperature in Celsius = "+c);
    }
}
