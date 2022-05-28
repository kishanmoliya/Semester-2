import java.util.Scanner;
public class pattern6{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value of n = ");
		int n = input.nextInt();
		int count=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(count%2);
				count++;
			}
			
			System.out.print("\n");
		}
	}
}


// 1
// 01
// 010
// 1010
// 10101