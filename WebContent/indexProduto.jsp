<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
	<head>
	    <meta charset="utf-8" />
	    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1" />
	
	    <title>FlexoSoul</title>
	    <link href="static/css/bootstrap.css" rel="stylesheet" />
	    <link href="static/css/font-awesome.css" rel="stylesheet" />
	    <link href="static/css/style.css" rel="stylesheet" />
		<script src="static/js/jquery-1.11.1.js"></script>
	    <script src="static/js/bootstrap.js"></script>
	    <script src="static/js/jquery.easing.min.js"></script>
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
                    <li><a href="index.jsp">Início</a></li>
                    <li><a href="index.jsp#services">Serviços</a></li>
                    <li><a href="index.jsp#contact">Contato</a></li>
                    <li><a href="category">Categoria</a></li>
                	<li><a href="product">Produto</a></li>
                	<li><a href="user">Conta</a></li>
                </ul>
            </div>
	
	        </div>
	    </div>
	
	    <div class="container page-content">
	        <div class="card">
	            <div class="form-group">
	                <div class="row text-center">
	                    <h2 class="head-set">Gerenciamento de Produtos</h2>
	                </div>
	                <form method="post" action="salvarProduto">
	                	<div class="form-group">
	                        <label>Nome</label>
	                        <input type="text" class="form-control" rows="3" name="nome"></input>
	                    </div>
	                    <label>Categoria</label>
	                    <div class="form-group">
	                        <select class="form-control" name="categoria">
	                          <c:forEach var="categoria" items="${listaCategoria}">
	                          	<!--  <input type="hidden" name="categoria">${categoria.id }</input>-->
	                          	<option value=${categoria.id} name="categoria">${categoria.nome}</option>
	                          </c:forEach>
	                        </select>
	                    </div>
	                    <div class="form-group">
	                        <label>Foto</label>
	                        <input type="file" id="imageInput">
	                    </div>
	                    <div class="form-group">
	                        <label>Descrição</label>
	                        <textarea class="form-control" rows="3" name="descricao"></textarea>
	                    </div>
	                    <button type="submit" class="btn btn-primary">
	                    <i class="glyphicon glyphicon-floppy-disk">
                    	</i>
	                    Criar</button>
	                </form>
	            </div>
	            <a href="consultarProduto">Consultar Produtos</a>
	        </div>
	    </div>
	    
	    <footer>
	        © 2015 FlexoSoul
	    </footer>
	</body>
</html>
