public class HomeWork1 {
    public static void main(String[] args) {

        /**Store below scenario value in an appropriate dataType variable, and print the same in console.
        1. number of hours in a day (byte)
                2. max no. of days in an year
        3. total number of employees in an organization
        4. population in a country
        5. interest rate
        6. balance in a bank account
        7. does the sun rise from the west? Store answer
        8. initials of your name (^Use: char) Hello World ---- HW  --- need 2 char variable
        9. Your full name
                */

        byte noOfHours = 24;
        System.out.println("There are " + noOfHours + " hours in a day.");
        short daysInAYear=366;
        System.out.println("The most days in a year is "+ daysInAYear);
        int noOfEmployees=2200000;
        System.out.println("Total employees for Walmrt is "+noOfEmployees);
        long population=1400000000L;
        System.out.println("Population of China is "+population);
        float interRate=3.15f;
        System.out.println(" 30 years mortgage interest rate is "+interRate+" today.");
        double bankBalance=2540000.09;
        System.out.println("Balance of a bank account is "+bankBalance);
        boolean sunRise=true;
        System.out.println("Does sun rise from the west: "+sunRise);
        char firstIni='R';
        char lastIni='C';
        System.out.println(" Initial of my name is "+firstIni+lastIni);
        String fullName="Rasel Chowdhury";
        System.out.println(" My full name is "+fullName);


        byte noOfHoursADay=24;
        System.out.println("There are "+noOfHoursADay+" hours in a day ");

        int com1=5;
        int com2=7;
        boolean com1grcom2=com1<com2;
        System.out.println(com1grcom2);
        System.out.println(com1++);
        System.out.println(com1);
        int lVar1=10, lVar2=20, lVar3=30,
                lVar4=40;
        boolean lRes1=lVar1<=lVar3 && (lVar2==(lVar4-lVar1-lVar1))&& lVar4==lVar2;
        System.out.println(lRes1);
        boolean lRes2=!(lVar1<=lVar3 || (lVar2==(lVar4-lVar1-lVar1))|| lVar4==lVar2);
        System.out.println(lRes2);


























    }
}

