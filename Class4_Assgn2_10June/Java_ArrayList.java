package Assignment2;
import java.util.*;

public class Java_ArrayList {
	    public static void main(String[] args) {
	        Scanner s=new Scanner(System.in);
	        int n=s.nextInt();
	        
	        ArrayList<ArrayList<Integer>> nums=new ArrayList<>();
	        
	        for(int i=0;i<n;i++) {
	            nums.add(new ArrayList<>());
	            int d=s.nextInt();
	            for(int j=0;j<d;j++) {
	                nums.get(i).add(s.nextInt());
	            }
	        }

	        int q=s.nextInt();
	        for(int z=0;z<q;z++){
	            int x=s.nextInt();
	            int y=s.nextInt();
	            
	            try{
	                System.out.println(nums.get(x-1).get(y-1));
	            } 
	            catch(Exception e){
	              System.out.println("ERROR!");  
	            } 
	        }
	    }
	}
