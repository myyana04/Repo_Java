import java.util.Arrays;

public class Exam {
    public static void main(String[] args) {
        int[] arr = {23, 1, 87, 23, 65, 78, 19, 23};
        int num = 23;
        int[] res = remove(arr, num);
        System.out.println(Arrays.toString(res));

    int smallest=missingNum(arr);
        System.out.println(smallest);


        points(142);



    }





//Create a method to return an int-array after removing a given int-value
    //from a given int array.


    public static int[] remove(int[] numbers, int target) {
        int count = 0;


        for (int number : numbers) {
            if (number == target) {
                count++;
            }
        }


        if (count == 0) {
            return numbers;
        }

        int[] result = new int[numbers.length - count];
        int index = 0;
        for (int value : numbers) {
            if (value != target) {
                result[index] = value;
                index++;
            }
        }
        numbers = null;
        return result;


    }

    //Create a method to return missing smallest positive integer (greater than 0)
         //from given array.

    public static int missingNum(int[] array) {

        int missingInt = 1;
        for (int i = 0; i < array.length; i++)
            if (array[i] == missingInt) {
                missingInt++;
                i = -1;
            }
        return missingInt;
    }

    //Write a method, that will print (not return) the points charged against
            //the license for over speeding.

           // 1. Speed Limit = 70
           // 2. Every 5 miles over the speed limit will add 1 point
            //3. If user gets 12 points for a speed then license is suspended

    public static void points(int speed){
        int limit=70;
        int p=0;
        if(speed<=70) {
            System.out.println(" Thank you for driving with in speed limit. ");
        }else{
            if(speed>limit) {
                p = (speed - limit) / 5;
            }
            System.out.println(p +" points");
            }
        if(p>=12){
            System.out.println("Liecence is suspended!!! ");
        }



    }


}

