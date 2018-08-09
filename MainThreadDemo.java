public class MainThreadDemo 
{
	public static void main(String arg[])
	{
		
		Thread mainThread=Thread.currentThread();
			
		System.out.println("Main Thread Name:"+mainThread.getName());
		
		System.out.println("Main Thread Priority:"+mainThread.getPriority());
		
		mainThread.setName("VitalThread");
		
		mainThread.setPriority(8);
		
		System.out.println("Main Thread Name after Change:"+mainThread.getName());
		
		System.out.println("Main Thread Priority after Change:"+mainThread.getPriority());
		
	}
}

