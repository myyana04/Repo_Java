public class MidTermCodeTest {
    public static void main(String[] args) {
        int[]arr={1,6,-3,5,2,4,3,8};
        int missingInt=missingNum(arr);
        System.out.println(missingInt);
        speedPoint(75);

    }

    // Question 2:
    //Create a method to return missing smallest positive integer (greater than 0)
    //from given array.


    public static int missingNum(int[] array) {

        int missingInt = 1;
        for (int i = 0; i < array.length; i++)
            if (array[i] == missingInt) {
                missingInt++;
                i=-1;



            }
        return missingInt;
    }

    /**
     * Question 3:
     * Scenario: Traffic ticketing system
     * Write a method, that will print (not return) the points to be charged against
     * the license for over speeding.
     * <p>
     * 1. Speed Limit = 70
     * 2. Every 5 miles over the speed limit will add 1 point
     * 3. If user speed is such that system shows 12 points for a speed
     * then print, license is suspended
     * <p>
     * Example:
     * user speed = 74 ; 0 points
     * user speed = 78 ; 1 points  // 70-75(1) 75-78(0) = 1
     * user speed = 88 ; 3 points  // 70-75(1) 75-80(1) 80-85(1) 85-88(0) = 3
     * user speed = 178 ; 21 points (License suspended).
     * user speed = 70 ; Thank you for driving within the speed limit.
     */


    public static void speedPoint(int num) {

        int speedlimit = 70;
        int speedOverLimit = num - speedlimit;
        int point = speedOverLimit / 5;
        if (num > 0 && num <= 70) {
            System.out.println("Thank you for driving with in the speed limit");
        } else if (num > 70 && num < 75 && point <= 0) {
            System.out.println("Ypur speed is " + num + " and your point is: " + point);
        } else if (num > 70 && point < 12) {
            System.out.println("Your speed is " + num + " and point is: " + point);
        } else if (num > 70 && point >= 12) {
            System.out.println("Your speed is " + num + " and your liecense suspended");
        }


    }
    /**
     * Question 1:
     * Create a method to return an int-array
     * after removing a given int-value from a given int array.
     *
     * Input array: /**
     *      * Question 1:
     *      * Create a method to return an int-array
     *      * after removing a given int-value from a given int array.
     *      *
     *      * Input array: {32, 14, 24, 98, 24, 56, 148, 24, 78, 24}    Input Number: 24
     *      * Returned array: {32, 14, 98, 56, 148, 78}
     *      *
     *      * Input array:     {1, 2, 4, 3, 1, 6, 1}    Input Number: 11
     *      * Returned Array:  {1, 2, 4, 3, 1, 6, 1}
     *          Input Number: 24
     * Returned array: {32, 14, 98, 56, 148, 78}
     *
     * Input array:     {1, 2, 4, 3, 1, 6, 1}    Input Number: 11
     * Returned Array:  {1, 2, 4, 3, 1, 6, 1}
     */

public int[] returnIntArray(int[]array, int num){
    int count =0;
    for (int newNum:array) {
        if (newNum == num) {
            count++;
        }
    }
        int[]newArray=new int[array.length-count];


    int j=0;
    for(int i=0;i<array.length;i++){
        if(array[i]!=num){
            newArray[j]=array[i];
            j++;

        }
    }
    return newArray;



}





}
