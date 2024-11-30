import org.junit.Test;
import static org.junit.Assert.*;

public class FailingTest {

    @Test
    public void testThatFails() {
        // Intentionally fail the test
        fail("This test is intentionally failing to block the build.");
    }
}
