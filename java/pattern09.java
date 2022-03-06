import java.util.Scanner;
public class pattern09{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the vslue of n = ");
        int n = sc.nextInt();
        
        for(int i=1;n>0;n--)
        {
            if(n)
            for(int k=1;k<=2*n-1;k++)
            {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
