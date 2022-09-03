#Proyecto de pruebas y cargado en Github
#27/01/2020
#Jhonatan Medina Blanco
Feature: login pagina orange

Scenario Outline: login
	Given abrir el navegador
	When diligencie el campo user <user> y contraseña <pass>

	Examples:
	|user|pass|
	|Admin|admin123|