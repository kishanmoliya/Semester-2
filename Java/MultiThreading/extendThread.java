class study1 extends Thread{
    public void run(){
        int i=0;
        while(i<10){
            System.out.println("I am in classroom...");
            i++;
        }
    }
}
class study2 extends Thread{
    public void run(){
        int i=0;
        while(i<10){
            System.out.println("I am writing a notebook");
            i++;
        }
    }
}

public class extendThread{
    public static void main(String[] args) {
        study1 t1 = new study1();
        study2 t2 = new study2();

        t1.start();
        t2.start();
    }
}