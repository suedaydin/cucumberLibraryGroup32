package com.cydeo.library.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/cucumber-report.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",
                "json:target/cucumber-report.json"
        },
        features = "src/test/resources/features",
        glue="com/cydeo/library/step_definitions",
        dryRun = false,
        tags = "@librarian and @B26G32-106 and @B26G32-107"
)

public class CukesRunner {

}
