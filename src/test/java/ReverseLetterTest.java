import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseLetterTest {
    private final ReverseLetter reverse = new ReverseLetter();

    @Test
    public void testReverseMixedString() {
        String input = "J@va the be$t!123";

        String firstReverse = reverse.reverseLetter(input);
        String secondReverse = reverse.reverseLetter(firstReverse);

        assertEquals(input, secondReverse);
    }

    @Test
    public void testReverseEmptyString() {
        String input = "";


        String firstReverse = reverse.reverseLetter(input);
        String secondReverse = reverse.reverseLetter(firstReverse);

        assertEquals(input, secondReverse);
    }

    @Test
    public void testReverseSingleString() {
        String input = "a";

        String firstReverse = reverse.reverseLetter(input);
        String secondReverse = reverse.reverseLetter(firstReverse);

        assertEquals(input, secondReverse);
    }

    @Test
    public void testReverseNoLetters() {
        String input = "123 !@";

        String firstReverse = reverse.reverseLetter(input);
        String secondReverse = reverse.reverseLetter(firstReverse);

        assertEquals(input, secondReverse);
    }

    @Test
    public void testReverseOnlyLetters() {
        String input = "abcd";
        String expectedResult = "dcba";

        String actualResult = reverse.reverseLetter(input);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testReverseSimbolEdgesAndMiddle() {
        String input = "123A b@c$D!";
        String expectedResult = "123D c@b$A!";

        String actualResult = reverse.reverseLetter(input);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testReverseAppercaseAndLowercase() {
        String input = "A---b";
        String expectedResult = "b---A";

        String actualReverse = reverse.reverseLetter(input);
        assertEquals(expectedResult, actualReverse);
    }
}
