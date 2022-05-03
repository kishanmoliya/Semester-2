import java.util.Scanner;
class mat{
	mat(){
		Scanner sc = new Scanner(System.in);
		System.out.print("How many Row you got M = ");
		int m = sc.nextInt();
		System.out.print("How many column you got n = ");
		int n = sc.nextInt();

		int[][] mat1= new int[m][n];
		for(int i=0;i<=m;i++){
			for(int j=0;j<=n;j++){
				System.out.println("mat1["+i+"]["+j+"] = ");
				mat1[i][j] = sc.nextInt();
			}
		}
	}  
}


public class matrix{
	public static void main(String[] args){
		mat ma = new mat();

	}
}