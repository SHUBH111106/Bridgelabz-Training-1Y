package Loops;
import java.util.Scanner;

class Grade {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int physics = sc.nextInt();
        int chemistry = sc.nextInt();
        int maths = sc.nextInt();

        int total = physics + chemistry + maths;
        double percentage = total / 3.0;

        System.out.println("Average Marks: " + percentage);

        if (percentage >= 80)
            System.out.println("Grade A – Excellent");
        else if (percentage >= 70)
            System.out.println("Grade B – Very Good");
        else if (percentage >= 60)
            System.out.println("Grade C – Good");
        else if (percentage >= 50)
            System.out.println("Grade D – Average");
        else if (percentage >= 40)
            System.out.println("Grade E – Below Average");
        else
            System.out.println("Grade R – Remedial");

    }
}

