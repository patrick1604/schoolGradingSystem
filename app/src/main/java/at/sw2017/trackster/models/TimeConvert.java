package at.sw2017.trackster.models;

import java.text.ParseException;

/**
 * Created by sbuersch on 01.06.2017.
 */

public class TimeConvert {


    public static double timeToMillisec(String time){

        String[] times = time.split(":");

        int min,sec,mil;

        min = Integer.parseInt(times[0]);
        sec = Integer.parseInt(times[1]);
        mil = Integer.parseInt(times[2]);


        return mil+1000*sec+1000*60*min;
    }


    public static double timeToSec(String time) throws ParseException{

        String[] times = time.split(":");
        if(times.length != 3) {
            throw new ParseException("Needs to have 3 segments", 0);
        }

        int min,sec;
        double mil;

        min = Integer.parseInt(times[0]);
        sec = Integer.parseInt(String.format("%-2s", times[1]).replace(' ', '0'));
        mil = Integer.parseInt(String.format("%-3s", times[2]).replace(' ', '0'));

        return mil/1000+sec+60*min;
    }

    public static String secToTime(double sec){

         return millisecToTime(sec * 1000);
    }

    public static String millisecToTime(double mil){

        int min =  (int)mil / (1000*60);
        int sek =  (int)(mil/1000)%60;
        int milli =  (int)mil%(1000);

        return ("" + min + ":"
                + String.format("%02d", sek) + ":"
                + String.format("%03d", milli));

    }



}
