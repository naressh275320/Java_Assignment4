package SchoolManagementSystem;
import java.util.*;

// Class managing a list of students
class StudentList {
    private List<Student> students;

    public StudentList() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public void displayStudentDetails() {
        for (Student student : students) {
            System.out.println("Student ID: " + student.getStudentId() + ", Name: " + student.getName() + ", Grade: " + student.getgrade());
        }
    }
}