package ar.edu.conversor

class ConversorOnzasGramosController extends AbstractConversorController {

    @Override
	def getConversor() { 
		new Conversor(28.349523125, "Onzas", "Gramos")
	}
	
}
