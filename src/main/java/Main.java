public class Main {
	public static void main(String[] args) {
        BankAccount acct1 = new BankAccount(1000, -1000, "Lisa");
        BankAccount acct_target = new BankAccount(1000, -1000, "Bob");
        
        acct_target.state_balance1(acct_target);
    	  acct1.state_balance1(acct1);
    	
    	  acct1.transfer(acct_target, 500, acct1);
    	
        acct_target.state_balance1(acct_target);
    	  acct1.state_balance1(acct1);
    	
    	  acct1.transfer(acct_target, 1600, acct1);
  }
}
