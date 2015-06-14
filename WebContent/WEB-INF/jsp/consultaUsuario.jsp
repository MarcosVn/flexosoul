<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
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
							<strong>Consultar Usuário</strong>
						</div>
						<div class="panel-body">
							<form method="post" action="consultarUsuarios">
								<span>Nome</span> <input type="text" name="nomeConsulta" />
								<button title="Clique para pesquisar" type="submit" class="btn">
									<i class="glyphicon glyphicon-search"></i> Pesquisar
								</button>
							</form>
							<c:if test="${not empty listaUsuarios}">
								<h4>
									Resultado(s) encontrado(s): <b>${fn:length(listaUsuarios)}</b>
								</h4>
								<table class="table table-striped">
									<thead>
										<tr>
											
											<th>ID</th>
											<th>Nome</th>
											<th>Sobrenome</th>
											<th>E-mail</th>
											<th></th>
											<th></th>
										</tr>
									</thead>
									<c:forEach var="usuario" items="${listaUsuarios}">
										<tbody>
											<tr>
												
												<td>${usuario.id}</td>
												<td>${usuario.nome}</td>
												<td>${usuario.sobrenome}</td>
												<td>${usuario.email}</td>
												<td>
													<form method="post" action="preparaEditarUsuario">
														<button title="Editar ${usuario.nome}" class="btn btn-primary" type="submit">
															<i class="glyphicon glyphicon-pencil"> </i>
														</button>
														<input type="hidden" value="${usuario.id}" name="usuario" />
													</form>
												</td>
												<td>
													<form method="post" action="excluirUsuario">
														<button title="Excluir ${usuario.nome}"class="btn btn-danger" type="submit">
															<i class="glyphicon glyphicon-trash"></i>
														</button>
														<input
														type="hidden" value="${usuario.id}" name="usuario" />
													</form>
												</td>
											</tr>
										</tbody>
									</c:forEach>
								</table>
							</c:if>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<footer class="fix">© 2015 FlexoSoul</footer>
</body>
</html>
