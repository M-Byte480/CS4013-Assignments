import java.util.Arrays;

public class Course3 {
    private String courseName;
    private String[] students = new String[4];
    private int numberOfStudents;

    public Course3(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        if(students.length >= numberOfStudents){
            students = Arrays.copyOf(students, students.length * 2);
        }
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {
        // Left as an exercise in Exercise 10.9

            int i = 0;
            boolean found = false;
            String[] temp = new String[students.length];
            for (String person : students) {
                if(person.equals(student) && !found) {
                    temp[i] = person;
                    i++;
                    found = true;
                }
            }

            students = temp;



        if(numberOfStudents < students.length / 2){
            students = Arrays.copyOf(students, students.length / 2);
        }

    }
}