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
	                    <h2 class="head-set">PRODUTO</h2>
	                </div>
	                <form method="post" action="salvarProdutoServlet">
	                    <div class="form-group">
	                        <select class="form-control" name="categoria">
	                          <option>Categoria 1</option>
	                          <option>Categoria 2</option>
	                          <option>Categoria 3</option>
	                        </select>
	                    </div>
	                    <div class="form-group">
	                        <label>Foto</label>
	                        <input type="file" id="imageInput" name="imagem">
	                    </div>
	                    <div class="form-group">
	                        <label>Descrição</label>
	                        <textarea class="form-control" rows="3" name="descricao"></textarea>
	                    </div>
	                    <button type="submit" class="btn btn-primary">Salvar</button>
	                </form>
	            </div>
	        </div>
	        
	        <div class="card">
	            <div class="table-responsive">
	                <table class="table">
	                    <thead>
	                        <tr>
	                            <td>ID</td>
	                            <td>Descrição</td>
	                        </tr>
	                    </thead>
	                    <tbody>
	                    	<!-- <c:forEach var="produto" items="${listaProdutos}">
		                        <tr>
		                          <td>{produto.id}</td>
		                          <td>{produto.descricao}</td>
		                          <td> 
		                          	<form method="post" action="preparaEditarProduto">
										<button class="btn btn-primary" type="submit">Editar</button>
										<input type="hidden" value="${produto.id}" name="produto"/>
									</form>
		                           </td>
		                          <td>
		                          	<form method="post" action="excluirProduto">
										<button class="btn btn-primary" type="submit">Excluir</button>
										<input type="hidden" value="${produto.id}" name="produto"/>
									</form>
								  </td>
		                        </tr>
	                        </c:forEach>  -->
	                        <tbody>
	                        <tr>
		                          <td>Produto 1</td>
		                          <td>Descrição Teste</td>
		                          <td> 
		                          	<form method="post" action="preparaEditarProduto">
										<button class="btn btn-primary" type="submit">Editar</button>
										<input type="hidden" value="${produto.id}" name="produto"/>
									</form>
		                           </td>
		                          <td>
		                          	<form method="post" action="excluirProduto">
										<button class="btn btn-primary" type="submit">Excluir</button>
										<input type="hidden" value="${produto.id}" name="produto"/>
									</form>
								  </td>
		                        </tr>
	                    </tbody>
	                </table>
	            </div>
	        </div>
	    </div>
	    
	    <footer>
	        © 2015 FlexoSoul
	    </footer>
	</body>
</html>
