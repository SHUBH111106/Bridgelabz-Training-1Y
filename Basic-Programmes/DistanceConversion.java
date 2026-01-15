import java.util.Scanner;

class DistanceConversion {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double distanceInFeet;
        double distanceInYards, distanceInMiles;

        System.out.print("Enter distance in feet: ");
        distanceInFeet = input.nextDouble();

        distanceInYards = distanceInFeet / 3;
        distanceInMiles = distanceInYards / 1760;

        System.out.println("The distance in yards is "
                + distanceInYards + " while the distance in miles is "
                + distanceInMiles);
    }
}
