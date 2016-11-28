package lab10;

public class Test {
    public static void main(String[] argv) {
        Student[] students = new Student[1];
        for (Student student : students) {
            student = new Student("Bob" + Math.round(Math.random() * 100));
            System.out.println(student.toString());
        }
    }
}
