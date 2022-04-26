interface a{
	public void run();
}
interface a1 extends a{
	public void run1();
}
interface a2 extends a{
	public void run2();
}
abstract class a12 implements a1,a2{
	abstract void demo();
}
class b extends a12{
	public void run(){
		System.out.println("Run a");
	}
	public void run1(){
		System.out.println("Run a1");
	}
	public void run2(){
		System.out.println("Run a2");
	}
	public void demo(){
		System.out.println("Run demo");
	}
}
public class classABC{
	public static void main(String[] args){
		b d= new b();
		d.run(); 
		d.run1();
		d.run2();
	}
}