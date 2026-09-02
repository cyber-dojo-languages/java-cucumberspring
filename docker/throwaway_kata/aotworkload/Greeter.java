// Part of the workload the AOT caches are recorded from. It has to exist before
// any learner's kata does, so what the caches hold are the compiler's classes,
// Cucumber's, Spring's and JUnit's rather than any kata's, and they speed up
// whatever a learner writes.
//
// Everything here sits in the aotworkload package on purpose. Cucumber finds
// features and step definitions by scanning the classpath from the package of
// the class running them, and a learner's runner sits in the default package.
// Putting this one in a package of its own is what stops a learner's [test]
// press from discovering this feature and these steps alongside their own.
package aotworkload;

public class Greeter {

    public String greeting() {
        return "hello";
    }
}
