import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseLetterTest {
    private ReverseLetter reverseLetter = new ReverseLetter();

    @Test
    public void testReverseMixedString() {
        String mixedString = "J@va the be$t!123";
        String result = ReverseLetter.reverseLetter(mixedString);
        assertEquals(mixedString, ReverseLetter.reverseLetter(result));
    }

    @Test
    public void testReverseEmptyString() {
        String emptyString = "";
        String result = ReverseLetter.reverseLetter((emptyString));
        assertEquals(emptyString, ReverseLetter.reverseLetter(result));
    }

    @Test
    public void testReverseSingleString() {
        String singleString = "a";
        String result = ReverseLetter.reverseLetter(singleString);
        assertEquals(singleString, ReverseLetter.reverseLetter(result));
    }

    @Test
    public void testReverseNoLetters() {
        String noLetters = "123 !@";
        String result = ReverseLetter.reverseLetter(noLetters);
        assertEquals(noLetters, ReverseLetter.reverseLetter(result));
    }

    @Test
    public void testReverseOnlyLetters() {
        String onlyLetters = "abcd";
        assertEquals("dcba", ReverseLetter.reverseLetter(onlyLetters));
    }

    @Test
    public void testReverseSimbolEdgesAndMiddle() {
        String input = "123A b@c$D!";
        String result = "123D c@b$A!";
        assertEquals(result, ReverseLetter.reverseLetter(input));
    }

    @Test
    public void testReverseAppercaseAndLowercase() {
        String input = "A---b";
        String result = "b---A";
        assertEquals(result, ReverseLetter.reverseLetter(input));
    }
}
