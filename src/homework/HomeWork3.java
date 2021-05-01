package homework;


public class HomeWork3 {


    public static void main(String[] args) {
    String myName= "Rasel Chowdhury" ;
        /*Store your full name in a variable and display the followings:
            1.Display length of the first name.
            2.Does your last name stars with "k" ( ignore cases ).
            3.Print the last alphabet of your first name.
            4.Does your last name ends with "M" ( ignore cases ).
        */

        int indexOfSpace = myName.indexOf(" ");
        String firstName= myName.substring(0,indexOfSpace);
        System.out.println("The length of your first name is: " + firstName.length());
        String []names=myName.split(" ");
        firstName=names[0];
        int len=myName.length();
        String lastName=names[1];
        boolean isLastName=lastName.toLowerCase().startsWith("k");
        System.out.println("does your last name starts with k:  " +isLastName);
        int fNamesLastInd= firstName.length()-1;
        char lastChar=firstName.charAt(fNamesLastInd);
        System.out.println("Last alphabet of your first name is: " + lastChar);
        boolean lastNameEnds=lastName.toUpperCase().endsWith("M");
        System.out.println("Does your last name ends with M: " + lastNameEnds);

        /* String myDStatement= "I am a good programmer";
        Use string methods to do following tasks:
        1. Display the total number of words in myStatement;
        2. Replace all 'r' characters with 'f' characters;
         */

        String myStatement="I am a good programmer";
        String[]words=myStatement.split(" ");
        int length=words.length;
        System.out.println("Total number of words in myStatement is: "+length);
        String replace=myStatement.replace('r','f');
        System.out.println("replace all 'r' character with 'f': "+replace);

        /* Store your first name in a string variable;
           Calculate the length of your first name without length method of string class;
         */
        String []firstNameLetters=firstName.split("");
        int firstNLen= firstNameLetters.length;
        System.out.println("The length of your first name is: "+firstNLen);

        /*
        String strNew="hello dear, how are you";
        Assign result is true (boolean) if length of string greater then 10 else false;
         */

        String strNew="hello dear, how are you";
        boolean trueFalse=strNew.length()>10?true:false;
        System.out.println(trueFalse);

        /* String threeWordsSentence=hApPY nEW yeAr;
        sout (threeWordsSentence);// hApPY nEw yeAr
        //code;
        sout(threeWordsSentence);// Happy New Year
         */

        String threeWordsSentence="hApPY nEw yeAr";
        System.out.println(threeWordsSentence);
        String[]wordsOfSentence=threeWordsSentence.toLowerCase().split(" ");
        String w1=wordsOfSentence[0].substring(0,1).toUpperCase();
        String w2=wordsOfSentence[0].substring(1);
        wordsOfSentence[0]=w1+w2;
        String w3=wordsOfSentence[1].substring(0,1).toUpperCase();
        String w4=wordsOfSentence[1].substring(1);
        wordsOfSentence[1]=w3+w4;
        String w5=wordsOfSentence[2].substring(0,1).toUpperCase();
        String w6=wordsOfSentence[2].substring(1);
        wordsOfSentence[2]=w5+w6;
        threeWordsSentence=wordsOfSentence[0]+" "+wordsOfSentence[1]+" "+wordsOfSentence[2];
        System.out.println(threeWordsSentence);

        /* create abbreviation;
        String threeWordsSentence:hApPy nEw yeAr;
        code//
        print: HNY
         */


    threeWordsSentence="hApPy nEw yEaR";
    String[] capitalLetters=threeWordsSentence.toUpperCase().split(" ");
    String abbre1=capitalLetters[0].substring(0,1);
    String abbre2=capitalLetters[1].substring(0,1);
    String abbre3=capitalLetters[2].substring(0,1);
    threeWordsSentence=abbre1+abbre2+abbre3;
        System.out.println(threeWordsSentence);




    }
}
