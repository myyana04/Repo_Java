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
        double ftemp3 = ( kTemp *9.0/5-459.67);
        System.out.println( kTemp + " K is equal to "+ ftemp3 + " in F ");
        // C to K,  T(K) = T(°C) + 273.15
        cTemp = 20;
        kTemp = cTemp + 273.13;
        System.out.println( cTemp + " in C is equal to" + kTemp + 273 + " in Kalvin ");
        // K to C, T(°C) = T(K) - 273.15
        kTemp = 68;
        cTemp= kTemp-273.15;
        System.out.println(kTemp + " is equal to "+ cTemp + " in C ");





    }
}
