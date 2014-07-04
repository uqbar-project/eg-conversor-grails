package ar.edu.conversor

class ConversorCelsiusAFarenheitController extends AbstractConversorController {

    def getConcreteConversor() {
		new ConversorCelsiusAFarenheit()
	}
	
}
