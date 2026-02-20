package Jobsheet2;

// Practicum Exercise 2 - Lecturer Class
public class Lecture12 {

    // ── Attributes ────────────────────────────────────────────────
    String  idLecturer;
    String  name;
    boolean activeStatus;
    int     yearOfEntry;
    String  expertiseCompetency;

    // ── Constructors ──────────────────────────────────────────────

    // Default constructor
    public Lecture12() {
    }

    // Parameterized constructor
    public Lecture12(String idLecturer, String name, boolean activeStatus,
                    int yearOfEntry, String expertiseCompetency) {
        this.idLecturer          = idLecturer;
        this.name                = name;
        this.activeStatus        = activeStatus;
        this.yearOfEntry         = yearOfEntry;
        this.expertiseCompetency = expertiseCompetency;
    }

    // ── Methods ───────────────────────────────────────────────────

    void showInformation() {
        System.out.println("Lecturer ID         : " + idLecturer);
        System.out.println("Name                : " + name);
        System.out.println("Active Status       : " + (activeStatus ? "Active" : "Inactive"));
        System.out.println("Year of Entry       : " + yearOfEntry);
        System.out.println("Expertise/Competency: " + expertiseCompetency);
    }

    void setStatusActive(boolean status) {
        activeStatus = status;
        if (activeStatus) {
            System.out.println(name + " is now Active.");
        } else {
            System.out.println(name + " is now Inactive.");
        }
    }

    int calculateTimeWork(int yearNow) {
        int yearsWorked = yearNow - yearOfEntry;
        System.out.println(name + " has been working for " + yearsWorked + " year(s).");
        return yearsWorked;
    }

    void changeSkill(String skill) {
        expertiseCompetency = skill;
        System.out.println("Expertise updated to: " + expertiseCompetency);
    }
}
