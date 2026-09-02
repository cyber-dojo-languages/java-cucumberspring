// The step definitions for the workload the AOT caches are recorded from.
// Running a real scenario is what pulls Cucumber's expression parsing, its
// gherkin reader and Spring's autowiring into the cache; loading the classes
// without running anything would leave most of that out.
package aotworkload;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import static org.junit.Assert.assertEquals;

public class GreeterStepDef {

    @Autowired
    private Greeter greeter;

    private String said;

    @Given("a greeter")
    public void a_greeter() {
    }

    @When("it greets")
    public void it_greets() {
        said = greeter.greeting();
    }

    @Then("it said {string}")
    public void it_said(String expected) {
        assertEquals(expected, said);
    }
}
