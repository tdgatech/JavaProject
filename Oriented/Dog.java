public class Dog extends Animal{
	private int eyes;
	private int legs;
	private int tail;
	private int teeth;
	private String coat;
	// public Dog (String name, int brain, int body, int size, int weight){// base characteristic 
	// 	super(name,brain,body,size,weight);// is call constructor that is for the class thart we arre exteding form.
	// }
	// remove parameter 
	public Dog (String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat){// base characteristic 
		super(name,1,1,size,weight);// is call constructor that is for the class thart we arre exteding form.
		this.eyes = eyes;
		this.legs = legs;
		this.tail = tail;
		this.teeth = teeth;
		this.coat = coat;
	}

	private void chew(){
		System.out.println("Dog.chew() called");
	}
	@Override
	public void eat(){
		System.out.println("Dog.eat() called");
		super.eat();
	}
}