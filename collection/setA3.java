import java.util.*;  
class setA3{  
   public static void main(String args[]){  
  
      TreeSet<String> al=new TreeSet<String>();  
        Scanner s1=new Scanner(System.in);

 
while(true)
{
System.out.println("1.Create Treeset\n2.Display treeset\n3.Exit");
 System.out.println("Enter your choice: ");
 int choice=s1.nextInt();
  switch(choice)
{
 case 1:
  	System.out.println("Enter a number of colors :");
  	int n=s1.nextInt();
        System.out.println("\nEnter the colors :");
	for (int i=0;i<n;i++)
	{  
       	String input=s1.next();
    	al.add(input);
	} 
  	break;
 case 2:
	System.out.println("TreeSet of colors: " + al);
	break;
 case 3:
         System.exit(0);

}
}
}}
