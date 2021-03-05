package com.vytrack.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

// @RunWith annotation from Junit4
@RunWith(Cucumber.class)
@CucumberOptions (
        plugin = {
                "rerun:target/rerun.txt",                // path to the failed test
                "json:target/cucumber.json",             // path to the json files
                "html:target/default-cucumber-reports",  // path to the reports
                // how can we see by looking at reports which thread (tests) we ran in parallel?
                // with timeline we can see how much time it takes to execute a thread in total.
                "timeline:target/timeline-report"
        },
        features = {"src/test/recources/features"
        },
        glue = "com/vytrack/step_definitions",          // can be an array, not String
        dryRun = false,                                 // true will run feature files only

        //tags = "@login",                       // to add one more tag --> 'and'
        //tags = "@regression",
        tags = "@smoke",
        //tags = "@negative_login",
        // gives us reports
        publish = true


)
public class CucumberRunner {


}
