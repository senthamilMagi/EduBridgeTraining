


import java.util.Scanner;

public class Airline_demo {
    private static boolean[] seats = new boolean[10]; // Array to track seat availability
    private static Scanner scanner = new Scanner(System.in);


         public static void main(String[] args) {
            showMenu();
            int choice = scanner.nextInt();

            while (choice != 3) {
                switch (choice) {
                    case 1:
                        reserveSeat();
                        break;
                    case 2:
                        displaySeatMap();
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }

                showMenu();
                choice = scanner.nextInt();
            }
        }

        private static void showMenu() {
            System.out.println("AirlineReservation ");
            System.out.println("---------------------------");
            System.out.println("1. Reserve a seat");
            System.out.println("2. View seat map");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
        }

        private static void reserveSeat() {
            System.out.println("Seat Map");
            System.out.println("--------");
            displaySeatMap();

            System.out.print("Enter seat number (1-10) to reserve: ");
            int seatNumber = scanner.nextInt();

            if (seatNumber < 1 || seatNumber > 10) {
                System.out.println("Invalid seat number. Please try again.");
                return;
            }

            if (seats[seatNumber - 1]) {
                System.out.println("Seat is already reserved.");
            } else {
                seats[seatNumber - 1] = true;
                System.out.println("Seat reserved successfully.");
            }
        }

        private static void displaySeatMap() {
            System.out.println("Seat Map");
            System.out.println("--------");

            for (int i = 0; i < seats.length; i++) {
                System.out.print("Seat " + (i + 1) + ": ");

                if (seats[i]) {
                    System.out.println("Occupied");
                } else {
                    System.out.println("Available");
                }
            }

            System.out.println();
        }
    
 }