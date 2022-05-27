// Write a program to accept a line and check how many consonants and vowels are there in line.

import java.util.Scanner;
public class Vowels {
        public static void main(String[] args){    
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the String = ");
        String s1 = sc.nextLine();
        String lower = s1.toLowerCase();

        int vowels=0,consonant=0;
        for(int i=0;i<lower.length();i++)
        {
           // char ch = lower.charAt(i);
            if(lower.charAt(i)=='a' ||lower.charAt(i)=='e' ||lower.charAt(i)=='i' ||lower.charAt(i)=='o' ||lower.charAt(i)=='u')
            {
                vowels++;
            }
            else
            {
                consonant++;
            }
        }
        System.out.println("Consonant in your String = "+consonant);
        System.out.println("Vowels in your String = "+vowels);

    }
}
