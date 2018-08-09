public class Sync
{
	public synchronized static void withDraw(String operations[])
	{
		for(int i=0;i<operations.length;i++)
		{
			
			try 
			{
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
			
			System.out.println(Thread.currentThread().getName()+":::"+operations[i]);
		}
	}
}

