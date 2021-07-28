package com.choucair.base;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)



@CucumberOptions (features = "src/test/resources/", tags ="@PEmpleos",  

monochrome= true, snippets= SnippetType.CAMELCASE)
public class RunnerTags {
	
}
