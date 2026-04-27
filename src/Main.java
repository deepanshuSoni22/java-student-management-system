import model.Student;
import service.StudentManager;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("RUDRI");
        Student s2 = new Student("RAJU");
        Student s3 = new Student("JOHN");
        Student s4 = new Student("BATISTA");

        StudentManager studentManager = new StudentManager();

        studentManager.addStudent(s1);
        studentManager.addStudent(s2);
        studentManager.addStudent(s3);
        studentManager.addStudent(s4);

        studentManager.displayAllStudents();

    }
}