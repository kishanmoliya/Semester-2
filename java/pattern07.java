import java.util.Scanner;

public class pattern07 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the vslue of n = ");
        int n = sc.nextInt();
        
        for(int i=1;i<=n;i++)
        {
            if(i==1 || i==n)
            {
                for(int j=1;j<=n;j++)
                {
                    System.out.print("* ");    
                }
                System.out.print("\n");
            }

            else
            {
                for(int k=1;k<=n;k++)
                {
                    if(k==1 || k==n)
                    {
                        System.out.print("* ");
                    }
                    else
                    {
                        System.out.print("  ");
                    }
                }
                System.out.print("\n");
            }
        }
    }
}

// * * * * *
// *       * 
// *       * 
// *       * 
// * * * * *
