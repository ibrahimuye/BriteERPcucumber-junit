package com.inventory.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(value = Cucumber.class)
@CucumberOptions(

        features = "src/test/resources/features",
        glue = "com/inventory/step_defs",
        tags = "@uc",
        dryRun = false,


//        plugin = {"html:target/Destination"}
        plugin = {
                "html:target/default-cucumber-reports",
                "json:target/cucumber.json",

        }
)
public class CukesRunner {
}
