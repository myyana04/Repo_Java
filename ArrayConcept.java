package HomeWork5;

import java.util.Locale;

public class ArrayConcept {
    public static void main(String[] args) {

        String fullName = "happy";
        /**
         * 1. Does first name start with 'K' (ignore cases)
         * 2. If user has a last name, Does last name ends with 'a' (ignore cases)
         *      else print, "No last name entered"
         * 3. If user has a last name, print the 1st letter of last name
         *      else print, "No last name entered"
         * 4. Print the number of letters in the first name.
         */

        String[] fullName1={"Rasel","Hasnath","Chowdhury"};
        boolean firstNameStartsWk=fullName1[0].toUpperCase().startsWith("K");
        System.out.println("Does first name starts witk K: "+firstNameStartsWk);
        int fullNameLen=fullName1.length;
        if(fullNameLen>1){
            System.out.println("Does last name starts with a: "+fullName1[fullNameLen-1].toLowerCase().endsWith("a"));
        }else {
            System.out.println("No last name entered");
        }
        if(fullNameLen>1) {
            String lastName = fullName1[fullNameLen - 1];
            String firstLetter = lastName.substring(0, 1);
            System.out.println("The first letter of last name is: " + firstLetter);
        }else {
            System.out.println("No last name entered");
        }
        System.out.println("Number of letters in the first name is: "+fullName1[0].length());






        /**
         * String threeWordsSentence_1 =  "hApPY nEW yeAr";
         * sout(threeWordsSentence_1);  // hApPY nEW yeAr
         * // code
         * sout(threeWordsSentence_1);  // Happy New Year
         */
        String threeWordsSentence_1 =  "hApPY nEW yeAr";
        System.out.println(threeWordsSentence_1);
        String[]threeWordsSentenceAfterSlit=threeWordsSentence_1.split(" ");
        String w1=threeWordsSentenceAfterSlit[0].substring(0,1).toUpperCase()+threeWordsSentenceAfterSlit[0].substring(1).toLowerCase();
        String w2=threeWordsSentenceAfterSlit[1].substring(0,1).toUpperCase()+threeWordsSentenceAfterSlit[1].substring(1).toLowerCase();
        String w3=threeWordsSentenceAfterSlit[2].substring(0,1).toUpperCase()+threeWordsSentenceAfterSlit[2].substring(1).toLowerCase();
        threeWordsSentence_1=w1+" "+w2+" " +w3;
        System.out.println(threeWordsSentence_1);


        /**
         * Create abbreviation:
         * String threeWordsSentence_2 =  "Lab sessIONS clAsses";
         * // code
         * LSC
         *
         */
        String threeWordsSentence_2 =  "Lab sessIONS clAsses";
        String[]afterSplit=threeWordsSentence_2.split(" ");
        String abbreviation=afterSplit[0].substring(0,1).toUpperCase()+afterSplit[1].substring(0,1).toUpperCase()+afterSplit[2].substring(0,1).toUpperCase();
        System.out.println("Abbreviation of given three words sentence is: "+abbreviation);



        /**
         * String sentence_4 = "We all are here to learn good stuff";
         * Print the number of words in the sentence.
         *
         */
        String sentence_4 = "We all are here to learn good stuff";
        String[]sentence_4split=sentence_4.split(" ");
        int sentence_4Length=sentence_4split.length;
        System.out.println("The number of words in the given sentence is: "+sentence_4Length);

    }
}
