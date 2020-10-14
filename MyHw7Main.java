package HomeWork7;

public class MyHw7Main {

    public static void main(String[] args) {
        MyHw7 a1 = new MyHw7();

        //Create a method to add all the numbers in a array with double-values
        double[] res = {45.23, 54.67, 20.12};
        double result = a1.addArry(res);
        System.out.println(result);


        //Create a method to verify if the input-int-number is prime or no
        int num = 20;
        boolean isItPrime = a1.checkPrimeNumber(num);
        System.out.println("is " + num + " is a prime number: " + isItPrime);

        //Create a method to find if given string is palindrome.
        String word = "johhy";
        boolean isPalindrome = a1.isItPalindrome(word);
        System.out.println(word + " is palindrome: " + isPalindrome);


        //Write a method to print(no return) the duplicate values in a given String array.
        String[] strValues = {"lake", "river","sky", "Sea", "Lake","river","sea"};

        a1.findDupSt(strValues);
    }
}