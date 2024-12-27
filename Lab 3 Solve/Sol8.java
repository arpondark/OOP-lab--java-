import java.util.*;

public class Sol8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = in.nextInt();
        in.nextLine();
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter name " + (i + 1) + ":");
            String name = in.nextLine();
            System.out.println("Enter the score of " + name + ":");
            int score = in.nextInt();
            in.nextLine();
            students.add(new Student(name, score));
        }

        students.sort((s1, s2) -> s2.score - s1.score);
        System.out.println("\nStudents in decreasing order of their scores:");
        for (Student student : students) {
            System.out.println(student.name + " - " + student.score);

        }
    }

}

class Student {
    String name;
    int score;

    Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
}