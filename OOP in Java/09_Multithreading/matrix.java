import java.util.Scanner;

class Matrix extends  Thread{
	public void run(){
		Scanner sc = new Scanner(System.in);
		System.out.print("How many Row you got M = ");
		int m = sc.nextInt();
		System.out.print("How many column you got n = ");
		int n = sc.nextInt();

		int[][] mat1= new int[m][n];
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				System.out.print("mat1["+i+"]["+j+"] = ");
				mat1[i][j] = sc.nextInt();
			}
		}
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				System.out.print(mat1[i][j]+" ");
			}
			System.out.println();
		}

		int sum = 0;
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				sum = sum+mat1[i][j];
			}
			System.out.format("Addition of %d Row : %d\n",(i+1),sum);
			sum = 0;
		}
	}
}


public class matrix{
	public static void main(String[] args){
		Matrix m = new Matrix();
		m.start();
	}
}
