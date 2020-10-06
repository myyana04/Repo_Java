public class HomeWork5 {
    public static void main(String[] args) {


        /*Write code/method to return abbreviation for any given string
                * Example: String msg = "Outfit of the day"
                * Expected: OOTD   // GM HAGDTY
                * String msg = "have a great day to you"
                *
         * //code
         *
         * sout("Abbreviation : " + abr);
         */
        //String msg = "have happy and prosperous life";
        //String abr = "";
        // code
        //System.out.println("Abbreviation: " + abr);     // HHAPL


        String mess="have a great day to you";
        String abr=" ";
        System.out.println();
        String[]letters=mess.toUpperCase().split(" ");
        for (int j=0;j<=letters.length-1;j++){
            abr=abr+letters[j].charAt(0);

        }
        System.out.println(abr);

        /**
         * Change the string to title case
         */
        //String line = "once upOn a tiMe in the UNIVERSE";   //  Once Upon A Time In The Universe
        //System.out.println("Line (Before modification) : " + line);
        // code
        //System.out.println("Line (After modification) : " + line);




        System.out.println("Before modification: " + mess);
        String[] str=mess.toLowerCase().split(" ");
        mess="";
        for(int i=0; i<str.length; i++) {
            mess = mess + " " + str[i].substring(0, 1).toUpperCase() + str[i].substring(1);
        }
        System.out.println("After modification: "+ mess);


         /* reverse a string
                */
       // String message = "Have A Great Day To You"
        //String reverseMessage = "";
        //System.out.println("Message : " + message);
        // code
        //System.out.println("Message in reverse: " + reverseMessage);    // syadiloh yppah

        String reverseMessage="";
        System.out.println("Message: "+ mess);
        int p=0;
        while(p<mess.length()){
            reverseMessage=mess.substring(p,p+1)+reverseMessage;
            p++;
        }
        System.out.println(" Message in reverse: "+reverseMessage);





    }


}

