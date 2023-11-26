import java.util.*;
public class Student {
    private int studentId;
    private String firstName;
    private String lastName;
    private ArrayList<Course> courses=new ArrayList<>();

    public Student(int studentId, String firstName, String lastName)
    {
        this.studentId=studentId;
        this.firstName=firstName;
        this.lastName=lastName;
    }
    public int getStudentId()
    {
        return studentId;
    }
    public String getFirstName()
    {
        return firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
    public ArrayList<Course> getCourses()
    {
        return courses;
    }
    public void enroll(Course course)
    {
        if(courses!=null)
        {
            courses.add(course);
        }
    }
    public void aff()
    {
        System.out.println("Id: "+this.getStudentId()+" Full Name: "+this.getFirstName()+" "+this.getLastName()+" enrolled in :");
        for(int i=0;i<courses.size();i++)
        {
            ( (this.getCourses()).get(i) ).aff();
        }
    }
}
