import java.util.Scanner;
public class Scannersum{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
    
        System.out.println("Enter number one = ");
        int a = sc.nextInt();

        System.out.println("Enter number two = ");
        int b = sc.nextInt();

        System.out.print("Sum of two Number is = "+(a+b));
    }
}