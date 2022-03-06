import java.util.Scanner;
public class pattern02{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the vslue of n = ");
        int n = sc.nextInt();
        
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<i+i;j++)
            {
                System.out.print(" "+j);
            }
            System.out.print("\n");
        }
    }
}
