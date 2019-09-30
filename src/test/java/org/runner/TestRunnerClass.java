package org.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",glue="org\\stepdefenition",monochrome=true,dryRun=false,plugin= {"pretty",
	    "html:target/cucumber-html-report/cucumber-pretty",
	    "json:target/cucumber-html-report/login.json",
	    "rerun:target/cucumber-html-report/rerun.txt"})

public class TestRunnerClass {
	
	

}
