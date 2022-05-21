import java.util.*;

class setA2 {
  public static void main(String[] args){
    Scanner s1=new Scanner(System.in);
    LinkedList<String> friends = new LinkedList<>();

     System.out.println("Enter a number of Friends :");
  int n=s1.nextInt();
     System.out.println("Enter names of friends :");
for (int i=0;i<n;i++)
{  
  
       String input=s1.next();
    friends.add(input);
}
 System.out.println("LinkedList of friends: " + friends);
}
}



