import java.util.Scanner;

class tree
{
	String name;
	String place ;
	String fruits;


	void setdata(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name = ");
		name = sc.next();

		System.out.print("Enter place = ");
		place = sc.next();
		
		System.out.print("Enter fruits = ");
		fruits = sc.next();	
	}

	void display(){
		System.out.print("\n");
		System.out.println("Name = "+name);
		System.out.println("place = "+place);
		System.out.println("fruits = "+fruits);
		System.out.print("\n");
	}
}

class treedemo{
	public static void main(String[] args) {
		tree c1 = new tree();
		c1.setdata();
		c1.display();

		tree c2 = new tree();
		c2.setdata();
		c2.display();


	}
}
