/* Create a class named Bank_Account with data memebers accountNo, userName, email, accountType and accountBalance,
   Also create methods getAccountDetails() and displayAccountDetails().
 */

import java.util.Scanner;
class bank_account{
    int accountno;
    String username;
    String email_id;
    String accounttype;
    double accountbalance;

    void getaccountdetails(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter customer account number: ");
        accountno = sc.nextInt();

        System.out.print("Enter customer user name: ");
        username = sc.next();

        System.out.print("Enter customer Email_id: ");
        email_id = sc.next();

        System.out.print("Enter customer account Type: ");
        accounttype = sc.next();

        System.out.print("Enter customer account balance: ");
        accountbalance = sc.nextDouble();
    }
    void displayaccountdetails(){
        System.out.println("");
        System.out.println("\n---------------------  YOURE ACCOUNT DETAILS IS ------------------------------");
        System.out.println("");
        System.out.println("Youre account number is = "+accountno);
        System.out.println("Youre account user name is = "+username);
        System.out.println("Youre account email id is = "+email_id);
        System.out.println("Youre account Type is = "+accounttype);
        System.out.println("Youre account balance is = "+accountbalance);
    }
}
public class bankdemo{
    public static void main(String[] args) {
        bank_account b1 = new bank_account();
        b1.getaccountdetails();
        b1.displayaccountdetails();
    }
}


