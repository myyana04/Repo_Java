import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.Callable;

public class HomeWork15 {
    public static void main(String[] args) {
        Calendar cal=Calendar.getInstance();
        System.out.println(cal);
        Date now=new Date();
        //System.out.println(now);
        //Date fromCal=cal.getTime();
        //System.out.println(fromCal);
        //cal.setTime(now);
        //System.out.println(cal);


        //System.out.println(cal);
        //System.out.println(cal.getTime());
        //cal.setTime(now);
        //System.out.println(cal);
        SimpleDateFormat sdf=new SimpleDateFormat("H:mm:ss a");
        //System.out.println(sdf.format(now));
        //cal.setTime(now);
        //System.out.println(cal);
        //cal.add(Calendar.HOUR,2);
        //System.out.println(cal);
        //cal.setTime(now);
        //System.out.println(now);
        //System.out.println(cal.getTime());
        //cal.setTime(now);
        //System.out.println(cal);
        //cal.add(Calendar.HOUR,2);
        //System.out.println(cal.getTime());
        System.out.println(sdf.format(now));
        //cal.setTime(now);
        //cal.add(Calendar.HOUR,2);
        //System.out.println(cal.getTime());
        //Calendar currentCal=Calendar.getInstance();
        //String formattedCurrentCal= sdf.format(currentCal.getTime());
        //System.out.println(formattedCurrentCal);



        /**
         * Question:
         * Create a method that will take an int as input.
         * return the timeline (hour am/pm) with interval of 2 hour from the current hour.
         */
        // sout(generateTimeline(5));
        // 9pm 11pm 1am 3am 5am
        // sout(generateTimeline(5));       // running the code around 8am
        // 8am 10am 12pm 2pm 4pm
        // sout(generateTimeline(10));       // running the code around 8am
        // 8am 10am 12pm 2pm 4pm 6pm 8pm 10pm 12am 2am

        int num=6;
       // System.out.println(cal);

           // cal.setTime(now);
            //cal.add(Calendar.HOUR,2);
            //System.out.println(cal.getTime());
            Calendar currentCal=Calendar.getInstance();
            String formattedCurrentCal= sdf.format(currentCal.getTime());
            //System.out.println(formattedCurrentCal);
            for(int i=1;i<num;i++) {
                cal.add(Calendar.HOUR, 2);

                System.out.println(sdf.format(cal.getTime()));
            }











    }


}
