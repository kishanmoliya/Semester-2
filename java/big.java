import java.util.Scanner;
public class big{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a = ");
		int a = input.nextInt();	

		System.out.println("Enter b = ");
		int b = input.nextInt();	

		System.out.println("Enter c = ");
		int c = input.nextInt();

		if(a>b && b>c)
		System.out.println("A is larjest");
		else if(b>a && b>c)
		System.out.println("B is larjest");
		else
		System.out.println("C is larjest");	

	}
}