class A
{
A()
{
System.out.println("Default Constructor-Super  Class");
}
A(int i)
{
System.out.println("Over loaded constructor-Super Class");
}
}
class B extends A
{
B()
{
System.out.println("Default Constructor-Sub class");
}
}
public class Example1
{
public static void main(String arg[])
{
B obj=new B();
}
}
 