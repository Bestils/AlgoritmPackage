package codewars;

import static org.junit.Assert.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ToLeetSpeakTest {

        @Test public void testSomething() {
            assertEquals("1337", ToLeetSpeak.toLeetSpeak("LEET"));
            assertEquals("(0D3W@R$", ToLeetSpeak.toLeetSpeak("CODEWARS"));
            assertEquals("#3110 W0R1D", ToLeetSpeak.toLeetSpeak("HELLO WORLD"));
            assertEquals("10R3M !P$UM D010R $!7 @M37", ToLeetSpeak.toLeetSpeak("LOREM IPSUM DOLOR SIT AMET"));
            assertEquals("7#3 QU!(K 8R0WN F0X JUMP$ 0V3R 7#3 1@2Y D06", ToLeetSpeak.toLeetSpeak("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG"));
        }
    }




