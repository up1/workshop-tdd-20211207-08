import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloTest {

    @Test
    @DisplayName("สวัสดี first test case")
    public void case01(){
        // Arrange
        Hello hello = new Hello();
        // Act
        String result = hello.sayHi("somkiat");
        // Assert
        assertEquals("Hello somkiat", result);
    }

}
