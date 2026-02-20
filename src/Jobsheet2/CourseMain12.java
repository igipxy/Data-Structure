package Jobsheet2;

// Practicum Exercise 1 - CourseMain Class
public class CourseMain12 {

    public static void main(String[] args) {

        // ── Object 1: Default constructor ────────────────────────────────────
        System.out.println("===== Course 1 (Default Constructor) =====");
        MataKuliah12 mk1 = new MataKuliah12();
        mk1.kodeCourse    = "TI301";
        mk1.name          = "Algoritma dan Struktur Data";
        mk1.credits       = 3;
        mk1.numberOfHours = 4;

        mk1.showInformation();
        mk1.updateSKS(4);
        mk1.addHour(2);
        mk1.reduceHours(1);
        mk1.reduceHours(10);   // should trigger error message

        // ── Object 2: Parameterized constructor ───────────────────────────────
        System.out.println("\n===== Course 2 (Parameterized Constructor) =====");
        MataKuliah12 mk2 = new MataKuliah12("TI205", "Pemrograman Berorientasi Objek", 3, 3);

        mk2.showInformation();
        mk2.updateSKS(4);
        mk2.addHour(1);
        mk2.reduceHours(2);
    }
}