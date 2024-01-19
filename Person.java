import java.util.Scanner;
import java.util.*;
public class Person {
    private String id;
    private String firstname;
    private String lastname;
    private String title;
    private int YOB = 0;

    public Person(String id, String firstname, String lastname, String title, int YOB) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.title = title;
        this.YOB = YOB;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYOB() {
        return YOB;
    }

    public void setYOB(int YOB) {
        this.YOB = YOB;
    }
    public String getFullName() {
        return this.getFirstname() + " " + this.getLastname();
    }
    public String getFormalName() {
        return this.getTitle() + " " + this.getFirstname() + " " + this.getLastname();
    }
    public String getAge() {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR)-this.getYOB();
        String year2 = Integer.toString(year);
        return year2;
    }
    public String getAge(int year) {
        Scanner in = new Scanner(System.in);
        int year2 = SafeInput.getRangedInt(in,"Input a year between 2000 and 2024",2000,2024);
        year2 = year2-this.getYOB();
        String year3 = Integer.toString(year2);
        return year3;
    }
    public String toCSVDataRecord() {
        return this.id + ", " + this.firstname + ", " + this.lastname + ", " + this.title + ", " + this.YOB;
    }

}
