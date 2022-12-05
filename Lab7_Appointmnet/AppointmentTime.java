import java.util.Comparator;
import java.util.StringTokenizer;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * An appointment time.
 */
public class AppointmentTime {
    private int hours;
    private int minutes;

   /*
     Add additional code here 
    */

    /**
     * Constructor
     * @param hours int
     * @param minutes int
     */
    public AppointmentTime(int hours, int minutes){
        this.hours = hours;
        this.minutes = minutes;
    }

    /**
     * String arg constructor
     * @param hours String
     * @param minutes String
     */
    public AppointmentTime(String hours, String minutes){
        this.hours = Integer.parseInt(hours);
        this.minutes = Integer.parseInt(minutes);
    }

    /**
     * Creates AppointmentTime from String[2]
     * @param time String[]
     */
    public AppointmentTime(String[] time){
        this(time[0], time[1]);
    }

    /**
     * CompareTo method compares the 2 times
     * @param that AppointmentTime
     * @return int
     */
    public int compareTo(AppointmentTime that){
        if(this.hours == that.hours){
            return this.minutes - that.minutes;
        }
        else{
            return this.hours - that.hours;
        }
    }

    /**
     * Format the time nicely
     * @return
     */
    @Override
    public String toString() {
        return String.format("%02d:%02d", hours, minutes);
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }
}