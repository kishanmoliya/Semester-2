import java.util.Random;
import java.util.Scanner;
import java.util.random.*;

class fungame{
    int number;
    int yournum;
    int numOfGuesses = 0;

    public int getnumOfGuesses(){
        return numOfGuesses;
    }

    public void setnumOfGuesses(int numOfGuesses){
        this.numOfGuesses = numOfGuesses;
    }

    fungame(){
        Random ra = new Random();
        this.number = ra.nextInt(100);
    }

    void yourinput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess any number from 1 to 100");
        yournum = sc.nextInt();
    }

    boolean isCorrectNumber(){
        numOfGuesses++;
        if(yournum == number){
            System.out.println("You did it in " +numOfGuesses+" attemps");
            return true;
        }
        else if(yournum < number){
            System.out.println("Too low...");
        }
        else{
            System.out.println("Too high...");
        }
        return false;
    }

}
public class random{
    public static void main(String[] args) {
        fungame f = new fungame();
        boolean b=false;
        while(!b){
            f.yourinput();
            b =f.isCorrectNumber();
        }
    }
}
