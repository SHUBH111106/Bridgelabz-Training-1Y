class ProfitCalculation {
    public static void main(String[] args) {
        int costPrice = 129;
        int sellingPrice = 191;

        int profit = sellingPrice - costPrice;
        double profitPercent = (profit * 100.0) / costPrice;

        System.out.println("Profit = " + profit);
        System.out.println("Profit Percentage = " + profitPercent);
    }
}
