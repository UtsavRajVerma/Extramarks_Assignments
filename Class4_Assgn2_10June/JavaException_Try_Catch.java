package Assignment2;
import java.util.*;

public class JavaException_Try_Catch {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
        try {
            int x=s.nextInt();
            int y=s.nextInt();
            System.out.println(x/y);
        }
        catch(InputMismatchException i){
            System.out.println("java.util.InputMismatchException");        
        }
        catch(ArithmeticException e) {
            System.out.println("java.lang.ArithmeticException: / by zero");
        }
	}
}
