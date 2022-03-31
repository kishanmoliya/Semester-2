class count
{
    static int k=7;
    count(int k){
        this.k=k;                           //if we not write this then ans is 7 alse 0;
    }
    void print(){
        System.out.println("The value of k is = "+k);
    }
}

public class this_use{
    public static void main(String[] args) {
        int k=0;
        count c1 = new count(k);    
        c1.print();
    }
}