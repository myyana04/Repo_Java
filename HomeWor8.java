public class HomeWor8 {
    public static void main(String[] args) {
        /**
         * task 1:
         * Add all the numbers from given array,
         * and store final result in "total" variable
         */
        double[] doubleArray = {11.23, 43.3, 34, 65.76, 87, 100};
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

        //boolean isPalindrome=;
        String word = "Racecar";
        String[]wordSp=word.split("");
        String isP="";
        for(int i=wordSp.length-1;i>=0;i--){
            isP=isP+wordSp[i];
        }

        boolean isPelindrome=word.equalsIgnoreCase(isP);
        System.out.println("is "+word+" a pelindrome: "+isPelindrome);

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
        int number = 22;
        boolean isPrime=true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime)
            System.out.println("Is "+number+" a prime number: "+isPrime);
        else
            System.out.println("Is "+ number+" a prime number: "+isPrime);
    }
}
