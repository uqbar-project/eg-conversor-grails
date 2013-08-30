package ar.edu.conversor

abstract class AbstractConversorController {

    def index() { 
		[conversores: conversores, conversor: conversor, conversorElegido: conversores.get(1)]
	}

	// TODO: Meter 
	/*
	 * <ul class="nav nav-tabs">
  <li class="active">
    <a href="#">Home</a>
  </li>
  <li><a href="#">...</a></li>
  <li><a href="#">...</a></li>
</ul>	
	 */
	def getConversores() {
		[new ConversorMillasKmController(), new ConversorOnzasGramosController()]
	}
	
	def convertir() {
		def conversorInstance = conversor
		def errorMessage = null
		try {
			if (params.valorOrigen) {
				conversorInstance.valorOrigen = new BigDecimal(params.valorOrigen)
				conversorInstance.convertir()
			}
		} catch (NumberFormatException e) {
			errorMessage = "El número " + params.valorOrigen + " no es un valor válido"
		}
		render (view: "index", model: [conversor: conversorInstance, errorMessage: errorMessage])
	}
	
	abstract def getConversor()
	
}
