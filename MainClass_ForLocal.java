class LocalVar
{
int l,b,r;
void addition()
{
l=12;
b=20;
r=l*b;
}
void disp()
{
System.out.println("result"+r);
}
}
class MainClass_ForLocal
{
public static void main(String ar[])
{
LocalVar lob=new LocalVar();
lob.addition();
lob.disp();
}
}
