import java.util.Arrays;

public class HomeWork9 {
    public static void main(String[] args) {

        String a=titleCase("happy new year");
        System.out.println(a);

        String grade=studentGrade(850,1000);
        System.out.println(grade);

        int[] toRev={10,20,30,40,50};
       revIntArray(toRev);
        ;

       int wordsInSentence= wordsInSent("happy new year");
        System.out.println(wordsInSentence);




    }
        //Write a method to convert given string into Titlecase

        public static String titleCase (String aString){


            String titleString = "";
            if (aString.trim().length() > 0) {
                String[] aStS = aString.trim().split(" ");
                for (int i = 0; i < aStS.length; i++) {
                    titleString = titleString + aStS[i].substring(0, 1).toUpperCase() + aStS[i].substring(1).toLowerCase() + " ";

                }
            }
            return titleString.trim();


        }
        //Write a method that will tell grade to student for given score and MaxScore

        public static String studentGrade ( double studentScore, double maxScore){

            String studentGrade = "";
            double percentage = (studentScore / maxScore) * 100;
            if (percentage <= 0 || percentage >= 100) {
                studentGrade = "Invalid Entry, please re-enter";

            } else if (percentage > 90 && percentage <= 100) {
                studentGrade = "Student grade is --> A";
            } else if (percentage > 80 && percentage <= 90) {
                studentGrade = "Student grade is --> B";
            } else if (percentage > 70 && percentage <= 80) {
                studentGrade = "Student grade is --> C";
            } else if (percentage > 60 && percentage <= 70) {
                studentGrade = "Student grade is -->D";
            } else if (percentage <= 60) {
                studentGrade = "Student grtade is -->F";
            }
            return studentGrade;

        }
        //Write a method that will reverse any given int-array
        public static void revIntArray ( int[] toRev){

                int[] revArray = new int[toRev.length];
                int k=0;
                if(toRev.length>0){

                for (int i = toRev.length - 1; i >= 0; i--) {
                    revArray[k] = toRev[i];
                    k++;
                }
                    System.out.println(Arrays.toString(revArray));
            }




        }


        //Write a method that return the number of words in given sentence.

        public static int wordsInSent (String aString){
            int length = 0;
            if (aString.length() > 0) {
                String[] aArray = aString.split(" ");
                length = aArray.length;
            }
            return length;

        }

}




































