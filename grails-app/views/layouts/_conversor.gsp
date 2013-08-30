<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta name="layout" content="main" />
<title>Conversor de medidas</title>
</head>
<body>
	<div class="body" style="width: 90%; padding: 15pt;">
		<h2>Conversor de medidas</h2>
		<form method="post">
			<g:if test="${errorMessage}">
				<div class="row">
					<div class="span8 alert alert-error">
					${errorMessage}
					</div>
				</div>
			</g:if>
			<div class="row">
				<div class="span4">
					<p class="text-right">
					${conversor.unidadMedidaOrigen}
					</p>
				</div>
				<div class="span8">
					<input class="input-medium" type="text" name="valorOrigen"
						placeholder="Ingrese un valor" value="${conversor.valorOrigen}" />
				</div>
			</div>
			<div class="row">
				<div class="span4">
					<p class="text-right">
					${conversor.unidadMedidaDestino}
					</p>
				</div>
				<g:valorConvertido valor="${conversor.valorDestino}" />
			</div>
			<br>
			<div class="row">
				<div class="span8 text-center">
					<g:actionSubmit value="Convertir" class="btn btn-success" action="convertir"/>
				</div>
			</div>
		</form>
	</div>
</body>