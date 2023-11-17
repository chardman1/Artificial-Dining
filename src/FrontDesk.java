import java.util.Scanner;

public class FrontDesk {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        Reservation reservation = new Reservation();    // Initialize object of type Reservation

        String[] frontDeskOptions = {
                "1. Make a reservation",
                "2. Get a table",
                "3. View menu",
                "4. Declare allergies",
                "5. Exit"
        };

        int optionInput;

        System.out.println("Welcome to McJava's! We are excited to have you!");  // Welcome message
        System.out.println("How may we serve you?");

        for (String option: frontDeskOptions) {     // For-each loop simpler than regular for loop in this case and functions the same
            System.out.println(option);
        }
        optionInput = scnr.nextInt();

        while (optionInput > 5 || optionInput < 1) {    // Repeat question if user inputs number that is not an option
            System.out.println("How may we serve you?");
            optionInput = scnr.nextInt();
        }

        switch (optionInput) {
            case 1:     // If user chose to make a reservation
                String guestName;
                int partySize, month, day;

                String[] months = {
                        "1. January",
                        "2. February",
                        "3. March",
                        "4. April",
                        "5. May",
                        "6. June",
                        "7. July",
                        "8. August",
                        "9. September",
                        "10. October",
                        "11. November",
                        "12. December"
                };

                scnr.nextLine();
                System.out.println("What is your name?");
                guestName = scnr.nextLine();
                reservation.setGuestName(guestName);

                System.out.println("How many are in your party?");
                partySize = scnr.nextInt();
                reservation.setPartySize(partySize);
                scnr.nextLine();

                System.out.println("Enter the month.");
                for (String m: months) {    // For-each loop simpler than regular for loop in this case and functions the same
                    System.out.println(m);
                }
                month = scnr.nextInt();
                String monthToString;

                switch (month) {
                    case 1:
                        monthToString = "January";
                        reservation.setMonth(monthToString);
                        break;
                    case 2:
                        monthToString = "February";
                        reservation.setMonth(monthToString);
                        break;
                    case 3:
                        monthToString = "March";
                        reservation.setMonth(monthToString);
                        break;
                    case 4:
                        monthToString = "April";
                        reservation.setMonth(monthToString);
                        break;
                    case 5:
                        monthToString = "May";
                        reservation.setMonth(monthToString);
                        break;
                    case 6:
                        monthToString = "June";
                        reservation.setMonth(monthToString);
                        break;
                    case 7:
                        monthToString = "July";
                        reservation.setMonth(monthToString);
                        break;
                    case 8:
                        monthToString = "August";
                        reservation.setMonth(monthToString);
                        break;
                    case 9:
                        monthToString = "September";
                        reservation.setMonth(monthToString);
                        break;
                    case 10:
                        monthToString = "October";
                        reservation.setMonth(monthToString);
                        break;
                    case 11:
                        monthToString = "November";
                        reservation.setMonth(monthToString);
                        break;
                    case 12:
                        monthToString = "December";
                        reservation.setMonth(monthToString);
                        break;
                    default:
                        System.out.println("Not a month");
                        break;
                }

                System.out.println("Enter the day:");
                day = scnr.nextInt();
                reservation.setDay(day);

                reservation.printCustomerInfo();
                break;
            case 2:     // If user chose to get a table
                break;
            case 3:     // If user chose to view menu
                break;
            case 4:     // If user chose to declare allergies
                break;
            case 5:     // If user chose to exit
                break;
            default:
                break;
        }
    }
}
