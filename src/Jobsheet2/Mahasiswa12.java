package Jobsheet2;

public class Mahasiswa12 {
    public Mahasiswa12(String string, String string2, double d, String string3) {
    }

    public Mahasiswa12() {
    }

    public static void main(String[] args) {
        
    }
    
    String nama;
    String nim;
    String kelas;
    double ipk;
    
    void tampilkanInformasi () {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("IPK: " + kelas);
        System.out.println("Kelas: " + ipk);
    }

    void ubahKelas (String kelasBaru) {
        kelas = kelasBaru;

    }

    void updateIpk(double ipkBaru) {
    if (ipkBaru >= 0.0 && ipkBaru <= 4.0) {
        ipk = ipkBaru;
    } else {
        System.out.println("GPA is invalid. Must be between 0.0 and 4.0");
    }
}

    String nilaiKinerja () {
        if (ipk >= 3.5) {
            return "Kinerja sangat baik";
        } else if (ipk >=3) {
            return "kinerja baik";
        } else if (ipk >=2.0) {
            return "kinerja cukup"; 
        } else {
            return "kinerja kurang";
        }
        
    
    
    
    
    
    }

    public String nilaiKinerja(double ipk2) {
        throw new UnsupportedOperationException("Unimplemented method 'nilaiKinerja'");
    }

}

