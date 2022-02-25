import java.util.Scanner;
public class area{
	float circlearea(int a)
	{
		float c = 3.14f*a*a;
		return c;
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter redius");
		int r = input.nextInt();
		area obj1 = new area();
		float ans = obj1.circlearea(r);
		System.out.print("Ans a Circle = "+ans);

	}
}