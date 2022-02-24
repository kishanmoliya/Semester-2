import java.util.Scanner;
public class Area{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Radius =");
		int r= input.nextInt();
		double area =3.14*r*r;
		System.out.println("Area Of Circle:"+area);
	}
}