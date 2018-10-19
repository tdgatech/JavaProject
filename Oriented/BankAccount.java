
public class BankAccount{
	
		private String number;
		private double balance;
		private String customerName;
		private String customerEmailAddress;
		private String customerPhoneNumber;
		public BankAccount(){
			System.out.println("Empty contructor called");
		}
		public BankAccount(String number, double balance, String customerName, String customerEmailAddress, String customerPhoneNumber){
			System.out.println("Account constructor with parameter called");			
			this.number = number;
			this.balance = balance;
			this.customerName = customerName;
			this.customerEmailAddress = customerEmailAddress;
			this.customerPhoneNumber = customerPhoneNumber;
		}
		public void deposit(double depositAmount){
			this.balance += depositAmount;
			System.out.println("Deposit of " + depositAmount + " made. New balance is " + this.balance);
		}
		public void withdrawl(double withdrawlAmount){
			if(balance - withdrawlAmount <= 0){
				System.out.println("Only " + balance + " available. Withdrawal not processed");
			}else{
				this.balance -= withdrawlAmount;
				System.out.println("Withdrawl of " + withdrawlAmount + " processed. Remaining balance = " + this.balance );
			}
		}
		// create getter and setter
		public String getNumber(){
			return number;
		}
		public void setNumber(String number){
			this.number = number;
		}
		public double getBalance(){
			return balance;

		}
		public void setBalance(double balance){
			this.balance = balance;
		}
		public String getCustomerName(){
			return customerName;
		}
		public void setCustomerName(String customerName){
			this.customerName = customerName;
		}
		public String getCustomerEmailAddress(){
			return customerEmailAddress;
		}
		public void setCustomerEmailAddress(String customerEmailAddress){
			this.customerEmailAddress = customerEmailAddress;
		}
		public String getCustomerPhoneNumber(){
			return customerPhoneNumber;
		}
		public void setCustomerPhoneNumber(String customerPhoneNumber){
			this.customerPhoneNumber = customerPhoneNumber;
		}
		public static void main(String[] args){
			BankAccount toanAccount = new BankAccount("12345",0.00,"Toan","myemail@toan.com","404 999 9999");
			toanAccount.withdrawl(100.0);
			toanAccount.deposit(500.00);
			toanAccount.withdrawl(100.00);
			toanAccount.deposit(500.);
			System.out.println(toanAccount.getNumber());
			System.out.println(toanAccount.getBalance());
			System.out.println(toanAccount.getCustomerName());
			System.out.println(toanAccount.getCustomerEmailAddress());
			System.out.println(toanAccount.getCustomerPhoneNumber());
			// toanAccount.setNumber("12345");
			// toanAccount.setBalance(0.00);
			// toanAccount.setCustomerName("Toan");
			// toanAccount.setCustomerEmailAddress("myemail@toan.com");
			// toanAccount.setCustomerPhoneNumber("404 999 999");

		}
	


	
}