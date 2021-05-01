public class HomeWork4 {

    public static void main(String[] args) {

        String sentence_3="hello dear, how are you";
        boolean result;
        /**
         * Assign result as true if length of sentence_3 is greater than 10
         * else assign false
         */

        int jLen=sentence_3.length();
        result=jLen>10?true:false;
        System.out.println("Is length of the sentence_3 is greater than 10: "+result);


        String sentence_4="we all ARe Good progRommeR";
        /**
         * Replace all 'r' with 'f'(Ignore cases)
         */

        String sentence_4toLowerCases=sentence_4.toLowerCase();
        String sentence_4Replace_r_f=sentence_4toLowerCases.replace('r','f');
        System.out.println(sentence_4Replace_r_f);


        String fullName="Rasel Chowdhury";
        /**
         * 1.Display the length pf your full name
         * 2.Does your name starts with with 'k'(ignore cases)
         * 3.Does your full name contains 'a'(ignore cases)
         */

        int fullNameLength=fullName.length();
        System.out.println("The length of my full name is: "+fullNameLength);
        boolean fullNameStarts=fullName.toLowerCase().startsWith("k");
        System.out.println("Does my name starts with k: "+fullNameStarts);
        boolean fullNameCon_a=fullName.toLowerCase().contains("a");
        System.out.println("Does my full name contains a: "+fullNameCon_a);



    }
}
