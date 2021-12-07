import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DemoRangeTest {

    @Test
    @DisplayName("ต้องเริ่มต้นด้วย [")
    public void case01() {
        DemoRange demoRange = new DemoRange("[1,5]");
        boolean result = demoRange.startWithInclude();
        assertTrue(result);
    }

    @Test
    @DisplayName("ต้องเริ่มต้นด้วย (")
    public void case02() {
        DemoRange demoRange = new DemoRange("(1,5]");
        boolean result = demoRange.startWithInclude();
        assertFalse(result);
    }

    @Test
    @DisplayName("ต้องสิ้นสุดด้วย ]")
    public void case03() {
        DemoRange demoRange = new DemoRange("[1,5]");
        boolean result = demoRange.endWithInclude();
        assertTrue(result);
    }

    @Test
    @DisplayName("ต้องสิ้นสุดด้วย )")
    public void case04() {
        DemoRange demoRange = new DemoRange("[1,5)");
        boolean result = demoRange.endWithInclude();
        assertFalse(result);
    }

    @Test
    @DisplayName("ต้องเริ่มต้นด้วย 1")
    public void case05() {
        DemoRange demoRange = new DemoRange("[1,5]");
        int result = demoRange.getStartNumber();
        assertEquals(1, result);
    }

    @Test
    @DisplayName("ต้องเริ่มต้นด้วย 2")
    public void case06() {
        DemoRange demoRange = new DemoRange("[2,5]");
        int result = demoRange.getStartNumber();
        assertEquals(2, result);
    }

    @Test
    @DisplayName("ต้องเริ่มต้นด้วย 2 จาก (1,5]")
    public void case07() {
        DemoRange demoRange = new DemoRange("(1,5]");
        int result = demoRange.getStartNumber();
        assertEquals(2, result);
    }

}
