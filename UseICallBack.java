public class UseICallBack implements ICallBack 
{

	@Override
	public void callBack(int value) 
	{
		System.out.println("This is Callback Method Overriding Interface Method:");
		System.out.println("Callback Value:"+value);
	}
	
	public static void main(String arg[])
	{
		UseICallBack callback=new UseICallBack();
		
		callback.callBack(89);
	}
}

