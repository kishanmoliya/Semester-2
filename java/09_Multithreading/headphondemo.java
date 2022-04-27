class MyHeadPhone{
    public static int stoke=5;
    void producer() {
        while (true) {
            stoke++;
            System.out.println("stoke = " + stoke);
            try {
                Thread.sleep((long) Math.random()*300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(stoke>5){
                try {
                    Thread.sleep(800);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    void consumer(){
        while (true) {
            stoke--;
            System.out.println("stoke = " + stoke);
            try {
                Thread.sleep((long) Math.random()*200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(stoke<1){
                try {
                    Thread.sleep(1800);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
class MyProducer extends Thread{
    MyHeadPhone obj = new MyHeadPhone();
    public void run(){
        try {
            obj.producer();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
class MyConsumer extends Thread{
    MyHeadPhone obj = new MyHeadPhone();
    public void run(){
        try {
            obj.consumer();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}


public class headphondemo{
    public static void main(String[] args) {
        MyProducer obj1 = new MyProducer();
        MyConsumer obj2 = new MyConsumer();
        obj1.start();
        obj2.start();
    }
}