import java.util.Scanner;
class Priyanka
{
public static void main(String args[])
{
Priya obj=new Priya();

obj.fun();
obj.disp();
 
}
}
class Priya
{
int id;
String name;
Scanner scan=new Scanner(System.in);
Priya()
{
System.out.println("BiggBoss");
}
void fun()
{
System.out.println("Enter yor Id:");
id=scan.nextInt();

System.out.println("Enter yor name:");
name=scan.next();
}
void disp()
{
System.out.println("Your id is="+id);
System.out.println("your name is="+name);
}
}