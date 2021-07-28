package com.choucair.base.pageobjects;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.equalToIgnoringWhiteSpace;
import static org.junit.Assert.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.assertj.core.api.SoftAssertions;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.XML;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.rest.Ensure;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

import io.restassured.response.Response;

public class EmpleosWebPageObjects extends PageObject {
	SoftAssertions softAssert = new SoftAssertions();
	String url = "";
	String current = "";
	String title = "";
	String parentWindowHandler = "";
	String aceptar = "ACEPTAR";
	String mensaje = ""; 
	String esperado = "";
	
	//Consulto menu
	public void SeleccionarOpcion(String opcion) {

		find(By.linkText(opcion)).click();

	}


	//Comparo menu
	public void CompararRuta(String ruta) {
		// TODO Auto-generated method stub
		WebDriver driver = getDriver();
		switch(ruta) {
		case "Servicios":
			url = "https://www.choucairtesting.com/servicio/";
		    current = driver.getCurrentUrl();
			assertThat(current).as("Comparación URL").isEqualTo(url);

			break;

		case "Industrias":
			url = "https://www.choucairtesting.com/industries/";
		    current = driver.getCurrentUrl();
			assertThat(current).as("Comparación URL").isEqualTo(url);
			
			break;

		case "Formación":
			url = "https://www.choucairtesting.com/formacion/";
		    current = driver.getCurrentUrl();
			assertThat(current).as("Comparación URL").isEqualTo(url);
			
			break;
		case "Comunidad":
			url = "https://www.choucairtesting.com/comunidad2020/";
		    current = driver.getCurrentUrl();
			assertThat(current).as("Comparación URL").isEqualTo(url);

			break;
		case "Empleos":
			url = "https://www.choucairtesting.com/empleos-testing/";
		    current = driver.getCurrentUrl();
			assertThat(current).as("Comparación URL").isEqualTo(url);

			break;
		case "Nosotros":
			url = "https://www.choucairtesting.com/nosotros/";
		    current = driver.getCurrentUrl();
			assertThat(current).as("Comparación URL").isEqualTo(url);			

			break;
		case "Contáctenos":
			url = "https://www.choucairtesting.com/contactenos/";
		    current = driver.getCurrentUrl();
			assertThat(current).as("Comparación URL").isEqualTo(url);				

			break;

			default:
				
			break;
		}
		Serenity.recordReportData().withTitle("ruta "+ url).andContents("URL --> " + url
				+"\n URL Actual --> " + current
				);
		}		
	//Consulto links empleados
	//Consulto y comparo ir al portal
		public void ConsultarRutaEmpleos(String rutasEmpleos) {
			// TODO Auto-generated method stub
			find(By.linkText(aceptar)).click();
			find(By.linkText(rutasEmpleos)).select();
			find(By.linkText(rutasEmpleos)).click();
			
	}

		//Comparo links empleados
		//Consulto y comparo ir al portal
		public void CompararRutaEmpleos(String rutasEmpleos) {
			// TODO Auto-generated method stub
			WebDriver driver = getDriver();
			switch(rutasEmpleos) {
			case "Modelo de calidad de software":
				url = "https://iso25000.com/index.php/normas-iso-25000/iso-25010";
			    current = driver.getCurrentUrl();
				assertThat(current).as("Comparación URL").isEqualTo(url);

				break;

			case "Diferencia entre calidad de software y pruebas":
				url = "http://www.rspa.com/spi/index.html";
			    current = driver.getCurrentUrl();
				assertThat(current).as("Comparación URL").isEqualTo(url);
				
				break;

			case "Papel de los ingenieros":
				url = "https://www.youtube.com/watch?v=bipTWWHya8A";
			    current = driver.getCurrentUrl();
				assertThat(current).as("Comparación URL").isEqualTo(url);
				
				break;
			case "El software en la economía actual":
				url = "https://www.youtube.com/watch?v=EzVolGw-P3k";
			    current = driver.getCurrentUrl();
				assertThat(current).as("Comparación URL").isEqualTo(url);

				break;
			case "Los errores del software":
				url = "https://www.pingdom.com/blog/2009";
			    current = driver.getCurrentUrl();
				assertThat(current).as("Comparación URL").isEqualTo(url);

				break;
			case "Calidad de software":
				url = "https://www.youtube.com/watch?v=Hf-47kSvkHc&t=12s";
			    current = driver.getCurrentUrl();
				assertThat(current).as("Comparación URL").isEqualTo(url);			

				break;
			case "Fundamentos ingeniería de software":
				url = "https://www.youtube.com/watch?v=JuwHxdWkRH0";
			    current = driver.getCurrentUrl();
				assertThat(current).as("Comparación URL").isEqualTo(url);				

				break;
			case "Marcos de trabajo de software: ágiles/tradicionales":
				url = "https://www.youtube.com/watch?v=ZMFaUvJTW-4";
			    current = driver.getCurrentUrl();
				assertThat(current).as("Comparación URL").isEqualTo(url);				

				break;
			case "Principios de programación":
				url = "https://www.youtube.com/watch?v=AEiRa5xZaZw";
			    current = driver.getCurrentUrl();
				assertThat(current).as("Comparación URL").isEqualTo(url);				

				break;
			case "Algoritmos de software":
				url = "https://www.youtube.com/watch?v=mzI90pTT5PY";
			    current = driver.getCurrentUrl();
				assertThat(current).as("Comparación URL").isEqualTo(url);				

				break;
			case "¿Qué es programación por Ncapas?":
				url = "https://www.youtube.com/watch?v=M_M8T8G4Og8";
			    current = driver.getCurrentUrl();
				assertThat(current).as("Comparación URL").isEqualTo(url);				

				break;
			case "Manual práctico de SQL":
				url = "https://www.choucairtesting.com/wp-content/uploads/2018/09/manual-practico-sql.pdf";
			    current = driver.getCurrentUrl();
				assertThat(current).as("Comparación URL").isEqualTo(url);				

				break;
			case "Marcos de trabajo de pruebas":
				url = "https://www.choucairtesting.com/wp-content/uploads/2018/09/ISO29119-Estandar-para-las-Pruebas-de-Software-2007.pdf";
			    current = driver.getCurrentUrl();
				assertThat(current).as("Comparación URL").isEqualTo(url);				

				break;
			case "¿Qué son los riesgos del proyecto y de producto?":
				url = "https://www.youtube.com/watch?v=yph3_90SNGM";
			    current = driver.getCurrentUrl();
				assertThat(current).as("Comparación URL").isEqualTo(url);				

				break;
			case "Técnicas de caja negra":
				url = "https://www.youtube.com/watch?v=Uo2xvx7zhwo";
			    current = driver.getCurrentUrl();
				assertThat(current).as("Comparación URL").isEqualTo(url);				

				break;
			case "Foundation Level – Técnicas":
				url = "https://www.youtube.com/watch?v=RQRkRLYujWA";
			    current = driver.getCurrentUrl();
				assertThat(current).as("Comparación URL").isEqualTo(url);				

				break;
			case "Fundamentos de la gerencia de proyectos en desarrollo de software":
				url = "https://www.choucairtesting.com/wp-content/uploads/2018/09/fundamentosgerenciaproyectos.pdf";
			    current = driver.getCurrentUrl();
				assertThat(current).as("Comparación URL").isEqualTo(url);				

				break;
			case "¿Cuáles son las actividades de la Gestión de Proyectos?":
				url = "https://www.youtube.com/watch?v=5ISd3NssJKs";
			    current = driver.getCurrentUrl();
				assertThat(current).as("Comparación URL").isEqualTo(url);				

				break;
				default:
					
				break;
			}
			Serenity.recordReportData().withTitle("ruta "+ url).andContents("URL --> " + url
					+"\n URL Actual --> " + current
					);
			}		
		//Consulto ser Choucair y aplicar
		public void ConsultarOpcion(String choucair) {
			// TODO Auto-generated method stub
			find(By.linkText(aceptar)).click();
			find(By.linkText(choucair)).click();
			
	}
		//Comparo ser Choucair y aplicar
		public void CompararOpcion(String choucair) {
			// TODO Auto-generated method stub
			WebDriver driver = getDriver();
			switch(choucair) {
			case "¿Qué es ser Choucair?":
				title = "//*[@id=\"content\"]/div/div/div/div/div/section[4]/div/div/div/div/div/div[2]/div/h2";
				esperado = "SER CHOUCAIR";
			    mensaje = find(By.xpath(title)).getText();
				assertThat(esperado).as("Comparación titulo").isEqualTo(mensaje);

				break;
				
			case "Prepararse para aplicar":
				title = "//*[@id=\"content\"]/div/div/div/div/div/section[10]/div/div/div/div/div/div[3]/div/h2";
				esperado = "PREPARARSE PARA APLICAR";
			    mensaje = find(By.xpath(title)).getText();
				assertThat(esperado).as("Comparación titulo").isEqualTo(mensaje);

				break;

			default:
				
				break;
			}
			Serenity.recordReportData().withTitle("Mensaje "+ esperado).andContents("Mensaje esperado --> " + esperado
					+"\n Mensaje de la aplicación --> " + mensaje
					);
			}
		//Cambio de ventana
		public <LoginPageObjects> void CambioWindows() {



			try {
			Thread.sleep(5000);
			} catch (Exception e) {
			}



			// ---- Cambiar al PopPup -----//
			// LoginPageObjects loginPageObjects;



			parentWindowHandler = this.getDriver().getWindowHandle(); // Almacena la ventana principal
			String subWindowHandler = null;
			Set<String> handles = this.getDriver().getWindowHandles(); // Consigue todas las ventanas PopPup
			Iterator<String> iterator = handles.iterator();
			while (iterator.hasNext()) {
			subWindowHandler = iterator.next();
			}
			this.getDriver().switchTo().window(subWindowHandler); // Cambia a la ventana PopPuw
			// ---- Cambiar al PopPup -----//



			try {
			Thread.sleep(3000);
			} catch (Exception e) {
			}



			}


		//Opción Continuar ir al portal
		public void Continuar() {
			// TODO Auto-generated method stub
			String continuar = "CONTINUAR";
			find(By.linkText(continuar)).click();
		}
		
	
}