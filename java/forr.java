import java.util.Scanner;
public class forr{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value of n = ");
		int n = input.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}
}