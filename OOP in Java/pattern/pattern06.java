import java.util.Scanner;
public class pattern06{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the vslue of n = ");
        int n = sc.nextInt();
        
        for(int i=n;i>0;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(" "+j);
            }
            System.out.print("\n");
        }
    }
}


// 1 2 3 4
// 1 2 3
// 1