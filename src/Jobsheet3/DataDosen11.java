public class DataDosen11 {

    public void dataAllDosen(Dosen11[] arrayOfDosen) {
        for (Dosen11 d : arrayOfDosen) {
            d.printInfo();
        }
    }

    public void numberOfLecturersPerGender(Dosen11[] arrayOfDosen) {
        int male = 0, female = 0;

        for (Dosen11 d : arrayOfDosen) {
            if (d.gender) {
                male++;
            } else {
                female++;
            }
        }

        System.out.println("Number of Male Lecturers   : " + male);
        System.out.println("Number of Female Lecturers : " + female);
    }

    public void AverageAgeOfLecturersPerGender(Dosen11[] arrayOfDosen) {
        int maleTotal = 0, femaleTotal = 0;
        int maleCount = 0, femaleCount = 0;

        for (Dosen11 d : arrayOfDosen) {
            if (d.gender) {
                maleTotal += d.age;
                maleCount++;
            } else {
                femaleTotal += d.age;
                femaleCount++;
            }
        }

        if (maleCount > 0)
            System.out.println("Average Age Male   : " + (maleTotal / maleCount));

        if (femaleCount > 0)
            System.out.println("Average Age Female : " + (femaleTotal / femaleCount));
    }

    public void infoDosenPalingTua(Dosen11[] arrayOfDosen) {
        Dosen11 oldest = arrayOfDosen[0];

        for (Dosen11 d : arrayOfDosen) {
            if (d.age > oldest.age) {
                oldest = d;
            }
        }

        System.out.println("Oldest Lecturer:");
        oldest.printInfo();
    }

    public void infoDosenMostYoungest(Dosen11[] arrayOfDosen) {
        Dosen11 youngest = arrayOfDosen[0];

        for (Dosen11 d : arrayOfDosen) {
            if (d.age < youngest.age) {
                youngest = d;
            }
        }

        System.out.println("Youngest Lecturer:");
        youngest.printInfo();
    }
}