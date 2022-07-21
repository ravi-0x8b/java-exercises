import  java.util.Scanner;
import entities.Rectangle;

public class RectangleProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        System.out.println("Enter rectangle width:");
        rectangle.width = sc.nextDouble();
        System.out.println("Enter rectangle height:");
        rectangle.height = sc.nextDouble();

        System.out.println("AREA: " + rectangle.Area());
        System.out.println("PERIMETER: " + rectangle.Perimeter());
        System.out.println("DIAGONAL: " + rectangle.Diagonal());

        sc.close();
    }
}
