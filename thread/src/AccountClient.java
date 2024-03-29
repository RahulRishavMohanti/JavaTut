
public class AccountClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Account account = new Account(5000);
        TransactionThread t1 =
                new TransactionThread(account, TransactionType.CREDIT, "Roger", 2000);
        TransactionThread t2 =
                new TransactionThread(account, TransactionType.CREDIT, "\tAmy", 3500);
        TransactionThread t3 =
                new TransactionThread(account, TransactionType.DEBIT, "\t\tCalvin", 6000);
	
	t3.start();
	try {
		
		Thread.sleep(10);
	}catch(InterruptedException ex) {
		ex.printStackTrace();;
	}
		t1.start();
	t2.start();
	//Join ensures that the caller thread(main) has to wait for the other threads to finish the job
	try {
		t1.join();
		t2.join();
		t3.join();
	}catch(InterruptedException e) {
		e.printStackTrace();
	}
	System.out.println("Final Bal" + account.getBalance());
	}
}
