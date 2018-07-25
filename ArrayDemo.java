import java.util.*;
class ArrayDemo
{
public static void main(String arg[])
{
int array[]=new int[5];
int var1;
Scanner scanner=new Scanner(System.in);
for(var1=0;var1<5;var1++)
{
System.out.println("Enter the value of Array element:"+var1+":");
array[var1]=scanner.nextInt();
}
for(var1=0;var1<5;var1++)
{
System.out.println("Array["+var1+"]="+array[var1]);
}
}
}

