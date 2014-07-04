package ar.edu.conversor

class ConversorMillasKmController extends AbstractConversorController {

	@Override
	def getConcreteConversor() {
		new Conversor(1.6093, "Millas", "Kilómetros")
	}

}
