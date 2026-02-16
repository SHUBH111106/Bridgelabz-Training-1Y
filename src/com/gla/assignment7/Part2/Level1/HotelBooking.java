package com.gla.assignment7.Part2.Level1;
class HotelBooking {
    private String guestName;
    private String roomType;
    private int nights;

    public HotelBooking() {
        this("Shubh", "Luxury", 3);
    }

    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    public HotelBooking(HotelBooking h) {
        this.guestName = h.guestName;
        this.roomType = h.roomType;
        this.nights = h.nights;
    }

    public void display() {
        System.out.println(guestName + " | " + roomType + " | Nights: " + nights);
    }

    public static class Main{
        static void main(String[] args) {
            HotelBooking h1= new HotelBooking();
            h1.display();
        }
    }
}

