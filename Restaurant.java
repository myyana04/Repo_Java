public class Restaurant {

     static String resName=" Naan Shack";
     static int capacity=25;
     static int guestCount=0;
    public void isAvailable(int num) {

        int ava = capacity - guestCount;
        if (ava >= num) {
            System.out.println("Please come in");



        guestCount=guestCount+num;}
    else {
            System.out.println("No availability");
        }
    }
}
