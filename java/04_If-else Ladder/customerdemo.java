import java.util.Scanner;

class customer
{
	String name;
	int cid;
	long MobileNo;


	void setdata(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name = ");
		name = sc.next();

		System.out.print("Enter cid = ");
		cid = sc.nextInt();
		
		System.out.print("Enter MobileNo = ");
		MobileNo = sc.nextLong();	
	}

	void display(){
		System.out.print("\n");
		System.out.println("Name = "+name);
		System.out.println("cid = "+cid);
		System.out.println("MobileNo = "+MobileNo);
		System.out.print("\n");
	}
}

class customerdemo{
	public static void main(String[] args) {
		customer c1 = new customer();
		c1.setdata();
		c1.display();

		customer c2 = new customer();
		c2.setdata();
		c2.display();


	}
}
