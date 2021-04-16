public class ResMain {

    public static void main(String[] args) {

        Restaurant r1=new Restaurant("Naan Shack",35);
        r1.isAvailable();
        r1.seatsParty(10);
        r1.printsRestaurantSummary();
        r1.isAvailable();
        r1.printsRestaurantSummary();
        r1.seatsParty(2);
        r1.printsRestaurantSummary();
        r1.seatsParty(22);
        r1.printsRestaurantSummary();
        r1.removesParty(33);
        r1.printsRestaurantSummary();



    }





    }

