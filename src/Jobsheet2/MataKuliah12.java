package Jobsheet2;


public class MataKuliah12 {

  
    String kodeCourse;
    String name;
    int    credits;        
    int    numberOfHours;

    public MataKuliah12() {
    }

   
    public MataKuliah12(String kodeCourse, String name, int credits, int numberOfHours) {
        this.kodeCourse    = kodeCourse;
        this.name          = name;
        this.credits       = credits;
        this.numberOfHours = numberOfHours;
    }

    

    void showInformation() {
        System.out.println("Course Code   : " + kodeCourse);
        System.out.println("Course Name   : " + name);
        System.out.println("Credits (SKS) : " + credits);
        System.out.println("Hours/Week    : " + numberOfHours);
    }

    void updateSKS(int sksNew) {
        credits = sksNew;
        System.out.println("Credits have been updated to: " + credits);
    }

    void addHour(int hours) {
        numberOfHours += hours;
        System.out.println("Hours added. New total hours/week: " + numberOfHours);
    }

    void reduceHours(int hours) {
        if (numberOfHours < hours) {
            System.out.println("Reduction cannot be made. Current hours (" +
                               numberOfHours + ") is less than reduction amount (" + hours + ").");
        } else {
            numberOfHours -= hours;
            System.out.println("Hours reduced. New total hours/week: " + numberOfHours);
        }
    }
}