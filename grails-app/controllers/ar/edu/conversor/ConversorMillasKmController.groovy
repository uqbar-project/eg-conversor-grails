package ar.edu.conversor

class ConversorMillasKmController extends AbstractConversorController {

	@Override
	def getConversor() {
		new Conversor(1.6093, "Millas", "Kilómetros")
	}

}
