class Overload
{
void disp()
{
System.out.println("Overload");
}
}
class Override extends Overload
{
void disp()
{
System.out.println("Override");
}
}
public static void main()
{
Override o=new Override();
o.disp();
}

