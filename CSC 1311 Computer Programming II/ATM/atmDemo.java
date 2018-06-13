import java.io.*;
import java.util.StringTokenizer;                                                                                         
import java.util.Scanner;
public class atmDemo {

    public static void main(String[] args)throws IOException {
        int num_acc = 3;
        
        int[] valid_ACCOUNT = new [num_acc];
        int[] valid_PIN = new [num_acc];
        int[] account_BAL = new [num_acc];
        
        int attempt=0,attempt_MAX=3,
        account,pin,option;
        
        double withdraw,deposit,balance;
        
        boolean found = false;
        
        Scanner keyboard = new Scanner(System.in);
        
        
        ATM myATM = new ATM();
        
        System.out.println("Hello\n");
        System.out.println("Welcome to\n");
        System.out.println("Murphy Banking\n");
        System.out.println("\nPlease Slide Your Card");
        
        /** Test the account number **/
        do {
            attempt++;
            if(attempt>attempt_MAX){
                myATM.eMessage();
                System.exit(0);
            }
            
            System.out.print("Enter account number: " );
            account = keyboard.nextInt();
            myATM.setAccount(account);
             for(int index=0; index < valid_ACCOUNT.length; index++){
                if(valid_ACCOUNT[index]==account){
                    System.out.println("Account Found on index '"+ index + "'.");
                    found = true;
                    myATM.setIndex(index);
                }
            }
            
        } while(found == false);
        
        /** Test the pin number **/
        attempt=0;
        found = false;
        do {
           attempt++;
            if(attempt>attempt_MAX){
                myATM.eMessage();
                System.exit(0);
            }
            
            System.out.print("Enter pin number: " );
            pin = keyboard.nextInt();
             //for(int index=0; index < valid_PIN.length; index++){
                if(valid_PIN[myATM.index]==pin){
                    System.out.println("Pin Found on index '"+ myATM.index + "'.");
                    found = true;
                }
            //}
            
        } while(found == false);
        
        myATM.setBalance(account_BAL[myATM.index]);
        
        while(true){
               System.out.println("\n\nMain menu\n");
               System.out.println("1:Balance Inquiry\n");      
               System.out.println("2:Withdraw\n");
               System.out.println("3:Deposit\n");
               System.out.println("4:Quit\n");

               System.out.print("Select a Menu: ");
               option=keyboard.nextInt();
               
               switch(option){
                
                case 1:
                System.out.println("\nAccount balance is "+ myATM.getBalance());
                break;
                
                case 2:
                System.out.println("Available Balance = " + myATM.getBalance());
                System.out.print("Enter amount to withdraw: ");
                withdraw=keyboard.nextDouble();
                myATM.setWithdraw(withdraw);
                
                if(myATM.getBalance()>withdraw){
                    myATM.getWithdraw();
                }
                else{
                    System.out.println("\nInsuffient Funds!");
                }
                System.out.println("New Balance = " + myATM.getBalance());
                break;
                
                case 3:
                System.out.println("Available Balance = " + myATM.getBalance());
                System.out.print("Enter amount to deposit: ");
                deposit=keyboard.nextDouble();
                myATM.setDeposit(deposit);
                myATM.getDeposit();
                System.out.println("New Balance = " + myATM.getBalance());
                break;
                
                case 4:
                char receipt;
                System.out.println("Would You like a receipt?");
                System.out.print("Yes or No: ");
                receipt=keyboard.next().charAt(0);
                
                if(receipt=='y'){
                    myATM.receipt();
                    System.exit(0);
                }else{
                    System.out.print("Thank You for Using Murphy Banking Inc!");
                    System.exit(0);
                }
                break;
                
                default:System.out.println("\nInvalid option. Re-Select your Choice.");
            }
        }
    }
}   
