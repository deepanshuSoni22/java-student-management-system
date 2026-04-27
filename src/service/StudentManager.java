package service;

import model.Student;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class StudentManager {
    private static final Map<Integer, Student> map = new HashMap<>();

    public boolean addStudent(Student s) {
        if (!map.containsKey(s.getId())) {
            map.put(s.getId(), s);
            return true;
        }

        return false;
    }

    public boolean removeStudent(int id) {
        if (map.containsKey(id)) {
            map.remove(id);
            return true;
        }
        return  false;
    }

    public boolean updateStudent(int id, String name) {
        if (map.containsKey(id)) {
            map.get(id).setName(name);
            return true;
        }

        return false;
    }

    public Map<Integer, Student> getAllStudents() {
        return Collections.unmodifiableMap(map);
    }

}
