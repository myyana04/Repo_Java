import java.util.Locale;

public class HomeWork6 {
    public static void main(String[] args) {

        /**
         * Checking car gear (P, D, N, R)           // switch
         * if car gear is P, display "you can park the car"
         * if car gear is D,
         *      if drive type is Snow, display "You are on Snow mode"
         *      if drive type is Sport, display "You are on Sport mode"
         *      if drive type is Eco, display "You are on Eco mode"
         * if car gear is N, display "put car in car wash"
         * if car gear is R, display  "revere the car"
         */
        String carGear="P";
        String driveType ="snow";
        switch (carGear.toUpperCase()) {
            case "P":
                System.out.println("You can park now");
                break;
            case "D":

                if (driveType.equalsIgnoreCase("snow")) {
                    System.out.println("You are on a Snow mode");
                } else if (carGear.equalsIgnoreCase("sport")) {
                    System.out.println("You are on Sport mode");
                } else if (driveType.equalsIgnoreCase("eco")) {
                    System.out.println("You are on a Eco mode");
                } else {
                    System.out.println("Invalid entry");
                }

                break;
            case "N":
                System.out.println("You are in car wash");
                break;
            case "R":
                System.out.println("reverse the car");
                break;
            default:
                System.out.println("Wrong Gear");


        }
        /**
         * store value in an int variable
         * if number is divisible by 3, print "divisible by 3"
         * if number is divisible by 5, print "divisible by 5"
         * if number is divisible by 3 and 5, print "divisible by both"
         * if not divisible by 3 or 5, print the number
         */
        int num=9;
        if(num%3==0 &&num%5==0){
            System.out.println(num+" is divisible by both 3 and 5");

        }else if(num%3==0) {
            System.out.println(num+" divisible by 3");
        }else if(num%5==0) {
            System.out.println(num+" divisible by 5");
        }else {
            System.out.println("Number is "+num);
        }

        /**
         * Create variable to store studentScore and maxScore;
         * Based on the percentage, display grade to student:
         * Grade A: 91-100
         * Grade B: 81-90
         * Grade C: 71-80
         * Grade D: 61-70
         * Grade E: 51-60
         * Grade F: less than or equal to 50
         */
        double studentScore =300;
        double maxScore = 700;
        double percentage=(studentScore/maxScore)*100;
        // calculate percentage
        // Your percentage: XX.yy and your Grade is: Z
        if(percentage<=0||percentage>100){
            System.out.println("Invalid entry, check your entry again");
        }else if(percentage>90&&percentage<=100){
            System.out.println("Your percentage is "+percentage+" and grade is: A");
        }else if(percentage>80&&percentage<=90){
            System.out.println("Your percentage is "+percentage+" and your grade is: B");
        }else if(percentage>70&&percentage<=90){
            System.out.println("Your percentage is "+percentage+" and yuor grade is: C");
        }else if(percentage>60&&percentage<=70){
            System.out.println("Your percentage is "+percentage+" and yuor grade is: D");
        }else if(percentage>50&&percentage<=60){
            System.out.println("Your percentage is "+percentage+" your grade is: E");
        }else if(percentage<=50){
            System.out.println("Your percentage is "+percentage+" and your grade is: F");
        }












        }


}
