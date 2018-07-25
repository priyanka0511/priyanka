import java.util.*;
{
class BiggestDemo
{
public static void main(String arg[])
{
int num1,num2,num3;
Scanner scanner=new Scanner(System.in);
System.out.println("Enter the first value");
num1=scanner.nextInt();
System.out.println("Enter the second value");
num2=scanner.nextInt();
System.out.println("Enter the third value");
num3=scanner.nextInt();
if(num1>num2&&num1>num3)
{
System.out.println("Number1 is biggest");
}
else if(num2>num3)
{
System.out.println("Number2 is biggest");
}
else
{
System.out.println("Number3 is biggest");
}
}
}

  