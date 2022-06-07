/*  Declare a class called student having following data members:id_no, no_of_subjects_registered, subject_code, 
subject_credits, grade_obtained and spi. Define constructor and calculate_spi methods.Define main to instantiate an array 
for objects of class student to process data of n students to be given as command line arguments. */


import java.util.Scanner;

import javax.xml.transform.SourceLocator;
class student{
    int no_of_subject_registered,id_no,n;
    int[] subject_credit;
    String[] subject_code,gred_obtained;
    double spi,point,total_credit,total_point;

    public void setStudentDdetails(){
        Scanner sc = new Scanner(System.in);
        Scanner ss = new Scanner(System.in);

        System.out.print("Enter Student Id = ");
        id_no = sc.nextInt();
        System.out.print("Enter the number of Subject = ");
        no_of_student_registered = sc.nextInt();

        int n = no_of_subject_registered;

        subject_credit = new int[n];
        subject_code = new String[n];
        gred_obtained = new String[n];

        for(int i=0;i<n;i++){
            System.out.print("Enter the Subject Code = ");
            subject_code[i] = ss.next();

            System.out.print("Enter the Subject Creadit = ");
            subject_credit[i] = sc.nextInt();
            total_credit = subject_credit[i] + total_credit;

            System.out.print("Enter you obtain Grede = ");
            gred_obtained[i] = ss.next();
            gred_obtained[i] = gred_obtained[i].toUpperCase();

            switch(gred_obtained[i]){
                case "A+" -> point = 10;
                case "A"  -> point = 9;
                case "B+" -> point = 8;
                case "B"  -> point = 7;
                case "C+" -> point = 6;
                case "c+" -> point = 5;
            }
            total_point = total_point + (point*subject_credit[i]);
        }

        spi = total_point/total_credit;
    }
    public void printStudentDdetails(){
        System.out.println("-------- Result! --------");
        System.out.println("Student Id = "+id_no);
        System.out.println("Total Subject = "+no_of_student_registered);

        for(int i=0;i<n;i++){
            System.out.println("Subject Credit and grede = "+subject_credit[i] + " " + gred_obtained[i]);
        }

        double cpi = spi;
        System.out.print("CPI = "+cpi+"\n");
        System.out.print("SPI = "+spi);
    }
}

public class SPI {
    public static void main(String[] args) {
        student s = new student();
        s.setStudentDdetails();
        s.printStudentDdetails();
    }
}
