// Write a program that creates and initializes a four integer element array. Calculate and display the average of its values.

import java.util.Scanner;
public class Four_int {
    public static void main(String[] args){
        int[] a = new int[4];
        Scanner sc = new Scanner(System.in);
        
        for(int i=0;i<4;i++)
        {
            System.out.printf("Enter the values of %d elements = ",i+1);
            a[i] = sc.nextInt();
        }

        int sum=0;
        for(int i=0;i<4;i++)                    //for(int i:a){
        {                                      //    sum += i;}
            sum += a[i];
        }
        float avg = sum/4.0f;
        System.out.println("Avg = "+avg);
    }
}
