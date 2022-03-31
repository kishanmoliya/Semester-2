import java.util.Scanner;
public class larjest3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a = ");
        int a = sc.nextInt();

        System.out.print("Enter the value of b = ");
        int b = sc.nextInt();

        System.out.print("Enter the value of c = ");
        int c = sc.nextInt();

        if(a>b && b>c)
        System.out.print("a is larjest");

        else if(b>a && b>c)
        System.out.print("b is larjest");

        else
        System.out.print("c is larjest");
    }
}
