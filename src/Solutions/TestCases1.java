package Solutions;

// src/Solutions/TestCases1.java

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestCases1 {

    @org.junit.Test
    public void testNormalString() {
        // Test case 1: normal string
        String normalString = "This is a normal string.";
        assertTrue(Program1.filterString(normalString));
    }

    @org.junit.Test
    public void testScriptTag() {
        // Test case 2: string with a script tag
        String scriptTag = "<script>";
        assertFalse(Program1.filterString(scriptTag));
    }

    @org.junit.Test
    public void testNonCharacterCodePoint() {
        // Test case 3: string with a noncharacter code point
        String nonCharacterCodePoint = "<scr" + "\uFDEF" + "ipt>";
        assertFalse(Program1.filterString(nonCharacterCodePoint));
    }
}
