public interface Addition 
{
	int add(int num1,int num2);
}

public interface Substraction 
{
	int sub(int num1,int num2);
}

public interface Calculator extends Addition,Substraction 
{
	void show();
}


public class UseCalculator implements Calculator {

	@Override
	public int add(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1+num2;
	}

	@Override
	public int sub(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1-num2;
	}

	@Override
	public void show() 
	{
		System.out.println("Addition Result:"+add(10,20));
		System.out.println("Substraction Result:"+sub(10,20));
	}
	
	public static void main(String arg[])
	{
		UseCalculator calculator=new UseCalculator();
		
		calculator.show();
	}

}


