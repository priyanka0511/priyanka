class A
{
A()
{
System.out.println("Default Constructor-Super Class");
}
}
class B extends A
{
B()
{
System.out.println("Default Constructor-Sub Class");
}
}
public class Example
{
public static void main(String arg[])
{
B obj=new B();
}
}
