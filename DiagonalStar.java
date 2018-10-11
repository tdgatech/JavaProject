public class DiagonalStar{
	
	static void print_rectangle(int number){ 
     	if(number < 5){
     		System.out.println("Invalid Value");
     	}    
        for (int i = 1; i <= number; i++){ 
            for (int j = 1; j <= number; j++){ 
                if (i == 1 || i == number || j == 1 || j == number){             
                    System.out.print("*");             
                }else{
                    System.out.print(" ");             
                }
            } 
            System.out.println(); 
        }
        for(int k= 1; k<= 50; k++){
        	System.out.print("-");
        }System.out.printf("\n");
         
       
    }
    public static void printSquareStar(int number) {
		if (number < 5)
		    System.out.println("Invalid Value");
		else {
		    boolean drawStar;

		    for (int row = 1; row <= number; row++) {
		        for (int column = 1; column <= number; column++) {

		            drawStar = false;

		            if (row == 1 || row == number)
		                drawStar = true;
		            else if (column == 1 || column == number)
		                drawStar = true;
		            else if (row == column)
		                drawStar = true;

		            else if (column == (number - row + 1))
		                drawStar = true;

		            if (drawStar)
		                System.out.print("*");
		            else
		                System.out.print(" ");
		        }
		        System.out.println("");
		    }
		    for(int k= 1; k<= 50; k++){
        		System.out.print("-");
        	}System.out.printf("\n");
		}
	} 
    public static void printTriangular(int number){
    	for (int i = 1; i <= number; i++){
    		for(int j = 1; j<=i; j++){
    			System.out.print(" " + j);
    		}System.out.printf("\n");
    	}
    	for(int k= 1; k<= 50; k++){
        	System.out.print("-");
        }System.out.printf("\n");
    }   
    public static void printTriangularChar(char character){
    	// int i = (int) character;
    	// System.out.println(i);
    	for(char i = 'A'; i <= character; i++ ){
    		for(char j = 'A'; j <= i; j++){
    			System.out.print(" " + j);
    		}
    		System.out.printf("\n");
    	}
    	for(int k= 1; k<= 50; k++){
        	System.out.print("-");
        }System.out.printf("\n");
    	// char character = (char) ascii;
    	// for(int i = ascii; )
    	//System.out.println(ascii);
    }
    public static void printTriangularSamneChar(char character){
    	for (char i = 'a'; i <= character; ++i){
    		for(char j = 'a'; j <= i; ++j){

    			System.out.print(" " + 'H');
    		}System.out.printf("\n");
    	}

    }
    
	public static void main(String[] args){
		print_rectangle (5);
		printSquareStar(5);
		printTriangular(5);
		printTriangularChar('D');
		printTriangularSamneChar('h');


	}
} 