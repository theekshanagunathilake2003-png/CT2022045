package Q5;

public class Main {

    public static void main(String[] args) {

        Lecturer lecturer1 = new Lecturer("Mr. Fernando", "Object Oriented Programming");

        Course course1 = new Course("Object Oriented Programming", "IT2023", lecturer1);

        Student student1 = new Student("Kamal Perera", "BSc Information Technology", "Object Oriented Programming");

        System.out.println("===== Lecturer Details =====");
        System.out.println("Lecturer Name   : " + lecturer1.getLecturerName());
        System.out.println("Course Teaching : " + lecturer1.getCourseTeaching());

        System.out.println("\n===== Course Details =====");
        System.out.println("Course Name     : " + course1.getCourseName());
        System.out.println("Course Code     : " + course1.getCourseCode());
        System.out.println("Lecturer        : " + course1.getLecturer().getLecturerName());

        System.out.println("\n===== Student Details =====");
        System.out.println("Student Name    : " + student1.getStudentName());
        System.out.println("Degree          : " + student1.getDegreeName());
        System.out.println("Course          : " + student1.getCourseFollowing());

        Lecturer lecturer2 = new Lecturer("Ms. Silva", "Object Oriented Programming");
        course1.setLecturer(lecturer2);

        System.out.println("\n===== After Lecturer Change =====");
        System.out.println("New Lecturer    : " + course1.getLecturer().getLecturerName());

    }

}