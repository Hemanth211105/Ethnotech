class Balance{
    private int balance;
    public void setbalance(int balance){
        this.balance=balance;
    }
    int getbalance(){
        return balance;
    }
    public void deposit(int amount ){
        balance+=amount;
    }
    int depositedbalance(){
        return balance;
    }
    public void withdrawl(int amount){
        balance-=amount;
    }
    int withdrawlbalance(){
        return balance;
    }
}
public class CheckBalance {
    public static void main(String args[]){
        Balance bal=new Balance();
        bal.setbalance(2000);
        System.out.println("Total Amount: "+bal.getbalance());
        bal.deposit(1000);
        System.out.println("Amount after deposited : "+bal.depositedbalance());
        bal.withdrawl(500);
        System.out.println("Amount after Withdrawl : "+bal.withdrawlbalance());

    }
}
