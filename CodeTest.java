public class CodeTest {


    public static void main(String[] args) {
        int[]arr={-1,-3,4,2};
        int a=returnSmallestInt(arr);
        System.out.println(a);


        speedPoint(130);




    }


    /**
     * Question 2:
     * Create a method to return missing smallest positive integer (greater than 0)
     * from given array.
     */

public static int returnSmallestInt(int[]arr){

    int smallestPositiveInt=1;
    for(int i=0; i<arr.length;i++){
        if(arr[i]==smallestPositiveInt){
            smallestPositiveInt++;
        }
    }
    return smallestPositiveInt;

}

/**
 * Question 3:
 * Scenario: Traffic ticketing system
 * Write a method, that will print (not return) the points to be charged against
 * the license for over speeding.
 *
 *    1. Speed Limit = 70
 *    2. Every 5 miles over the speed limit will add 1 point
 *    3. If user speed is such that system shows 12 points for a speed
 *      then print, license is suspended
 *
 *  Example:
 *      user speed = 74 ; 0 points
 *      user speed = 78 ; 1 points  // 70-75(1) 75-78(0) = 1
 *      user speed = 88 ; 3 points  // 70-75(1) 75-80(1) 80-85(1) 85-88(0) = 3
 *      user speed = 178 ; 21 points (License suspended).
 *      user speed = 70 ; Thank you for driving within the speed limit.
 *
 */


public static void speedPoint(int num){

    int speedlimit=70;
    int speedOverLimit=num-speedlimit;
    int point=speedOverLimit/5;
    if(num>0&&num<=70) {
        System.out.println("Thank you for driving with in the speed limit");
    }
    else if(num>70&&num<75&&point<=0){
        System.out.println("Ypur speed is "+num+" and your point is: "+point);
    }else if(num>70&&point<12){
        System.out.println("Your speed is "+num+" and point is: "+point);
    }else if(num>70&&point>=12){
        System.out.println("Your speed is "+num+" and your liecense suspended");
    }


}



}











