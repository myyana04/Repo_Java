import java.util.Arrays;

public class NewPrac2 {
    public static void main(String[] args) {
        String fullName = "happy peace Joy love";
        /**
         * 1. Does first name start with 'K' (ignore cases)
         * 2. If user has a last name, Does last name ends with 'a' (ignore cases)
         *      else print, "No last name entered"
         * 3. If user has a last name, print the 1st letter of last name
         *      else print, "No last name entered"
         * 4. Print the number of letters in the first name.
         */
        String[] fullNameSplit = fullName.split(" ");
        boolean isFirstNameStartsWith_K = fullNameSplit[0].toUpperCase().startsWith("K");
        System.out.println("Does first name starts with K: " + isFirstNameStartsWith_K);
        int r = fullNameSplit.length;
        String q = fullNameSplit[r - 1];
        if (fullNameSplit.length > 1) {
            System.out.println("deos last name ends with a: " + q.toLowerCase().endsWith("a"));
            System.out.println("Ist letter of last name: " + q.substring(0, 1));

        } else {
            System.out.println("No last name entered");
        }
        System.out.println("No of letters in the first name is: " + fullNameSplit[0].length());


        /**
         * String threeWordsSentence_1 =  "hApPY nEW yeAr";
         * sout(threeWordsSentence_1);  // hApPY nEW yeAr
         * // code
         * sout(threeWordsSentence_1);  // Happy New Year
         */
        String threeWordsSentence_1 = "hApPY nEW yeAr";
        System.out.println(threeWordsSentence_1);
        threeWordsSentence_1 = threeWordsSentence_1.toUpperCase();
        String[] threeWordsSentence_1Split = threeWordsSentence_1.split(" ");

        String firstWord = threeWordsSentence_1Split[0].substring(0, 1) + threeWordsSentence_1Split[0].substring(1).toLowerCase();
        String secondWord = threeWordsSentence_1Split[1].substring(0, 1) + threeWordsSentence_1Split[1].substring(1).toLowerCase();
        String thirdWord = threeWordsSentence_1Split[2].substring(0, 1) + threeWordsSentence_1Split[2].substring(1).toUpperCase();
        System.out.println(firstWord + " " + secondWord + " " + thirdWord);


        /**
         * Create abbreviation:
         *String threeWordsSentence_2 =  "Lab sessIONS clAsses";
         * // code
         * LSC
         *
         */
        String threeWordsSentence_2 = "Lab sessIONS clAsses";
        threeWordsSentence_2 = threeWordsSentence_2.toUpperCase();
        String[] threeWordsSentence_2Split = threeWordsSentence_2.split(" ");
        System.out.println(threeWordsSentence_2Split[0].substring(0, 1) + threeWordsSentence_2Split[1].substring(0, 1) + threeWordsSentence_2Split[2].substring(0, 1));

        /**
         * String sentence_4 = "We all are here to learn good stuff";
         * Print the number of words in the sentence.
         *
         */
        String sentence_4 = "We all are here to learn good stuff";
        String[] sentence_4Split = sentence_4.split(" ");
        System.out.println("The number of words: " + sentence_4Split.length);

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
        double studentScore = 120;
        double maxScore = 800;
        // calculate percentage
        // Your percentage: XX.yy and your Grade is: Z
        double percentage = (studentScore / maxScore) * 100.00;
        if (percentage <= 0 && percentage > 100) {
            System.out.println("Invalid entry");
        } else if (percentage > 90 && percentage <= 100) {
            System.out.println("Your percentage is " + percentage + " and your grade is: A");
        } else if (percentage > 80 && percentage <= 90) {
            System.out.println("Your percentage is " + percentage + " and your grade is: B");
        } else if (percentage > 70 && percentage < 81) {
            System.out.println("Your percentage is " + percentage + " and your grade is: C");
        } else if (percentage > 60 && percentage < 71) {
            System.out.println("Your percentage is " + percentage + " and your grade is: D");
        } else if (percentage > 50 && percentage < 61) {
            System.out.println("Your percentage is " + percentage + " and your grade is: E");
        } else {
            System.out.println("Your percentage is " + percentage + " and your grade is: F");
        }


        /**
         * store value in an int variable
         * if number is divisible by 3, print "divisible by 3"
         * if number is divisible by 5, print "divisible by 5"
         * if number is divisible by 3 and 5, print "divisible by both"
         * if not divisible by 3 or 5, print the number
         */
        int num = 3;
        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println(num + " Is divisible by both 3 1nd 5");
        } else if (num % 3 == 0) {
            System.out.println(num + " Is divisible by 3");
        } else if (num % 5 == 0) {
            System.out.println(num + " Is divisible by 5");
        } else {
            System.out.println(num + " Is not divisible by 3 or 5");


        }

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
        String carGear = "d";
        String driveType = "Eco";
        switch (carGear.toLowerCase()) {
            case "p":
                System.out.println("Please park your car");
                break;
            case "n":
                System.out.println("Put car in a car wash");
                break;
            case "r":
                System.out.println("Reverse the car");
                break;
            case "d":
                if (driveType.equalsIgnoreCase("snow"))
                    System.out.println("You re on snow mode");
                else if (driveType.equalsIgnoreCase("sport"))
                    System.out.println("You are on Sport mode");
                else if (driveType.equalsIgnoreCase("eco"))
                    System.out.println("You are on eco mode");
                else
                    System.out.println("Wrong mode");
                break;
            default:
                System.out.println("Invalid gear");


        }


        /**
         * String sentence1 =  "hApPY nEW yeAr";
         * sout(sentence1);  // hApPY nEW yeAr
         * // code
         * sout(sentence1);  // Happy New Year
         */
        String sentence1 = "hApPY nEW yeAr";
        System.out.println(sentence1);

        String[] sentence1AfterSplit = sentence1.split(" ");
        sentence1 = "";
        for (int i = 0; i < sentence1AfterSplit.length; i++) {

            sentence1 = sentence1 + sentence1AfterSplit[i].substring(0, 1).toUpperCase() + sentence1AfterSplit[i].substring(1).toLowerCase() + " ";


        }
        System.out.println(sentence1 = sentence1.trim());

        /**
         * Create abbreviation:
         * String sentence2 =  "Lab sessIONS clAsses";
         * // code
         * LSC
         *
         */
        String sentence2 = "Lab sessIONS clAsses are great";
        String abbr = "";
        sentence2 = sentence2.toUpperCase();
        String[] sentence2AfterSplit = sentence2.split(" ");
        for (int i = 0; i < sentence2AfterSplit.length; i++) {
            abbr = abbr + sentence2AfterSplit[i].substring(0, 1);


        }
        System.out.println(abbr);

        /**
         * Reverse a string
         *
         */
        String sentence3 = "happy holidays";
        String reverseSentence3 = "";
        System.out.println("sentence3 : " + sentence3);     // happy holidays
        // code
        // syadiloh yppah
        String[] sentence3AfterSplit = sentence3.split("");

        for (int i = sentence3AfterSplit.length - 1; i >= 0; i--) {
            reverseSentence3 = reverseSentence3 + sentence3AfterSplit[i];
        }
        System.out.println("Reverse sentence3 : " + reverseSentence3);


        /**
         * task 1:
         * Add all the numbers from given array,
         * and store final result in "total" variable
         */
        double[] doubleArray = {11, 22, 33, 44, 55};
        double total = 0;
        for (int i = 0; i < doubleArray.length; i++) {
            total = total + doubleArray[i];
        }
        System.out.println(total);

        /**
         * task 2:
         * Find out if the value stored in word variable is palindrome.
         * And, store the result in "isPalindrome" variable
         * palindrome: string which reads the same in reverse
         * eg:
         * level --> level  (palindrome)
         * eye  --> eye     (palindrome)
         * head --> daeh    (not palindrome)
         */
        String word = "level";
        String[] wordAfterSplit = word.split("");
        String word1 = "";
        for (int i = wordAfterSplit.length - 1; i >= 0; i--) {
            word1 = word + wordAfterSplit[i];
        }
        boolean isPalindrome = word.equalsIgnoreCase(word1);
        System.out.println(isPalindrome);

        /**
         * task3:
         * Find if the value stored in num variable is a prime number or not.
         * And, store the final result in "isPrime" variable
         * prime number -> number which is ONLY divisible by 1 and itself.
         * eg:
         * 5 -> prime
         * 7 -> prime
         * 10 -> not a prime
         */
        int number = 23;
        boolean isPrime = true;
        for (int i = 2; i <= number; i++) {
            if (number % i == 0)
                isPrime = false;
            break;
        }
        if (isPrime) {
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }
        //String words="happy holidays to you";

        String b=titleCase("happpy holidays to you");
        System.out.println(b);
        studentsGrade1(890,900);
        int[]array={11,22,33,44,55};

        revIntArray(array);
        int t=noOfWordsInASent("hello dear, how are you");
        System.out.println(t);


    }

    //Write a method to convert given string into Titlecase

    public static String titleCase(String words) {


        String[] wordsAfterSplit = words.split(" ");
        words = "";
        for (int i = 0; i < wordsAfterSplit.length; i++) {

            words = words + wordsAfterSplit[i].substring(0, 1).toUpperCase() + wordsAfterSplit[i].substring(1).toLowerCase() + " ";


        }
        words = words.trim();
        return words;




    }
    //Write a method that will tell grade to student for given score and MaxScore
    public static void studentsGrade1(double score, double maxScore){


        double percentage = (score/ maxScore) * 100.00;
        if (percentage <= 0 && percentage > 100) {
            System.out.println("Invalid entry");
        } else if (percentage > 90 && percentage <= 100) {
            System.out.println("Your percentage is " + percentage + " and your grade is: A");
        } else if (percentage > 80 && percentage <= 90) {
            System.out.println("Your percentage is " + percentage + " and your grade is: B");
        } else if (percentage > 70 && percentage < 81) {
            System.out.println("Your percentage is " + percentage + " and your grade is: C");
        } else if (percentage > 60 && percentage < 71) {
            System.out.println("Your percentage is " + percentage + " and your grade is: D");
        } else if (percentage > 50 && percentage < 61) {
            System.out.println("Your percentage is " + percentage + " and your grade is: E");
        } else {
            System.out.println("Your percentage is " + percentage + " and your grade is: F");
        }



    }
    //Write a method that will reverse any given int-array
    public static void revIntArray(int[]array){

        int[] revArray=new int[array.length];
        int j=0;
        for(int i=array.length-1;i>=0;i--){
           revArray[j]=array[i];
           j++;


        }
        System.out.println(Arrays.toString(revArray));

    }
    //Write a method that return the number of words in given sentence.
    public static int noOfWordsInASent(String sent){

        int noOfWords=0;
        String[]sentAfterSplit=sent.split(" ");
         noOfWords=sentAfterSplit.length;
        return noOfWords;

    }


}
















