// Write a program to print given array in reverse order.
import java.util.Scanner;
public class reverse {
    public static void main(String[] args){
        int a[] = new int[5];
        Scanner sc = new Scanner(System.in);
        

        for(int i=0;i<a.length;i++)
        {
            System.out.print("Enter "+(i+1)+" array elements = ");
            a[i] = sc.nextInt();
        }

        System.out.print("Array elements = ");      // This is a Optional loop
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }

        System.out.print("\nReverse Array elements ");
        for(int i=a.length-1;i>=0;i--)
        {
            System.out.print(a[i]+" ");
        }
    }
}
