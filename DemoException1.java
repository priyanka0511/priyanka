class DemoException1
{
public static void main(String arg[])
{
int a[]=new int[2];
try
{
a[0]=11;
a[1]=12;
a[2]=14;//size of array only two elements
a[45]=23;
System.out.println(a[45]);
}
catch(Exception eobj)
{
//System.out.println(eobj);
eobj.printStackTrace();//detai information about the exception
}
}
