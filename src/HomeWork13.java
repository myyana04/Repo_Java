import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Create a method that can find if the given array has any duplicate data or not?

public class HomeWork13<dupValue> {
    public static void duplicateVal(String[] words) {
        int count = 0;
        List<String> newWords = Arrays.asList(words);
        for (int i = 0; i < newWords.size(); i++) {
            int indexOfWord = newWords.indexOf(newWords.get(i));
            int lastIndexOfWord = newWords.lastIndexOf(newWords.get(i));
            if (indexOfWord == lastIndexOfWord) {
                count++;
            }
        }
        if (count > 0) {
            System.out.println("Arrays has duplicate data");
        } else {
            System.out.println("Array doesn't have duplicate data");


        }


    }

    /**
     * Create a method that would return the values occurring more than one time in given string-array
     */

    public static List<String> valuesMoreThen1(String[] words) {
        List<String> dupValue = new ArrayList<>();

        for(int i=0;i< words.length;i++){
            for(int p=i+1;p<words.length;p++){
                if(words[i].equalsIgnoreCase(words[p])&&!(dupValue.contains(words[i]))){

                    dupValue.add(words[i]);


                }

                }

            }

        return dupValue;

    }

    /**
     * Question 3:
     * Create a method that will take String-array as input
     *
     * If there is a color with maximum count, return the color name
     * If there are two or more colors with same number, return all.
     */

    

    public static void main(String[] args) {

        String[] words = {"happy", "peace", "joy", "grow", "laugh","joy", "happy", "laugh", "joy","happy","joy"};

        duplicateVal(words);

        String[] arr = {"green", "blue", "red", "yellow", "grey", "green", "red", "grey",
                "green",  "red", "yellow", "yellow", "grey", "blue" , "yellow", "grey",
                "green", "blue",  "yellow", "grey", "green", "blue", "green", "green",
                "green", "green"};

        List<String>l1=valuesMoreThen1(words);
        System.out.println(l1);





                }







}
