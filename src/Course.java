public class Course {

    // Method Overloading
    public void enrollStudent(String name) {
        System.out.println(name + " enrolled in the course.");
    }

    public void enrollStudent(String name, String courseName) {
        System.out.println(name + " enrolled in " + courseName);
    }
}
