import java.util.Scanner;

public class IT22619976Lab9Q2 {

    public static double circleArea(double radius) {
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();

        double area = circleArea(radius);

        System.out.printf("Area of the circle: %.2f%n", area);
    }
}