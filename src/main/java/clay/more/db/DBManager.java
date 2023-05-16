package clay.more.db;

import clay.more.models.Student;

import java.util.ArrayList;
import java.util.List;

public class DBManager {
    static List<Student> students = new ArrayList<>();

    static {
        students.add(new Student(1L, "Ilyas", "Zhuanyshev", 74, "B"));
        students.add(new Student(2L, "Kuat", "Abylai", 90, "A"));
        students.add(new Student(3L, "Clay", "More", 69, "C"));
        students.add(new Student(4L, "Steven", "Failure", 10, "F"));
        students.add(new Student(5L, "Simba", "Kanglybay", 99, "A"));
        students.add(new Student(6L, "Mark", "Neizvesten", 34, "F"));
    }

    public static List<Student> getStudents(){
        return students;
    }

    public static void addStudent(Student student){
        student.setId(students.size()+1L);
        students.add(student);
    }

    public static Student getStudentById(Long id){
        return students.stream()
                .filter(student -> student.getId() == id)
                .findAny()
                .orElse(null);
    }
}
