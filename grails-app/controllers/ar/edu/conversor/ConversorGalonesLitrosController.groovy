package ar.edu.conversor

class ConversorGalonesLitrosController extends AbstractConversorController {
	
	def getConcreteConversor() {
		new Conversor(3.785, "Galones", "Litros")
	}
	
}
