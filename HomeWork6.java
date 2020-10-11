public class HomeWork6 {



    public static void main(String[] args) {
        int[] myInput = {32, 15, 99, 12, 40, 9};
        double arrAve = arrAve(myInput);
        System.out.println("Average of my inputs is " + arrAve);


        String[] allNames = {"Rasel", "Dimitri", "Pavlo", "John", "Johnson","Johnny"};
        String findName = "Dimitri";
        findNameIndex(allNames, findName);


    }
    //Create a method to find average of an int-array

    public static double arrAve(int[] arr) {
        double total = 0;
        for (int j = 0; j < arr.length; j++) {
            total = total + arr[j];
        }
        int totaslNoOfInput = arr.length;
        return total / totaslNoOfInput;

    }

    // Create a method (NO return) that will print the index of given name in the given array

    public static void findNameIndex(String[] names, String namesToSearch) {

        for (int i = 0; i <= names.length; i++) {
            if (names[i].equalsIgnoreCase(namesToSearch)) {
                System.out.println(" The index of " + namesToSearch + " is " + i);
                break;

            }

        }


    }

}






