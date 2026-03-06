import java.util.Scanner;

public class DosenDemo11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input number of lecturers: ");
        int length = sc.nextInt();
        sc.nextLine();

        Dosen11[] arrayOfDosen = new Dosen[length];

        for (int i = 0; i < length; i++) {

            System.out.println("Input data for lecturer " + (i + 1));

            System.out.print("Code: ");
            String code = sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Gender (true=Male, false=Female): ");
            boolean gender = sc.nextBoolean();

            System.out.print("Age: ");
            int age = sc.nextInt();
            sc.nextLine();

            arrayOfDosen[i] = new Dosen(code, name, gender, age);
            System.out.println();
        }

        DataDosen11 data = new DataDosen();

        System.out.println("===== ALL LECTURERS =====");
        data.dataAllDosen(arrayOfDosen);

        data.numberOfLecturersPerGender(arrayOfDosen);
        data.AverageAgeOfLecturersPerGender(arrayOfDosen);
        data.infoDosenPalingTua(arrayOfDosen);
        data.infoDosenMostYoungest(arrayOfDosen);

        sc.close();
    }
}