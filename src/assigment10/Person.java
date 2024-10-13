
package assigment10;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Person implements IPerson {
    private String id;
    private String fullname;
    private Date DateOfBirth;
    private Date bookBorrowDate;
    private Date bookReturnDate; 
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Person() {
    }

    public Person(String id, String fullname, Date DateOfBirth, Date bookBorrowDate, Date bookReturnDate) {
        this.id = id;
        this.fullname = fullname;
        this.DateOfBirth = DateOfBirth;
        this.bookBorrowDate = bookBorrowDate;
        this.bookReturnDate = bookReturnDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public Date getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(Date DateOfBirth) {
        this.DateOfBirth = DateOfBirth;
    }

    public Date getBookBorrowDate() {
        return bookBorrowDate;
    }

    public void setBookBorrowDate(Date bookBorrowDate) {
        this.bookBorrowDate = bookBorrowDate;
    }

    public Date getBookReturnDate() {
        return bookReturnDate;
    }

    public void setBookReturnDate(Date bookReturnDate) {
        this.bookReturnDate = bookReturnDate;
    }

    public SimpleDateFormat getSdf() {
        return sdf;
    }

    public void setSdf(SimpleDateFormat sdf) {
        this.sdf = sdf;
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", fullname=" + fullname + ", DateOfBirth=" + DateOfBirth + ", bookBorrowDate=" + bookBorrowDate + ", bookReturnDate=" + bookReturnDate + ", sdf=" + sdf + '}';
    }
    @Override
    public void addPerson(){
    }
    public void updatePerson(){
    }
    public void displayInfo(){
    }
    public Boolean isBookOverdue(){ 
        long borrowTime = bookBorrowDate.getTime();
        long returnTime = bookReturnDate.getTime();
        long daysBetween = ( returnTime = borrowTime) / (1000*60*24);
        return daysBetween >=30;
    }
    public String checkBookStatus(){
        if(isBookOverdue()){
            return "overdue";
        } else {
            return "not overdue";
        }
    }

    void setFullName(String nextLine) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}