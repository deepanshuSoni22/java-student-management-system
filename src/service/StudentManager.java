package service;

import model.Student;

import java.util.HashMap;
import java.util.Map;

public class StudentManager {
    private Map<Integer, Student> map = new HashMap<>();

    public boolean addStudent(Student s) {
        if (!map.containsKey(s.getId())) {
            map.put(s.getId(), s);
            return true;
        }

        return false;
    }

    public void displayAllStudents() {
        for (Map.Entry<Integer, Student> s : map.entrySet()) {
            System.out.printf("id: %s | name: %s%n", s.getKey(), s.getValue().getName());
        }
    }

}
