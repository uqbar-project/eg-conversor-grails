package ar.edu.conversor

class ConversorCelsiusAFarenheit {

	BigDecimal valorOrigen
	BigDecimal valorDestino

	String getUnidadMedidaDestino() {
		"Farenheit"
	}

	String getUnidadMedidaOrigen() {
		"Celsius"
	}

	def convertir() {
		valorDestino = (valorOrigen * 9/5) + 32
	}
	
}
