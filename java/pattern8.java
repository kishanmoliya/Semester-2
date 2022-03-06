import java.util.Scanner;
public class pattern8{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value of n = ");
		int n = input.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(i==1 || i==n){
				for(int j=1;j<=n;j++){
					System.out.print("*");
				}
				System.out.print("\n");
			}
			else
			{
				for(int j=1;j<=n;j++)
				{
					if(j==1 || j==n)
					{
						System.out.print("* ");
					}
					else
					{
						System.out.print(" ");
					}
				}
				System.out.print("\n");
			}
		}
	}
}