public class BankAccount {
    private int minBalance;
    private int balance;
    private String owner;
 
    public String getOwner() {
       return owner;
    }
    public void setOwner(String owner) {
	this.owner = owner;
    }
	
	  //only recives a number bigger than minbalance
    public BankAccount(int balance, int minBalance, String owner) {
        this.balance = balance;
        this.minBalance = minBalance;
        this.owner = owner;
    }
    public void state_balance1(BankAccount acct ) {
    	System.out.println("Balnace of " + acct.getOwner() + ": " +acct.getBalance());
    } 
    public boolean withdraw(int amount, BankAccount acct1) {
        if (balance - amount < minBalance) {
        	System.out.println("error, an account reached the minimum amout of money allowed, cannot complete transfer");
        	return false;
        }
        else{
        	balance = balance - amount;
            return true;
        }
    }
    public void deposit(int amount, BankAccount acct1) {
        balance = balance + amount;
    }
    public boolean transfer(BankAccount acct_target, int amount, BankAccount acct) {
    	if(acct.withdraw(amount, acct)==false) {
    		return false;
    	}
    	else {
    		acct_target.deposit(amount, acct);
    		System.out.println("transfer completed");
    		return true;
    	}
    } 
    public int getBalance() {
        return balance;
    }
    public int getMinBalance() {
	return minBalance;
    }
    public void setMinBalance(int minBalance) {
	 this.minBalance = minBalance;
    }
    public void setBalance(int balance) {
	if(balance>minBalance) {
	    this.balance = balance;
        }	
    }

}
