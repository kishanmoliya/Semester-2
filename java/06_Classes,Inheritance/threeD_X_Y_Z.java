import java.util.Scanner;

class myPointThreeD{
    double x,y,z;

    public myPointThreeD(){
        x=0;
        y=0;
        z=0;
    }
    public myPointThreeD(double x,double y,double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public double distanceD(myPointThreeD k){
        double distance = Math.sqrt(Math.pow(this.x-k.x,2)+Math.pow(this.y-k.y,2)+Math.pow(this.z-k.z,2));
        return distance;

    }
}

class setxyz{
    double x,y,z;
    Scanner sc = new Scanner(System.in);

    public double getx(){
        System.out.print("Enter the value of x = ");
        return x = sc.nextDouble();
    }
    public double gety(){
        System.out.print("Enter the value of y = ");
        return y = sc.nextDouble();
    }
    public double getz(){
        System.out.print("Enter the value of z = ");
        return z = sc.nextDouble();
    }
}
public class threeD_X_Y_Z{
    public static void main(String[] args) {
        setxyz se = new setxyz();
        myPointThreeD m = new myPointThreeD();

        myPointThreeD mx = new myPointThreeD(se.getx(),se.gety(),se.getz());
        System.out.printf("Distance (%f, %f, %f) to convert (%f, %f %f) = ",m.x,m.y,m.z,mx.x,mx.y,mx.z);
        System.out.println(m.distanceD(mx));

        myPointThreeD mxy = new myPointThreeD(se.getx(),se.gety(),se.getz());
        System.out.printf("Distance (%f, %f, %f) to convert (%f, %f %f) = ",mx.x,mx.y,mx.z,mxy.x,mxy.y,mxy.z);
        System.out.println(mx.distanceD(mxy));
    }
}