package com.equifax.runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith (Cucumber.class)
@CucumberOptions (
		
		plugin = {
				"html:target/built-in-html-report",
				"json:target/Cucumber.json "
		
		},
					
		tags = "@test",
//		tags = "@api",
		features = "src/test/resources/com/equifax/features",
		glue = "com/equifax/step_definitions"
		,strict = true
//		,dryRun = true
		,monochrome =true
//		,stepNotifications = true
//		,snippets = SnippetType.CAMELCASE
		)




public class CukeRunner {

}
