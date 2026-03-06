public class Matakuliah11 {
    String code;
    String name;
    int sks;
    int hours;

    // Constructor
    public Matakuliah11(String code, String name, int sks, int hours) {
        this.code = code;
        this.name = name;
        this.sks = sks;
        this.hours = hours;
    }

    // addData method
    public void addData(String code, String name, int sks, int hours) {
        this.code = code;
        this.name = name;
        this.sks = sks;
        this.hours = hours;
    }

    // printInfo method
    public void printInfo() {
        System.out.println("Course Code : " + code);
        System.out.println("Course Name : " + name);
        System.out.println("SKS         : " + sks);
        System.out.println("Hours       : " + hours);
        System.out.println("----------------------------");
    }
}