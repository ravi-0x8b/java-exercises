import java.util.Scanner;
import entities.Student;

public class StudentProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        System.out.print("Name: ");
        student.Name = sc.nextLine();
        System.out.print("Fist note: ");
        student.FirstNote = sc.nextDouble();
        System.out.print("Second note: ");
        student.SecondNote = sc.nextDouble();
        System.out.print("Third note: ");
        student.ThirdNote = sc.nextDouble();

        System.out.println("Final Grade: " + student.FinalGrade());
        if (student.IsPass()) {
            System.out.println("PASS");
        }
        else {
            System.out.println("FAILED");
            System.out.println("MISSING " + student.MissingPoints());
        }
        sc.close();
    }
}
