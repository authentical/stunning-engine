import static org.junit.Assert.*;

public class UtilitiesTest {

    private Utilities utilities;

    @org.junit.Before
    public void setup(){
        utilities = new Utilities();
    }



    @org.junit.Test
    public void everyNthChar() throws Exception {

        char[] output = utilities.everyNthChar(new char[] {'h','e','l','l','o'}, 8);

        assertArrayEquals(new char[] {'h','e','l','l','o'}, output);

        char[] output2 = utilities.everyNthChar(new char[] {'h','e','l','l','o'}, 0);

        assertArrayEquals(new char[] {'h','e','l','l','o'}, output2);

    }

    @org.junit.Test
    public void removePairs() throws Exception {

        String testString = "AABCDDEFF";
        assertEquals("ABCDEF", utilities.removePairs(testString));
        assertEquals("ABCABDEF", utilities.removePairs("ABCCABDEEF"));
        assertNull("Did not get null returned when null was passed", utilities.removePairs(null));
        assertEquals(" ", utilities.removePairs("  "));


    }

    @org.junit.Test
    public void converter() throws Exception {

        assertEquals(300,utilities.converter(10,5));
    }

    @org.junit.Test(expected = ArithmeticException.class)
    public void ArithmeticException() {             // Do not need throws Exception

        assertEquals(300,utilities.converter(10,0));
    }

    @org.junit.Test
    public void nullIfOddLength() throws Exception {

        assertEquals("hell", utilities.nullIfOddLength("hell"));
        assertNull(null, utilities.nullIfOddLength("hello"));
        assertNotNull(utilities.nullIfOddLength("even"));
    }

}