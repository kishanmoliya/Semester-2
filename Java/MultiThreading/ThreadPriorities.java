class myThread1 extends Thread{
    public myThread1(String name){
        super(name);
    }
    public void run(){
        int i=1;
        while(i<20){
            System.out.println("Follow me..."+this.getName());
            i++;
        }
    }
}
public class ThreadPriorities {
    public static void main(String[] args) {
        myThread1 t1 = new myThread1("Kishan");
        myThread1 t2 = new myThread1("Karan");
        myThread1 t3 = new myThread1("Uttam");
        myThread1 t4 = new myThread1("Rohan");
        myThread1 t5 = new myThread1("Yash");

        t1.setPriority(Thread.MAX_PRIORITY);
        t4.setPriority(Thread.NORM_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
