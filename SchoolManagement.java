// Problem Statement:
// Design a system to manage students and teachers in a school.

// Classes:
// Base Class: Person (attributes like name and age)
// Subclasses: Student (attributes like studentId and grade), Teacher (attributes like employeeId and subject)
// Methods:
// A method to display details for each person.

class Person{
    private String name;
    private int age;
    public Person(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void display(){
        System.out.println("Name :"+getName()+" Age :"+getAge());
    }
       
     
}
class Student extends Person{
    private int studentId;
    private double grade;
    public Student(String name,int age,int studentId,double grade){
        super(name,age);
        this.studentId=studentId;
        this.grade=grade;
    }
    public int getStudentId(){
        return studentId;}
    public double getGrade(){
        return grade;
    }
    public void display(){
        super.display();
        System.out.println("StudentId : "+getStudentId()+", Grade :"+getGrade());

}
}
class Teacher extends Person{
    private int employeeId;
    private String subject;
    public Teacher(String name,int age,int employeeId,String subject){
        super(name,age);
        this.employeeId=employeeId;
        this.subject=subject;
    }
    public int getEmployeeId(){
        return employeeId;

    }
    public String getSubject(){
        return subject;
    }
    public void display(){
        super.display();
        System.out.println("EmployeeId : "+getEmployeeId()+", Subject :"+getSubject());

}

}
public class SchoolManagement{
    public static void main(String args[]){
        Student s=new Student("John",20,1,85.5);
        s.display();
        Teacher t=new Teacher("Teacher1",35,587,"Maths");
        t.display();

    }

}