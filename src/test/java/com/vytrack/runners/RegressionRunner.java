package com.vytrack.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

// @RunWith annotation from Junit4
@RunWith(Cucumber.class)
@CucumberOptions (
        plugin = {
                "rerun:target/rerun.txt",                // path to the failed test
                "json:target/cucumber2.json",             // path to the json files
                "html:target/default-cucumber-reports",  // path to the reports
        },
        features = {"src/test/recources/features/Activities",
                    "src/test/recources/features/fleet"
        },
        glue = "com/vytrack/step_definitions",          // can be an array, not String
        dryRun = false,                                 // true will run feature files only
        tags = "",                                      // to add one more tag --> 'and'
        publish = true


)


public class RegressionRunner {
}
