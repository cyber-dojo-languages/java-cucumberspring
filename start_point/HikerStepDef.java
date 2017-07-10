import org.junit.*;
import static org.junit.Assert.*;
import org.springframework.beans.factory.annotation.Autowired;
import cucumber.api.java.en.*;

public class HikerStepDef {

    @Autowired
    private Hiker hiker;

    private int answer;

    @Given("^the hitch-hiker selects some tiles$")
    public void theHitchHikerSelectsSomeTiles() throws Throwable {
    }

    @When("^they spell (\\d+) times (\\d+)$")
    public void theySpellTimes(int arg1, int arg2) throws Throwable {
        answer = hiker.answer(arg1,arg2);
    }

    @Then("^the score is (\\d+)$")
    public void theScoreIs(int expected) throws Throwable {
        assertEquals(expected, answer);
    }
}
