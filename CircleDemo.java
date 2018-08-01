public final class FinalVariable
{
final double PI;
public FinalVariable(){
PI=3.141;
}
public final double calcArea(double radius)
{
return PI*radius*radius;
}
}

public class CircleDemo
{
public static void main(String arg[])
{
FinalVariable objFinalVariable=new FinalVariable();
System.out.println("Area of Circle:"+objFinalVariable.calcArea(8));
}
}

 