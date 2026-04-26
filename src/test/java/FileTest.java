import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class FileTest {
    @Test
    void testPath() {
        String path = File.getPath();
        assertTrue(path.contains("data.txt"));
    }
}
