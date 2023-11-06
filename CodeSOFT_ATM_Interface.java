import java.util.Scanner;
class User_Bank_Acc{
    String Account_holder_name="Shikhar Pandey";
    String Fathername="Senior Pandey";
     int acc_no=5654546;
     float acc_bal=1500000.0f;
     void Bank_Details(){
         System.out.println ("Account holder name is : "+Account_holder_name);
         System.out.println ("Account holder's father's name is: "+Fathername);
         System.out.println ("Account no. is : >>> " +acc_no);
         System.out.println ("Current account balance is Rs : "+acc_bal);
         System.out.println ("----------------------------------------------------------------------");
    }
    void modify(){
        System.out.print("Enter the details you want to modify >> ");
        System.out.println (" Enter a new name for modify : ");
        Scanner sc2=new Scanner ( System.in );
        float balance = acc_bal;
        String name= sc2.nextLine ();
        System.out.println("The details after modifying : " +" modified balance is "+ balance+ " and name is >> " +name);
        System.out.println ("Note :- You can't modify your account balance without depositing a amount in it ");
        System.out.println ("----------------------------------------------------------------------");
    }
}
public class CodeSOFT_ATM_Interface extends User_Bank_Acc {
     float withdraw;
     float deposit;
     float Check_bal;
     void menu(){
        System.out.println ( "Enter 1 for Withdraw amount :" );
        System.out.println ( "Enter 2 for deposit amount :" );
        System.out.println ( "Enter 3 for Check balance  :" );
        System.out.println ( "Enter 4 for Bank Details :" );
        System.out.println ( "Enter 5 for Modified details :" );
         System.out.println (" Press any other number for Exit");
         System.out.println ("------------------------------------------------------------------------------------------ ");
         System.out.print ("Enter your choice : ");
        Scanner sc = new Scanner ( System.in );
        int opt = sc.nextInt ();
        switch (opt){
            case 1:
                Withdraw();
                break;
            case 2:
                deposit_amount();
                break;
            case 3:
                Check_Balance ();
                break;
            case 4:
                Bank_Details();
                menu ();
                break;
            case 5:
               modify ();
               break;
            default:
                System.out.println ("Thanks for using ATM !");
        }
    }
     void Check_Balance() {
        this.Check_bal=acc_bal;
        System.out.println ( "Your balance is : Rs "+acc_bal );
         System.out.println ("------------------------------------------------------------------------------");
        menu ();
    }
     void deposit_amount() {
        Scanner sc1 = new Scanner ( System.in );
        System.out.print ("Deposited Amount is :"+deposit);
        deposit = sc1.nextFloat ();
        acc_bal = acc_bal + deposit;
        System.out.println ( "Money deposited Successfully , your total balance is : Rs " + acc_bal );
         System.out.println ("------------------------------------------------------------------------------");
        menu ();
    }
     void Withdraw() {
        Scanner sc1 = new Scanner ( System.in );
        System.out.print ("Enter Amount for Withdrawal : Rs "+withdraw);
        withdraw = sc1.nextFloat ();
        if ( withdraw > acc_bal ) {
            System.out.println ( "insufficient Balance" );
            System.out.println ("------------------------------------------------------------------------------");
        } else {
            acc_bal = acc_bal - withdraw;
            System.out.println ("Rs "+ withdraw +" withdrawn successfully , Your Current Balance is Rs : "+acc_bal );
            System.out.println ("------------------------------------------------------------------------------");
            menu ();
        }
    }
    public static void main(String[] args) {
    CodeSOFT_ATM_Interface obj=new CodeSOFT_ATM_Interface ();
    obj.menu ();
    }
}
