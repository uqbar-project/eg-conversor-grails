
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<title>Conversor de medidas</title>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<r:require modules="jquery, bootstrap"/>
	<r:layoutResources/>
</head>
<body>
	<div class="body" style="width: 90%; padding: 15pt;">
		<div class="well well-sm">
			<h3 class="text-center">Conversor de medidas</h3>
		</div>
		<form method="post">
			<g:if test="${errorMessage}">
				<div class="row">
					<div class="span8 alert alert-danger">
					${errorMessage}
					</div>
				</div>
			</g:if>
			<br/>
			<div class="row">
				<div class="col-md-4">
					<p class="text-right">
					${conversor.unidadMedidaOrigen}
					</p>
				</div>
				<div class="col-md-4">
					<input class="form-control" type="text" name="valorOrigen"
						placeholder="Ingrese un valor" value="${conversor.valorOrigen}" />
				</div>
			</div>
			<br/>
			<div class="row">
				<div class="col-md-4">
					<p class="text-right">
					<br>
					${conversor.unidadMedidaDestino}
					</p>
				</div>
				<g:render template="/layouts/valorConvertido" model="['valor': conversor.valorDestino]" />
			</div>
			<br>
			<div class="row">
				<div class="col-md-12 text-center">
					<g:actionSubmit value="Convertir" class="btn btn-success btn-lg" action="convertir"/>
				</div>
			</div>
		</form>
	</div>
</body>
<r:layoutResources/>
