import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ManagementSystem system = new ManagementSystem();

        int choice;

        do {

            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Register Student");
            System.out.println("2. Register Teacher");
            System.out.println("3. View All People");
            System.out.println("4. Search Person");
            System.out.println("5. Delete Person");
            System.out.println("6. Enroll Student in Course");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            input.nextLine();

            switch(choice) {

                case 1:

                    System.out.print("Enter student name: ");
                    String studentName = input.nextLine();

                    System.out.print("Enter student age: ");
                    int studentAge = input.nextInt();
                    input.nextLine();

                    System.out.print("Enter student ID: ");
                    String studentId = input.nextLine();

                    Student student = new Student(studentName, studentAge, studentId);

                    system.addPerson(student);

                    System.out.println("Student registered successfully!");

                    break;

                case 2:

                    System.out.print("Enter teacher name: ");
                    String teacherName = input.nextLine();

                    System.out.print("Enter teacher age: ");
                    int teacherAge = input.nextInt();
                    input.nextLine();

                    System.out.print("Enter subject: ");
                    String subject = input.nextLine();

                    Teacher teacher = new Teacher(teacherName, teacherAge, subject);

                    system.addPerson(teacher);

                    System.out.println("Teacher registered successfully!");

                    break;

                case 3:

                    System.out.println("\n===== Registered People =====");

                    system.displayAllPeople();

                    break;

                case 4:

                 System.out.print("Enter name to search: ");
                 String searchName = input.nextLine();

                system.searchPerson(searchName);

                 break;

                case 5:

                System.out.print("Enter name to delete: ");
                String deleteName = input.nextLine();

                system.deletePerson(deleteName);

                break;

                case 6:

                Course course = new Course();

                System.out.print("Enter student name: ");
                String enrollName = input.nextLine();

                System.out.print("Enter course name: ");
                String courseName = input.nextLine();

                course.enrollStudent(enrollName, courseName);

                break;

                case 7:

                System.out.println("Exiting system...");

                break;

                default:

                    System.out.println("Invalid choice!");

            }

        } while(choice != 7);

        input.close();
    }
}
