package ar.edu.conversor
class Conversor {
	
	String unidadMedidaOrigen
	BigDecimal valorOrigen
	String unidadMedidaDestino
	BigDecimal valorDestino
	BigDecimal factorConversion
	
	public Conversor(unFactorConversion, unaUnidadMedidaOrigen, unaUnidadMedidaDestino) {
		factorConversion = unFactorConversion
		unidadMedidaOrigen = unaUnidadMedidaOrigen
		unidadMedidaDestino = unaUnidadMedidaDestino 
	}
	
	def convertir() {
		valorDestino = factorConversion * valorOrigen
	}
	
}
