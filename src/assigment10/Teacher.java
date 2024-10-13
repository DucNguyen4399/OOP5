
package assigment10;
import java.util.Date;

public class Teacher extends Person {
    private String department;
    private String teachingSubject;

    public Teacher(String id, String fullName, Date dateOfBirth, String department, String teachingSubject) {
        this.department = department;
        this.teachingSubject = teachingSubject;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTeachingSubject() {
        return teachingSubject;
    }

    public void setTeachingSubject(String teachingSubject) {
        this.teachingSubject = teachingSubject;
    }

    public void addTeacher() {        
    }

    public void updateTeacher(String id) {
    }

    @Override
    public String toString() {
        return "Teacher{" + "department=" + department + ", teachingSubject=" + teachingSubject + '}';
    }
        @Override
    public void addPerson(){
    }
    public void updatePerson(){
    }
    public void displayInfo(){
    }
}

