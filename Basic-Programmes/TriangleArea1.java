import java.util.Scanner;

class TriangleArea1{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double base, height;
        double areaSqCm, areaSqIn;

        System.out.print("Enter base in cm: ");
        base = input.nextDouble();

        System.out.print("Enter height in cm: ");
        height = input.nextDouble();

        areaSqCm = 0.5 * base * height;
        areaSqIn = areaSqCm / (2.54 * 2.54);

        System.out.println("The Area of the triangle in sq in is "
                + areaSqIn + " and sq cm is " + areaSqCm);
    }
}
