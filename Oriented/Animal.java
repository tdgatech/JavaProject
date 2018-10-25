public class Animal{
	private String name;
	private int brain;
	private int body;
	private int size;
	private int weight;
	public Animal (String name, int brain, int body, int size, int weight){
		this.name = name;
		this.brain = brain;
		this.body = body;
		this.size = size;
		this.weight = weight;
	}
	// create a method eat and move then extend in dog class
	public void eat(){
		System.out.println("Animal.eat() called");

	}
	public void move(){

	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public int getBrain(){
		return brain;
	}
	public void setBrain(int brain){
		this.brain = brain;
	}
	public int getBody(){
		return body;
	}
	public void setBody(int body){
		this.body = body;
	}
	public int getSize(){
		return size;
	}
	public void setSize(int size){
		this.size = size;
	}
	public int getWeight(){
		return weight;
	}
	public void setWeight(){
		this.weight = weight;
	}
	public static void main(String[] args){
		Animal animal = new Animal("Animal", 1, 1, 5, 5);
		Dog dog = new Dog("Lulu", 8, 20, 2, 4, 1, 20, "long silky");
		dog.eat();
		dog.chew();
	}
}
// Inheritance another class in java

