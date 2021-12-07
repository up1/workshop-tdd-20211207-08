import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IdGeneratorServiceTest {

    @Test
    void process() {
        IdGeneratorService service = new IdGeneratorService();
        String result = service.process();
        assertEquals("XYZ6", result);
    }
}