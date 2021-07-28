#Empresa: Choucair
#Automatizador: Kymberlin Vega
#Producto: Empleos
@PEmpleos
Feature: Empleos

  Background: Login
    Given Ingreso al portal Choucair
  
  @RegresionEmpleos
  Scenario: 1. Validar ingreso a la opcion empleos
    
    When Consulto opcion Empleos
    Then Comparar ruta: Empleos 
   
   @RegresionServicios
  Scenario: 2. Validar ingreso a la opcion servicios
    
    When Consulto opcion Servicios
    Then Comparar ruta: Servicios  
    
    @RegresionIndustrias
  Scenario: 3. Validar ingreso a la opcion industrias
    
    When Consulto opcion Industrias
    Then Comparar ruta: Industrias  
    
    @RegresionFormacion
  Scenario: 4. Validar ingreso a la opcion formación
    
    When Consulto opcion Formación
    Then Comparar ruta: Formación  
    
    @RegresionComunidad
  Scenario: 5. Validar ingreso a la opcion comunidad
    
    When Consulto opcion Comunidad
    Then Comparar ruta: Comunidad  
    
    @RegresionNosotros
  Scenario: 6. Validar ingreso a la opcion nosotros
    
    When Consulto opcion Nosotros
    Then Comparar ruta: Nosotros
    
      @RegresionContactenos
  Scenario: 7. Validar ingreso a la opcion contáctenos
    
    When Consulto opcion Contáctenos
    Then Comparar ruta: Contáctenos  
    
      @RegresionEmpleos @GeneralidadesCalidadSoftware
  Scenario: 8. Validar ingreso a la opcion Modelo de calidad de software
    
    When Consulto opcion Empleos
    Then Consulto y comparo opcion: Modelo de calidad de software
    
      @RegresionEmpleos @GeneralidadesCalidadSoftware
  Scenario: 9. Validar ingreso a la opcion Diferencia entre calidad de software y pruebas
    
    When Consulto opcion Empleos
    Then Consulto y comparo opcion: Diferencia entre calidad de software y pruebas
    
       @RegresionEmpleos @GeneralidadesCalidadSoftware
  Scenario: 10. Validar ingreso a la opcion Papel de los ingenieros
    
    When Consulto opcion Empleos
    Then Consulto y comparo opcion: Papel de los ingenieros
    
       @RegresionEmpleos @GeneralidadesCalidadSoftware
  Scenario: 11. Validar ingreso a la opcion El software en la economía actual
    
    When Consulto opcion Empleos
    Then Consulto y comparo opcion: El software en la economía actual    
    
       @RegresionEmpleos @GeneralidadesCalidadSoftware
  Scenario: 12. Validar ingreso a la opcion Los errores del software
    
    When Consulto opcion Empleos
    Then Consulto y comparo opcion: Los errores del software   
    
       @RegresionEmpleos @GeneralidadesCalidadSoftware
  Scenario: 13. Validar ingreso a la opcion Calidad de software
    
    When Consulto opcion Empleos
    Then Consulto y comparo opcion: Calidad de software
    
       @RegresionEmpleos @SobreIngenieríaSoftware
  Scenario: 14. Validar ingreso a la opcion Fundamentos ingeniería de software
    
    When Consulto opcion Empleos
    Then Consulto y comparo opcion: Fundamentos ingeniería de software
    
       @RegresionEmpleos @SobreIngenieríaSoftware
  Scenario: 15. Validar ingreso a la opcion Marcos de trabajo de software: ágiles/tradicionales
    
    When Consulto opcion Empleos
    Then Consulto y comparo opcion: Marcos de trabajo de software: ágiles/tradicionales
    
       @RegresionEmpleos @SobreIngenieríaSoftware
  Scenario: 16. Validar ingreso a la opcion Principios de programación
    
    When Consulto opcion Empleos
    Then Consulto y comparo opcion: Principios de programación
    
       @RegresionEmpleos @SobreIngenieríaSoftware
  Scenario: 17. Validar ingreso a la opcion Algoritmos de software
    
    When Consulto opcion Empleos
    Then Consulto y comparo opcion: Algoritmos de software
    
       @RegresionEmpleos @SobreIngenieríaSoftware
  Scenario: 18. Validar ingreso a la opcion ¿Qué es programación por Ncapas?
    
    When Consulto opcion Empleos
    Then Consulto y comparo opcion: ¿Qué es programación por Ncapas?   
    
       @RegresionEmpleos @SobreIngenieríaSoftware
  Scenario: 18. Validar ingreso a la opcion Manual práctico de SQL
    
    When Consulto opcion Empleos
    Then Consulto y comparo opcion: Manual práctico de SQL   
    
       @RegresionEmpleos @SobrePruebasSoftwareDesarrolloSoftware
  Scenario: 19. Validar ingreso a la opcion Marcos de trabajo de pruebas
    
    When Consulto opcion Empleos
    Then Consulto y comparo opcion: Marcos de trabajo de pruebas     
        
       @RegresionEmpleos @SobrePruebasSoftwareDesarrolloSoftware
  Scenario: 20. Validar ingreso a la opcion ¿Qué son los riesgos del proyecto y de producto?
    
    When Consulto opcion Empleos
    Then Consulto y comparo opcion: ¿Qué son los riesgos del proyecto y de producto?     
    
       @RegresionEmpleos @SobrePruebasSoftwareDesarrolloSoftware
  Scenario: 21. Validar ingreso a la opcion Técnicas de caja negra
    
    When Consulto opcion Empleos
    Then Consulto y comparo opcion: Técnicas de caja negra         
    
       @RegresionEmpleos @SobrePruebasSoftwareDesarrolloSoftware
  Scenario: 22. Validar ingreso a la opcion Foundation Level – Técnicas
    
    When Consulto opcion Empleos
    Then Consulto y comparo opcion: Foundation Level – Técnicas         

       @RegresionEmpleos @SobreGerenciaProyectos
  Scenario: 23. Validar ingreso a la opcion Fundamentos de la gerencia de proyectos en desarrollo de software
    
    When Consulto opcion Empleos
    Then Consulto y comparo opcion: Fundamentos de la gerencia de proyectos en desarrollo de software 

       @RegresionEmpleos @SobreGerenciaProyectos
  Scenario: 24. Validar ingreso a la opcion ¿Cuáles son las actividades de la Gestión de Proyectos?
    
    When Consulto opcion Empleos
    Then Consulto y comparo opcion: ¿Cuáles son las actividades de la Gestión de Proyectos?
    	  
    	  @RegresionEmpleos @PortalEmpleos
    Scenario: 25. Validar ingreso a la opcion Ir al portal de empleos
    
    When Consulto opcion Empleos
    Then Consulto y comparo: Ir al portal de empleos
        
        @RegresionEmpleos @Choucair
    Scenario: 27. Validar ingreso a la opcion ¿Qué es ser Choucair?
    
    When Consulto opcion Empleos
    Then Consulto y comparo seccion ¿Qué es ser Choucair?
        
         @RegresionEmpleos @Choucair
    Scenario: 27. Validar ingreso a la opcion Prepararse para aplicar
    
    When Consulto opcion Empleos
    Then Consulto y comparo seccion Prepararse para aplicar