class count
{
    static int k=0;
    count(){
        k++;
    }
    void objprint(){
        System.out.println("Object = "+k);
    }
}

public class object_count{
    public static void main(String[] args) {
        count c1 = new count();
        count c2 = new count();
        count c3 = new count();
        count c4 = new count();
        c4.objprint();
    }
}