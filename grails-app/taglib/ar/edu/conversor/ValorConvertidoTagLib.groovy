package ar.edu.conversor

import java.text.DecimalFormat

class ValorConvertidoTagLib {
	
	def valorConvertido = { attrs, body ->
		def valor = attrs.valor
		def claseValor = "alert alert-" + (valor != null ? "info" : "warning" )
		def valorConvertido =  "NO INGRESADO"
		if (valor) {
			valorConvertido = new DecimalFormat("#######0.########").format(valor)
		}
		out << g.render(template: "/layouts/valorConvertido" , model: [valorConvertido: valorConvertido, claseValor: claseValor]) 
	}
	
}
