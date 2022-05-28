import java.util.Scanner;
public class pattern7{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value of n = ");
		int n = input.nextInt();
		for(int i=n;i>0;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			
			System.out.print("\n");
		}
	}
}

// ****
// ***
// **
// *