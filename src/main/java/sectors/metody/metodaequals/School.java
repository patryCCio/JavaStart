package sectors.metody.metodaequals;

public class School {
    public static void main(String[] args) {
        Student student1 = new Student("Jan", 21);
        Student student2 = new Student("Jan", 21);

        boolean studentEquals = student1.equals(student2);
        System.out.println(studentEquals);
    }
}
