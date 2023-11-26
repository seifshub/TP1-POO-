public class TestUniManSys {
    public static void main(String[]ar)
    {
        Student student1 = new Student(1,"Seif","Chouchane");

        Instructor instructor1 = new Instructor(1,"foulen","ben falten");
        Instructor instructor2 = new Instructor (2, "aziz", "moez");

        Course course1 = new Course(1, "JAVA", instructor1);
        Course course2 = new Course (2, "BDD", instructor2);

        student1.enroll(course1);
        student1.enroll(course2);

        student1.aff();
    }
}
