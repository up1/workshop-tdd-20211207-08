import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

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

}
