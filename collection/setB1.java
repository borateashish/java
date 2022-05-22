import java.util.*;
import java.io.*;

class setB1{
	public static void main(String[] args)
 {
  		Scanner s1=new Scanner(System.in);
		Set s = new TreeSet();
		
		System.out.print("Enter no.of integers:");
		int n = s1.nextInt();
		System.out.print("Enter numbers:");
		for(int i = 0; i < n; i++) {
			
			int x = s1.nextInt();
			s.add(x);
		}
		
		Iterator itr = s.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}	
	}
}
