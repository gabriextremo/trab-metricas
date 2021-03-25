<html>
    <head>
        <link rel="stylesheet" href="bootstrap.min.css">

        <title>Vigilantes</title>
    </head>
    <body class="p-1 mb-1 bg-primary">
         <%
            request.getSession();
            
            String usuario = (String) session.getAttribute("usuario");
            if (usuario == null){
                response.sendRedirect("login.jsp");
            }

        %>
        <nav class="navbar navbar-expand-lg navbar-dark bg-primary">
            <a class="navbar-brand">Vigilantes</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarColor01" aria-controls="navbarColor01" aria-expanded="false" aria-label="Toggle navigation">
              <span class="navbar-toggler-icon"></span>
            </button>
          
            <div class="collapse navbar-collapse" id="navbarColor01">
              <ul class="navbar-nav mr-auto">
                <li class="nav-item active">
                  <a class="nav-link" href="index.jsp">Home <span class="sr-only">(current)</span></a>
                </li>

            </div>
          </nav>

          <div class="container p-3 w-100 mb-4 bg-dark text-white">
                <div class="jumbotron bg-dark" >
                    <h2 class="display-4 text-white">As "Regras" da internet! </h2>
    
                    <p class="lead">Você sabe quais coisas você pode fazer enquanto estiver on-line? Se não veja o artigo abaixo e fique por dentro dessas regras e o que pode acontecer se elas forem quebradas</p>
  
                    <hr class="my-4">

                    <p class="lead">Em primeiro lugar essas regras podem, ou não, se aplicar a você	dependendo que você esta fazendo na internet, as regras são mais
                    para te nortear e informar sobre o que pode estar acontecendo "debaixo dos panos" na internet.<br><br>

                    Regra 1<br><br>

                    Nada na internet é de graça. Não é uma grande surpresa considerando que fora da mesma o mundo funciona da mesma maneira, mas o que isso quer dizer?
                    Simples se você vêr um anuncio dizendo "Clique aqui e ganhe um iphone X" não clique. Você daria um iphone X para uma pessoa que passasse por você na rua? Provavelmente não
                    então por que você acha que alguem faria o mesmo na internet?
                    </p>
                </div>
           </div>

            
    </body>
</html>