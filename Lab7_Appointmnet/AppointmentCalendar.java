import java.util.ArrayList;

/**
 * An appointment calendar.
 */
public class AppointmentCalendar {
    private ArrayList<Appointment> appointments;

   /*
      Add additional code here.
   */

    /**
     * No-arg constructor creates an arrayList for appointments
     */
    public AppointmentCalendar(){
        this.appointments = new ArrayList<>();
    }

    /**
     * Add appointment to the appointments arrayList if the time does not conflict
     * If they conflict, raise an exception
     * @param a Appointment
     * @throws Exception
     */
    public void add(Appointment a) throws Exception {
        for (Appointment exists : appointments) {
            if (exists.ifConflicts(a)) {
                throw new Exception("Conflicting times: Appointment not added");
            }
        }
        appointments.add(a);
    }

    /**
     * Removes appointment from the arraylist if it exists
     * @param appointment Appointment
     */
    public void cancel(Appointment appointment){
        for (Appointment a : appointments) {
            if (a.equals(appointment)) {
                appointments.remove(a);
                System.out.println("Successfully removed appointment");
                return;
            }
        }
    }

    /**
     * Returns an arraylist containing all the appointments which are held on passed date
     * @param day String of format DD-MM-YYYY
     * @return ArrayList<Appointment>
     */
    public ArrayList<Appointment> getAppointmentsForDay(AppointmentDate day){
        ArrayList<Appointment> appointments = new ArrayList<>();
        for (int i = 0; i < this.appointments.size() ; i++) {
            if(this.appointments.get(i).getDay().equals(day)) {
                appointments.add(this.appointments.get(i));
            }
        }

        return appointments;
    }
}