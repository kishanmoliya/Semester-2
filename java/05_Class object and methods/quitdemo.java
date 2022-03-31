import java.util.Scanner;
class quitdemo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		int vowel = 0;
		String str;
		do{
			System.out.print("Enter String = ");
			str = sc.nextLine();

			char ch;
			for(int i=0;i<str.length();i++){
				str = str.toLowerCase();
				ch = str.charAt(i);

				if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
					vowel++;
				}
			}
		}while(!str.equalsIgnoreCase("quit"));
		vowel = vowel-2;
		System.out.print("Number of vowel = "+vowel);
	}
}







// class counter{
// 	static int count = 0;

// 	counter(){
// 		count++;
// 	}
// 	void display(){
// 		System.out.println("Enter string = "+count);
// 	}
// }

// public class quitdemo{
// 	public static void main(String  []args){
// 		counter c1 = new counter();
// 		c1.display();
// 		counter c2 = new counter();
// 		c2.display();
// 		counter c3 = new counter();
// 		c3.display();
// 	}
// }