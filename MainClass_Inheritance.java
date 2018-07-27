class Parent
{
void fun()
{
System.out.println("I am parents");
}
}
class Child extends Parent
{
void disp(){
System.out.println("I am Child");
}
}
class MainClass_Inheritance
{
public static void main(String arg[])
{
Child obj=new Child();
obj.fun();
obj.disp();
}
}
