package com.choucair.base;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.RunWith;

import com.choucair.base.tool.BeforeSuite;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;

/**
 * Ejecución con un runner personalizado para lograr la ejecución de casos de
 * prueba por medio de documentos de excel
 */

@CucumberOptions(features = "src/test/resources/features/", tags = {
		"@PruebaChoucair" }, monochrome = true, snippets = SnippetType.CAMELCASE)

@RunWith(RunnerPersonalizado.class)
public class RunnerCucumber {

	@BeforeSuite
	public static void test() throws InvalidFormatException, IOException, com.ibm.icu.impl.InvalidFormatException {

		
	}
}
