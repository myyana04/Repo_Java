import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class DinGi {


    public static void main(String[] args) {


        /**Home Work -->1
        /**
         Store below scenario value in an appropriate dataType variable, and print the same in console.
         1. number of hours in a day (byte)
         2. max no. of days in an year
         3. total number of employees in an organization
         4. population in a country
         5. interest rate
         6. balance in a bank account
         7. does the sun rise from the west? Store answer
         8. initials of your name (^Use: char) Hello World ---- HW  --- need 2 char variable
         9. Your full name

        byte noOfHours = 24;
        System.out.println("There are " + noOfHours + " hours in a day");
        short maxDaysInAYear = 366;
        System.out.println("There are " + maxDaysInAYear + " days in a year");
        int walmartEmployees = 2200000;
        System.out.println("There are " + walmartEmployees + " employees at Walmart");
        long populationOfChina = 1400000000L;
        System.out.println("There are " + populationOfChina + " people in China");
        float mortgageRate = 1.1f;
        System.out.println("Mortgage interest rete is " + mortgageRate + " today");
        double bankBalance = 246851.09;
        boolean isSunRise = true;
        System.out.println("Does sun rise from west: " + isSunRise);
        char firstN = 'R';
        char lastN = 'C';
        System.out.println("Initial of my name is--> " + firstN + lastN);
        String fullN = "Rasel Chowdhury";
        System.out.println("My full name is " + fullN);

        /**
         * Home Work 2;
         * F--C;
         * C--F;
         * C--K;
         * K--F;
         * F--K;
         * K--C;


        double fTemp = 133;
        double fahrenToC = ((5.0 / 9) * (fTemp - 32)); // F-->C=(5/9)(F-32);
        System.out.println(fTemp + " degree Fahrenheit = " + fahrenToC + " in C");
        double cTemp = 133;
        double celToF = ((9.0 / 5) * (cTemp)) + 32; // C-->F=(9/5)(C)+32;
        System.out.println(cTemp + " deg celsius is equal to " + celToF + " in Fahrenheit");
        double kTemp = 133;
        double kToC = kTemp - 273; // K-->C=K-273;
        System.out.println(kTemp + " in Kelvin is equal to " + kToC + " in celsius");
        double fToK = ((5.0 / 9) * (fTemp - 32)) + 273; //F-->K=5/9(F-32)+273
        System.out.println(fTemp + " in F is equal to " + fToK + " in Kalvin");
        double kToF = ((9.0 / 5) * (kTemp - 273)) + 32; // K-->F=9/5(K-273)+32
        System.out.println(kTemp + " in K is equal to " + kToF + " In F");
        System.out.println(cTemp + " in C is equql to " + (cTemp + 273) + " in k");// C-->K=C+273


         * HOME WORK #
         * Store your full name in a variable, and display the following:
         *     1. Display length of the first name.
         *     2. Does your last name starts with "K" (Ignoring cases)
         *     3. print the last alphabet of your first name
         *     4. Does your last name ends with "M" (Ignoring cases)


        String fullName = " Rasel Chowdhury";


        /**
         * String myStatment = "I am a good programmer";
         * Use string methods to do following tasks:
         * 	1. Display the total number of words in the myStatement.
         * 	2. replace all the 'r' characters with 'f' characters

        /**
         * Store your first name in a string variable.
         * Calculate the length of your first name, without using length() method of String class.
         */

        /**
         *
         * String strNew = "hello dear, how are you?";
         *
         * Assign result (boolean) as true if length of strNew if greater than 10
         * else assign false.
         *
         * print the result value.
         *
         */

        /**
         * String threeWordsSentence =  "hApPY nEW yeAr";
         * sout(threeWordsSentence);  // hApPY nEW yeAr
         * // code
         * sout(threeWordsSentence);  // Happy New Year
         */


        /**
         * Create abbreviation:
         * String threeWordsSentence =  "Lab sessIONS clAsses";
         * // code
         * LSC
         *



        System.out.println(isItPrime(8));
        String[] names = {"Happyness", "Joy", "Happyful", "peaceHappy", "castle", "happyer"};
        String word = "happy";
        wordCheck(names, word);
        List<Integer> allValues = new ArrayList<>();
        allValues.add(11);
        allValues.add(22);
        allValues.add(33);
        boolean remove11 = allValues.remove(new Integer(11));
        System.out.println(remove11);
        System.out.println(allValues);
        List<String> sNames = new ArrayList<>();
        sNames.add("hAppy");
        sNames.add("joy");
        sNames.add("peace");
        sNames.add("gRow");
        sNames.add("peace");
        sNames.add("learN");
        System.out.println(sNames);
        int sNamesSize = sNames.size();
        System.out.println(sNamesSize);
        String removeIndex4 = sNames.remove(4);
        System.out.println(removeIndex4);
        System.out.println(sNamesSize);
        System.out.println(sNames.size());
        System.out.println(sNames);
        System.out.println(sNames.remove(1));
        System.out.println(sNames);
        System.out.println(sNames.remove("learN"));
        System.out.println(sNames.size());
        System.out.println(sNames);
        List<Double> heights = new ArrayList<>();
        heights.add(2.2);
        heights.add(3.3);
        heights.add(4.4);
        heights.add(5.5);
        heights.add(6.6);
        System.out.println(heights);
        double removeIndex2 = heights.remove(2);
        System.out.println(removeIndex2);
        System.out.println(heights.size());
        boolean removeVal = heights.remove(new Double(5.5));
        System.out.println(removeVal);
        System.out.println(heights.remove(1));
        System.out.println(heights);
        double d1 = heights.remove(0);
        System.out.println(d1);
        System.out.println(sNames);
        sNames.add("joy");
        sNames.add("LearN");
        System.out.println(sNames);
        String oldVal = sNames.set(1, "Welcome");
        System.out.println(oldVal);
        System.out.println(sNames);
        System.out.println(heights);
        heights.add(7.7);
        heights.add(8.8);
        double d2 = heights.remove(0);
        System.out.println(d2);
        boolean r3 = heights.remove(new Double(7.7));
        System.out.println(r3);
        System.out.println(heights);
        double rep = heights.set(0, 9.9);
        System.out.println(rep);
        System.out.println(heights);
        String s1 = sNames.get(1);
        List<Boolean> myList = new ArrayList<>();
        myList.add(false);
        System.out.println(myList);
        myList.add(1, true);
        System.out.println(myList);
        boolean b = myList.set(1, false);
        System.out.println(b);
        System.out.println(myList);
        myList.set(myList.size() - 1, true);
        System.out.println(myList);


        //Write code to confirm if grow is appearing on only once in the arraylist
        String[] words1 = {"happy", "peaceful", "nice", "world", "begin", "learn", "love"};
        List<String> newWords = new ArrayList<>();
        // for(int i=0;i<words1.length;i++){
        // newWords.add(words1[i]);

        // System.out.println(newWords);
        List<String> wordLiss = Arrays.asList(words1);
        System.out.println(wordLiss);
        for (String word2 : words1) {
            newWords.add(word2);
        }
        System.out.println(newWords);
        int joy = newWords.indexOf("nice");
        System.out.println(joy);

        String[] words = {"hApPy", "peace", "joy", "peace", "grow", "LearN", "joy", "peace", "happy", "joy", "world", "grow"};
        List<String> assignment1 = Arrays.asList(words);
        int count = 0;
        for (String word2 : assignment1) {
            if (word2.contains("grow")) {
                count++;
            }
            int lastOfPeace = assignment1.lastIndexOf("peace");
            System.out.println(lastOfPeace);
        }//System.out.println("Count = " + count);

        System.out.println(newWords);
        System.out.println(assignment1);
        // Write code to confirm if grow is appearing on only once in the arraylist
        int count1 = 0;
        for (String lov : assignment1) {
            if (lov.equalsIgnoreCase("grow")) {
                count1++;


            }


        }


        if (count1 == 1) {
            System.out.println("grow is present once ");
        } else if (count1 > 1) {
            System.out.println("grow appears more then once");
        } else {
            System.out.println("grow is not present");


        }
        int count2 = 0;
        for (int i = 0; i < assignment1.size(); i++) {
            if (assignment1.get(i).equalsIgnoreCase("grow")) {
                count2++;
            }

        }

        if (count2 == 1) {
            System.out.println("grow is present once ");
        } else if (count2 > 1) {
            System.out.println("grow appears more then once");
        } else {
            System.out.println("grow is not present");


        }
        boolean isCon=assignment1.contains("row");
        System.out.println(isCon);
        boolean isEmp=assignment1.isEmpty();
        System.out.println(isEmp);
        System.out.println(assignment1.size());


        List<Object>anyDataType=new ArrayList<>();
        anyDataType.add(11);
        anyDataType.add("usa");
        anyDataType.add(2.2);
        anyDataType.add(true);
        System.out.println(anyDataType);



        Map<String, Integer> colorCount = new HashMap<>();
        colorCount.put("green", 10);
        colorCount.put("red", 21);
        colorCount.put("blue", 43);
        colorCount.put("orange", 12);
        colorCount.put("violet", 10);
        colorCount.put("pink", 65);
        colorCount.put("white", 7);
        colorCount.put("black", 10);

        /**
         * print the key which has value greater than 8 and less than 21
         *
         * green
         * orange
         * violet
         * black
         *


       int v= colorCount.get("green");
        System.out.println(v);
        colorCount.put("purple",12);
        



    }




    public static boolean isItPrime(int num) {
        boolean isPrime = true;
        for (int i = 2; i <= num; i++) {
            if (num % 2 == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("prime number");

        } else {
            System.out.println("not a prime");
        }
        return isPrime;

    }


    //String[] names = {"Happyness", "Joy", "Happyful", "peaceHappy", "castle", "happyer"};
    // String word = "happy";
    //wordCheck(names,word);
    //create a method to find howmany words have happy with it

    public static void wordCheck(String[] names, String word) {
        boolean isWordWith = true;
        int count = 0;
        for (String words : names) {
            if (words.toLowerCase().contains(word.toLowerCase())) {
                count++;
                isWordWith = false;


            } else if (isWordWith) {
                System.out.println("No word match");
            }

        }
        String[] newString = new String[count];
        int j = 0;
        for (int i = 0; i < names.length; i++) {
            if (names[i].toLowerCase().contains(word.toLowerCase())) {
                newString[j] = names[i];
                j++;

            }
        }
        System.out.println(Arrays.toString(newString));
    }




                Map<String, Integer> colorCount = new HashMap<>();

                System.out.println(colorCount.size());


                colorCount.put("red", 21);
                colorCount.put("blue", 43);
                colorCount.put("orange", 12);
                colorCount.put("violet", 10);
                colorCount.put("pink", 65);
                colorCount.put("white", 7);
                colorCount.put("black", 10);
                colorCount.put("green", 10);
                colorCount.put("shada", 25);


                Integer colorCountSize = colorCount.size();
                System.out.println(colorCountSize);

                Integer removeRed = colorCount.remove("white");
                System.out.println(removeRed);

                boolean removeRedByKeyAndValue = colorCount.remove("blue", 43);
                System.out.println(removeRedByKeyAndValue);

                Integer removeWhiteAgain = colorCount.remove("white");
                System.out.println(removeWhiteAgain);

                System.out.println(colorCount);

                System.out.println(colorCount.remove("black", 20));

                Integer valueWithGreen = colorCount.get("green");
                System.out.println(valueWithGreen);

                Integer valueWithBreen = colorCount.get("Black");
                System.out.println(valueWithBreen);


                System.out.println(colorCount.containsKey("green"));
                System.out.println(colorCount);

                System.out.println(colorCount.containsKey("pink"));
                System.out.println(colorCount.containsValue(22));

                Collection<Integer> myValue = colorCount.values();
                System.out.println(myValue);

                System.out.println(myValue);
                System.out.println(colorCount.values());

                System.out.println(colorCount.entrySet());
                System.out.println(colorCount.isEmpty());
                Set<String> allNames = colorCount.keySet();
                System.out.println(allNames);

                //colorCount.clear();
                System.out.println(colorCount);
                System.out.println(colorCount.size());

                Set<String> allKeys = colorCount.keySet();
                System.out.println(allKeys);

                Collection<Integer> values = colorCount.values();
                System.out.println(values);
                System.out.println(colorCount);
                printKeyWithConditions(colorCount);

                List<String> myNames = new ArrayList<>();
                myNames.add("Malen");
                myNames.add("Arslan");
                Set<String> students = new HashSet<>();
                students.add("John");
                students.add("Puyol");
                myNames.addAll(students);
                System.out.println(myNames);
                System.out.println(students.removeAll(students));
                System.out.println(myNames);

                Map<String, Integer> phnBook = new HashMap<>();
                phnBook.put("Rasel", 347278019);
                phnBook.put("Kaniz", 6352284);
                phnBook.put("Yana", 2197732);
                phnBook.put("King", 564323445);
                System.out.println(phnBook);
                boolean isHere = false;
                for (Map.Entry myEntry : phnBook.entrySet()) {
                    System.out.println("The phone number for " + myEntry.getKey() + " is " + myEntry.getValue());
                    if (myEntry.getKey().equals("ana")) {
                        System.out.println(myEntry.getKey() + " is here");
                        isHere = true;
                    } else if (isHere) {
                        System.out.println(myEntry.getKey() + " is not here");
                    }
                    //System.out.println(phnBook.keySet());
                    //System.out.println(phnBook.entrySet());
                    //System.out.println(phnBook.values());

                }

                String[] words = {"happy", "peace", "joy", "grow", "joy", "laugh", "happy", "laugh", "joy"};
                System.out.println(duplicateValues(words));

                Set<Double> interestRates = new HashSet<>();
                interestRates.add(1.1);
                interestRates.add(2.2);
                interestRates.add(12.2);
                interestRates.add(1.11);
                interestRates.add(2.0);
                interestRates.add(13.1);
                interestRates.add(22.0);
                interestRates.add(1.2);
                /**
                 * find the max mortgage rate?


                double maxRate = -1.0;
                for (double rate : interestRates) {
                    if (rate > maxRate) {
                        maxRate = rate;
                    }

                }
                System.out.println("Max rate is: "+maxRate);


                /**
                 * find the min mortgage rate?
                 */

                /** for (int i : numbers) {
                 if (i < smallest) {
                 smallest = i;
                 } // end finding smallest
                 else if (i > largest) {
                 largest = i;
                 } // end finding largest number
                 } // end finding largest and smallest values


                 }


                double minRate=0;
                for(double i:interestRates){
                    if(minRate<i){
                        minRate=i;
                    }


                }
                System.out.println(minRate);


    /**Map<String, Integer> colorCount = new HashMap<>();
     colorCount.put("green", 10);
     colorCount.put("red", 21);
     colorCount.put("blue", 43);
     colorCount.put("orange", 12);
     colorCount.put("violet", 10);
     colorCount.put("pink", 65);
     colorCount.put("white", 7);
     colorCount.put("black", 10);
     /**
     * Print the color name with max count.
     *
     * pink

    //Collection<Integer> values = colorCount.values();
    //System.out.println(colorCount.values());
                System.out.println("values are: "+values);
    int maxValue=0;
                for (int val:values) {
        if (val > maxValue) {
            maxValue = val;
        }
    }
                System.out.println(maxValue);

    //Set<String> allKeys = colorCount.keySet();
                System.out.println(allKeys);
                for(String key:allKeys){
        if(colorCount.get(key)>=maxValue){
            System.out.println("The color with maximum count is "+key);
            break;
        }
    }

    Map<Integer, String> myMap = new HashMap<>();
                myMap.put(101,"happy");
                myMap.put(10,"job");
                myMap.put(908,"learn");
                myMap.put(1111,"grow");
                myMap.put(76,"HappY");
    Integer checkKey = 101;
    // write code here
    // if value with given key is of length greater than 4 -->
    //      print the value
    //
    // else -->
    //      print 'value not greater than 4'
    //
    // if the given key is not found -->
    //      print 'key not available'

    /**  Collection<Integer> keys=myMap.keySet();
     System.out.println(keys);
     Collection<String>myV=myMap.values();

     boolean isFound=true;
     for (int i:keys){
     if(i==checkKey){
     isFound=false;
     if(myMap.get(i).length()>4){
     System.out.println("length of "+myMap.get(i)+" greater then 4");
     }else if(myMap.get(i).length()<4){
     System.out.println("length of "+ myMap.get(i)+" is not greater then 4");
     }

     }
     }
     if (isFound){
     System.out.println("key not available");

     }


                if(myMap.containsKey(checkKey)){
        if(myMap.get(checkKey).length()>4){
            System.out.println("length of "+myMap.get(checkKey)+" greater then 4");
        }else {
            System.out.println("length of "+ myMap.get(checkKey)+" is not greater then 4");
        }
    }else {
        System.out.println("key not available");
    }
                System.out.println(duplicateValues(words));


    Map<Integer,String>dup=new HashMap<>();
    Collection<Integer> keys=myMap.keySet();
                System.out.println(keys);

                for (String val:myMap.values()){
        for (Integer key:keys){
            if(myMap.get(key).equalsIgnoreCase(val)){

                dup.put(key,val);


            }
        }
        System.out.println(dup);

    }
                System.out.println(duplicateValues(words));
                System.out.println(colorCount.entrySet());

    Date currentTime=new Date();
                System.out.println(currentTime);

                try{
        Thread.sleep(5000);

    }catch (InterruptedException e) {
    }

    currentTime=new Date();
                System.out.println(currentTime);


                Thread.sleep(10000);
    currentTime =new Date();
                System.out.println(currentTime);
}





            public static boolean isItPrime(int num) {
                boolean isPrime = true;
                for (int i = 2; i <= num; i++) {
                    if (num % 2 == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.println("prime number");

                } else {
                    System.out.println("not a prime");
                }
                return isPrime;

            }


            //String[] names = {"Happyness", "Joy", "Happyful", "peaceHappy", "castle", "happyer"};
            // String word = "happy";
            //wordCheck(names,word);
            //create a method to find howmany words have happy with it

            public static void wordCheck(String[] names, String word) {
                boolean isWordWith = true;
                int count = 0;
                for (String words : names) {
                    if (words.toLowerCase().contains(word.toLowerCase())) {
                        count++;
                        isWordWith = false;


                    } else if (isWordWith) {
                        System.out.println("No word match");
                    }

                }
                String[] newString = new String[count];
                int j = 0;
                for (int i = 0; i < names.length; i++) {
                    if (names[i].toLowerCase().contains(word.toLowerCase())) {
                        newString[j] = names[i];
                        j++;

                    }
                }
                System.out.println(Arrays.toString(newString));
            }





























            public static void printKeyWithConditions (Map < String, Integer > givenMap){

                //print the key which has value greater than 8 and less than 21

                Set<String> allKeys = givenMap.keySet();
                for (String key : allKeys) {
                    Integer val = givenMap.get(key);
                    if (val > 8 && val < 21) {
                        System.out.println(key);
                    }


                }
            }


            /**
             * Question 1:
             * Create a method, that will return all duplicates values with count from the given List<String>
             List<String> words = {"happy", "peace", "joy", "grow", "joy", "laugh", "happy", "laugh", "joy"};
             * Output:
             *      happy - 2
             *      joy - 3
             *      laugh - 2


            public static List<String> duplicateValues(String[] words) {
                List<String> dupValue = new ArrayList<>();

                for(int i=0;i< words.length;i++){
                    for(int p=i+1;p<words.length;p++){
                        if(words[i].equalsIgnoreCase(words[p])){

                            dupValue.add(words[i]);


                        }

                    }

                }

                return dupValue;

            }

            /**
             *
             * Question 2:
             * Create a hashMap with any numbers of key-value pairs from the user
             * Key should be Integer
             * Value should be String
             *
             * Create method that will print the keys with same value, else "All keys have different values"
             *
             * Input to method -> [{101="happy"}, {102="peace"}, {103="Happy"}, {104="learn"}, {105="PEaCe"}, {106="HAPPY"}]
             * Output (print) ->
             *      "happy" with keys -> 101, 103, 106
             *      "peace" with keys -> 102, 105
             *
             * Input to method -> [{111="happy"}, {98="peace"}, {10="LAugh"}, {55="learn"}, {101="Grow"}]
             * Output (print) ->
             *      All keys have different values
                 *
                 *      */


        Date d1=new Date();
        //to fetch minutes from d1 data
       SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/yyyy hh:mm:ss a");
        System.out.println(d1);
        System.out.println(sdf.format(d1));  //to fecth minutes from d1
        System.out.println(d1);
        System.out.println(sdf.format(d1));

        /**
         * print "In first half" is current date is less or equal to 15
         * else print "In second half"
         */
        System.out.println(d1);
        System.out.println(sdf.format(d1));
      sdf=new SimpleDateFormat("d");
       String day= sdf.format(d1);
        System.out.println(day);
        System.out.println(d1);
        int d= Integer.valueOf(day); //to change String to int
        System.out.println(d);
        if(d<=15){
            System.out.println("In first half");
        }else {
            System.out.println("In second half");
        }
        Date convertedDate=null;
        String dateText="April 28 2021, 19:11;29";
        SimpleDateFormat sdf2=new SimpleDateFormat("MMM dd yyyy, HH+:mm:ss");  //convert String to Date object

        try {
            convertedDate= sdf2.parse(dateText);
        }catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(convertedDate);


        Date now=new Date();
        boolean isNowEqul=now.equals(dateText);
        System.out.println(isNowEqul);
try {
        boolean isNowBefore=now.before(sdf2.parse(dateText));

    System.out.println(isNowBefore);
        }catch (ParseException e){

        }

        Calendar cal=Calendar.getInstance();
        System.out.println(cal);




















        }












}











