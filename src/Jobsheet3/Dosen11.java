public class Dosen11 {
    String code;
    String name;
    boolean gender; // true = Male, false = Female
    int age;

    public Dosen11(String code, String name, boolean gender, int age) {
        this.code = code;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("Code   : " + code);
        System.out.println("Name   : " + name);
        System.out.println("Gender : " + (gender ? "Male" : "Female"));
        System.out.println("Age    : " + age);
        System.out.println("----------------------------");
    }
}