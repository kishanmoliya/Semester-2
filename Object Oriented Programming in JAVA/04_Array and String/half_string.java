// Write a program to find length of string and print second half of the string.
import java.util.Scanner;
public class half_string {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string = ");
        String k = sc.nextLine();

        int j = k.length()/2;
        System.out.print("Length of String is = "+k.length());
        System.out.print("\nHalf of the string is = "+k.substring(j));
    }
}
