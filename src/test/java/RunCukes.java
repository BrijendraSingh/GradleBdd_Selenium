import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
				tags= {"@sampleTag"},
				features= {"src/test/resources/gherkin"},
				glue= {"src/test/java/stepDef"},
				plugin= {"pretty", "json:target/json/cucumber.json","html:target/html","junit:target/junit/cucumber.xml"}		
)
public class RunCukes {

}
