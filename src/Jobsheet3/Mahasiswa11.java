public class Mahasiswa11 {
    String nim;
    String name;
    String className;
    double gpa;

    // Default Constructor
    public Student() {
    }

    // Parameterized Constructor
    public Student(String nim, String name, String className, double gpa) {
        this.nim = nim;
        this.name = name;
        this.className = className;
        this.gpa = gpa;
    }

    // Method to print student info
    public void printInfo() {
        System.out.println("NIM        : " + nim);
        System.out.println("Name       : " + name);
        System.out.println("Class      : " + className);
        System.out.println("GPA        : " + gpa);
        System.out.println("----------------------------");
    }
}