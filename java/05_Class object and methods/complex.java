class complexnumber{
    double real,img;
    complexnumber(){
       double real;
       double img;
    }
    complexnumber(double r,double i){
        this.real = r;
        this.img = i;
    }
    void displaynumber(){
        System.out.println("Youre no one is = "+real);
        System.out.println("Youre no two is = "+img);
    }
}

public class complex{
    public static void main(String[] args) {
        System.out.println("");
        complexnumber c1 = new complexnumber(5.6 , 8.5);
        complexnumber c2 = new complexnumber(5.3 , 5.9);

        c1.displaynumber();
        c2.displaynumber();

    }
}