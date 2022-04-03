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
        double dist = math.sqrt(math.pow(this.x-mp.x,2)+((Object) math).pow(this.y-mp.y,2));
        return dist;

    }
    public double distance(double x,double y){
        double dist = math.sqrt(math.pow(this.x-x,2)+((Object) math).pow(this.y-y,2));
        return dist;
        
    }
}
public class four{
    public static void main(String[] args) {
        mypoint mp1 = new mypoint();
        mypoint mp2 = new mypoint(1,1);

        System.out.println(mp1.distance(mp2));
    }
}