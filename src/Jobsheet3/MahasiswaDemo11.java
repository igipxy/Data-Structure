import java.util.Scanner;

public class MahasiswaDemo11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input number of students: ");
        int length = sc.nextInt();
        sc.nextLine();

        Student[] arrayOfStudents = new Student[length];

        for (int i = 0; i < length; i++) {
            System.out.println("Input data for student " + (i + 1));

            System.out.print("NIM: ");
            String nim = sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Class: ");
            String className = sc.nextLine();

            System.out.print("GPA: ");
            double gpa = sc.nextDouble();
            sc.nextLine();

            arrayOfStudents[i] = new Student(nim, name, className, gpa);
            System.out.println();
        }

        System.out.println("===== STUDENT DATA =====");

        for (Student s : arrayOfStudents) {
            s.printInfo();
        }

        sc.close();
    }
}