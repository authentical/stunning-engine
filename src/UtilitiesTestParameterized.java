import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(Parameterized.class)
public class UtilitiesTestParameterized {

    private String input;
    private String output;

    private Utilities utilities;


    @org.junit.ClassRule
    public UtilitiesTestParameterized(String input, String output){
        this.input=input;
        this.output=output;
    }



}
