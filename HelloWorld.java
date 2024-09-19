package hello;


public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World!!! ");
		
		Bank LisaAccount = new Bank(1000,-1000);
		Bank BobAccount = new Bank(1000,-1000);
		
        System.out.println("Lisa sum:");
        System.out.println(LisaAccount.getBalance());
        System.out.println("Bob sum:");
        System.out.println(BobAccount.getBalance());
        
       // boolean success = LisaAccount.withdraw(1500);
      //  System.out.println("success=" + success + ", balance=" + LisaAccount.getBalance());
        

      //  BobAccount.deposit(500);
      //  System.out.println("balance=" + BobAccount.getBalance());
        
        
        boolean DidItWork = LisaAccount.transfer(BobAccount, 500);
        System.out.println("Did it work?:" + DidItWork);
        
        DidItWork = BobAccount.transfer(LisaAccount, 500);
        System.out.println("Did it work?:" + DidItWork);
        
        System.out.println("Lisa new sum:");
        System.out.println(LisaAccount.getBalance());
        System.out.println("Bob new sum:");
        System.out.println(BobAccount.getBalance());
        
        
        DidItWork = LisaAccount.transfer(BobAccount, 1600);
        System.out.println("Did it work?:" + DidItWork);
        
        DidItWork = BobAccount.transfer(LisaAccount, 1600);
        System.out.println("Did it work?:" + DidItWork);
        
        System.out.println("Lisa 2nd new sum:");
        System.out.println(LisaAccount.getBalance());
        System.out.println("Bob 2nd new sum:");
        System.out.println(BobAccount.getBalance());

	}

}
