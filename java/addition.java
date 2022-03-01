import java.util.Scanner;
public class addition{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the value of a = ");
		int a = input.nextInt();

		System.out.println("Enter the value of b = ");
		int b = input.nextInt();

		System.out.println("addition = "+(a+b));
	}
}