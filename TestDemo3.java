//TestDemo3.java
class Test
{
int a, b;
Test ()
{
System.out.println("I am from default Constructor...");
a=10;
b=20;
System.out.println("Value of a: "+a);
System.out.println("Value of b: "+b);
}
};
class TestDemo3
{
public static void main(String [] args)
{
Test t1=new Test ();
}
};

