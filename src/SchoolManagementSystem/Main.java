package SchoolManagementSystem;

import java.util.*;

public class Main{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Create students
        // Student student1 = new Student("John Doe", 1);
        // Student student2 = new Student("Jane Doe", 2);

        // Create teachers
        Teacher teacher1 = new Teacher("Mr. Smith", 101);
        Teacher teacher2 = new Teacher("Ms. Johnson", 102);

        // Create courses
        //Course mathCourse = new MathCourse("Math 101", 1);
        //Course scienceCourse = new ScienceCourse("Science 101", 2);

        // Create a school
        School school = new School();

        while(true){
            System.out.println("\n--- School Management System ---");
            System.out.println("1) Enrollig students into course");
            System.out.println("2) Assign teachers to courses");
            System.out.println("3) Record grades");
            System.out.println("4) Display student details");
            System.out.println("5) Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    // Enroll students in courses
                    System.out.println("Enter student name: ");
                    String name = scanner.next();
                    System.out.println("Enter student ID: ");
                    int ID = scanner.nextInt();
                    
                    Student student1 = new Student(name, ID);

                    System.out.println("Enter Math course name: ");
                    name = scanner.next();
                    System.out.println("Enter Math course ID: ");
                    ID = scanner.nextInt();
                    Course mathCourse = new MathCourse(name, ID);
                    
                    
                    System.out.println("Enter Science course name: ");
                    name = scanner.next();
                    System.out.println("Enter Science course ID: ");
                    ID = scanner.nextInt();
                    Course scienceCourse = new ScienceCourse(name, ID);
                    
                    school.enrollStudent(student1, mathCourse);
                    school.enrollStudent(student1, scienceCourse);
                    break;
                    
                case 2:
                    // Assign teachers to courses
                    
                    //school.assignTeacherToCourse(teacher1, mathCourse);
                    //school.assignTeacherToCourse(teacher2, scienceCourse);
                    break;

                case 3:
                    
                    break;

                case 4:
                    // Display student details
                    StudentList studentList = new StudentList();
                    //studentList.addStudent(student1);
                    //studentList.addStudent(student2);
                    studentList.displayStudentDetails();
                    break;
                
                case 5:
                    System.out.println("Thank you for using our warehouse. Come again!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            System.exit(0);
        }
        //scanner.close();
    }
}
