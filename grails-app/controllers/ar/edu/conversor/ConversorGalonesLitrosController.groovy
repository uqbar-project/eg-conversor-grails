package ar.edu.conversor

class ConversorGalonesLitrosController extends AbstractConversorController {
	
	def getConversor() {
		new Conversor(3.785, "Galones", "Litros")
	}
	
}
