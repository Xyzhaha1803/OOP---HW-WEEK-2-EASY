/*Simple Class with a Method. Create a class Student with two attributes: name and age. 
Create a method displayInfo() that prints the student's name and age. 
In the main method, create a Student object and call displayInfo(). */

public class Q4{
    public static void main(String[] args){
        Student student = new Student();
        student.displayInfo();
    }
}

class Student{
    String name = "Spongebob";
    int age = 22;

    public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}