import java.io.Console;
import java.util.ArrayList;
import java.util.List;

public class Student extends Person
{
    int graduationYear;
    boolean enrolled = false;
    
    void enrollStudent() 
    {
        enrolled = true;
    }
    
    @Override
    public void sayHello()
    {
        System.out.println("Hello Student "+name);
    }
    
    
    public static Student addStudent(String name, int age, int gradYear, boolean enrolled)
    {
        Student newStudent = new Student();
        newStudent.name = name;
        newStudent.age = age;
        newStudent.graduationYear = gradYear;
        if(enrolled)
        {    
            newStudent.enrollStudent();
        }
        return newStudent;
    }
    
    public static void main(String[] args)
    {
        
        List<Student> studentList = new ArrayList<Student>();
                
        studentList.add(addStudent("Michael", 20, 2020, true));
        studentList.add(addStudent("Janice", 32, 2019, false));
        studentList.add(addStudent("Ronald", 19, 2021, false));
                                    
        for (Student s: studentList)
        {
            System.out.println("Name: " + s.name
                            + "\nAge: " + s.age
                            + "\nGraduation Year: " + s.graduationYear
                            + "\nEnrolled? " + s.enrolled);
        }
    }
}
