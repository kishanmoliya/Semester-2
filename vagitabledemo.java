import java.util.Scanner;
abstract class vegetable{
 	abstract String tostring();
 }
 class potato extends vegetable{
 	public String tostring(){
 		return "Yellow";
 	}
 }
 class bringle extends vegetable{
 	public String tostring(){
 		return "Purple";
 	}
 }
 class tomato extends vegetable{
 	public String tostring(){
 		return "Red";
 	}
 }

 public class vagitabledemo{
 	public static void main(String[] args){
 		Scanner sc = new Scanner(System.in);
 		System.out.print("Enter the vagetable Name =  ");
 		String vegetable = sc.nextLine();

 		vegetable v = null;

 		switch(vegetable){
 			case "potato":
 			 v = new potato();
 			 break;
 			case "bringle": 
 			v = new bringle(); 
 			break;
 			case "tomato": 
 			v = new tomato();
 			break;
 		}
 		System.out.print("Color = "+v.tostring());
 	}
 }


