import java.util.Random;

public class IdGeneratorService {

    private MyRandom random;

    public void setRandom(MyRandom random) {
        this.random = random;
    }

    public String process() {
        int number = random.get(10);
        return "XYZ" + number;
    }

}

interface MyRandom {
    int get(int bound);
}
