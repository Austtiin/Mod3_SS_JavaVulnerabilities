package Solutions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestCases3 {

    @Test
    public void testFileNotFound() {
        String[] args = {"/nonexistentfile.txt"};
        assertThrows(Exception.class, () -> Program3.StartMain(args));
    }
}