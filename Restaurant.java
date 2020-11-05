public class Restaurant {


    /*Create a Restaurant class with attribute name, guestCapacity, guestCount
    1. Create a method that tells user if the seats are available
    2. Create a method that seatsParty.
    3. Create a method that removesParty.
    4. Create a Constructor-method that allows host open for services by passing restaurant name/guestCapacity.
    a5. Create a method that printsRestaurantSummary
         Name:
         Current Guest Count:
         Guest Capacity:
     */



    private String resName;
    private int capacity;
    private int guestCount = 0;
    public Restaurant(String resName, int capacity) {
        this.resName = resName;
        this.capacity = capacity;
    }
    public void isAvailable() {
        if(capacity > guestCount) {
            System.out.println(capacity-guestCount+ "seats are available .");
        } else {
            System.out.println("No availability.");
        }
    }
    public void seatsParty(int num) {
        if (capacity - guestCount > num) {
            guestCount += num;
        } else {
            System.out.println("Not enough seats.");
        }
    }
    public void removesParty(int num) {
        if(guestCount >= num) {
            guestCount -= num;
        } else {
            System.out.println("Wrong input.");
        }
    }
    public void printsRestaurantSummary() {
        System.out.println(
                " Restaurant Summary \n" +
                        "  Name: " + resName + "\n"+
                        "  Current Guest Count: " + guestCount + "\n" +
                        "  Guest Capacity: " + capacity);
    }
}


























