package com.choucair.base.steps;

import com.choucair.base.pageobjects.LoginWebPageObjects;

import net.thucydides.core.annotations.Step;

public class LoginWebSteps {

	LoginWebPageObjects LoginWebPageObjects;

	@Step
	public void Browser() {
		LoginWebPageObjects.getDriver().manage().deleteAllCookies();
		LoginWebPageObjects.open();

	}

}