import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseLetterTest {
    private ReverseLetter reverseLetter = new ReverseLetter();

    @Test
    public void testReverseMixedString() {
        assertEquals("J@va the be$t!123", ReverseLetter.reverseLetter("t@eb eht av$J!123"));
    }

    @Test
    public void testReverseEmptyString() {
        assertEquals("", ReverseLetter.reverseLetter(""));
    }

    @Test
    public void testReverseSingleString() {
        assertEquals("a", ReverseLetter.reverseLetter("a"));
    }

    @Test
    public void testReverseNoLetters() {
        assertEquals("123 !@", ReverseLetter.reverseLetter("123 !@"));
    }

    @Test
    public void testReverseOnlyLetters() {
        assertEquals("abcd", ReverseLetter.reverseLetter("dcba"));
    }

    @Test
    public void testReverseSimbolEdgesAndMiddle() {
        assertEquals("123D c@b$A!", ReverseLetter.reverseLetter("123A b@c$D!"));
    }

    @Test
    public void testReverseAppercaseAndLowercase() {
        assertEquals("b---A", ReverseLetter.reverseLetter("A---b"));
    }
}
