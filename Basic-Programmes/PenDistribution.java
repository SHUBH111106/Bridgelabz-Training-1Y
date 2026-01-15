class PenDistribution {
    public static void main(String[] args) {
        int pens = 14;
        int students = 3;

        int perStudent = pens / students;
        int remaining = pens % students;

        System.out.println("Pens per student = " + perStudent);
        System.out.println("Remaining pens = " + remaining);
    }
}
