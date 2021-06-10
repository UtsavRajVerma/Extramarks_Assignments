package Assignment2;

	import java.util.*;
	
	 class MyCalculator {
	    /*
	    * Create the method long power(int, int) here.
	    */
	        long power(int x,int y)throws Exception{
	        if(x<0 || y<0){
	            throw new Exception("n or p should not be negative.");
	        }
	        else if(x==0 && y==0){
	            throw new Exception("n and p should not be zero.");
	        }
	            return (long) Math.pow(x,y);
	    }
	}

	public class Java_Exception_Handling2 {
	    public static final MyCalculator my_calculator = new MyCalculator();
	    public static final Scanner in = new Scanner(System.in);
	    
	    public static void main(String[] args) {
	        while (in .hasNextInt()) {
	            int n = in .nextInt();
	            int p = in .nextInt();
	            
	            try {
	                System.out.println(my_calculator.power(n, p));
	            } catch (Exception e) {
	                System.out.println(e);
	            }
	        }
	    }
	}
	
