import java.util.Arrays;
import java.util.Locale;

public class NewPractice {

    //method to return names more then 6 letters long
    public void returnNames_6_orMoreLetters(String[] names) {
        int maxLen = 0;
        for (int i = 0; i < names.length; i++) {
            if (names[i].length() >= 6) {
                maxLen = maxLen + 1;
            }



        }
        String[]noOfNames_6=new String[maxLen];
        int j=0;
        for(int i=0;i<names.length;i++){
            if(names[i].length()>=6){
                noOfNames_6[j]=names[i];
                j++;





            }
            System.out.println(Arrays.toString(noOfNames_6));

        }
    }
    public static void main(String[] args) {

        int[] jen = {11, 22, 33, 44, 55};
        int[] jenRev = new int[jen.length];
        int d = 0;
        for (int i = 0; i < jen.length; i++) {
            jenRev[d] = jen[jen.length - 1 - i];
            d++;

        }
        System.out.println(Arrays.toString(jenRev));


        String[] words = {"happy", "peacr", "joy", "grow", "learn", "teach", "love"};
        //print all words in odd index
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
        for (int i = 1; i < words.length; i += 2) {
            System.out.println(words[i] + " ");
        }
        for (int i = 0; i < words.length; i++) {
            if (i % 2 == 0) {
                System.out.println(words[i]);
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("hello");
        }
        String words123 = "happy peace joy grow learn teach love fun";
        String[] wordsAfS = words123.toLowerCase().split("");
        int count = 0;
        for (int i = 0; i < wordsAfS.length; i++) {
            if (wordsAfS[i].equals("a") || wordsAfS[i].equals("e") || wordsAfS[i].equals("i") || wordsAfS[i].equals("o") || wordsAfS[i].equals("u")) {
                count = count + 1;
            }

        }
        System.out.println(count);
        System.out.println(wordsAfS.length);

        char[] letters = {'A', 'B', 'C', 'D', 'E'};
        /*
            Letter at index-0: A
            Letter at index-1: B
            Letter at index-2: C
            Letter at index-3: D
            Letter at index-4: E
         */
        for (int i = 0; i < letters.length; i++) {
            System.out.println("Letter of index-" + i + ": " + letters[i]);
        }
        int j = 0;
        while (j < letters.length) {
            System.out.println("Letter of index-" + j + ": " + letters[j]);
            j++;
        }


        int l = 0;
        for (char alp : letters) {
            System.out.println("Letter of index-" + l + ": " + letters[l]);
            l++;

        }
        double result = div2Numbers(0, 2);
         System.out.println(result);


        String afterRev = reverseString("Happy Holidays");
        System.out.println(afterRev);

        String theAbb = createAbbr("Happy New Year");
        System.out.println(theAbb);
        crAb("Happy Hallowen");

        greetUser("     ");
        String titleString = titleCase("veRy gOOd mOrning");
        System.out.println(titleString);
        String grade = studentGrade(850.00, 1000);
        System.out.println(grade);
        int[] arr = {11, 22, 32, 42, 52};
        int low = arr.length;
        System.out.println(low);
        for (int m = 0; m < low; m++) {


        }
        int s = numSent("My Java Class is good, i like it");
        System.out.println(s);
        //int[]validData={10,20,30,40};
        //for(int i = 0; i < validData.length; i++)

        {

            // validData[i] =0+validData[validData.length - i - 1];
            //System.out.println(validData[i]);
        }

        String sentence_3 = "hello ";
        boolean result1 = sentence_3.length() > 10 ? true : false;
        System.out.println(result1);
        /**
         * Assign result as true if length of sentence_3 is greater than 10
         * else assign false
         *
         * Hint: use ternary operator
         */


        String sentence_4 = "We all ARe Good ProgRommeR";
        String afterRep = sentence_4.toLowerCase(Locale.ROOT).replace('r', 'f');
        System.out.println(afterRep);
        /**
         *  1. Replace all 'r' with 'f' (Ignore cases)
         */


        String fullName = "Rasel Chowdhury";
        int fullNameLen = fullName.length();
        System.out.println(fullNameLen);
        boolean isStartsWith = fullName.toLowerCase().startsWith("k");
        System.out.println(isStartsWith);
        boolean isCont = fullName.toLowerCase().contains("a");
        System.out.println(isCont);
        /**
         * 1. Display the length of your fullname.
         * 2. Does your name start with 'K' (ignore cases)
         * 3. Does your full name contain 'a' (ignore cases)
         */
        String fullN = "happy peace";

        boolean isFNSk = fullN.toLowerCase().startsWith("k");
        System.out.println(isFNSk);
        int lat = fullN.lastIndexOf(" ");

        if (lat > 0) {
            boolean a = fullN.substring(lat).toLowerCase().endsWith("a");
            System.out.println(a);
        } else {
            System.out.println("No last name enter");
        }

       // if (lat > 0) {
            System.out.println(fullN.substring(lat, (lat + 1)));
        //} else {
            //System.out.println("No last name enter");
            /**
             * 1. Does first name start with 'K' (ignore cases)
             * 2. If user has a last name, Does last name ends with 'a' (ignore cases)
             *      else print, "No last name entered"
             * 3. If user has a last name, print the 1st letter of last name
             *      else print, "No last name entered"
             * 4. Print the number of letters in the first name.
             */


        }




         static double div2Numbers ( double num1, double num2){
            double res = 0.0;
            if (num2 != 0) {
                res = (num1 / num2);
            }
            return res;
        }

        public static String reverseString (String rString){


            String reverseSentence3 = "";

            String[] sent3Split = rString.split("");
            for (int i = sent3Split.length - 1; i >= 0; i--) {
                reverseSentence3 = reverseSentence3 + sent3Split[i];
            }
            return reverseSentence3;
        }

        public static String createAbbr (String aString){
            String[] sent2Split = aString.toUpperCase().split(" ");
            String abbreviation = "";
            for (int i = 0; i < sent2Split.length; i++) {
                abbreviation = abbreviation.trim() + sent2Split[i].charAt(0);
            }
            return abbreviation;
        }

        public static void crAb (String bString){
            String abbr = "";
            String[] afterS = bString.toUpperCase().split(" ");
            for (int i = 0; i < afterS.length; i++) {
                abbr = abbr.trim() + afterS[i].substring(0, 1);
            }
            System.out.println(abbr);
        }

        public static void greetUser (String fName){
            if (fName.trim().length() == 0) {
                System.out.println("Hello user");
            } else {

                String[] fnamS = fName.trim().split(" ");

                String ffN = fnamS[0].substring(0, 1).toUpperCase() + fnamS[0].substring(1).toLowerCase();

                System.out.println("Hello: " + ffN);
            }
        }

        // Due: Mar 25, 2021
        /**
         * Write a method to convert given string into Titlecase
         */
        /**
         * Write a method that will tell grade to student for given score and MaxScore
         */
        /**
         * Write a method that will reverse any given int-array
         */
        /**
         * Write a method that return the number of words in given sentence.
         */


        public static String titleCase (String aString){


            String titleString = "";
            if (aString.trim().length() > 0) {
                String[] aStS = aString.trim().split(" ");
                for (int i = 0; i < aStS.length; i++) {
                    titleString = titleString + aStS[i].substring(0, 1).toUpperCase() + aStS[i].substring(1).toLowerCase() + " ";

                }
            }
            return titleString.trim();


        }

        public static String studentGrade ( double studentScore, double maxScore){

            String studentGrade = "";
            double percentage = (studentScore / maxScore) * 100;
            if (percentage <= 0 || percentage >= 100) {
                studentGrade = "Invalid Entry, please re-enter";

            } else if (percentage > 90 && percentage <= 100) {
                studentGrade = "Student grade is --> A";
            } else if (percentage > 80 && percentage <= 90) {
                studentGrade = "Student grade is --> B";
            } else if (percentage > 70 && percentage <= 80) {
                studentGrade = "Student grade is --> C";
            } else if (percentage > 60 && percentage <= 70) {
                studentGrade = "Student grade is -->D";
            } else if (percentage <= 60) {
                studentGrade = "Student grtade is -->F";
            }
            return studentGrade;

        }
        public static void reverseIntArr ( int[] arr){


            if (arr.length > 0) {
                for (int i = arr.length - 1; i <= 0; i--) {
                    System.out.println(arr[i] + " ");
                }


            }
        }

        public static int numSent (String aString){
            int length = 0;
            if (aString.length()>0){
            String[] aArray = aString.split(" ");
            length = aArray.length;}
            return length;
        }




    }

































