<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<link rel="shortcut icon"
	href="https://img.icons8.com/nolan/64/000000/web.png"
	type="image/x-icon">
<title>Nomina | WEB</title>
<!-- Compiled and minified CSS -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
<link href="https://fonts.googleapis.com/icon?family=Material+Icons"
	rel="stylesheet">
<link rel="stylesheet" href="css/style.css">
<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
</head>

<body>
	<jsp:useBean id="cDao" class="nomina.model.conceptoDao"
		scope="request"></jsp:useBean>

	<header>
		<div class="navbar-fixed">
			<nav>
				<div class="nav-wrapper teal darken-4">
					<a href="index.html" class="brand-logo"><i
						class="material-icons">person_pin</i>NOMINA</a> <a href="#"
						data-target="mobile-demo" class="sidenav-trigger"><i
						class="material-icons">keyboard_tab</i></a>
					<ul class="right hide-on-med-and-down">
						<li><a href="consulta.jsp"
							class="waves-effect waves-light btn  teal darken-4"><i
								class="material-icons left">search</i>BUSCAR EMPLEADO</a></li>
						<li><a href="registro.jsp"
							class="waves-effect waves-light btn-small teal darken-4"><i
								class="material-icons left">person_add</i>REGISTRAR EMPLEADO</a></li>

					</ul>
				</div>
			</nav>
		</div>

		<ul class="sidenav teal darken-1" id="mobile-demo">
			<li><a class="subheader white-text">Enlaces</a></li>
			<li>
				<div class="divider"></div>
			</li>
			<li><a href="consulta.jsp"
				class="waves-effect waves-light btn  teal darken-4"><i
					class="material-icons left">search</i>BUSCAR EMPLEADO</a></li>
			<li><a href="registro.jsp"
				class="waves-effect waves-light btn  teal darken-4"><i
					class="material-icons left">person_add</i>REGISTRAR EMPLEADO</a></li>
		</ul>
	</header>

	<main class="teal lighten-5">
		<div class="container">
			<table class="card-panel hoverable centered striped highlight"
				style="margin-top: 121, 5px; margin-bottom: 121, 5px; margin-top: 121px; margin-bottom: 121px;">
				<thead>
					<tr>
						<th>Código del concepto</th>
						<th>Descripción del concepto</th>
						<th>Tipo de concepto</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="n" items="${cDao.list()}">
						<tr>
							<td><c:out value="${n.codconcepto}" /></td>
							<td><c:out value="${n.descripcion}" /></td>
							<td><c:out value="${n.tipoconcepto.descripcion}" /></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>

	</main>

	<footer class="page-footer teal darken-4">
		<div class="container">
			<div class="row">
				<div class="col l6 s12">
					<h5 class="white-text">Nomina PROGRAMACIÓN WEB</h5>
					<p class="grey-text text-lighten-4">Breve descripción de la
						temática del previo</p>
				</div>
				<div class="col l4 offset-l2 s12">
					<h5 class="white-text">Links</h5>
					<ul>
						<li><a class="grey-text text-lighten-3"
							href="https://github.com/carlosfernandoufps/">GitHub</a></li>
						<li><a class="grey-text text-lighten-3"
							href="https://ingsistemas.cloud.ufps.edu.co/index.php">Ing.
								Sistemas UFPS</a></li>
						<li><a class="grey-text text-lighten-3"
							href="https://materializecss.com">Materialize</a></li>
						<li><a class="grey-text text-lighten-3"
							href="https://theuselessweb.com">Random</a></li>
					</ul>
				</div>
			</div>
		</div>
		<div class="footer-copyright">
			<div class="container">
				© 2020 <a
					class="grey-text text-lighten-4 right" href="#!">Mail</a>
			</div>
		</div>
	</footer>
	<!-- Compiled and minified JavaScript -->
	<script src="js/function.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
</body>

</html>