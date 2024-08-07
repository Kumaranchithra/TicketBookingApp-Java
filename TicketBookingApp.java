package com.TicketBookingApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TicketBookingApp {
    private List<Ticket> tickets;

    public TicketBookingApp() {
        tickets = new ArrayList<>();
        // Adding some sample tickets
        tickets.add(new Ticket(1, "Concert A"));
        tickets.add(new Ticket(2, "Concert B"));
        tickets.add(new Ticket(3, "Concert C"));
    }

    public void viewAvailableTickets() {
        System.out.println("Available Tickets:");
        for (Ticket ticket : tickets) {
            if (!ticket.isBooked()) {
                System.out.println(ticket);
            }
        }
    }

    public void bookTicket(int ticketId) {
        for (Ticket ticket : tickets) {
            if (ticket.getId() == ticketId && !ticket.isBooked()) {
                ticket.bookTicket();
                System.out.println("Ticket booked successfully: " + ticket);
                return;
            }
        }
        System.out.println("Ticket not found or already booked.");
    }

    public void viewBookedTickets() {
        System.out.println("Booked Tickets:");
        for (Ticket ticket : tickets) {
            if (ticket.isBooked()) {
                System.out.println(ticket);
            }
        }
    }

    public static void main(String[] args) {
        TicketBookingApp app = new TicketBookingApp();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nTicket Booking System");
            System.out.println("1. View Available Tickets");
            System.out.println("2. Book a Ticket");
            System.out.println("3. View Booked Tickets");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    app.viewAvailableTickets();
                    break;
                case 2:
                    System.out.print("Enter Ticket ID to book: ");
                    int ticketId = scanner.nextInt();
                    app.bookTicket(ticketId);
                    break;
                case 3:
                    app.viewBookedTickets();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
