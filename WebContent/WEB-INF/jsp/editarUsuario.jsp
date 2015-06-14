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
							<h2>Dados da Conta</h2>
						</div>
						<div class="panel-body">
							<form role="form" action="editarUsuario" method="post">
								<div class="form-group input-group">
									<span class="input-group-addon"><i
										class="glyphicon glyphicon-user"></i></span> <input type="text"
										class="form-control" id="nome" name="nome" placeholder="Nome"
										value="${user.nome}" />
								</div>
								<div class="form-group input-group">
									<span class="input-group-addon"><i class="fa fa-tag"></i></span>
									<input type="text" class="form-control" id="sobrenome"
										name="sobrenome" placeholder="Sobrenome"
										value="${user.sobrenome}" />
								</div>
								<div class="form-group input-group">
									<span class="input-group-addon">@</span> <input type="text"
										class="form-control" id="email" name="email"
										placeholder="Email" value="${user.email}" />
								</div>
								<div class="form-group input-group">
									<span class="input-group-addon"><i class="fa fa-lock"></i></span>
									<input type="password" class="form-control" id="senha"
										name="senha" placeholder="Senha" value="${user.senha}" />
								</div>
								<div class="form-group input-group">
									<span class="input-group-addon"><i class="fa fa-lock"></i></span>
									<input type="password" class="form-control" id="conf_password"
										name="conf_password" placeholder="Confirmar Senha" />
								</div>
								<input type="hidden" name="id" value="${user.id}" />
								<button type="submit" class="btn btn-primary">
									<i class="glyphicon glyphicon-ok"></i>								
								Confirmar</button>
								<a href="consultarUsuario" class="btn btn-danger">
								<i class="glyphicon glyphicon-ban-circle"></i>
									Cancelar </a>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- /.container -->

	<footer class="fix">© 2015 FlexoSoul</footer>
</body>
</html>
