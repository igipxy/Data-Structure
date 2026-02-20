package Jobsheet2;

// Practicum 2 & 3 - StudentMain Class
public class StudentMain12 {

    public static void main(String[] args) {

        // ── Practicum 2: Default constructor + manual attribute assignment ─────
        System.out.println("===== mhs1 - First Display =====");
        Mahasiswa12 mhs1 = new Mahasiswa12();          // instantiation (answer 2.2.3 Q1)
        mhs1.nama  = "Muhammad Ali Farhan";
        mhs1.nim   = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk   = 3.55;

        mhs1.tampilkanInformasi();                 // first output

        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(3.60);

        System.out.println("\n===== mhs1 - Second Display (after update) =====");
        mhs1.tampilkanInformasi();                 // second output (different because state changed)

        System.out.println("Nilai Kinerja mhs1: " + mhs1.nilaiKinerja(mhs1.ipk));

        // ── Practicum 3: Parameterized constructor ─────────────────────────────
        System.out.println("\n===== mhs2 - Parameterized Constructor =====");
        Mahasiswa12 mhs2 = new Mahasiswa12("Annisa Nabila", "2141720160", 3.25, "TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();
        System.out.println("Nilai Kinerja mhs2: " + mhs2.nilaiKinerja(mhs2.ipk));

        // ── Practicum 3 Q5: New object using parameterized constructor ──────────
        System.out.println("\n===== mhsStudent - New Object =====");
        Mahasiswa12 mhsStudent = new Mahasiswa12("Budi Santoso", "2241720199", 3.75, "TI 2A");
        mhsStudent.tampilkanInformasi();
        System.out.println("Nilai Kinerja: " + mhsStudent.nilaiKinerja(mhsStudent.ipk));

        // ── Demonstrate invalid IPK validation ─────────────────────────────────
        System.out.println("\n===== Testing invalid IPK =====");
        mhs1.updateIpk(5.0);   // should print error message
    }
}
