package lab10;

import java.util.Date;

public class Student {
    String name;
    String role;
    Date deadline;

    Student() {
    }

    Student(String name) {
        this.name = name;
        this.role = "Free Student";
        this.deadline = null;
    }

    public String getName() {
        return name;
    }

    public Date getDeadline() {
        return deadline;
    }

    public String getRole() {
        return role;
    }

    public void setDeadline(Date deadline) {
        System.out.println("A free student should not be assigned a deadline.");
    }
}
