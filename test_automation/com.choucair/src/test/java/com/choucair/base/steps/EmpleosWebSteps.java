package com.choucair.base.steps;

import java.io.IOException;
import java.util.List;

import com.choucair.base.pageobjects.EmpleosWebPageObjects;

import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;

public class EmpleosWebSteps {

 EmpleosWebPageObjects EmpleosWebPageObjects;

 	//Consulto Menu
	@Step
	public void SeleccionarOpcion(String opcion) {
		// TODO Auto-generated method stub
		EmpleosWebPageObjects.SeleccionarOpcion(opcion);
	}
	//Comparo menu
	@Step
	public void ComparaRuta(String ruta) {
		// TODO Auto-generated method stub
		EmpleosWebPageObjects.CompararRuta(ruta);
		
	}
	//Consulto y comparo links empleados
	@Step
	public void ConsultarCompararRutaEmpleos(String rutasEmpleos) {
		
		EmpleosWebPageObjects.ConsultarRutaEmpleos(rutasEmpleos);
		EmpleosWebPageObjects.CambioWindows();
		EmpleosWebPageObjects.CompararRutaEmpleos(rutasEmpleos);
	}
	//Consulto y comparo ser Choucair y aplicar
	@Step
	public void ConsultarCompararChoucair(String choucair) {
		
		EmpleosWebPageObjects.ConsultarOpcion(choucair);
		EmpleosWebPageObjects.CompararOpcion(choucair);
	}
	//Consulto y comparo ir al portal
	@Step
	public void ConsultarCompararPortal(String rutasEmpleos) {
		
		EmpleosWebPageObjects.ConsultarRutaEmpleos(rutasEmpleos);
		EmpleosWebPageObjects.Continuar();
		EmpleosWebPageObjects.CompararRutaEmpleos(rutasEmpleos);
	}

}