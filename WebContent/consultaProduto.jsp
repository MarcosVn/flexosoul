<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1" />

    <title>FlexoSoul</title>
    <link href="static/css/bootstrap.css" rel="stylesheet" />
    <link href="static/css/font-awesome.css" rel="stylesheet" />
    <link href="static/css/style.css" rel="stylesheet" />
    <script src="static/js/jquery-1.11.1.js"></script>
    <script src="static/js/bootstrap.js"></script>
    <script src="staticjs/jquery.easing.min.js"></script>
    <script src="static/js/custom.js"></script>


</head>
<body>
    <div class="navbar navbar-default navbar-fixed-top">
        <div class="container">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="nav navbar-brand" href="index.html">
                    FlexoSoul
                </a>
            </div>
            <div class="navbar-collapse collapse navbar-right scroll-me">
                <ul class="nav navbar-nav ">
                    <li><a href="/flexosoul/#home">Início</a></li>
                    <li><a href="/flexosoul/#services">Serviços</a></li>
                    <li><a href="/flexosoul/#contact">Contato</a></li>
                	<li><a href="categoria">Categoria</a>
                	<li><a href="user">Cadastro</a>
                </ul>
            </div>

        </div>
    </div>
    
    <div class="container page-content">
        <div class="col-sm-10">
            <div class="row  pad-top">
                <div class="col-md-offset-2">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <strong>Consultar Produto</strong>  
                        </div>
                        <div class="panel-body">
                            <form method="post" action="consultarProduto">
								<span>Nome</span> <input type="text" name="nomeConsulta" /> 
								<button title="Clique para pesquisar" type="submit" class="btn">
									<i class="glyphicon glyphicon-search"></i>
                    				Pesquisar
								</button>
						    </form>
						    <c:if test="${not empty listaProduto}">
						    	<h4> Resultados encontrado(s): <b>${fn:length(listaProduto)}</b></h4>
								<table class="table table-striped">
							      <thead>
							        <tr>
							          <th>ID</th>
							          <th>Nome</th>
							          <th>Descrição</th>
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
							          <td> <form method="post" action="preparaEditarProduto">
											<button title="Editar ${produto.nome}" class="btn btn-primary" type="submit">
											<i class="glyphicon glyphicon-pencil">
                    						</i>
											</button> 
											<input type="hidden" value="${produto.id}" name="produto" />
										</form></td>
							          <td>
							          	<form method="post" action="excluirProduto">
											<button title="Remover ${produto.nome}" class="btn btn-danger" type="submit" value="Excluir">
												<i class="glyphicon glyphicon-trash">
                    							</i>
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
    </div><!-- /.container -->
    
    <footer class="fix">© 2015 FlexoSoul</footer>
</body>
</html>
