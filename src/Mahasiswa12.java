public class Mahasiswa12 {
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

    void updateIpk (double ipkBaru) {
        ipk = ipkBaru;
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

}

