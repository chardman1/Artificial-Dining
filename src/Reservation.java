public class Reservation {
    // Initialize private fields
    private String guestName;
    private int partySize;
    private String month;
    private int day;

    // Getters and setters
    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String name) {
        this.guestName = name;
    }

    public int getPartySize() {
        return partySize;
    }

    public void setPartySize(int size) {
        this.partySize = size;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String m) {
        this.month = m;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int d) {
        this.day = d;
    }

    // Print customer info
    public void printCustomerInfo() {
        System.out.println();
        System.out.println("Thank you for making a reservation with us!");
        System.out.println("Here is your reservation info");
        System.out.println("Customer: " + guestName);
        System.out.println("Size of party: " + partySize);
        System.out.println("Date of reservation: " + month + " " + day);
    }
}
