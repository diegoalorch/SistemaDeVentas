<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Compras</title>
 <link rel="stylesheet" href="recursos/css/bootstrap.min.css">
</head>
<body>
	<div class="container" style="margin-left: 20px">
		<label style="margin-top: 5px"><i class="fas fa-user-tie"></i>  Nick</label> 
		<h2 style="margin-top: 12px">Nueva Compra</h2>
		<hr>
		<label>Fecha:<br><input type="date" class="form-control" id="fecha"></label>
		<label>Proveedor(es):<br><input type="text" class="form-control" id="proveedor"></label>
		<label>Codigo De Barra:<br><input type="text" class="form-control" id="producto"></label><br><br>
		<label>Descripción<br><input type="text" class="form-control" id="descripcion"></label>
		<label>Presentación<br><input type="text" class="form-control" id="presentacion2"></label>
		<label>Precio<br><input type="text" class="form-control" id="precio"></label>
		<div class="card" style="width: 350px; height: 190px; float: right; margin-right: -150px; margin-top: -90px">
			<div class="card-header">
				Tipo De Documento
			</div>
			<div class="card-body">
				<select class="form-control">
					<option>Seleccione Opción</option>
					<option>Factura</option>
				</select><br>
				<input type="text" class="form-control" style="width: 150px; float: left;">
				<input type="text" class="form-control" style="width: 150px; float:right; margin-left: 15px; margin-top: -38px">
			</div>
			
		</div>
		<div style=" float:left; margin-left: 388px; margin-top: 50px">
			<button class="btn btn-primary" id="new"><i class="fas fa-shopping-bag"></i>   Nuevo</button>
			<button class="btn btn-success" id="add"><i class="fas fa-shopping-cart"></i>   Agregar</button>
			<button class="btn btn-dark" id="register"><i class="fas fa-cash-register"></i>   Registrar</button>
		</div>
		<div style="margin-top: 110px">
			<table class="table table-hover" id="aumentartabla">
			  <thead class="thead-light">
			    <tr>
			      <th scope="col">Item</th>
			      <th scope="col">Descripción</th>
			      <th scope="col">Presentación</th>
			      <th scope="col">Cantidad</th>
			      <th scope="col">Precio</th>
			      <th scope="col">Importe</th>
			      <th scope="col">Eliminar</th>
			    </tr>
			  </thead>
			  <tbody>
			  </tbody>
			</table>
		</div>
		<div class="card" style="width: 18rem; margin-left: 650px">
		  <ul class="list-group list-group-flush">
		    <li class="list-group-item">Subtotal</li>
		    <li class="list-group-item">IGV</li>
		    <li class="list-group-item"><h2>TOTAL: </h2></li>
		  </ul>
		</div>
		<div>
		</div>
	</div>
	<script src="https://kit.fontawesome.com/b99e675b6e.js"></script>
	<script src="recursos/vendor/jquery/jquery-3.2.1.min.js"></script>
	<script src="recursos/js/home.js"></script>
	<script src="recursos/js/compra.js"></script>
</body>
</html>