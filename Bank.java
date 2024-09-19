package hello;

class Bank {
	private int balance = 500;
	private int minBalance = -100;
	
	public Bank() {
		
	}

    public Bank(int balance, int minBalance) {
        this.balance = balance;
        this.minBalance = minBalance;
    }

	public int getBalance() {
		return balance;
   }

    public boolean withdraw(int amount) {
    	if (balance - amount < minBalance)
            return false;
        balance = balance - amount;
        return true;
    }
    
    public void deposit(int amount) {
        balance = balance + amount;
    }
    
    public boolean transfer(Bank target, int amount) {
        if (withdraw(amount) == false)
            return false;
        target.deposit(amount);
	  return true;
    }


	
}

