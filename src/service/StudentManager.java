package service;

import model.Student;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class StudentManager {
    private static final Map<Integer, Student> map = new HashMap<>();

    private static final String FILE_NAME = "tasks.txt";

    private void saveToFile() {
        try (FileWriter fw = new FileWriter(FILE_NAME)) {
            for (Map.Entry<Integer, Student> entry : map.entrySet()) {
                Integer id = entry.getKey();
                String student = entry.getValue().getName();
                // write id and name separated by comma; change fields as needed
                fw.write(id + ", " + student + System.lineSeparator());
            }
        } catch (IOException e) {
            System.out.println("Error writing to file!");
        }
    }


    public boolean addStudent(Student s) {
        if (!map.containsKey(s.getId())) {
            map.put(s.getId(), s);
            saveToFile();
            return true;
        }

        return false;
    }

    public boolean removeStudent(int id) {
        if (map.containsKey(id)) {
            map.remove(id);
            saveToFile();
            return true;
        }
        return  false;
    }

    public boolean updateStudent(int id, String name) {
        if (map.containsKey(id)) {
            map.get(id).setName(name);
            saveToFile();
            return true;
        }

        return false;
    }

    public Map<Integer, Student> getAllStudents() {
        return Collections.unmodifiableMap(map);
    }

}
