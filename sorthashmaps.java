    import java.util.*;
    import java.util.Map;  
    import java.util.HashMap;  
    import java.util.TreeMap;  
    import java.util.Iterator;  
    public class sorthashmaps 
    {  
    public static void main(String args[])  
    {  
    Scanner s1=new Scanner(System.in);
    HashMap<Integer, String> hm=new HashMap<Integer, String>();  
    System.out.println("Enter a number of inputs :");
    int n=s1.nextInt();
    for (int i=0;i<n;i++)
{  System.out.println("\nEnter a mobile no :");
       int mno=s1.nextInt();
   System.out.println("\nEnter a Name :");
       String name=s1.next();
    	hm.put(mno, name);
}
   System.out.println("Contact List : " + hm);
  
    Iterator <Integer> it = hm.keySet().iterator();         
    System.out.println("Before Sorting");  
    while(it.hasNext())  
    {  
    int key=(int)it.next();  
    System.out.println("Mob no:  "+key+"     name:   "+hm.get(key));  
    }  
    System.out.println("\n");  
    Map<Integer, String> map=new HashMap<Integer, String>();  
    
    System.out.println("After Sorting");  
    TreeMap<Integer,String> tm=new  TreeMap<Integer,String> (hm);  
    Iterator itr=tm.keySet().iterator();               
    while(itr.hasNext())    
    {    
    int key=(int)itr.next();  
    System.out.println("Mob no:  "+key+"     name:   "+hm.get(key));  
    }    
    }  
    }  
