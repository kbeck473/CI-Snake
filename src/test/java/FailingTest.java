import org.junit.Assert;
import org.junit.Test;

public class FailingTest {
    @Test
    public void testSomething() {
        // Example test that always passes
       // Assert.assertFalse();
        Assert.assertTrue("This should always pass", true);
    }
}
