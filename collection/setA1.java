import java.util.*;

class setA1{
  public static void main(String[] args) {
    ArrayList<String> cities = new ArrayList<>();
  Scanner s1=new Scanner(System.in);
  System.out.println("Enter a number of cites you want :");
  int n=s1.nextInt();
  System.out.println("Enter city names :");
for (int i=0;i<n;i++)
{  
     
       String input=s1.next();
    cities.add(input);
}

    System.out.println("ArrayList of cities : " + cities); 
  cities.removeAll(cities);
    System.out.println("After Removing all elements");
    System.out.println("Updated ArrayList of cities: " + cities);

  }
}
