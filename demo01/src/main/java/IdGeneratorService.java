import java.util.Random;

public class IdGeneratorService {

    public String process() {
        Random random = new Random();
        int number = random.nextInt(10);
        return "XYZ" + number;
    }

}
