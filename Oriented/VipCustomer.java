public class VipCustomer{
	private String name;
	private double creditLimit;
	private String emailAddress;
	public VipCustomer(){
		this("Default name", 100000.00,"default@email.com");

	}
	public VipCustomer(String name, double creditLimit){
		this(name, creditLimit, "unknown@email.com");
	}
	public VipCustomer(String name, double creditLimit, String emailAddress){
		this.name = name;
		this.creditLimit = creditLimit;
		this.emailAddress = emailAddress;

	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public double getCreditLimit(){
		return creditLimit;
	}
	public void setcreditLimit(double creditLimit){
		this.creditLimit = creditLimit;
	}
	public String getEmailAddress(){
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress){
		this.emailAddress = emailAddress;
	}
	public static void main(String[] args){
		VipCustomer person1 = new VipCustomer();
		System.out.println(person1.getName());
		System.out.println(person1.getCreditLimit());
		System.out.println(person1.getEmailAddress());

		VipCustomer person2 = new VipCustomer("Toan", 25000.00);
		System.out.println(person2.getCreditLimit());
		System.out.println(person2.getName());


		VipCustomer person3 = new VipCustomer("Hien", 100.00, "hien@email.com");
		System.out.println(person3.getEmailAddress());
		System.out.println(person3.getName());
		System.out.println(person3.getCreditLimit());

	}
}