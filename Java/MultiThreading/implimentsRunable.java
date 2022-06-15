class myThread1 implements Runnable{
    public void run(){
        int i=0;
        while(i<10){
            System.out.println("Eating chapati...");
            i++;
        }
    }
}
class myThread2 implements Runnable{
    public void run(){
        int i=0;
        while(i<10){
            System.out.println("Eating pizza");
            i++;
        }
    }
}

public class implimentsRunable {
    public static void main(String[] args) {
        myThread1 t1 = new myThread1();
        Thread go1 = new Thread(t1);

        myThread2 t2 = new myThread2();
        Thread go2 = new Thread(t2);

        go1.start();
        go2.start();
    }
}
