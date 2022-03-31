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
        System.out.println("real = "+real);
        System.out.println("img = "+img);
    }

    complexnumber sum_num(complexnumber z){
       complexnumber temp = new complexnumber();

       temp.real = real + z.real;
       temp.img = img + z.img;

       return temp;
    }
}

public class complex{
    public static void main(String[] args) {
        complexnumber c1 = new complexnumber(5.6 , 8.5);
        complexnumber c2 = new complexnumber(5.3 , 5.9);


       

        complexnumber sum = new complexnumber();
        sum = c1.sum_num(c2);
        sum.displaynumber();
    }
}