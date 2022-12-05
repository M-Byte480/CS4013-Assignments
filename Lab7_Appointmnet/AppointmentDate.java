import java.util.StringTokenizer;

/**
 * An appointment date.
 */
public class AppointmentDate {
    private int year;
    private int month;
    private int day;

   /*
   Add additional code here
   */

    /**
     * Constructor
     * @param day int
     * @param month int
     * @param year int
     */
    public AppointmentDate(int day, int month, int year){
        this.year = year;
        this.day = day;
        this.month = month;
    }

    /**
     * Constructor that converts string args
     * @param day String
     * @param month String
     * @param year String
     */
    public AppointmentDate(String day, String month, String year){
        this(Integer.parseInt(day), Integer.parseInt(month), Integer.parseInt(year));
    }

    /**
     * Converts String[3] to AppointmentDate object
     * @param date String[]
     */
    public AppointmentDate(String[] date){
        this(date[0], date[1], date[2]);
    }

    /**
     * Splits a line of string based on Regex:-
     * @param line String
     */
    public AppointmentDate(String line){
        String[] lineSplit = line.split("-");
        this.day = Integer.parseInt(lineSplit[0]);
        this.month = Integer.parseInt(lineSplit[1]);
        this.year = Integer.parseInt(lineSplit[2]);
    }

    /**
     * Equals method
     * @param that AppointmentDate
     * @return true if the two objects have the same data-fields
     */
    public boolean equals(AppointmentDate that){
        if(this.year == that.year){
            if(this.day == that.day){
                return this.month == that.month;
            }
        }
        return false;
    }

}