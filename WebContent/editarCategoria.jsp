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
                    <h1 class="head-set">Gerenciamento de Categorias</h1>
                </div>
                <form action="categoriaServlet" method="post">
                    <div class="form-group">
                        <label>Nome</label>
                        <input type="text" name="nome" class="form-control" value=${categoria.nome}></textarea>
                        
                        <label>Descricao</label>
                        <input type="text" name="descricao" class="form-control" value=${categoria.descricao}></textarea>
                    
                    </div>
                    <button type="submit" class="btn btn-primary">Salvar</button>
                </form>
            </div>
        </div>
        	<a href="consultarCategoria">Consultar Categorias</a>
        </div>
    </div>
    
    <footer>
        2015 FlexoSoul
    </footer>
</body>
</html>
