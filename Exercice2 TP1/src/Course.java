public class Course {
    private int courseId;
    private String courseName;
    private Instructor instructor;

    public Course(int courseId, String courseName, Instructor instructor)
    {
        this.courseId=courseId;
        this.courseName=courseName;
        this.instructor=instructor;
    }
    public int getCourseId()
    {
        return courseId;
    }
    public String getCourseName()
    {
        return courseName;
    }
    public Instructor getInstructor()
    {
        return instructor;
    }
    public void aff()
    {
        System.out.print("course ID: "+this.getCourseId()+" course name: "+this.getCourseName()+" ");
        (this.getInstructor()).aff();
    }
}

