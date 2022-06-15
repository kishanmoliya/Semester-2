class even extends Thread{
	public void run(){
		int i=1;
		while(i<=20){
			if(i%2==0){
				System.out.println("Even No = "+i);
				try{
					Thread.sleep(1000);
				}catch(Exception e){
					System.out.println(e);
				}
			}
			i++;
		}
	}
}
class odd extends Thread{
	public void run(){
		int i=1;
		while(i<=20){
			if(i%2!=0){
				System.out.println("Odd No = "+i);
				try{
					Thread.sleep(3000);
				}catch(Exception e){
					System.out.println(e);
				}
			}
			i++;
		}
	}
}

public class oddThread{
	public static void main(String[] args){
		even e = new even();
		odd o = new odd();
		
		e.start();
		o.start();
	}
}