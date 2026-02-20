package Jobsheet2;

// Practicum Exercise 2 - DosenMain (LecturerMain) Class
public class DosenMain12 {

    public static void main(String[] args) {

        // ── Object 1: Default constructor ────────────────────────────────────
        System.out.println("===== Lecturer 1 (Default Constructor) =====");
        Lecture12 dosen1 = new Lecture12();
        dosen1.idLecturer          = "D001";
        dosen1.name                = "Dr. Andi Wibowo";
        dosen1.activeStatus        = true;
        dosen1.yearOfEntry         = 2005;
        dosen1.expertiseCompetency = "Artificial Intelligence";

        dosen1.showInformation();
        dosen1.calculateTimeWork(2026);
        dosen1.setStatusActive(false);
        dosen1.changeSkill("Machine Learning");
        System.out.println("--- Updated Info ---");
        dosen1.showInformation();

        // ── Object 2: Parameterized constructor ───────────────────────────────
        System.out.println("\n===== Lecturer 2 (Parameterized Constructor) =====");
        Lecture12 dosen2 = new Lecture12("D002", "Ir. Siti Rahayu", true, 2010,
                                       "Database Systems");

        dosen2.showInformation();
        dosen2.calculateTimeWork(2026);
        dosen2.setStatusActive(true);
        dosen2.changeSkill("Big Data & Cloud Computing");
        System.out.println("--- Updated Info ---");
        dosen2.showInformation();
    }
}