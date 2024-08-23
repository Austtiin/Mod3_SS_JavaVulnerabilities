package Solutions;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestCases2 {

        @org.junit.Test
        public void testDeleteFile() {
            // Test case 1: delete file

            //This is false currently because the file is not deleted
            //file is not deleted because the file is not created
            //I.E the file does not exist until our main program creates it
            //test case 1 will fail
            assertTrue(Program2.deleteFile(new java.io.File("someFileName.txt")));
        }

        @org.junit.Test
        public void testDeleteFileFailure() {
            // Test case 2: delete file failure
            assertFalse(Program2.deleteFile(new java.io.File("nonExistentFile.txt")));
        }
}
