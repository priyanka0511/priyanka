public class ChildThread extends Thread 
{	
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(Thread.currentThread().getName()+":::"+i);
		}
	}
	
	public static void main(String arg[])
	{
		
		ChildThread T1=new ChildThread();
		
		ChildThread T2=new ChildThread();
		
		T1.setName("F-Thread");
		
		T2.setName("S-Thread");
		
		System.out.println("State of the T1:"+T1.isAlive());
		
		System.out.println("State of the T2:"+T2.isAlive());
		
		T1.start();
		
		T2.start();

		System.out.println("State of the T1 After Start:"+T1.isAlive());
		
		System.out.println("State of the T2 After Start:"+T2.isAlive());
		
	}
}
