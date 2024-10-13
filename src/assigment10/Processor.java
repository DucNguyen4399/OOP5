
package assigment10;
import java.util.Scanner;

public class Processor {
    public static void main(String[] args) {
        PersonList personList = new PersonList();
        Scanner scanner = new Scanner(System.in);
        int option;
        do {
            System.out.println("1. Add a new student");
            System.out.println("2. Add a new teacher");
            System.out.println("3. Update a person by ID");
            System.out.println("4. Delete a person by ID");
            System.out.println("5. Display all students and teachers");
            System.out.println("6. Find the student with the highest GPA");
            System.out.println("7. Find a teacher by department");
            System.out.println("8. Notify whether the book's return due date has arrived or not");
            System.out.println("9. Exit");
            System.out.print("Choose an option: ");
            option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1:
                    personList.addStudent(); 
                    break;
                case 2:
                    personList.addTeacher();  
                    break;
                case 3:
                    personList.updatePerson();  
                    break;
                case 4:
                    personList.deletePersonById();  
                    break;
                case 5:
                    personList.displayEveryone();  
                    break;
                case 6:
                    personList.findTopStudent();
                    break;
                case 7: 
                    personList.findTeacherByDepartment();
                    break;
                case 8: 
                    personList.checkBookBorrowing();
                    break;
                case 9:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option! Please try again.");
            }
        } while (option != 9);

        scanner.close();
    }
}


