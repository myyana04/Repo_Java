public class RestaurantHw {
    /**
     * Create a Restaurant class:
     * <p>
     * name
     * maxGuestCapacity
     * currentGuestCount
     * totalGuestsSoFar
     * <p>
     * 1. Constructor that allows user to start a restaurant by passing restaurant name and max capacity.
     * data form user goes to name and maxGuestCapacity
     * 2. Create a method that tells user if the X number of seats are available
     * parameter: int
     * return type: boolean
     * 3. Create a method that seats party
     * parameter: int
     * 4. Create a method that remove party
     * parameter: int
     * 5. Create a method that prints the restaurant summary:
     * Name:
     * Max capacity:
     * Current guest count:
     * Total guests served so far:
     */
    int maxGuestCapacity;
    String restaurantName = " ";
    int currentGuestCount=0;
    int totalGuestsSoFar=0;

    public boolean isSeatAvailable(int num) {
        boolean isAvailable;
        int isAvai = maxGuestCapacity - currentGuestCount;
        if (isAvai >= num) {
            isAvailable=true;
        } else {
            isAvailable=false;


        }
        return isAvailable;
    }


    public RestaurantHw(String name, int maxCapacity) {
         restaurantName=name;
         maxGuestCapacity=maxCapacity;

    }

    public void seatsParty(int num) {
        int available = maxGuestCapacity - currentGuestCount;
        if (available > num) {
            System.out.println("plase follow me to your table");
            currentGuestCount = currentGuestCount + num;
            totalGuestsSoFar = totalGuestsSoFar + num;
        } else {
            System.out.println("Sorry, no seats available now");


        }
    }
    public void removeParty(int num){
        if(currentGuestCount>=num){
            System.out.println("Party of "+num+" removed from restaurant");
            currentGuestCount=currentGuestCount-num;
        }else {
            System.out.println("Invalid guest entry");
        }



    }
    public void restSummary(){
        System.out.println("Restaurant name: "+restaurantName+
                "\nMaximum capacity: "+maxGuestCapacity+
                "\nCurrent guest count: "+currentGuestCount+
                "\nTotal guest serve so far: "+totalGuestsSoFar);
    }
















}






















