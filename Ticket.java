package com.TicketBookingApp;

public class Ticket {
    private int id;
    private String eventName;
    private boolean isBooked;

    public Ticket(int id, String eventName) {
        this.id = id;
        this.eventName = eventName;
        this.isBooked = false;
    }

    public int getId() {
        return id;
    }

    public String getEventName() {
        return eventName;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void bookTicket() {
        this.isBooked = true;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", eventName='" + eventName + '\'' +
                ", isBooked=" + isBooked +
                '}';
    }
}
