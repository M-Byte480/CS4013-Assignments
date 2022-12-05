import java.util.Arrays;
public class TestCourse {
    public static void main(String[] args) {
        Course lm121 = new Course("LM121");
        lm121.addStudent("Milan");
        lm121.addStudent("Noel");
        lm121.addStudent("Tadhg");

        lm121.dropStudent("Noel");

        System.out.println((Arrays.toString(lm121.getStudents())));

    }
}
