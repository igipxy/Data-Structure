import java.util.Scanner;

public class MatakuliahDemo11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input number of courses: ");
        int length = sc.nextInt();
        sc.nextLine();

        Matakuliah11[] arrayOfMatakuliah = new Matakuliah11[length];

        for (int i = 0; i < length; i++) {

            System.out.println("Input data for course " + (i + 1));

            System.out.print("Code: ");
            String code = sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("SKS: ");
            int sks = sc.nextInt();

            System.out.print("Hours: ");
            int hours = sc.nextInt();
            sc.nextLine();

            arrayOfMatakuliah[i] = new Matakuliah11(code, name, sks, hours);
            System.out.println();
        }

        System.out.println("===== COURSE DATA =====");

        for (Matakuliah11 mk : arrayOfMatakuliah) {
            mk.printInfo();
        }

        sc.close();
    }
}