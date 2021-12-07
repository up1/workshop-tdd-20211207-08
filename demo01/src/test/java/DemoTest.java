import org.junit.jupiter.api.*;

public class DemoTest {

    @BeforeAll
    public static void initOnce() {
        System.out.println("==== initOnce ====");
    }

    @AfterAll
    public static void deinitOnce() {
        System.out.println("==== deinitOnce ====");
    }

    @BeforeEach
    public void init() {
        System.out.println("init");
    }

    @AfterEach
    public void cleanup() {
        System.out.println("cleanup");
    }

    @Test
    public void case01() {
        System.out.println("case 01");
    }

    @Test
    public void case02() {
        System.out.println("case 02");
    }

}
