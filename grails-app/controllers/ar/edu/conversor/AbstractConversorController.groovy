package ar.edu.conversor

abstract class AbstractConversorController {

    def index() { 
		render (template: "/layouts/conversor", model: [conversor: getConcreteConversor()])
	}
	
	abstract def getConcreteConversor()

	def convertir() {
		def conversorInstance = getConcreteConversor()
		def errorMessage = null
		try {
			if (params.valorOrigen) {
				conversorInstance.valorOrigen = new BigDecimal(params.valorOrigen)
				conversorInstance.convertir()
			}
		} catch (NumberFormatException e) {
			errorMessage = "El número " + params.valorOrigen + " no es un valor válido"
		}
		render (template: "/layouts/conversor", model: [conversor: conversorInstance, errorMessage: errorMessage])
	}
	
}
