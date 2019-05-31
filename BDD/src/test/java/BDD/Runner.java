package BDD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Admin\\Desktop\\BackupWS\\BDD\\src\\test\\java\\BDD\\Parametisation.feature", glue= {"BDD"})
public class Runner {

	}

