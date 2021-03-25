<html>
    <head>
        <link rel="stylesheet" href="bootstrap.min.css">

        <title>Vigilantes</title>
    </head>
    <body class="p-1 mb-1 bg-primary">


          <div class="container p-3 w-100 mb-4 bg-dark text-white">
                <div class="jumbotron bg-dark" >
                    <h2 class="display-4 text-white">Cadastrar</h2>
                    
                    <form action="inserir.do">
                        <p>Usuario</p>
                        <input type="text" name="Login"><br>
                        <p>Senha</p>
                        <input type="text" name="Senha">
                        <p>Nome</p>
                        <input type="text" name="Nome">
                        <p>E-mail</p>
                        <input type="text" name="Email">

                        <input type="submit" value="Cadastrar">
                    </form> 
                    <button><a href="login.jsp">Voltar</a></button>
                </div>
           </div>

            
    </body>
</html>