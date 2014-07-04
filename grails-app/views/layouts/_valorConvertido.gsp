<%@ page import="java.text.DecimalFormat" %>
<div class="col-md-4 alert alert-${valor ? 'info' : 'warning'}">
	${valor ? new DecimalFormat('#######0.########').format(valor) : 'NO INGRESADO'}
</div>
