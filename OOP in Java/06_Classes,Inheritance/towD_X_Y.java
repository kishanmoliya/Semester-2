/*  Design a class named MyPoint to represent a point with x and y-coordinates. The class contains:

i. The data fields x and y that represent the coordinates with getter methods.
ii. A no-arg constructor that creates a point (0, 0).
iii. A constructor that constructs a point with specified coordinates.
iv. A method named distance that returns the distance from this point to a specified point of the MyPoint type.
v. A method named distance that returns the distance from this point to another point with specified x- and ycoordinates */

class mypoint{
    double x,y;

    public mypoint(){
        x=0;
        y=0;
    }
    public mypoint(double x,double y){
        this.x = x;
        this.y = y;
    }
    public double distance(mypoint mp){
        double dist = Math.sqrt(Math.pow(this.x-mp.x,2)+Math.pow(this.y-mp.y,2));
        return dist;

    }
    public double distance(double x,double y){
        double dist = Math.sqrt(Math.pow(this.x-x,2)+Math.pow(this.y-y,2));
        return dist;
        
    }
}
public class towD_X_Y{
    public static void main(String[] args) {
        mypoint mp1 = new mypoint();
        mypoint mp2 = new mypoint(1,1);

        System.out.println(mp1.distance(mp2));
    }
}