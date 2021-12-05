package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import steps.BaseClass;

//AbstractTestNGCucumberTests

@CucumberOptions(features = "src/test/java/features", 
				 glue="steps123",
				 monochrome = true,
				 publish = true,
				// dryRun = true //to generate snippet
				  tags = "@functional" //run only @functional
				// tags = "@smoke or @functional" //run all the scenarios with either @smoke or @functional
				// tags = "@regression and @functional" //run testcase with both @regression and @functional
				// tags = "not @smoke" //to run all the scenarios except @smoke
				 )
public class CucumberRunner extends BaseClass{
	
	
}
