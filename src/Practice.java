import java.util.Arrays;

public class Practice {


    public static void main(String[] args) {
        double fTemp=90;
        double cTemp=(fTemp-32)*5/9;
        System.out.println(fTemp + " in F is equal to "+ cTemp +" in C");
        double kTemp=273+(fTemp-32)*5/9;
        System.out.println(fTemp + " in F is equal to "+kTemp+ " in K");
        kTemp=150;
        cTemp=(kTemp-273);
        System.out.println(kTemp + " in K is equal to "+cTemp+ " in C");
        fTemp=9/5*(kTemp-273)+32;
        System.out.println(kTemp +" Kalvin is equal to "+ fTemp + "in F");
        cTemp=36;
        fTemp=(9/5.0*cTemp)+32;
        System.out.println(cTemp + " C is equal to "+ fTemp + "in F");
        kTemp=cTemp+273;
        System.out.println(cTemp + " C is equal to "+kTemp+" in K");
        String cityName=" New York City;";
        boolean isCityStartsWith_New=cityName.startsWith("New");
        System.out.println(isCityStartsWith_New);
        boolean cEwith=cityName.endsWith("City");
        System.out.println(cEwith);
        cityName="New York City in ToWN       ";
        cityName=cityName.trim();
        System.out.println(cityName);
        cityName=cityName.substring(5,9);
        System.out.println(cityName);
        double[]myBills={100.9,4.4,3.6,2.5,1.25};
        System.out.println(myBills[4]);
        cityName="New York City";
        String[]abc= cityName.split("o");
        System.out.println(Arrays.toString(abc));
        abc=cityName.split(" ")  ;
        System.out.println(Arrays.toString(abc));
        String state= "hello, how are you doing";
        String[] splState=state.split(" ");
        int len=splState.length;
        //int lastINSp=state.lastIndexOf(" ");
       // String lastWord=state.substring(lastINSp+1);
        //int lastWordLength=lastWord.length();
        //System.out.println(lastWordLength);
        //int leng=state.length();
        System.out.println(len);
        //String[]myName="Rasel Chowdhury";
        //String[] hng=splState.
        //System.out.println(hng);
        //ublic static void main(String[] args) {
           String myName= "Rasel Chowdhury" ;
        /*Store your full name in a variable and display the followings:
            1.Display length of the first name.
            2.Does your last name stars with "k" ( ignore cases ).
            3.Print the last alphabet of your first name.
            4.Does your last name ends with "M" ( ignore cases ).

         */
        String days="weekday";
        boolean anyMeetings=true;
        String clothes="";
        if(days.equalsIgnoreCase("weekday") && anyMeetings==false){
            clothes="formal";

        }else if(days.equalsIgnoreCase("weekday") &&anyMeetings==true){
            clothes="suits";

        }else if(days.equalsIgnoreCase("weekend")){
            clothes=" casual";
        }
        System.out.println(clothes);
        int num=13;

        if(num%2==0){
            System.out.println(num+ " is even");}
        else{
            System.out.println(num+" is odd");}

        String res=num%2==0?"even":"odd";
        System.out.println(num+ " is " + res);

        // if else

        String name="Happy";
        int num1=8;
        boolean result=true;


        if(name.length()>10 &&num1>5){
            System.out.println(name.toUpperCase());
            System.out.println(name.replace('p','b'));

        }else{
        result=false;}

        System.out.println(result);

        //swith
        String dayName="dingi";
        switch (dayName){
            case "Monday":
                System.out.println(" Day 1");
                break;
            case "Tuesday":
                System.out.println(" Day 2");
                break;
            case "Wednasday":
                System.out.println(" Day 3");
                break;
            case "Thursday":
                System.out.println(" Day 4");
                break;
            case "Friday":
                System.out.println(" Day 5");
                break;
            case "Saturday":
                System.out.println(" Day 6");
                break;
            case "Sunday":
                System.out.println(" Day 7");
                break;
            default:
                System.out.println(" Invalid day");


        }
    String monthName="Dec";

        switch (monthName.toLowerCase()){
            case "jan":
            case "dec":
            case "feb":
                System.out.println(monthName+ " is in Winter");
                break;
            case "mar":
            case "apr":
            case "may":
                System.out.println(monthName+" is in Spring");
                break;
            case "jun":
            case "july":
            case "aug":
                System.out.println(monthName+" is Summer");
                break;
            case "sep":
            case "oct":
            case "nov":
                System.out.println(monthName+" is in Fall");
                break;
            default:
                System.out.println("Invalid month");

        }

        double studentScore=170;
        double maxScore=160;
        double percentage=(studentScore/maxScore)*100;
        if(percentage>100){
            System.out.println("Invalid Entry");
        }
        else if(percentage>90){
            System.out.println("Your percentage is "+percentage+" and your GHrade: A");
        }
        else if(percentage>80 && percentage<91){
            System.out.println("Your percentage is "+percentage+" and your Grade: B");
        }
        else if(percentage>70 && percentage<81){
            System.out.println("Your percentage is "+percentage+" and your Grade: C");
        }
        else if(percentage>60 && percentage<71){
            System.out.println("Your percentage is "+percentage+" and Grade: D");

        }
        else if(percentage>50 && percentage<61){
            System.out.println("Your percentage is "+percentage+" and your Grade:E");
        }
        else if(percentage<50){
            System.out.println("Your percentage is "+percentage+" and your Grade:F");
        }



int num2=8;
        if(num2%3==0 && num2%5==0){
            System.out.println(num2+" is divisible by both 3 and 5");
        }
        else if(num2%3==0){
            System.out.println(num2+" is divisible by 3");
        }
        else if(num2%5==0){
            System.out.println(num2+" is divisible by 5");

        }else {
            System.out.println(num2);}


        //SWITCH
        String dMode="snow";
        char gear='D';
        switch (gear){
            case 'N':
                System.out.println("Put your car in car wash");
                break;
            case 'P':
                System.out.println("Park the car");
                break;
            case 'R':
                System.out.println("Reverse the car");
                break;
            case 'D':
               switch(dMode) {
                   case "snow":
                       System.out.println("You're on a Snow Mode");
                       break;
                   case "sport":
                       System.out.println("You're on a Sport Mode");
                       break;
                   case "eco":
                       System.out.println("You're on a Eco Mode");
                       break;
                   default:
                       System.out.println("Invalid drive mode");
               }

               //FOR LOOP
               for(int i=0;i<5;i++){
                   System.out.println("Hello "+(i+1));
               }
               String[]names={"happy","peace","joy","laugh","sadness","madness"};
               for(int i=0; i<=names.length-1;i++){
                System.out.println(names[i]);}
               for(int j=0;j<names.length;j+=2){
                System.out.println(names[j]);
            }
               //Enhanced for loop
               for(String name1:names){
                   System.out.println(name1);
               }
               int[]nums={1111,2222,3333,4444,5555,6666,};
               for(int nmuss:nums){
                   System.out.println(nmuss);
               }
               for(int k=10;k>=1;k--){
                   System.out.println(k);
               }

               //while loop
                int j=0;
                while (j<5){
                    System.out.println("Hello");
                    j++;
                }
                //for loop
                char[]alphabets={'A','B','C','D','E','F','G'};
                for(int i=0;i<alphabets.length;i++){
                    System.out.println("for loop "+alphabets[i]);
                }
                //Enhance for loop

                for(char looFor:alphabets){
                    System.out.println(looFor);
                }
                //while loop
                int d=0;
                while(d<alphabets.length) {
                    System.out.println(alphabets[d]);
                    d++;
                }

                // Reverse a string
                String mess="happy holiday";
                String reverse=" ";
                for(int p=mess.length()-1;p>=0;p--)
                {
                    reverse=reverse+mess.charAt(p);

                }
                System.out.println(reverse);

                String cde=" happy hunting";
                String abree=" ";
                int t=0;
                while (t < cde.length()) {
                    abree=abree+cde.substring(t,t+1);
                    t++;
                }
                System.out.println(abree);
                String msg="outfit of the day";
                String abr=" ";
                String[]msgSplit=msg.toUpperCase().split("");
                for(int i=0;i<msgSplit.length;i++){
                    abr=abr+msgSplit[i].charAt(0);
                }
                System.out.println(abr);
                divTwo(20,6);
                int[]myInput={11,12,13,14,15};

            int resss=arrAve(myInput);
                System.out.println(resss);

                //String word="riyaan";
                //int count=countVowelIs(word);
               // System.out.println(count);

        }




        
        
        




















    }

    public static void divTwo(double num1,double num2){
        double result=0.0;
        if (num2!=0){
            result=num1/num2;
        }
        System.out.println(result);
    }
    public static int arrAve(int[]arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result = result + i;

            System.out.println(result);}

            int arrlength = arr.length;

            return result / arrlength;
        }
        //public static int countVowelIs(String val){
        //int count=0;
        //String word1=word.toLowerCase();
        //for(int i=0;i<word1.length();i++){
        //char ch=word1.charAt(i);
        // if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
        // count++;}
        // }
        //return count;
        // }


}


