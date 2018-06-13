import java.util.Date;
public class ATM {

private double balance,
withdraw,
deposit;
private int account,
pin;
int index;
    
    public void setAccount(int a){
        account=a;
    }
    
    public void setIndex(int i){
        index=i;
    }
    
    public void setBalance(double b){
        balance = b;
    }
    
    public double getBalance(){    
        return balance;
    }
    
    public void setWithdraw(double w){
        withdraw=w;
    }
    
    public double getWithdraw(){
        balance=(balance-withdraw);
        return balance;
    }
    
    public void setDeposit(double d){
        deposit=d;
    }

    public double getDeposit(){
        balance=(balance+deposit);
        return balance;
    }
    
    public void eMessage(){
        System.out.println("\nPlease Contact Your Financial Advisor!");
        System.out.println("An Error Has Occured With This Transaction");
        System.out.println("Thank You");
        System.out.println("For Using");
        System.out.println("Murphy Banking Inc");
       }
    
    public void receipt(){
        Date date = new Date();
        //System.out.println("\n\n" + date.toString());
        System.out.println("Account: " + account);
        System.out.println("Available Balance: " + balance);
        System.out.println("Thank You");
        System.out.println("For Using");
        System.out.println("Murphy Banking Inc");
       }
}