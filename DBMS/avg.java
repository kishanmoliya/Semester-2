import java.util.Scanner;
public class avg{
	static float calclute(int x,int y ,int z)
	{
		float c = (float)(x+y+z)/3;
		return c;
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value of a = ");
		int a = input.nextInt();

		System.out.println("Enter the value of b = ");
		int b = input.nextInt();

		System.out.println("Enter the value of c = ");
		int c = input.nextInt();

		float ans = calclute(a,b,c);
		System.out.print("Avarage of three number is = "+ans);

	}
}