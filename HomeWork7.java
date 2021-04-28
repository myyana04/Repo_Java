public class HomeWork7 {

    public static void main(String[] args) {

        String sentence1 = "hApPY nEW yeAr";
        /* sout(sentence1);  // hApPY nEW yeAr
         * // code
         * sout(sentence1);  // Happy New Year
         */
        System.out.println(sentence1);
        String[] sent1Split = sentence1.toLowerCase().split(" ");
        sentence1 = "";
        for (int i = 0; i < sent1Split.length; i++) {
            sentence1 = sentence1 + sent1Split[i].substring(0, 1).toUpperCase() + sent1Split[i].substring(1) + " ";
        }
        System.out.println(sentence1);


        String sentence2 = "Lab sessIONS clAsses";
        /* Create abbreviation:
         * // code
         * LSC
         */
        String[] sent2Split = sentence2.toUpperCase().split(" ");
        String abbreviation = "";
        for (int i = 0; i < sent2Split.length; i++) {
            abbreviation = abbreviation + sent2Split[i].charAt(0);
        }
        System.out.println(abbreviation);



        //Reverse a string

        String sentence3 = "happy holidays";
        String reverseSentence3 = "";
        System.out.println("sentence3 : " + sentence3);     // happy holidays
        // code
        String[] sent3Split = sentence3.split("");
        for (int i = sent3Split.length - 1; i >= 0; i--) {
            reverseSentence3 = reverseSentence3 + sent3Split[i];
        }
        System.out.println("Reverse sentence3 : " + reverseSentence3);  // syadiloh yppah


    }
}






























