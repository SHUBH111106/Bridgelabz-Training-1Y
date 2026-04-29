package com.gla.logisticsmanagement;

public class RouteLinkedList<T extends CheckPoint> {

    private class Node {
        T data;
        Node next;
        Node(T d) { data = d; }
    }

    private Node head;

    public void addCheckpoint(T cp) {
        Node n = new Node(cp);
        if (head == null) { head = n; return; }

        Node temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = n;
    }

    public double computeTotalDistance() {
        double total = 0;
        Node temp = head;
        while (temp != null) {
            total += temp.data.getDistanceFromLast();
            temp = temp.next;
        }
        return total;
    }

    public double computeTotalPenalty() {
        double total = 0;
        Node temp = head;
        while (temp != null) {
            total += temp.data.calculatePenalty();
            temp = temp.next;
        }
        return total;
    }

    public void printRoute() {
        Node temp = head;
        int i = 1;
        while (temp != null) {
            CheckPoint cp = temp.data;
            System.out.println(i + ". " + cp.getType() + " – " +
                    cp.locationName + " – " +
                    (cp.isDelayed() ? "Delayed" : "On Time") +
                    " – Penalty: " + cp.calculatePenalty());
            temp = temp.next;
            i++;
        }
    }

    public boolean checkCritical() {
        boolean delivery = false, fuel = false;
        Node temp = head;

        while (temp != null) {
            if (temp.data instanceof DeliveryCheckpoint) delivery = true;
            if (temp.data instanceof FuelCheckpoint) fuel = true;
            temp = temp.next;
        }
        return delivery && fuel;
    }
}