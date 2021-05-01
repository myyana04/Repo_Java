package homework;

public class HomeWork2 {
    public static void main(String[] args) {
        System.out.println( "Rasel Chowdhury ");


        double fTemp = 68;
        //° C = 5/9 (° F - 32) F to C
        double cTemp = (fTemp -32)* 5.0/9;
        System.out.println(fTemp + "deg F is equal to " + cTemp + " deg C ");
        cTemp  = 20;
        //T(°F) = T(°C) × 1.8 + 32 C to F
        fTemp = cTemp * 1.8 +32;
        System.out.println(cTemp + "deg C is equal to " + fTemp + " in F.");

        // T(K) = (T(°F) + 459.67) × 5/9 F to Kalvin
        fTemp = 68;
        double kTemp = ( fTemp+459.67)*5.0/9;
        System.out.println( fTemp + " F is equal to " + kTemp + " IN Kalvin ");
        // T(°F) = T(K) × 9/5 - 459.67 kalvin to F
        kTemp = 68;
        double ftemp = ( kTemp *9.0/5-459.67);
        System.out.println( kTemp + " K is equal to "+ ftemp + " in F ");
        // C to K,  T(K) = T(°C) + 273.15
        cTemp = 20;
        kTemp = cTemp + 273.13;
        System.out.println( cTemp + " in C is equal to" + kTemp + 273 + " in Kalvin ");
        // K to C, T(°C) = T(K) - 273.15
        kTemp = 68;
        cTemp= kTemp-273.15;
        System.out.println(kTemp +" Kalvin is equal to "+ cTemp + " in C ");

        int num=11;
        boolean isEven=false;
        int remainder=num%2;
        isEven=remainder==0;
        System.out.println("is "+ num+ " is even: "+isEven);

        int creditScore=699;
        double mortgageRate=creditScore>700?1.1:2.0;
        System.out.println("Mortgage rate is: "+mortgageRate);

        int time=19;
        String greetings=time>12?"good evening":"good morning";
        System.out.println(greetings);

        int myResult=creditScore>700?time:time++;
        System.out.println(time+" and "+myResult);

        boolean res=time<10?creditScore<700:myResult<10;//false
        System.out.println(res);
        num=5;
        num+=3;//8
        System.out.println(num);//8
        num*=5;//8*5
        System.out.println(num);//40
        num%=4;//40/4=10, remainder 0
        System.out.println(num);//0
        num=10;
        num%=3;
        System.out.println(num);//1
        String cityName="New York city";
        int cityNameLength=cityName.length();
        System.out.println("The length of my city name is: "+cityNameLength);//13
        String cityNameToLowerCase=cityName.toLowerCase();
        System.out.println(cityNameToLowerCase);//new york ciy
        String cityNameToUpperCase=cityName.toUpperCase();
        System.out.println(cityNameToUpperCase);//NEW YORK CITY
        boolean isEqual=cityName.equals(cityNameToLowerCase);
        System.out.println(isEqual);//false
        boolean isIgnore=cityName.equalsIgnoreCase(cityNameToLowerCase);
        System.out.println(isIgnore);//true
        boolean isContains=cityName.contains("new");
        System.out.println(isContains);
        boolean isCont=cityName.toLowerCase().contains("new".toLowerCase());
        System.out.println("is city name contains "+"new: "+isCont);
        String cityNameReplaceY_Z=cityName.replace('y','o');
        System.out.println(cityNameReplaceY_Z);
        cityName="New York City In The TowN";
        String l1=cityName.replace('Y','i');
        System.out.println(l1);
        char charAtIndex7=cityName.charAt(12);
        System.out.println(charAtIndex7);
        String hello="hello world, how are you";
        int len=hello.length();
        int lastIndex=len-1;
      char charAtLastIndex=hello.charAt(lastIndex);
        System.out.println(charAtLastIndex);
        int indexOf=cityName.indexOf("N");//only first occurence of N will return eventhough the
        //string has 3 N
        System.out.println(indexOf);//0
        int indexOfMulti=cityName.toUpperCase().indexOf("city".toUpperCase());
        System.out.println(indexOfMulti);


        //Celsius to Fahrenheit	° F = 9/5 ( ° C) + 32
       //Kelvin to Fahrenheit	° F = 9/5 (K - 273) + 32
        //Fahrenheit to Celsius	° C = 5/9 (° F - 32)
       // Celsius to Kelvin	K = ° C + 273
        //Kelvin to Celsius	° C = K - 273
        //Fahrenheit to Kelvin	K = 5/9 (° F - 32) + 273
        double cenTemp=100.00;
        double fRen=((9.0/5)*cenTemp)+32;
        System.out.println(cenTemp + " deg Celcoius is equal to " +fRen+ " in Ferenheit.");
        double kalvin=100;
        double kalToFer=(9.0/5)*(kalvin-273)+32;
        System.out.println(kalvin + " deg Kalvin is equal to "+ kalToFer+ " in Ferenheit");
        double celToKal=cenTemp+273;
        System.out.println(cenTemp+" in deg Celsius is equal to "+celToKal+" in Kalvin.");
        System.out.println(kalvin+" in Kalvin is equal to "+(kalvin-273)+" in deg celsius. ");


        int creditScore1=670;
        double mortgageRate1=creditScore1>700?1.1:2.1;
        System.out.println(creditScore1+ " is the credit score and mortgage rate is "+mortgageRate1);
        int time1=9;
        String greeting =time1>12?" Good Evening":"Good Day";
        System.out.println(" Greeting -->"+ greeting);
        boolean myResult2=creditScore1>700?true:false;
        System.out.println(myResult2);
        int myResult1=time1>12?time1:time1++;
        System.out.println(time1);
        System.out.println("myResult is "+ myResult1);
        boolean res2=time1>10?creditScore1<700:myResult1>8;
        System.out.println(res2);
        int var1=10;
        var1+=5;
        System.out.println(var1);
        var1-=2;
        System.out.println(var1);
        var1*=10;
        System.out.println(var1);
        var1/=2;
        System.out.println(var1);
        var1%=2;
        System.out.println(var1);
        String cityName1="New York City";
        System.out.println(cityName1);
        int cityNameLength1=cityName1.length();
        System.out.println(cityNameLength1);
        String cityNameToLowerCase1=cityName1.toLowerCase();
        System.out.println(cityNameToLowerCase1);
        cityName1=cityName1.toLowerCase();
        System.out.println(cityName1);
        String cityNameToUpperCase1=cityName1.toUpperCase();
        System.out.println(cityNameToUpperCase1);
        boolean isEqual1=cityName1.equals(cityName1.toUpperCase());
        System.out.println(isEqual1);
        boolean equalsIgnore=cityName1.equalsIgnoreCase(cityName1);
        System.out.println(equalsIgnore);
        boolean isConNew=cityName1.contains("New");
        System.out.println(isConNew);
        boolean isConIgnoreCases=cityName1.toLowerCase().contains("nEW".toLowerCase());
        System.out.println(isConIgnoreCases);
        String newName=cityName1.replace('y','z');
        System.out.println(newName);
        String rep1=cityName1.replaceAll("new york city","love you all");
        System.out.println(rep1);
        char c1=cityName1.charAt(4);
        System.out.println(c1);
        String hello1= "Hello Dear, How are you";
        int len1=hello.length();
        int lastInde=len1-1;
        System.out.println(lastInde);
        //char c2=hello1.charAt(lastInde);
        //System.out.println(c2);
        int p1=hello1.indexOf('w');
        System.out.println(p1);
        int p2=hello1.indexOf("How a");
        System.out.println(p2);





























    }
}
