<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>	
	<%@ include file="head.jsp" %>
<body>
	<%@ include file="header.jsp" %>
	
	<div class="container page-content">
		<div class="card">
	    	<div class="form-group">
	        	<div class="row text-center">
	            	<h2 class="head-set">Gerenciamento de Produtos</h2>
	            </div>
	            <form action="salvarProduto" method="post">
		            <div class="form-group">
		            	<label>Nome</label>
		                <input type="text" class="form-control" name="nome"/>
		            </div>
		            <div class="form-group">
		            	<label>Categoria</label>
		                	<select class="form-control" name="categoria">
		                    	<c:forEach var="categoria" items="${listaCategoria}">
		                        	<option name="categoria" value="${categoria.id}">${categoria.nome}</option>
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
		            <button style="margin-bottom: 50px;" type="submit" class="btn btn-primary">
		            	<i class="glyphicon glyphicon-floppy-disk"></i>
		                Salvar
		            </button>
	            </form>
	        </div>
	        <a href="consultarProduto">
	        <i class="glyphicon glyphicon-list-alt"></i>
	        Consultar Produtos</a>
	    </div>
	</div>
	    
	<%@ include file="footer.jsp" %>
</body>
</html>
