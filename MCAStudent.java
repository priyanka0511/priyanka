
/**
* This program is used to show that static data members are
* used to represent those properties which are common to every object. 
* 
*/
class MCAStudent{
//name and rollNo are not common for all students
//so keep them as non-static data members.
String name;
int rollNo;
//As course offered is same for all students
//so keep it as static.
static String courseName = "MCA";

//constructor
MCAStudent(String n, int r){
name = n;
rollNo = r;
}

//display all values
public void display(){
System.out.println("Name = " + name);
System.out.println("RollNo. = " + rollNo);
System.out.println("Course Name = " + courseName);
System.out.println("");
}	
}

public class StaticExample1 {
public static void main(String args[]){
//create object of MCAStudent class.
MCAStudent stu1 = new MCAStudent("jai", 6);
MCAStudent stu2 = new MCAStudent("sunil", 15);

//method call
stu1.display();
stu2.display();
}
}

