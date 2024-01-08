package SchoolManagementSystem;
import java.util.*;

// Class representing a school
class School {
    private Map<Course, List<Student>> courseEnrollments;
    private Map<Teacher, List<Course>> teacherSchedules;

    public School() {
        this.courseEnrollments = new HashMap<>();
        this.teacherSchedules = new HashMap<>();
    }

    public void enrollStudent(Student student, Course course) {
        courseEnrollments.computeIfAbsent(course, k -> new ArrayList<>()).add(student);
    }

    public void assignTeacherToCourse(Teacher teacher, Course course) {
        teacherSchedules.computeIfAbsent(teacher, k -> new ArrayList<>()).add(course);
    }

    public void recordGrade(Student student, Course course, int grade) {
        // Implement grade recording logic here
        
    }
}
