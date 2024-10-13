
package assigment10;
import java.util.Date;
import java.util.Scanner;

public class Student extends Person {
    private float gpa;
    private String major;
    private Scanner scanner = new Scanner(System.in);

    public Student(String id, String fullName, Date dateOfBirth, float gpa, String major) {
        this.gpa = gpa;
        this.major = major;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public String toString() {
        return "Student{" + "gpa=" + gpa + ", major=" + major + ", scanner=" + scanner + '}';
    }    
    @Override
    public void addPerson(){
    }
    public void updatePerson(){
    }
    public void displayInfo(){
    }
}
