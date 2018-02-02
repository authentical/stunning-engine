import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class UtilitiesTestParameterized {

    private String input;
    private String output;

    private Utilities utilities;


    public UtilitiesTestParameterized(String input, String output){
        this.input=input;
        this.output=output;
    }

    @org.junit.Before
    public void setup(){
        utilities = new Utilities();
    }

    @Parameterized.Parameters
    public static Collection<Object> testConditions(){
        return Arrays.asList(new Object[][] {
                {"ABCDEFF","ABCDEF"},
                {"AB88EFFG", "AB8EFG"},
                {"A", "A"}
        });
    }

    @org.junit.Test
    public void removePairs() throws Exception{
        assertEquals(output, utilities.removePairs(input));
    }

}
