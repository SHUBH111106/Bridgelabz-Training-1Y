class EarthVolume {
    public static void main(String[] args) {
        double radius = 6378;
        double pi = 3.14159;

        double volumeKm = (4.0 / 3) * pi * radius * radius * radius;
        double volumeMiles = volumeKm / (1.6 * 1.6 * 1.6);

        System.out.println("Volume in km³ = " + volumeKm);
        System.out.println("Volume in miles³ = " + volumeMiles);
    }
}
