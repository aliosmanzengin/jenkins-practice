package com.ali.ui.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
//        plugin = {
//                "pretty",
//                "html:reports/html-reports/default-cucumber-reports.html",
//                "json:reports/json-reports/cucumber.json",
//                "junit:reports/xml-report/cucumber.xml",
//                "rerun:reports/failedRerun.txt",
//                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
//        },
        features = "./src/test/resources/features/ui_features",
        glue = "com/ali/ui/stepDefinitions",
        tags = "@Search",
        dryRun = false
//        monochrome = true
)
public class Runner {

}