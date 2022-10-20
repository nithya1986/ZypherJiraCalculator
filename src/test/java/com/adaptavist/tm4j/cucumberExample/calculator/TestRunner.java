package com.adaptavist.tm4j.cucumberExample.calculator;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/calculatorFeatures"
        ,glue={"com/adaptavist/tm4j/cucumberExample/stepDefinition"}
        ,plugin = {"junit:target/cucumber/result.xml","json:target/cucumber.json"}
)

public class TestRunner {

}
