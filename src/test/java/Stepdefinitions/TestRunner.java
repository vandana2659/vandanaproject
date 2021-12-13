package Stepdefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;

import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features", glue= {"Stepdefinitions"},
monochrome= true,

plugin = {"json:target/cucumber.json"},
tags="@smoketest"
)


public class TestRunner {

}