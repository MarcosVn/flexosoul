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
			<div class="row pad-top">
				<div class="col-md-offset-2">
					<div class="panel panel-default">
						<div class="panel-heading">
							<strong>Consultar Produto</strong>
						</div>
						<div class="panel-body">
							<form method="post" action="consultarProduto">
								<span>Nome</span> <input type="text" name="nomeConsulta" />
								<button title="Clique para pesquisar" type="submit" class="btn">
									<i class="glyphicon glyphicon-search"></i> Pesquisar
								</button>
							</form>
							<c:if test="${not empty listaProduto}">
								<h4>
									Resultado(s) encontrado(s): <b>${fn:length(listaProduto)}</b>
								</h4>
								<table class="table table-striped">
									<thead>
										<tr>
											<th>ID</th>
											<th>Nome</th>
											<th>Descrição</th>
											<th>Categoria</th>
											<th></th>
											<th></th>
										</tr>
									</thead>
									<c:forEach var="produto" items="${listaProduto}">
										<tbody>
											<tr>
												<td>${produto.id}</td>
												<td>${produto.nome}</td>
												<td>${produto.descricao}</td>
												<td>${produto.catId} - ${produto.catNome}</td>
												<td>
													<form method="post" action="preparaEditarProduto">
														<button title="Editar ${produto.nome}"
															class="btn btn-primary" type="submit">
															<i class="glyphicon glyphicon-pencil"> </i>
														</button>
														<input type="hidden" value="${produto.id}" name="produto" />
													</form>
												</td>
												<td>
													<form method="post" action="excluirProduto">
														<button title="Remover ${produto.nome}"
															class="btn btn-danger" type="submit" value="Excluir">
															<i class="glyphicon glyphicon-trash"> </i>
														</button>
														<input type="hidden" value="${produto.id}" name="produto" />
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
