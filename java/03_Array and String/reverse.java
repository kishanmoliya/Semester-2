
import java.util.Scanner;
public class reverse {
    public static void main(String[] args){
        int a[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array elements = ");

        for(int i=0;i<a.length;i++)
        {
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
