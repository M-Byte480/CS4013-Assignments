import java.util.Arrays;

public class Course {
    private String courseName;
    private String[] students = new String[4];
    private int numberOfStudents;

    /**
     * Creates a course object with the given name
     * @param courseName Takes a String name
     */
    public Course(String courseName) {
        this.courseName = courseName;
    }

    /**
     * Adds a student to the course array
     * @param student String name of the student
     */
    public void addStudent(String student) {
        if(students.length <= numberOfStudents){
            students = Arrays.copyOf(students, students.length * 2);
        }
        students[numberOfStudents] = student;
        numberOfStudents++;
    }


    /**
     * @return String[] of the students in the course
     */
    public String[] getStudents() {
        return students;
    }

    /**
     * @return Number of students in the course
     */
    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    /**
     * @return The name assigned to the Course instance
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * Checks the array of students for the first instance of the student in the array.
     * It prints out the name of the student removed as: "Student was removed: " + student.
     * If student was not found, nothing will change and prints out "There was no student found"
     *
     * If the number of students is exactly half or less than half, it shrinks the array in half.
     * @param student Name of the student to drop
     */
    public void dropStudent(String student) {
        // Left as an exercise in Exercise 10.9
        int positionOfBreak = 0; // Use this indicator for student found. Assume it is not found where -1 means not found.
        boolean found = false;

        for (int i = 0; i < numberOfStudents && !found; i++) {

            if(students[i].equals(student)){
                positionOfBreak = i; // Take the position of the student.
                students[i] = null; // Change it to null. Useful if the student is at the end of the array.
                System.out.println("Student was removed: " + student);
                numberOfStudents--;
                found = true; // Break at the first instance
            }

        }

        // If the student is not found:
        if(!found){
            System.out.println("There was no student found");
        }else{
        // If the student is found:
            // Count the difference between the number of students that remain, and the where the popped student is.
            int numElementsCopy = numberOfStudents - positionOfBreak;
            System.arraycopy(students, positionOfBreak + 1, students, positionOfBreak, numElementsCopy);
            // System.arraycopy takes an array to copy from, the position to copy from, array to copy to,
            // position to copy to, number of elements to copy
            // I take the elements and basically shift them 1 back in the same array.

            // Change the last student from its old position to null. This solution is much better than
            students[numberOfStudents] = null;
        }

        // Shrink if half. It will always work since we have the array starting at 4 and it will always be a power of 2.
        // Hence, we don't have to worry about array of odd length.
        if(numberOfStudents <= students.length / 2){
            students = Arrays.copyOf(students, students.length / 2);
        }

    }
}