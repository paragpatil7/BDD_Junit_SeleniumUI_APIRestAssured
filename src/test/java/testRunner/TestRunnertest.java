package testRunner;


	import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions; 
	//import cucumber.api.testng.CucumberFeatureWrapper;
	//import cucumber.api.testng.TestNGCucumberRunner;
	import cucumber.api.junit.Cucumber;
	import cucumber.api.CucumberOptions;
	

	
	@RunWith(Cucumber.class)
	@CucumberOptions(
			features="src/test/java/features",
			glue="stepDefinition",
			//dryRun = false,
			plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
			monochrome = true
			
			)
	 
	
	 
	//public class testRunner extends AbstractTestNGCucumberTests{
	 
	//}

	public class TestRunnertest {
		 
		@AfterClass
		public static void writeExtentReport() {
			Reporter.loadXMLConfig(new File("extent-config.xml"));
		    Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
		    Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
		    Reporter.setSystemInfo("Machine", 	"Windows 10" + "64 Bit");

		}
		
		
	}