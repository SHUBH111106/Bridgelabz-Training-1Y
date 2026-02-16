package com.gla.assignment7.Part1.Level1.Level2;
class MovieTicket {
    private String movieName;
    private String seatNumber;
    private double price;

    public MovieTicket(String movieName) {
        this.movieName = movieName;
    }

    public void bookTicket(String seatNumber, double price) {
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket booked successfully!");
    }

    public void displayDetails() {
        System.out.println("Movie: " + movieName);
        System.out.println("Seat: " + seatNumber);
        System.out.println("Price: " + price);
    }
}

class Main4 {
    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket("Avengers");
        ticket.bookTicket("A12", 250);
        ticket.displayDetails();
    }
}

