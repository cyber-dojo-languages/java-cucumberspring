// Tells Cucumber which Spring context to build for the recorded workload, the
// counterpart of a kata's own ApplicationContext. Building a real context is
// the point of it: that is what loads Spring's bean factory and its annotation
// scanning, which are the slowest classes a kata here waits for.
package aotworkload;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.test.context.ContextConfiguration;

@CucumberContextConfiguration
@ContextConfiguration(classes=Greeter.class)
public class ApplicationContext {
}
