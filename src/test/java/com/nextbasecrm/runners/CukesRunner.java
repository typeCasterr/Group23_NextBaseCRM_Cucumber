package com.nextbasecrm.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                  "html:target/default-html-reports",
                  "rerun:target/rerun.txt"},
        features = "src/test/resources/features",
        glue = "com/nextbasecrm/step_definitions",
        dryRun = false,
        tags = "@aa"
)
public class CukesRunner {
}