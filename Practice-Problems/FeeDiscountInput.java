import java.util.Scanner;

class FeeDiscountInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double fee = sc.nextDouble();
        double discountPercent = sc.nextDouble();

        double discount = fee * discountPercent / 100;
        double finalFee = fee - discount;

        System.out.println("Discount = " + discount);
        System.out.println("Final Fee = " + finalFee);
    }
}
