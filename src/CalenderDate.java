import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class CalenderDate {
    public static void main(String[] args) {


        //generateTimeLine(10);
        String[]t=generateTimeLine(3,"Rasel");
        System.out.println(Arrays.toString(t));
    }


    public static void generateTimeLine(int num) {
        Calendar cal = Calendar.getInstance();
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("ha  ");
        System.out.print(sdf.format(now));
        Calendar currentCal = Calendar.getInstance();
        String formattedCurrentCal = sdf.format(currentCal.getTime());
        for (int i = 1; i < num; i++) {
            cal.add(Calendar.HOUR, 2);


        }
        System.out.print(sdf.format(cal.getTime()));

    }

    public static String[] generateTimeLine(int num, String name){
        Calendar cal=Calendar.getInstance();
        String[]timeLine=new String[num];
        SimpleDateFormat sdf=new SimpleDateFormat("ha");
        for(int i=0;i<num;i++){
            if(i>0){
                cal.add(Calendar.HOUR,2);
            }
            timeLine[i]=sdf.format(cal.getTime());


        }
        //System.out.println(Arrays.toString(timeLine));
        return timeLine;

    }
}
