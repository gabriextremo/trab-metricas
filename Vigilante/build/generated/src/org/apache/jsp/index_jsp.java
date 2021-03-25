package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap.min.css\">,\n");
      out.write("        <title>Vigilantes</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"..\\bootstrap.min\">\n");
      out.write("        <script>\n");
      out.write("            function redireciona(param){\n");
      out.write("                location.href=param;\n");
      out.write("            }\n");
      out.write("        </script>\n");
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
      out.write("            <a class=\"navbar-brand\">Vigilantes</a><input type=\"button\" value=\"Deslogar\" onClick=\"redireciona('deslogar.do');\">\n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarColor01\" aria-controls=\"navbarColor01\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("              <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("            </button>\n");
      out.write("          \n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarColor01\">\n");
      out.write("              <ul class=\"navbar-nav mr-auto\">\n");
      out.write("                <li class=\"nav-item active\">\n");
      out.write("                  <a class=\"nav-link\" href=\"#\">Home <span class=\"sr-only\">(current)</span></a>\n");
      out.write("                 \n");
      out.write("                </li> \n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("          </nav>\n");
      out.write("\n");
      out.write("          <div class=\"container p-3 w-100 mb-4 bg-dark text-white\">\n");
      out.write("            <!--jumbotron !-->\n");
      out.write("            <div class=\"jumbotron bg-dark\" >\n");
      out.write("                <h2 class=\"display-4 text-white\">Aprenda mais sobre a internet e afins!</h2>\n");
      out.write("\n");
      out.write("                <p class=\"lead\">Esse site e dedicado pra você que não tem total conhecimento da internet ou de computadores no geral</p>\n");
      out.write("\n");
      out.write("                <hr class=\"my-4\">\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-4\">\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                      <h5 class=\"card-title\">As regras da Internet</h5>\n");
      out.write("                      <p class=\"card-text\">Você sabe o que você pode ou não fazer na internet?<br>Neste artigo te ajudamos a descobrir algumas coisas que podem tornar\n");
      out.write("                      a sua vida na internet mais segura.</p>\n");
      out.write("                      <a href=\"artigo1.jsp\" class=\"btn btn-primary\">Visitar</a>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("\n");
      out.write("                <div class=\"col-sm-4\">\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                      <h5 class=\"card-title\">Artigo</h5>\n");
      out.write("                      <p class=\"card-text\">DESCRIÇÂO DO ARTIGOS.</p>\n");
      out.write("                      <a class=\"btn btn-primary\" onclick=\"alert('Estamos trabalhando para trazer novos conteudos para você');\">Visitar</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-4\">\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                      <h5 class=\"card-title\">Artigo</h5>\n");
      out.write("                      <p class=\"card-text\">DESCRIÇÂO DO ARTIGOS.</p>\n");
      out.write("                      <a href=\"#\" class=\"btn btn-primary\">Visitar</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
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
