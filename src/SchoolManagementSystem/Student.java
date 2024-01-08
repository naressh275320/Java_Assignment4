package SchoolManagementSystem;

// Class representing a student, inheriting from Person
class Student extends Person {
    private int studentId;
    private String grade;

    public Student(String name, int studentId) {
        super(name);
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getgrade() {
        return grade;
    }

    public void setgrade(String grade) {
        this.grade = grade;
    }
}
