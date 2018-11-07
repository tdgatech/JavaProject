// supper is used to access call the parent class memebr(variable and methods)
// this is used to call the current class member( varibale and method).  This is required when we have a parameter with the same as instance variable (field).
public class ThisMethod{
	private int x;
	private int y;
	private int width;
	private int height;
	// 1st constructor 
	public rectangle(){
		this(0,0); // calls 2nd constructor
	}
	// 2nd constructor 
	public Rectangle (int width, int height){
		this(0,0,width,height);// calls 3rd constructor
	}
	// 3rd constructor
	publics Rectangle (int x, int y, int width, int height){
		//initialize variable
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
}
