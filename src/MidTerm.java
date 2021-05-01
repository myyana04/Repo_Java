import java.util.Arrays;

public class MidTerm {

    public static int missingNum(int[] array) {

        int missingInt = 1;
        for (int i = 0; i < array.length; i++)
            if (array[i] == missingInt) {
                missingInt++;
                i = -1;
            }
        return missingInt;

    }


    public static int[] numbers() {
        int[] arr = {4, 6, 3, 8,};
        return arr;

    }

    public static void main(String[] args) {
        String myName = " Rasel";


        int[] arr = {1, 5, 8, 4, 6, 9,};
        numbers();


        dingii(arr);
        for (int i = 10; i <= 1; --i) {
            System.out.println(i);
        }
        int limit = 10;
        int count = 1;
        while (count <= limit) {
            System.out.println("I love computer science");
            count++;
        }
        int[] pussyCat = {2, 6, 3, 8, 1, 5};
        int rasel = missingNm(pussyCat);
        System.out.println(rasel);
        int [] john={34,23,56,98,23,66,43,68};
        int rem=23;
        //int[]jellu=remove(john,rem);
        //System.out.println(Arrays.toString(jellu));


        //int[]roast=removeInt(john,rem);
        // System.out.println(Arrays.toString(roast));


        int[]let={11,33,43,56,22,11,44,11,78};
        int num=11;
       int []dora= removeIn(let,num);
        System.out.println(Arrays.toString(dora));



    }


    public static void dingii(int[] arr) {
        int smallest = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
                int[] myA = {32, 14, 24, 98, 24, 56, 148, 24, 78, 24};
                int numbere = 24;
                int[] result = removeNum(myA, numbere);
                System.out.println(result);

            }
        }


    }

    // Input array numbers: {32, 14, 24, 98, 24, 56, 148, 24, 78, 24}
    // Input target number: 24

    public static int[] removeNum(int[] array, int num) {
        int j = 0;


        for (int number : array) {
            if (number == num) {
                j++;
            }
        }


        if (j == 0) {
            return array;
        }

        int[] result = new int[array.length - j];
        int index = 0;
        for (int value : array) {
            if (value != num) {
                result[index] = value;
                index++;
            }
        }
        array = null;
        return result;


    }

    public static int missingNm(int[] array) {
        int missingIn = 1;
        for (int i = 0; i < array.length; i++)
            if (array[i] == missingIn) {
                missingIn++;
                i = -1;
            }
        return missingIn;
    }

    int [] john={34,23,56,98,23,66,43};
    int rem=23;

   // public static int[] removeInt(int[] array, int remove) {
     // int[] temp = new int[array.length];
      //int count = 0;
    //int duplicates = 0;
    //for (int j : array) {
     //if (j != remove) {
       //  temp[count] = j;
      //count++;
    //} else duplicates++;
    //}
    // int[] result = new int[temp.length-duplicates];
    // for (int i = 0; i < temp.length-duplicates; i++) {
     //  result[i] = temp[i];
   // }
   // return result;
   // }


   // public static int[] remove(int[] numbers, int target) {
     //   int count = 0;

        // loop over array to count number of target values.
        // this required to calculate length of new array
       // for (int number : numbers) {
         //   if (number == target) {
           //     count++;
           // }
        //}

        // if original array doesn't contain number to removed
        // return same array
       // if (count == 0) {
         //   return numbers;
       // }

       // int[] result = new int[numbers.length - count];
       // int index = 0;
       // for (int value : numbers) {
          //  if (value != target) {
              //  result[index] = value;
              //  index++;
           // }
        //}
      //  numbers = null;// make original array eligible for GC                  return result;
     //   return result;





       public static int[] removeIn(int[] numb, int num) {
            int[] copy = new int[numb.length];
            int countRemoved = 0;
            int j = 0;
            for (int i = 0; i < numb.length; i++) {
                if (numb[i] != num) {
                    copy[j++] = numb[i];
                } else
                    countRemoved++;
            }
            int[] newCopy = new int[numb.length - countRemoved ];
            for (int i = 0; i < newCopy.length; i++)
                newCopy[i] = copy[i];
            return newCopy;
        }



    }


















