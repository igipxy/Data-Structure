
public class Mahasiswa11 {
    String nim;
    String name;
    String className;
    double gpa;

    // Default Constructor
    // Default Constructor
    public Mahasiswa11() {
    }

    // Parameterized Constructor
    public Mahasiswa11(String nim, String name, String className, double gpa) {
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