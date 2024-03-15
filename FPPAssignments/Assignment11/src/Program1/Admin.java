package Program1;

import java.util.*;

public class Admin {
    public static HashMap<Key, Student> processStudents(List<Student> students) {
        HashMap<Key, Student> studentMap = new HashMap<Key, Student>();
        for (Student student : students) {
            Key key = new Key(student.getFirstName(), student.getLastName());
            studentMap.put(key, student);
        }
        return studentMap;
    }

    public static double computeAverageGPA(HashMap<Key, Student> maps) {
        double gpaSum = 0;
        for (Map.Entry<Key, Student> entry : maps.entrySet()) {
            gpaSum += entry.getValue().getGpa();
        }
        return gpaSum / maps.size();
    }
}
