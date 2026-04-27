import model.Student;
import service.StudentManager;
import util.ConsoleHelper;

import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        StudentManager studentManager = new StudentManager();

        Scanner sc = new Scanner(System.in);

        while (true) {
            ConsoleHelper.displayOptions();

            System.out.print("Choice ('q' to quit)? ");
            String input = ConsoleHelper.getRawUserInput(sc);

            if (input.equals("q")) {
                System.out.println("End Program!");
                break;
            }

            try {
                int choice = Integer.parseInt(input);

                switch (choice) {
                    case 1:
                        System.out.print("Enter student name: ");
                        String sName = sc.nextLine();
                        Student student = new Student(sName);
                        if (studentManager.addStudent(student)) {
                            System.out.println("Student created successfully!");
                        } else {
                            System.out.println("Failed creating student!");
                        }
                        break;

                    case 4:
                        System.out.println("Displaying all students...");
                        System.out.println("\n" + "-".repeat(15) + "\n");
                        Map<Integer, Student> students = studentManager.getAllStudents();
                        for (Map.Entry<Integer, Student> s : students.entrySet()) {
                            System.out.printf("id: %d | name: %s%n", s.getKey(), s.getValue().getName());
                        }
                        System.out.println("\n" + "-".repeat(15) + "\n");
                        break;

                    default:
                        System.out.println("Invalid Choice. Please enter a correct option!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid Choice. Please Try again!");
            }

        }

    }
}