public class SyncDemo extends Thread 
{
	
String withDrawOperation[]= {"Enter Pin","Check Balance","Enter Amount","Process Tran","Complete"};

public void run()
{
	Sync.withDraw(withDrawOperation);
}

public static void main(String arg[])
{
	SyncDemo T1=new SyncDemo();
	
	T1.setName("Sunil");
	
	SyncDemo T2=new SyncDemo();
	
	T2.setName("Harish");
	
	T1.start();
	
	T2.start();
}
	
}
