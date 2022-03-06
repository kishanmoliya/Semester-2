import java.util.Scanner;
public class pattern5{
	public static void main(String[] args){
		// Scanner input = new Scanner(System.in);
		// System.out.println("Enter the value of n = ");
		// int n = input.nextInt();
		// int count=1;
		for(int i=65;i<=69;i++)
		{
			for(int j=65;j<=i;j++)
			{
				System.out.print((char)+j);
				
			}
			
			System.out.print("\n");
		}
	}
}