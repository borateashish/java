 import java.io.*;
import java.util.*;
public class Phonebook
{
public static void main(String args[])
{
Try
{
FileInputStream fis=new FileInputStream("myfile.txt");
Scanner sc=new Scanner(System.in);
Hashtable<String,String> ht=new Hashtable<String,String> ();
String[] strarray;
String a,str;
while(sc.hasNext())
{
a=sc.nextLine();
strarray=a.split("\t");
ht.put(strarray[0],strarray[1]);
System.out.println("hash table values are"+strarray[0]+":"+strarray[1]);
}
Scanner s=new Scanner(System.in);
System.out.println("Enter the name as given in the phone book");
str=s.next();
if(ht.containsKey(str))
{
System.out.println("phone no is"+ht.get(str));
}
else
{
System.out.println("Name is not matched");
}
}
catch(Exception e)
{
System.out.println(e);
}
}
}
