// The JUnit-to-Cucumber bridge for the workload the AOT caches are recorded
// from, the counterpart of a kata's own RunCukesTest.
//
// It passes, because a JVM writes a cache when it exits of its own accord and a
// green run is the simplest way to be sure of that.
package aotworkload;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    monochrome = true,
    plugin = { "pretty" }
)
public class RunGreeterCukes {
}
