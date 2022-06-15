import java.util.Scanner;
public class pattern013{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the vslue of n = ");
        int n = sc.nextInt();
        
        for(int i=n;i>0;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(" "+i);
            }
            System.out.print("\n");
        }
    }
}


// 5 5 5 5 5
// 4 4 4 4
// 3 3 3 
// 2 2
// 1