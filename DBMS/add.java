import java.util.Scanner;
public class add{
	static int sum(int x,int y)
	{
		int c = x+y;
		return c;
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value of a = ");
		int a = input.nextInt();

		System.out.println("Enter the value of b = ");
		int b = input.nextInt();

		int ans = sum(a,b);
		System.out.print("Sum of two number is = "+ans);

	}
}