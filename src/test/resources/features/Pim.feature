#Proyecto de pruebas y cargado en Github
#27/01/2020
#Jhonatan Medina Blanco
@regression
Feature: pim
@AddEmployee
  Scenario Outline: agregar empleado
    Given abrir el navegador
    And diligencie el campo user <user> y contraseña <pass>
    When diligencie el nuevo empleado en los campos firstname <firstname>,  middleName <middleName> and lastName <lastName>
    Examples:
      |user|pass|firstname|middleName|lastName|
      |Admin|admin123|Maria|Camila   |Rocio   |

  @CreateLoginEmployees
  Scenario Outline: agregar empleado y crear usuario
    Given abrir el navegador
    And diligencie el campo user <user> y contraseña <pass>
    When diligencie el nuevo empleado en los campos firstname <firstname>,  middleName <middleName> and lastName <lastName>
    And diligencie los campo user <user> y contraseña <pass>
    Examples:
      |user|pass|firstname|middleName|lastName|
      |Admin|admin123|Maria|Camila   |Rocio   |