public class RunnableDemo implements Runnable 
{

	@Override
	public void run() 
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(Thread.currentThread().getName()+":::"+i);
		}
		
	}
	
	public static void main(String arg[])
	{
		RunnableDemo runnableTarget=new RunnableDemo();
		
		Thread myThread1=new Thread(runnableTarget);
		
		Thread myThread2=new Thread(runnableTarget);
		
		myThread1.start();
		
		myThread2.start();
		
	}
	
}
