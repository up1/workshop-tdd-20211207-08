import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StubRandom6 implements MyRandom {
    @Override
    public int get(int bound) {
        return 6;
    }
}

class SpyRandom implements MyRandom {
    private int counter;
    @Override
    public int get(int bound) {
        if(bound >= 5) counter++;
        return 0;
    }
    public boolean verify(int i) {
        return counter == i;
    }
}

class IdGeneratorServiceTest {
    @Test
    public void case_spy() {
        SpyRandom random = new SpyRandom();
        IdGeneratorService service = new IdGeneratorService();
        service.setRandom(random);
        service.process();
        // Assert
        assertTrue(random.verify(1));
    }

    @Test
    void process() {
        // Dependency
        MyRandom random = new StubRandom6();
        // 1. Constructor Injection
        IdGeneratorService service = new IdGeneratorService();
        service.setRandom(random); // 2. Setter  Injection
        String result = service.process(); // 3. Method  Injection
        assertEquals("XYZ6", result);
    }
}