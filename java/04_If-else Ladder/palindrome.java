import java.util.Scanner;
public class palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number = ");
        int n = sc.nextInt(),a=0;

        for(int i=n;i>0;)
        {
            a=(a*10)+(i%10);
            i=i/10;
        }
        if(n==a)
        System.out.print("Number is Palindrome");

        else
        System.out.print("Number is not Palindrome");
    }
}
