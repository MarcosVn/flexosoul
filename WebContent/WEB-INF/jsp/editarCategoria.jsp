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
					<h2 class="head-set">Edição da Categoria ${categoria.nome}</h2>
				</div>
				<form action="editarCategoria" method="post">
					<div class="form-group">
						<label>Nome</label> <input type="text" name="nome"
							class="form-control" value="${categoria.nome}" /> <label>Descricao</label>
						<input type="text" name="descricao" class="form-control"
							value="${categoria.descricao}" />
						<input type="hidden" name="id" value="${categoria.id}"/>

					</div>
					<button type="submit" class="btn btn-primary">
									<i class="glyphicon glyphicon-ok"></i>								
								Confirmar</button>
								<a href="consultarCategoria" class="btn btn-danger">
								<i class="glyphicon glyphicon-ban-circle"></i>
									Cancelar </a>
				</form>
			</div>
		</div>
	</div>
	<footer class="fix"> © 2015 FlexoSoul </footer>
</body>
</html>
