package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features="src/test/java/feature",glue={"stepDefination"})
public class TestRunner extends AbstractTestNGCucumberTests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
