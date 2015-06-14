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
                    <h2 class="head-set">Gerenciamento de Categorias</h2>
                </div>
                <form action="categoriaServlet" method="post">
                    <div class="form-group">
                        <label>Nome</label>
                        <input type="text" name="nome" class="form-control"/>
                        
                        <label>Descricao</label>
                        <input type="text" name="descricao" class="form-control"/>
                    
                    </div>
                    <button style="margin-bottom: 50px;" type="submit" class="btn btn-primary">
                    <i class="glyphicon glyphicon-floppy-disk">
                    </i>
                    Salvar</button>
                </form>
            </div>
            <a href="consultarCategoria">
            <i class="glyphicon glyphicon-list-alt"></i>
            Consultar Categorias</a>
        </div>    	
    </div>
    <footer class="fix">
        © 2015 FlexoSoul
    </footer>
</body>
</html>
