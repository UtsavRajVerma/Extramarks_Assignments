package Assignment2;
import java.util.*;

public class List {

	public static void main(String[] args) {
		        Scanner s=new Scanner(System.in);
		        int n=s.nextInt();
		        ArrayList<Integer> list=new ArrayList<>();
		        
		        while(n-->0) {
		            list.add(s.nextInt());
		        }
		        
		        int q=s.nextInt();
		        
		        while(q-->0) {
		            String temp=s.next();
		            if(temp.equals("Insert")) {
		                int idx=s.nextInt();
		                int val=s.nextInt();
		                list.add(idx, val);
		            }
		            else {
		                list.remove(s.nextInt());
		            }
		        }
		        for(int i=0;i<list.size();i++){
		            System.out.print(list.get(i)+" ");
		        }
		    }
		}