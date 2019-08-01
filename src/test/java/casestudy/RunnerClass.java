package casestudy;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features="src/test/resources/casestudy/",

plugin="html:target\\htmlreport")

public class RunnerClass {

}
