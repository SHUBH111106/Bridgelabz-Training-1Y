class Handshakes {
    public static void main(String[] args) {
        int people = 10;

        int handshakes = (people * (people - 1)) / 2;
        System.out.println("Total handshakes = " + handshakes);
    }
}
