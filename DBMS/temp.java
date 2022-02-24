import java.util.Scanner;
public class temp{
	static float convert(float a)
	{
		float c = (a-32)*(5/9f);
		return c;
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Tampareture in f = ");
		float f = input.nextFloat();

		float ans = convert(f);
		System.out.println("C = "+ans);
	}
}