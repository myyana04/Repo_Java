public class RestMain {
    public static void main(String[] args) {


RestaurantHw r1=new RestaurantHw("Naan Shack",100);


r1.restSummary();
r1.seatsParty(12);
r1.restSummary();

RestaurantHw r2=new RestaurantHw("Sagor",250);
r2.restSummary();
r1.removeParty(11);
r1.restSummary();
r1.seatsParty(21);
r1.restSummary();
    }



}
