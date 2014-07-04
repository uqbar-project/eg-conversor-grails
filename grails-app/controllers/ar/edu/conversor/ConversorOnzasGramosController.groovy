package ar.edu.conversor

class ConversorOnzasGramosController extends AbstractConversorController {

    @Override
	def getConcreteConversor() { 
		new Conversor(28.349523125, "Onzas", "Gramos")
	}
	
}
