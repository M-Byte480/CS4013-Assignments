import java.io.IOException;
import java.math.BigInteger;
import java.math.BigDecimal;
import java.io.File;
import java.io.FileWriter;
import java.math.MathContext;

public class OddsOfMonkeyTypingHamlet {

    public static void main(String[] args) throws IOException {
        FileWriter output = new FileWriter("TadhgRyan.txt");
        MathContext mc = new MathContext(1000);
        BigDecimal probability = new BigDecimal(String.valueOf(3));
        int a = 2;
        int d = 1;
        for (int i = 0; i < 1000; i++) {
            probability = probability.add(BigDecimal.valueOf(d * (4.0 / (a + a + 1 + a + 2))), mc);
            a++;
            d *= -1;
        }
        System.out.println(probability);
        output.close();
    }
}
