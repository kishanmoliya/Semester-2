class myThread2 extends Thread{
    public void run(){
        int i = 0;
        while(i<35){
            System.out.println("Go whit him...");
            try{
                Thread.sleep(300);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            i++;
        }
    }
}
class myThread3 extends Thread{
    public void run(){
        int i = 0;
        while(i<35){
           System.out.println("Whait...");
           i++; 
        }
    }
}
public class thradMethod {
    public static void main(String[] args) {
        myThread2 t1 = new myThread2();
        myThread3 t2 = new myThread3();
        t1.start();
        t2.start();
    }
}
