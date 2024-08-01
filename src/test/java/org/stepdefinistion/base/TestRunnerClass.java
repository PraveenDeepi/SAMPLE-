package org.stepdefinistion.base;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/",
glue = "org.stepdefinistion",
monochrome = true ,
dryRun = false, 
strict = true,
snippets = SnippetType.CAMELCASE,
tags = "@Feature2",
plugin = {"html: Report", "junit: Report\\junitfile.xml","json: Report\\jsonfile.json"})
public class TestRunnerClass {

}
