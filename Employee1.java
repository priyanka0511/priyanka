import java.util.Scanner;
class Depart
{
int did;
String dname;
}
class Employee1 extends Depart
{
int eid;
String ename;
float sal;
Scanner scan=new Scanner(System.in);
void accept()
{
System.out.println("Enter the Department Details like Dname,Did");
dname=scan.nextLine();
did=scan.nextInt();
System.out.println("Enter the Employee Details like eame,eid,sal");
ename=scan.nextLine();
eid=scan.nextInt();
sal=scan.nextFloat();
}
void disp()
{
System.out.println("DID="+did+"\t dname="+dname);
System.out.println("Eid="+eid+"\t ename="+ename+"\t Esalary="+sal);
}
public static void main(String args[])
{
Employee1 obj=new Employee1();
obj.accept();
obj.disp();
}
}

