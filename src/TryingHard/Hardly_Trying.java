package TryingHard;



import java.util.Arrays;

public class Hardly_Trying {
    public static void main(String[] args) {
        String townName = "My town name is Sylhet";
        char chrAt9 = townName.charAt(9);
        System.out.println(chrAt9);
        int var1 = 5;
        var1 += 5;
        System.out.println(var1);
        var1 /= 2;
        System.out.println(var1);
        var1 %= 5;
        System.out.println(var1);

        String hello = "hello dear";
        int a = hello.length();
        int lastIndex = a - 1;
        System.out.println(a);
        String cityName = "     New York City in the Town of USA     ";


        cityName = cityName.trim();
        System.out.println(cityName);
        String c1 = cityName.substring(2, 6);
        System.out.println(c1);
        int[] var = new int[5];
        var[0] = 100;
        System.out.println(var[1]);
        String[] v = cityName.split("e");
        System.out.println(Arrays.toString(v));
        String[] p = cityName.split(" ");
        System.out.println(Arrays.toString(p));
        String statement = "New York City if the world capital--> really";
        int lastIndexOfSpace = statement.lastIndexOf(" ");
        String lastWord = statement.substring(lastIndexOfSpace + 1);
        int lastWordLen = lastWord.length();
        System.out.println("The last word of the statement is " + lastWord + " and the length is " + lastWordLen);
        double[] myBills = new double[5];
        myBills[0] = 43.22;
        myBills[1] = 44.23;
        myBills[2] = 45.24;
        myBills[3] = 46.25;
        myBills[4] = 47.26;
        System.out.println(Arrays.toString(myBills));
        double foodBill = myBills[2];
        myBills[4] = myBills[0] + myBills[1] + myBills[2] + myBills[3] + myBills[4];
        System.out.println(Arrays.toString(myBills));
        System.out.println(myBills.length);
        String[] stat = statement.split(" ");
        int leng = stat.length;
        String lastW = stat[leng - 1];
        int lastWLen = lastW.length();
        System.out.println("The last word of the statement is " + lastW + " and the length is " + lastWLen);


        String fullName = "Rasel Chowdhury";
        int indexOf = fullName.indexOf(" ");
        System.out.println(indexOf);
        String first = fullName.substring(0, indexOf);
        System.out.println(first);
        int firstLen = first.length();
        System.out.println(firstLen);
        int lsatIn = fullName.lastIndexOf(" ");
        System.out.println(lsatIn);
        String lastn = fullName.substring(lsatIn + 1);
        System.out.println(lastn);
        boolean isStar = lastn.toLowerCase().startsWith("k".toLowerCase());
        System.out.println(isStar);
        boolean nn = lastn.startsWith("c");
        System.out.println(nn);
        char b = first.charAt(firstLen - 1);
        System.out.println(b);
        boolean n = lastn.toLowerCase().endsWith("m".toLowerCase());
        System.out.println(n);
        String[] fname = fullName.split(" ");
        int fLen = fname.length;
        System.out.println(fLen);
        String fiName = fname[0];
        System.out.println(fiName);
        String laName = fname[fLen - 1];
        System.out.println(laName);
        int faLen = fiName.length();
        System.out.println(faLen);
        boolean withK = laName.toLowerCase().startsWith("c".toLowerCase());
        System.out.println(withK);
        boolean endm = laName.toLowerCase().endsWith("Y".toLowerCase());
        System.out.println(endm);
        int laLen = laName.length();
        char laLa = laName.charAt(laLen - 1);
        System.out.println(laLa);
        String goodP = "I am a good programmer. i love my life.";
        String[] goodPp = goodP.split(" ");
        int goodL = goodPp.length;
        System.out.println(goodL);
        String goodR = goodP.replace('r', 'f');
        System.out.println(goodR);
        String[] firstLett = first.split("");

        int firLen = firstLett.length;
        System.out.println(firLen);
        String pingi = "hello dear, how are you";
        int restt = pingi.length();
        System.out.println(restt);
        String isGreat = restt > 23 ? "true" : "false";
        System.out.println(isGreat);
        String thrWoSen = "hApPy nEW yeAr";
        String[] tws = thrWoSen.toLowerCase().split(" ");
        System.out.println(Arrays.toString(tws));
        String f1 = tws[0].substring(0, 1).toUpperCase();
        System.out.println(f1);
        String f2 = tws[0].substring(1);
        System.out.println(f2);
        System.out.println(f1 + f2);
        String f3 = tws[1].substring(0, 1).toUpperCase();
        String f4 = tws[1].substring(1);
        String f5 = tws[2].substring(0, 1).toUpperCase();
        String f6 = tws[2].substring(1);


        tws[0] = f1 + f2;
        tws[1] = f3 + f4;
        tws[2] = f5 + f6;
        thrWoSen = tws[0] + " " + tws[1] + " " + tws[2];

        System.out.println(thrWoSen);
        String[] twsU = thrWoSen.toUpperCase().split(" ");
        String f7 = twsU[0].substring(0, 1);
        String f8 = twsU[1].substring(0, 1);
        String f9 = twsU[2].substring(0, 1);
        System.out.println(f7 + f8 + f9);

        String days = "weekend"; //weekday or weekend
        boolean anyMeetings = true;  //true or false
        String clothes = " ";
        //days=weekend; clothes=casual;
        //days=weekday and meeting=false; clothes=formal;
        //days =weekday and meetings=true; clothes=suit;
        if (days.equalsIgnoreCase("weekday") && anyMeetings == false) {
            clothes = "formal";
        } else if (days.equalsIgnoreCase("weekday") && anyMeetings == true) {
            clothes = "suit";
        } else if (days.equalsIgnoreCase("weekend")) {
            clothes = "casual";
        }
        System.out.println(clothes);

        int num = 1;
        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("odd");
        }

        String name = "Happy";
        boolean result = true;
        int number = 22;

        if (name.length() > 10 && number > 5) {
            System.out.println(name.toUpperCase());
            System.out.println(name.replace('p', 'b'));
        } else {
            result = false;
        }
        System.out.println(result);
        //f1+f2+" "+f3+f4+" "+f5+f6
        String dayName = "Tuesday".toLowerCase();
        switch (dayName) {
            case "monday":
                System.out.println(" Day 1 ");
                break;
            case "tuesday":
                System.out.println(" Day 2 ");
                break;
            case "wednesday":
                System.out.println(" Day 3 ");
                break;
            case "thursday":
                System.out.println(" Day 4 ");
                break;
            case "friday":
                System.out.println(" Day 5 ");
                break;
            case "saturday":
                System.out.println(" Day 6 ");
                break;
            case "sunday":
                System.out.println(" Day 7 ");
                break;
            default:
                System.out.println(" Invalid day ");
                break;

        }
        String monthName = "March";
        switch (monthName.toLowerCase()) {
            case "january":
            case "february":
            case "december":
                System.out.println(monthName + " is in winter season");
                break;
            case "march":
            case "april":
            case "may":
                System.out.println(monthName + " in in spring season");
                break;
            case "june":
            case "july":
            case "august":
                System.out.println(monthName + " is in summer season");
                break;
            case "september":
            case "october":
            case "november":
                System.out.println(monthName + " is in fall season");
                break;
            default:
                System.out.println(" Invalid month");
                break;

        }

        char gear = 'D';
        String cMode = "Sport";
        switch (gear) {
            case 'P':
                System.out.println(" You can park");
                break;
            case 'N':
                System.out.println(" put car in car wash");
                break;
            case 'R':
                System.out.println(" you can reverse");
                break;
            case 'D':
                switch (cMode.toLowerCase()) {
                    case "snow":
                        System.out.println(" you are in " + cMode + " mode");
                        break;
                    case "sport":
                        System.out.println(" You are in " + cMode + " mode");
                        break;
                    case "eco":
                        System.out.println(" You are in " + cMode + " mode");
                        break;
                    default:
                        System.out.println("Invalid Mode");
                }
                break;
            default:
                System.out.println("Invalid Gear");


        }
        double maxScore = 160;
        double studentScore = 150;
        double percentage = (studentScore / maxScore) * 100;
        System.out.println(percentage);
        if (percentage > 100 && percentage <= 0) {
            System.out.println("Wrong data enter");
        } else if (percentage >= 91 && percentage <= 100) {
            System.out.println("Yoor score is " + studentScore + " and your Grade:A ");
        } else if (percentage >= 81 && percentage <= 90) {
            System.out.println("Your score is " + studentScore + " , and your Grade: B");
        }

        int numb = 26;
        if (numb % 3 == 0 && numb % 5 == 0) {
            System.out.println("Divisible by both 3 and 5");
        } else if (numb % 3 == 0) {
            System.out.println("Divisible by 3");
        } else if (numb % 5 == 0) {
            System.out.println("Divisible by 5");
        } else {
            System.out.println("The number is " + numb);
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello- " + (i + 1));
        }

        String[] names = {"Happy", "Peace", "Joy", "Laugh", "Love"};
        for (int i = 0; i <= names.length - 1; i++) {
            System.out.println(names[i]);

        }
        for (String name1 : names) {
            System.out.println(name1);
        }
        int[] ssn = {1111, 2222, 3333, 4444, 5555, 6666};
        for (int ssn1 : ssn) {
            System.out.println(ssn1);

        }
        for (int i = 0; i < ssn.length; i++) {
            System.out.println(ssn[i]);
        }
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        char[] alphabets = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};
        for (int i = 0; i < alphabets.length; i++) {
            System.out.println(alphabets[i]);
        }
        for (char alp : alphabets) {
            System.out.println(alp);
        }
        int j = 0;
        while (j < alphabets.length) {
            System.out.println(alphabets[j]);
            j++;
        }

        String din = "happy holiday";
        String messN =" ";
        for (int i = din.length() - 1; i >= 0; i--) {

            char pos = din.charAt(i);
            messN = messN + pos;


        }
        System.out.println(messN);
    }

        String riyaan=" once upon a time in mexico";

        String[]yana=riyaan.toUpperCase().split(" ");
















    }



