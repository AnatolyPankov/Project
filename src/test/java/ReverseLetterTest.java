import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseLetterTest {
    private final ReverseLetter reverse = new ReverseLetter();

    @Test
    public void reverse_shouldReverseString() {
        String result = reverse.reverseLetter("J@va the be$t!123");

        assertEquals("t@eb eht av$J!123", result);

    }

    @Test
    public void reverse_returnsEmptyForEmptyInput() {
        String result = reverse.reverseLetter("");

        assertEquals("", result);
    }

    @Test
    public void reverse_preservesOneLetter() {
        String result = reverse.reverseLetter("a");

        assertEquals("a", result);
    }

    @Test
    public void reverse_keepsNonLettersInPlace() {
        String result = reverse.reverseLetter("123 !@#");

        assertEquals("123 !@#", result);
    }

    @Test
    public void reverse_rotatesTheLetters() {
        String result = reverse.reverseLetter("abcd");

        assertEquals("dcba", result);
    }

    @Test
    public void reverse_reverseSimbolEdgesAndMiddle() {
        String result = reverse.reverseLetter("123A b@c$D!");

        assertEquals("123D c@b$A!", result);
    }

    @Test
    public void reverse_appercaseAndLowercase() {
        String result = reverse.reverseLetter("A---b");

        assertEquals("b---A", result);
    }
}
