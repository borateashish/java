import java.io.*;

public class SearchThread extends Thread
{
    File f1;
    String fname;
    static String str;
    String line;
     LineNumberReader reader = null;
    SearchThread(String fname)
    {
        this.fname=fname;
        f1=new File(fname);
    }
    public void run()
    {           
        try
        { 
            FileReader fr=new FileReader(f1);
            reader=new  LineNumberReader(fr);
            while((line=reader.readLine())!=null)
            {
                if(line.indexOf(str)!=-1)
                {
                    System.out.println("string found in "+fname+" at "+reader.getLineNumber()+"line");
                    stop();
                }
            }
        }
        catch(Exception e)
        {
        }
     }       
    public static void main(String[] args) throws IOException
    {
        Thread t[]=new Thread[20];
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter String to search");
        str=br.readLine();
        
        FilenameFilter filter = new FilenameFilter()
        {
            public boolean accept(File file, String name) 
	    {
	            if (name.endsWith(".txt")) 
		    {
	                 return true;
	            }
		    else
	            {
	           	 return false;
        	    }
            }
   	};
 
	File dir1 = new File(".");
	File[] files = dir1.listFiles(filter);
        if (files.length == 0) 
	{
	    System.out.println("no files available with this extension");
   	} 
	else 
        {
     		 for(int i=0;i<files.length;i++)
	         {
           		 for (File aFile : files) 
	                 {
		                t[i]=new SearchThread(aFile.getName());
                		t[i].start();
                         }
      		 }
    	} 
    }
}
