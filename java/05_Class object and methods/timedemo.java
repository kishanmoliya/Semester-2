class time{
	int hour,min,sec;
	time(){
		hour=00;
		min=00;
	}
	time(int x, int y, int z){
		hour=x;
		min=y;
		sec=z;
	}
	void displaydata(){
		System.out.print("\n");
		System.out.println("HOURS : " +hour);
		System.out.println("MINUTE : " +min);
		System.out.println("SECOND : " +sec);
	}
	time addtime(time z){

		time temp=new time();

		temp.sec = sec + z.sec;
		temp.min= min + z.min + (temp.sec/60);
		temp.sec = temp.sec%60;
		temp.hour= hour + z.hour + (temp.min/60);
		temp.min= temp.min%60;

		return temp;
	}
}
class timedemo{
	public static void main(String[] args) {

		time t1= new time(5,25,50);
		t1.displaydata();

		time t2= new time(6,27,20);
		t2.displaydata();


		System.out.println("\n---------------------  ADDITION OF TWO TIME ------------------------------");

		time add= new time();
		add=t1.addtime(t2);
		add.displaydata();
	}
}