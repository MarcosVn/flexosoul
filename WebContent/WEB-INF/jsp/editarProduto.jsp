<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<%@ include file="head.jsp"%>
<body>
	<%@ include file="header.jsp"%>
	<div class="container page-content">
		<div class="card">
			<div class="form-group">
				<div class="row text-center">
					<h2 class="head-set">Edição do Produto ${produto.nome}</h2>
				</div>
				<form method="post" action="editarProduto">
					<div class="form-group">
						<label>Nome</label> <input type="text" class="form-control"
							name="nome" value="${produto.nome}"></input>
					</div>
					<label>Categoria</label>
					<div class="form-group">
						<select class="form-control" name="categoria">
							<c:forEach var="categoria" items="${listaCategoria}">
								<option value=${categoria.id } name="categoria">${categoria.nome}</option>
							</c:forEach>
						</select>
					</div>
					<div class="form-group">
						<label>Foto</label> <input type="file" id="imageInput">
					</div>
					<div class="form-group">
						<label>Descrição</label>
						<textarea class="form-control" rows="3" name="descricao">${produto.descricao}</textarea>
					</div>
					<input type="hidden" name="id" value="${produto.id}" />
					<button type="submit" class="btn btn-primary">Confirmar</button>
					<a href="consultarCategoria" class="btn btn-danger"> Cancelar </a>
				</form>
			</div>
		</div>
	</div>

	<%@ include file="footer.jsp"%>
</body>
</html>
