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


// import​ ​java.util.Scanner​; 
//  ​class​ ​Bank_Account
//  ​{ 
//  ​        ​int​ accountNo;
//  ​        ​String​ userName;
//  ​        ​String​ email_id;
//          String accountType;
//          double accountBalance;
  
//  ​        ​void​ ​getAccountDetails() 
//  ​        { 
//  ​                ​Scanner​ sc​=​new​ ​Scanner​(​System​.​in); 
//  ​                ​System​.​out​.​println(​"​Enter customer Account Number:​"​); 
//  ​                accountNo​=​sc​.​nextInt(); 
//  ​                ​System​.​out​.​println(​"​Enter customer Name:​"​); 
//  ​                userName​=​sc​.​next(); 
//  ​                ​System​.​out​.​println(​"​Enter customer email-id:​"​); 
//  ​                email_id​=​sc​.​next();
//             System.out.println("
// Enter  Type of account of customer");
// accountType=​sc​.​next();
// System.out.println("
// Enter  balance of customer");
// accountBalance=​sc​.​nextdouble();

//  ​        } 
//  ​        ​void​ ​displayAccountDetails().
//  ​        { 
//  ​               System​.​out​.​println(​"​Account Number-​"​+​accountNo); 
//  ​                ​System​.​out​.​println(​"​customer Name-​"​+​userName); 
//  ​                ​System​.​out​.​println(​"​Customer Emaul-id-​"​+​email_id); 
//  System​.​out​.​println(​"​Type of Account -​"​+​accountType); 
//  System​.​out​.​println(​"​Balance amount in Account -​"​+​accountBalance,); 
//  ​        } 
//  ​} 
//  ​class​ ​Bank_demo 
//  ​{ 
//  ​        ​public​ ​static​ ​void​ ​main​(​String​[] ​args​)  
//  ​        { 
//  ​                customer c1​=​new​ customer(); 
//  ​                customer c2​=​new​ customer(); 
//  ​                c1​.​setdata(); 
//  ​                 
//  ​                c1​.​displaydata(); 
//  ​                c2​.​setdata(); 
//  ​                c2​.​displaydata(); 
//  ​        } 
//  ​}