class myThread extends Thread{
    public myThread(String name){
        super(name);
    }
    public void run(){
        int i=7;
        System.out.println("Follow me...");
    }
}
public class threadconstructor {
    public static void main(String[] args) {
        myThread t1 = new myThread("Kishan");
        myThread t2 = new myThread("Sanjay");
        t1.start();
        t2.start();

        System.out.println("The id of the Thread is "+t1.getId());
        System.out.println("The name of the Thrad is "+t1.getName());
        System.out.println("The id of the Thread is "+t2.getId());
        System.out.println("The name of the Thrad is "+t2.getName());
    }
}
