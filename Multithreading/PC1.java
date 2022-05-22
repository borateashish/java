class Buffer
{
	int value;
	boolean produced=false;
	public synchronized void produce(int x)
	{
		if(produced)
		{
			System.out.println("producer enter monitor out of turn..suspend.....");
			try
			{
				wait();
		}
		catch(Exception e)
		{}
		}
		value=x;
		System.out.println(value+"is produced");
		produced=true;
		notify();
	}
public synchronized void consume()
{
		if(! produced)
		{
				System.out.println("consumer enterd the monitor out of turn,suspend......");
		try{
			wait();
		}catch(Exception e)
		{}
	}
	System.out.println(value+"is consumed");
	produced=false;
	notify();
	}
}
class Producer extends Thread
{
	Buffer buffer;
	public Producer(Buffer b)
	{
		buffer =b;
	}
	public void run()
	{
		System.out.println("producer started ,producing value........");
		for(int i=1;1<=10;i++)
		buffer.produce(i);
	}
	}
class Consumer extends Thread
{
	Buffer buffer;
	public Consumer(Buffer b)
	{
		buffer =b;
	}
	public void run()
	{
		System.out.println("consumer started,consuming value.......");
		for(int i=1;i<=10;i++)
		buffer.consume();
	}
}
class PC1
{
public static void main(String arr[])
{
	Buffer b=new Buffer();
	Producer p=new Producer(b);
	Consumer c=new Consumer(b);
	p.start();
	c.start();
}
}
