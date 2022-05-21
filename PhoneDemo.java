                                                                                                                                                       

import java.io.*;
class PhoneDemo
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		File f=new File("phone.txt");
		RandomAccessFile rf=new RandomAccessFile(f,"rw");
		String name=null,contact=null;
		LAB:while(true)
		{
			System.out.println("\n\n1:Search Name and Display Phone number \n2:Add New Name-phone Number pair \n3:Exit");
			System.out.println("Enter Your Choice:");
			int choice=Integer.parseInt(br.readLine());
			switch(choice)
			{
				case 1:
						System.out.println("Enter Name for search :");
						name=br.readLine();
						rf.seek(0);
						String str=null;
						while((str=rf.readLine())!=null)
						{
							String tok[]=str.split("[-]");
							if(tok[0].equals(name))
							{
								System.out.println("Name:"+tok[0]+"  Contact:"+tok[1]);
								continue LAB;
							}
						}
						System.out.println("No Match Found for Given Name:"+name);
						break;
				case 2:
						 System.out.println("Enter Name to Add :");
						 name=br.readLine();
						System.out.println("Enter Contact to Add :");
						contact=br.readLine();
						rf.seek(f.length());
						rf.writeBytes(name+"-"+contact+"\n");
						System.out.println("Details are added Succesfully !!!!");
						break;
				case 3:
						rf.close();
						System.exit(0);
				default:
							System.out.println("Invalid Choice !!!");
			}
		}
	}
}

