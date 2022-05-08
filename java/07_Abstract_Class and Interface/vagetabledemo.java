/*  The abstract vegetable class has three subclasses named Potato, Brinjal and Tomato. Write a java program that 
demonstrates how to establish this class hierarchy. Declare one instance variable of type String that indicates the color of a 
vegetable. Crete and display instances of these objects. Override the toString() method of object to return a string with the 
name of vegetable and its color.
 */ 

import java.util.Scanner;
abstract class Vegetable {
	String color;
	abstract String tostring();
}

class Potato extends Vegetable{
	public String tostring(){
		color = "Skin";
		return color;
	}
}
class Brinjal extends Vegetable{
	public String tostring(){
		color = "Purple";
		return color;
	}
}
class Tomato extends Vegetable {
	public String tostring(){
		color = "Red";
		return color;
	}
}

public class vagetabledemo{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		System.out.print("Vegetable Name : ");
		String veg = input.next();

		Vegetable v=null;

		switch(veg){
			case "Potato":
				v = new Potato();
				break;
			case "Brinjal":
				v = new Tomato();
				break;
			case "Tomato":	
				v = new Tomato();
				break;
		}
		
		System.out.println(veg + "'s color is " + v.tostring());
	}
}

// abstract class vegetable{
//     String color;
//     abstract public String toString();
// }
// class potato extends vegetable{
//     public String toString(){
//         color = "Potato's color is Yellow";
//         return color;
//     }
// }
// class bringle extends vegetable{
//     public String toString(){
//         color = "Bringle's color is Purpal";
//         return color;
//     }
// }
// class tomato extends vegetable{
//     public String toString(){
//         color = "Tomato's color is Red";
//         return color;
//     }
// }

// class vagetabledemo{
//     public static void main(String[] args) {
//         potato p = new potato();
//         bringle b = new bringle();
//         tomato t = new tomato();

//         System.out.println(p.toString());
//         System.out.println(b.toString());
//         System.out.println(t.toString());
//     }
// }