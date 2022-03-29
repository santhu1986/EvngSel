package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"E:\\Seleniumprjfeb\\Ebanking\\src\\feature\\Rolecre.feature",
		                    "E:\\Seleniumprjfeb\\Ebanking\\src\\feature\\Login.feature"},
                                 glue="stepdefination",monochrome=true,
                 plugin= {"pretty","json:Target/Roleresult/Role.json"})
public class Loginrunner 
{

}
