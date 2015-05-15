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
                    <li><a href="index.jsp">In�cio</a></li>
                    <li><a href="index.jsp#services">Servi�os</a></li>
                    <li><a href="index.jsp#contact">Contato</a></li>
                    <li><a href="categoria">Categoria</a></li>
                	<li><a href="produto">Produto</a></li>
                	<li><a href="usuario">Conta</a></li>
                </ul>
            </div>

        </div>
    </div>

    <div class="container page-content">
        <div class="card">
            <div class="form-group">
                <div class="row text-center">
                    <h1 class="head-set">Gerenciamento de Produtos</h2>
                </div>
                <form>
                    <div class="form-group">
                        <select class="form-control">
                          <option>Categoria 1</option>
                          <option>Categoria 2</option>
                          <option>Categoria 3</option>
                        </select>
                    </div>
                    <div class="form-group">
                        <label>Foto</label>
                        <input type="file" id="exampleInputFile">
                    </div>
                    <div class="form-group">
                        <label>Descri��o</label>
                        <textarea class="form-control" rows="3"></textarea>
                    </div>
                    <button type="submit" class="btn btn-primary">Salvar</button>
                </form>
            </div>
        </div>
    </div>
    
    <footer>
        � 2015 FlexoSoul
    </footer>
</body>
</html>