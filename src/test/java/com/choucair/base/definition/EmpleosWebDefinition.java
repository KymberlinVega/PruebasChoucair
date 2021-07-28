package com.choucair.base.definition;

import java.io.IOException;
import java.util.List;

import com.choucair.base.steps.EmpleosWebSteps;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class EmpleosWebDefinition {

	@Steps
	EmpleosWebSteps EmpleosWebSteps;

	//Consulto menu
	@When("^Consulto opcion ([^\"]*)$")
	public void consultoInformaciónCorrespondiente(String opcion) {

		EmpleosWebSteps.SeleccionarOpcion(opcion);
	}
	// Comparo menu
	@When("^Comparar ruta: ([^\"]*)$")
	public void compararRutaEmpleos(String ruta) {

		EmpleosWebSteps.ComparaRuta(ruta);
	}
	//Consulto y comparo links empleados
	@When("^Consulto y comparo opcion: ([^\"]*)$")
	public void consultoYComparoOpcion(String rutasEmpleos) {

		EmpleosWebSteps.ConsultarCompararRutaEmpleos(rutasEmpleos);
	}
	//Consulto y comparo ir al portal
	@When("^Consulto y comparo: ([^\"]*)$")
	public void consultoYComparoPortal(String ruta) {

		EmpleosWebSteps.ConsultarCompararPortal(ruta);
	}
	//Consulto y comparo ser Choucair y aplicar
	@When("^Consulto y comparo seccion ([^\"]*)$")
	public void consultoYComparoChoucair(String choucair) {

		EmpleosWebSteps.ConsultarCompararChoucair(choucair);
	}
}