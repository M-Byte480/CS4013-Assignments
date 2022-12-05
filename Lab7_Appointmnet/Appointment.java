/**
 * An appointment.
 */
public class Appointment {
    private String description;
    private AppointmentDate day;
    private AppointmentTime from;
    private AppointmentTime to;

   /*
      Add additional code here
   */

    /**
     * Construct an appointmnet
     * @param description String
     * @param day AppointmentDate
     * @param from AppointmentTime to start
     * @param to AppointmentTime to finish
     */
    public Appointment(String description, AppointmentDate day, AppointmentTime from, AppointmentTime to){
        this.description = description;
        this.day = day;
        this.from = from;
        this.to = to;
    }

    /**
     * Splits a string up into parts
     * @param line
     */
    public Appointment(String line){
        String[] lineSplit = line.split(" ");
        this.description = lineSplit[0];
        this.day = new AppointmentDate(lineSplit[1].split("-"));
        this.from = new AppointmentTime(lineSplit[2].split(":"));
        this.to = new AppointmentTime(lineSplit[3].split(":"));
    }

    /**
     * @return Day datafield
     */
    public AppointmentDate getDay(){
        return this.day;
    }

    /**
     * Nicely formats the time constraints
     * @return String
     */
    public String format(){
        return this.from.toString() + " -> " + this.to.toString() + " : " + this.description;
    }

    /**
     * Checks if the 2 times given, have overlapping.
     * @param sometime Appointment to compare this Appointment to
     * @return true if it conflicts, false if it doesn't
     */
    public boolean ifConflicts(Appointment sometime){
        // If the same day:
        if(this.day.equals(sometime.day)){
            // Assume these are the start times:
            Appointment early = this;
            Appointment later = sometime;

            // Compare and flip it our assumption is wrong
            if(this.from.compareTo(sometime.from) > 0){
                early = sometime;
                later = this;
            }

            // Whichever starts earlier, the earlier time can never be in the meeting that starts later.
            // Then we just only need to check if the beginning of the 2nd meeting is within the the earlier meeting.

            // Standardize:
            // Convert the times into the same decimal base. Ie base10 hours and base60 minutes to decimal
            double thisStart = early.from.getHours() + early.from.getMinutes() / 60.0;
            double thisFinish = early.to.getHours() + early.to.getMinutes() / 60.0;
            double thatStart = later.from.getHours() + later.from.getMinutes() / 60.0;

            // Compare and check if the later one is anywhere within the constraints of the already existing time
            return (thisStart <= thatStart && thatStart < thisFinish);
        }
        return false;
    }
}
