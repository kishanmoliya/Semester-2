// Write a program to check that the given number is prime or not.


import java.util.Scanner;
public class prime{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number = ");
        int n = sc.nextInt();

        int k=0;
        for(int i=2;i<=n/2;i++)
        {
            if(n%i!=0)
            k++;
            break;
        }
        if(k==1)
        System.out.print("Number is Prime");

        else
        System.out.print("Number is Not Prime");
    }
}
