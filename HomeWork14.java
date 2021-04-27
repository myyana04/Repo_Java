import java.util.*;
import java.util.ArrayList;

public class HomeWork14 {
    public static void main(String[] args) {

        //find all duplicates values with count from the given List<String>

        String[] arrStr = {"happy", "peace", "joy", "grow", "joy", "laugh", "happy", "laugh", "joy", "peace"};
        List<String> words = Arrays.asList(arrStr);
        System.out.println(duplicatedValues(words));

        //print the keys with same value, else "All keys have different values
        //{111="happy"}, {98="peace"}, {10="LAugh"}, {55="learn"}, {101="Grow"}]

        Map<Integer, String> keyValue = new HashMap<>();
        keyValue.put(111, "happpy");
        keyValue.put(98, "peace");
        keyValue.put(10, "laugh");
        keyValue.put(55, "learn");
        keyValue.put(101, "grow");
        sameOrDifferentValue(keyValue);

        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(101,"happy");
        myMap.put(10,"job");
        myMap.put(908,"learn");
        myMap.put(1111,"grow");
        myMap.put(76,"HappY");
        System.out.println(sameOrDifferentValue(myMap));

        /** Create a method that will take String-array as input
         *
         * If there is a color with maximum count, return the color name
         * If there are two or more colors with same number, return all.
         */

        String[] arr = {"green", "blue", "red", "yellow", "grey", "green", "red", "grey",
                "green", "red", "yellow", "yellow", "grey", "blue", "yellow", "grey",
                "green", "blue", "yellow", "grey", "green", "blue", "green", "green",
                "green", "green"};

        System.out.println(maxColorCount(arr));



    }
    //Create a method, that will return all duplicates values with count from the given List<String>


    public static Map<String, Integer> duplicatedValues(List<String> words) {
        Map<String, Integer> numberDuplicatedValues = new HashMap<>();
        int count = 1;
        for (int i = 0; i < words.size(); i++) {
            for (int j = i + 1; j < words.size(); j++) {
                if (words.get(i).equalsIgnoreCase(words.get(j))) {
                    count++;
                }
            }
            if (count > 1 && !numberDuplicatedValues.containsKey(words.get(i))) {
                numberDuplicatedValues.put(words.get(i), count);
            }
            count = 1;
        }
        return numberDuplicatedValues;
    }

    //Create method that will print the keys with same value, else "All keys have different values

    public static Map<String, List<Integer>> sameOrDifferentValue(Map<Integer, String> keyValue) {
        List<String> listOfValues = new ArrayList<>(keyValue.values());
        List<String> listOfDuplicatedValues = new ArrayList<>();
        Map<String, List<Integer>> output = new HashMap<>();
        for (int j = 0; j < keyValue.size(); j++) {
            for (int i = j + 1; i < keyValue.size(); i++) {
                if (listOfValues.get(j).equalsIgnoreCase(listOfValues.get(i)) && !listOfDuplicatedValues.contains(listOfValues.get(j).toLowerCase())) {
                    listOfDuplicatedValues.add(listOfValues.get(j).toLowerCase());
                }
            }
        }
        if (listOfDuplicatedValues.size() == 0) {
            System.out.println("All keys have different values");
            return output;
        }
        List<Integer> keyList = new ArrayList<>();
        for (int e = 0; e < listOfDuplicatedValues.size(); e++) {
            for (Integer key : keyValue.keySet()) {
                if (keyValue.get(key).equalsIgnoreCase(listOfDuplicatedValues.get(e))) {
                    keyList.add(key);
                }
                output.put(listOfDuplicatedValues.get(e) + " with keys ", keyList);
            }
            keyList = new ArrayList<>();
        }
        return output;
    }

    /**Create a method that will take String-array as input
         *
                 * If there is a color with maximum count, return the color name
         * If there are two or more colors with same number, return all.
         */

    public static List<String> maxColorCount(String[] arr) {
        Map<String, Integer> colorsWithCount = new HashMap<>();
        int count = 1;
        for (int j = 0; j < arr.length; j++) {
            for (int i = j + 1; i < arr.length; i++) {
                if (arr[j].equalsIgnoreCase(arr[i])) {
                    count++;
                }
            }
            if (!colorsWithCount.containsKey(arr[j])) {
                colorsWithCount.put(arr[j], count);
                count = 1;
            }
        }
        List<String> colorMaxCount = new ArrayList<>();
        int tempMaxVal = 1;
        for (String color : colorsWithCount.keySet()) {
            if (colorsWithCount.get(color) > tempMaxVal) {
                tempMaxVal = colorsWithCount.get(color);
            }
        }
        for (String color : colorsWithCount.keySet()) {
            if (colorsWithCount.get(color) >= tempMaxVal) {
                colorMaxCount.add(color);
            }
        }
        return colorMaxCount;

    }
}