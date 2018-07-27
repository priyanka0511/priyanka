class Student{
//instance variable.
int rollNo;
String name; 

Student(String name, int rollNo){
//local variable.
this.name = name;
this.rollNo = rollNo;
} 

public void displayDetails(){
System.out.println("RollNo = " + rollNo);
System.out.println("name = " + name);
}
}

public class ThisExample2 {
public static void main(String args[]){
//creating Student class object.
Student stu1 = new Student("jai", 6);
//method call
stu1.displayDetails();
}
}
