import java.util.Scanner;
class vowel{
	int totalvowel = 0;
	public vowel(){
		Scanner sc = new Scanner(System.in);
		String k;
		do{
			System.out.print("Enter Sentence = ");
			k = sc.nextLine();
			for(int i=0;i<k.length();i++){
				k = k.toLowerCase();
				if(k.charAt(i) == 'a' || k.charAt(i) == 'e' || k.charAt(i) == 'i' || k.charAt(i) =='o' || k.charAt(i) =='u'){
					totalvowel++;
				}
			}
		}while(!k.equalsIgnoreCase("quit"));
		totalvowel = totalvowel - 2;
		System.out.print("Total vowel = "+totalvowel);
	}
}
public class quitdemo{
	public static void main(String[] args) {
		vowel n = new vowel();
	}
}