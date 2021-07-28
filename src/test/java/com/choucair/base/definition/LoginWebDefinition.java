package com.choucair.base.definition;

import com.choucair.base.steps.LoginWebSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class LoginWebDefinition {

	@Steps
	LoginWebSteps LoginWebSteps;
	
	@Given("^Ingreso al portal Choucair$")
	public void ingresoAlPortalChoucair() {
	    // Write code here that turns the phrase above into concrete actions
	    LoginWebSteps.Browser();
	}

}