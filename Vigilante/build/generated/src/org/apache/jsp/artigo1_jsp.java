package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class artigo1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap.min.css\">\n");
      out.write("\n");
      out.write("        <title>Vigilantes</title>\n");
      out.write("    </head>\n");
      out.write("    <body class=\"p-1 mb-1 bg-primary\">\n");
      out.write("         ");

            request.getSession();
            
            String usuario = (String) session.getAttribute("usuario");
            if (usuario == null){
                response.sendRedirect("login.jsp");
            }

        
      out.write("\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-dark bg-primary\">\n");
      out.write("            <a class=\"navbar-brand\">Vigilantes</a>\n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarColor01\" aria-controls=\"navbarColor01\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("              <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("            </button>\n");
      out.write("          \n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarColor01\">\n");
      out.write("              <ul class=\"navbar-nav mr-auto\">\n");
      out.write("                <li class=\"nav-item active\">\n");
      out.write("                  <a class=\"nav-link\" href=\"index.jsp\">Home <span class=\"sr-only\">(current)</span></a>\n");
      out.write("                </li>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("          </nav>\n");
      out.write("\n");
      out.write("          <div class=\"container p-3 w-100 mb-4 bg-dark text-white\">\n");
      out.write("                <div class=\"jumbotron bg-dark\" >\n");
      out.write("                    <h2 class=\"display-4 text-white\">As \"Regras\" da internet! </h2>\n");
      out.write("    \n");
      out.write("                    <p class=\"lead\">Você sabe quais coisas você pode fazer enquanto estiver on-line? Se não veja o artigo abaixo e fique por dentro dessas regras e o que pode acontecer se elas forem quebradas</p>\n");
      out.write("  \n");
      out.write("                    <hr class=\"my-4\">\n");
      out.write("\n");
      out.write("                    <p class=\"lead\">Em primeiro lugar essas regras podem, ou não, se aplicar a você\tdependendo que você esta fazendo na internet, as regras são mais\n");
      out.write("                    para te nortear e informar sobre o que pode estar acontecendo \"debaixo dos panos\" na internet.<br><br>\n");
      out.write("\n");
      out.write("                    Regra 1<br><br>\n");
      out.write("\n");
      out.write("                    Nada na internet é de graça. Não é uma grande surpresa considerando que fora da mesma o mundo funciona da mesma maneira, mas o que isso quer dizer?\n");
      out.write("                    Simples se você vêr um anuncio dizendo \"Clique aqui e ganhe um iphone X\" não clique. Você daria um iphone X para uma pessoa que passasse por você na rua? Provavelmente não\n");
      out.write("                    então por que você acha que alguem faria o mesmo na internet?\n");
      out.write("                    </p>\n");
      out.write("                </div>\n");
      out.write("           </div>\n");
      out.write("\n");
      out.write("            \n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
