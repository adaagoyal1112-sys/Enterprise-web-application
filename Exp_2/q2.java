package Exp_2;

class Student
{
    private String name;
    int rollno;
    protected double marks;
    public String college;

    Student()
    {
        name="Unknown";
        rollno=0;
        marks=0.0;
        college="Thapar University";
    }

    Student(String name, int rollno, double marks, String college)
    {
        this.name= name;
        this.rollno=rollno;
        this.marks=marks;
        this.college=college;
    }

    public void display()
    {
        System.out.println("Name : "+name);
        System.out.println("Roll no : "+rollno);
        System.out.println("Marks : "+marks);
        System.out.println("College : "+college);
    }
}

public class q2 {
    public static void main(String args[])
    {
        Student s1= new Student();
        Student s2= new Student("Vinayak",3,97.3,"Punjab University");

        System.out.println("Student 1 : ");
        s1.display();

        System.out.println();
          System.out.println("Student 2:");
        s2.display();

        System.out.println();
        System.out.println("Accessing members directly: ");
        System.out.println("Roll no: " + s2.rollno);
        System.out.println("Marks: " + s2.marks);
        System.out.println("College: " + s2.college);
    }
}
