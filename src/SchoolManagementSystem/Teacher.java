package SchoolManagementSystem;

// Class representing a teacher, inheriting from Person
class Teacher extends Person {
    private int teacherId;

    public Teacher(String name, int teacherId) {
        super(name);
        this.teacherId = teacherId;
    }

    public int getTeacherId() {
        return teacherId;
    }
}