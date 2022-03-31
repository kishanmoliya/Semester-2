import java.util.Scanner;
class circle
{
    double r;
    double circle_area(){
        return 3.14*r*r;
    }
}

class circle_areademo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of circle = ");
        circle c1 = new circle();
        c1.r = sc.nextDouble();

        System.out.println("Circle area = "+c1.circle_area());
    }
}