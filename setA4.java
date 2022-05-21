import java.util.*;
class setA4{
	public static void main(String args[])
	{
		
		Hashtable<Integer, String> ht1 = new Hashtable<>();
        Scanner s1=new Scanner(System.in);
 System.out.println("Enter a number of contacts :");
  int n=s1.nextInt();
       
for (int i=0;i<n;i++)
{  System.out.println("\nEnter a mobile no :");
       int mno=s1.nextInt();
   System.out.println("\nEnter a Name :");
       String name=s1.next();
    	ht1.put(mno, name);
}
	


		System.out.println("Contact List : " + ht1);
	}
}

