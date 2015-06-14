<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE>
<html>
<%@ include file="head.jsp"%>
<body>
	<%@ include file="header.jsp"%>
	<div class="container page-content">
		<div class="col-sm-10">
			<div class="row  pad-top">
				<div class="col-md-offset-2">
					<div class="panel panel-default">
						<div class="panel-heading">
							<h2 class="text-center">Painel Administrativo</h2>
						</div>
						<div style="padding: 90px; font-size: 20px">
						<div class="row text-center">
							
							<a href="categoria">
								<i class="glyphicon glyphicon-folder-close"></i>
							Gerenciamento de Categorias</a>
						</div>
						<p>
						<div class="row text-center">
							<a href="produto">
								<i class="glyphicon glyphicon-briefcase"></i>
							Gerenciamento de Produtos</a>
						</div>
						<p>
						<div class="row text-center">
							
							<a href="usuario">
								<i class="glyphicon glyphicon-user"></i>
							Gerenciamento de Usuários</a>
						</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<footer class="fix">© 2015 FlexoSoul</footer>
</body>
</html>
