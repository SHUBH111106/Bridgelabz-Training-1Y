package Loops;
import java.util.Scanner;
public class FriendsComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Amar's age: ");
        int ageAmar = sc.nextInt();
        System.out.print("Enter Akbar's age: ");
        int ageAkbar = sc.nextInt();
        System.out.print("Enter Anthony's age: ");
        int ageAnthony = sc.nextInt();
        System.out.print("Enter Amar's height: ");
        float heightAmar = sc.nextFloat();
        System.out.print("Enter Akbar's height: ");
        float heightAkbar = sc.nextFloat();
        System.out.print("Enter Anthony's height: ");
        float heightAnthony = sc.nextFloat();
        String youngest;
        if (ageAmar <= ageAkbar && ageAmar <= ageAnthony) {
            youngest = "Amar";
        } else if (ageAkbar <= ageAmar && ageAkbar <= ageAnthony) {
            youngest = "Akbar";
        } else {
            youngest = "Anthony";
        }
        String tallest;
        if (heightAmar >= heightAkbar && heightAmar >= heightAnthony) {
            tallest = "Amar";
        } else if (heightAkbar >= heightAmar && heightAkbar >= heightAnthony) {
            tallest = "Akbar";
        } else {
            tallest = "Anthony";
        }
        System.out.println("Youngest friend: " + youngest);
        System.out.println("Tallest friend: " + tallest);
    }
}
