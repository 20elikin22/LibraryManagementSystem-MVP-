public class Student extends Person {

    private String studentId;

    public Student(String name, int age, String studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    // Method Overriding
    @Override
    public void displayInfo() {
        System.out.println("=== Student Information ===");
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Student ID: " + studentId);
    }
}