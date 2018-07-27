class Display {
int a, b;

//default constructor.
Display(){
//call two parameter constructor using this.
this(10, 20);
System.out.println("Default Constructor called.");
} 

//one parameter constructor.
Display(int num1){
//call two parameter constructor using this.
this(num1, 40);
System.out.println("one parameter constructor called.");
} 

//two parameter constructor.
Display(int num1, int num2){
a = num1;
b = num2;
System.out.println("two parameter constructor called.");
} 

//method to display values.
public void display(){
System.out.println("a = " +a);
System.out.println("b = " +b);
}
}

public class ThisExample7 {
public static void main(String args[]){
//call default constructor.
Display obj1 = new Display();
obj1.display();

//call one parameter constructor.
Display obj2 = new Display(30);
obj2.display();

//call two parameter constructor.
Display obj3 = new Display(50, 60);
obj3.display();
}
}

