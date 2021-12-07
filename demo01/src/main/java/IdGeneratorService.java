import java.util.Random;

public class IdGeneratorService {

    private Random random;

    public void setRandom(Random random) {
        this.random = random;
    }

    public String process() {
        int number = random.nextInt(10);
        return "XYZ" + number;
    }

}
