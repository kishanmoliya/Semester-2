import java.util.Scanner;
public class first{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Enter your name = ");
		String name = input.nextLine();	

		System.out.println("Enter your city = ");
		String city = input.nextLine();	

		System.out.println("Enter your class = ");
		String classs = input.nextLine();

		System.out.println("Name = "+name);
		System.out.println("City = "+city);
		System.out.println("Class = "+classs);	

	}
}