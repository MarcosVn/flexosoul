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
                            <strong>Cadastro</strong>  
                        </div>
                        <div class="panel-body">
                            <form role="form" action='salvarUsuario' method="post">
                                <div class="form-group input-group">
                                    <span class="input-group-addon"><i class="glyphicon glyphicon-user"  ></i></span>
                                    <input type="text" class="form-control" id="nome"  name = "nome" placeholder="Nome" />
                                </div>
                                <div class="form-group input-group">
                                    <span class="input-group-addon"><i class="fa fa-tag"  ></i></span>
                                    <input type="text" class="form-control" id="sobrenome" name="sobrenome" placeholder="Sobrenome" />
                                </div>
                                <div class="form-group input-group">
                                    <span class="input-group-addon">@</span>
                                    <input type="text" class="form-control" id="email" name="email" placeholder="Email" />
                                </div>
                                <div class="form-group input-group">
                                    <span class="input-group-addon"><i class="fa fa-lock"  ></i></span>
                                    <input type="password" class="form-control" id="senha" name="senha" placeholder="Senha" />
                                </div>
                                <div class="form-group input-group">
                                    <span class="input-group-addon"><i class="fa fa-lock"  ></i></span>
                                    <input type="password" class="form-control" id="conf_password" name="conf_password" placeholder="Confirmar Senha" />
                                </div> 
                                 <input type="submit" class="btn btn-success" value="Cadastrar">
                            </form>
                            
                        </div>
                        
                    </div>
                    
    			<a href="consultarUsuarios">Consultar Usuários</a>
                </div>
            </div>
        </div>
    </div><!-- /.container -->
    <footer>© 2015 FlexoSoul</footer>
</body>
</html>
