package homework;

/**
 * create a variable to store students score and total possible score;
 * based on the percentage display grade to student;
 * Grade A: 91-100;
 * Grade B: 81-90;
 * Grade C: 71-80;
 * Grade D: 61-70;
 * Grade E: 51-60;
 * Grade F: less then to equal to 50;
 */

public class ConditionalLoop {
    public static void main(String[] args) {
        double studentScore = 155;
        double maxScore = 160.00;
        double percentage = (studentScore / maxScore) * 100;
        if (percentage>100)
        {
            System.out.println("Invalid entry, Please check student score!");}
        else if (percentage > 90 && percentage <= 100)
        {
            System.out.println("Your percentage is; " + percentage + " and your grade is: A. ");
        }
        if (percentage > 80 && percentage < 91) {
            System.out.println("Your percentage is:" + percentage + " and your grade is: B. ");
        } else if (percentage > 70 && percentage < 81) {
            System.out.println(" Your percentage is:" + percentage + " and your grade is: C. ");
        } else if (percentage > 60 && percentage < 71) {
            System.out.println("Your percentage is:" + percentage + " and your grade is: D. ");
        } else if (percentage > 50 && percentage < 61) {
            System.out.println("Your percentage is: " + percentage + " and your grade is E.");
        } else if (percentage <= 50) {
            System.out.println(" Your percentage is: " + percentage + " and your grade is: F.");
        }

        /**
         * store value in a int variable
         * if number is divisible by 3, print "divisible by 3"
         * if number is divisible by 5, print "divisible by 5"
         * if number is divisible by 3 and 5, print "divisible by both"
         * if not divisible by 3 or 5, print the numbr
         */

        int num =41;
        if (num%3==0&&num%5==0)
        {
            System.out.println("divisible by both");
        }
        else if (num%3==0)
        {
            System.out.println("divisible by 3");
        }
        else if (num%5==0) {
            System.out.println("divisible by 5");
        }

           else if (num%3!=0||num%5!=0)
            {
                System.out.println("The number is:"+ num);
            }

        /**
         * checking car mode (P,N,R,D)
         * If car mode is P and "you can park the car"
         * If car mode is D drive car
         *             if drive type is snow, display "you are on Snow mode"
         *             If drive type is sport, display "you are on Sport mode"
         *             If drive type is Eco, display "you are on Eco mode"
         * If car is N, display " put car in car wash"
         * If car more is R, display " Reverse the car"
         */

        char shift='D';
        String dMode="Sport";
        switch(shift) {
            case 'P':
                System.out.println("You can park the car");
                break;
            case 'N':
                System.out.println("Put car in car wash");
                break;
            case 'R':
                System.out.println("Reverse the car");
                break;
            case 'D':
                switch (dMode) {
                    case "Sport":
                        System.out.println("You are on Sport mode");
                        break;
                    case "Snow":
                        System.out.println("You are on Snow mode");
                        break;
                    case "Eco":
                        System.out.println("You are on Eco mode");
                        break;
                    default:
                        System.out.println("Invalid mode");
                        break;
                }

            default:
                System.out.println("Invalid shift");
                break;
        }


        }

}









