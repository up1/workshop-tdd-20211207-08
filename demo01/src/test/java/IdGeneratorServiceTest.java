import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class Random6 extends Random {
    @Override
    public int nextInt(int bound) {
        return 6;
    }
}

class IdGeneratorServiceTest {

    @Test
    void process() {
        // Dependency
        Random random = new Random6();
        // 1. Constructor Injection
        IdGeneratorService service = new IdGeneratorService();
        service.setRandom(random); // 2. Setter  Injection
        String result = service.process(); // 3. Method  Injection
        assertEquals("XYZ6", result);
    }
}