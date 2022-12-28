package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = {"src/test/resources/tatacliq/tatacliq.feature"},glue ={"defination"})

public class testrunner extends AbstractTestNGCucumberTests{
	

}
