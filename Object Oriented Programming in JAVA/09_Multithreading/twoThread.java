class a1 implements Runnable{
	public void run(){
		int i=0;
		while(i<=10){
			System.out.println("Good Morning");
			try{
				Thread.sleep(1000);
			}catch(Exception e){
				System.out.println(e);
			}
			i++;
		}
	}
}
class a2 implements Runnable{
	public void run(){
		int i=0;
		while(i<=10){
			System.out.println("Good Afternoon");
			try{
				Thread.sleep(3000);
			}catch(Exception e){
				System.out.println(e);
			}
			i++;
		}
	}
}

public class twoThread{
	public static void main(String[] args){
		a1 a = new a1();
		a2 b = new a2();
		Thread t1 = new Thread(a);
		Thread t2 = new Thread(b);

		t1.start();
		t2.start();
	}
}