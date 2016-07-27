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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("        \n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Ficha de Inscrição do Doente1</title>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"/>\n");
      out.write("        <meta charset=\"UTF-8\"/>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"WEB-INF/addIt/css/style.css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("       \n");
      out.write("        <form action=\"cartaoD.jsp\" method=\"POST\">\n");
      out.write("        \n");
      out.write("            <label for=\"nid\">NID:</label><input type=\"text\" id=\"nid\"/>   <label for=\"datadea\">Data de Abertura:</label> <input type=\"text\" id=\"datadea\"/> <br/>\n");
      out.write("            \n");
      out.write("             <fieldset>\n");
      out.write("                <legend> Informação do Paciente</legend>\n");
      out.write("                \n");
      out.write("                <label for=\"nome\">Nome:</label> <input type=\"text\" id=\"nome\"/> <label for=\"apelido\">Apelido:</label> <input type=\"text\" id=\"apelido\"/> <br/>\n");
      out.write("                <label for=\"bi\">B.I.:</label> <input type=\"text\" id=\"bi\"/>  <label for=\"datan\">Data de Nascimento:</label> <input type=\"datetime\" id=\"datan\"/> <br/>\n");
      out.write("                <label for=\"sexo\" >Sexo:</label>         <input type=\"radio\" name=\"sexo\" value=\"M\"/> Masculino \n");
      out.write("                <input type=\"radio\" name=\"sexo\" value=\"F\"/> Feminino <br/>\n");
      out.write("                \n");
      out.write("                <label >Estado Civil:</label> \n");
      out.write("                \n");
      out.write("                <select id=\"cboestado\">   \n");
      out.write("                    <optgroup>\n");
      out.write("                        <option id=\"solteiro\">Solteiro </option>\n");
      out.write("                        <option id=\"casado\"> Casado</option>\n");
      out.write("                        <option id=\"divorciado\">Divorciado </option>\n");
      out.write("                        <option id=\"separado\">Separado </option>\n");
      out.write("                        <option id=\"viuvo\"> Viúvo </option>\n");
      out.write("                    <optgroup/>          \n");
      out.write("                </select>\n");
      out.write("                \n");
      out.write("                <label>Profissão</label>   \n");
      out.write("                \n");
      out.write("                <select id=\"cboprofissao\">\n");
      out.write("                    <optgroup>\n");
      out.write("                        <option id=\"medico\">Médico </option>\n");
      out.write("                        <option id=\"professor\">Professor </option>\n");
      out.write("                        <option id=\"policia\">Polícia </option>\n");
      out.write("                        <option id=\"bombeiro\">Bombeiro </option>\n");
      out.write("                        <option id=\"enfermeiro\"> Enfermeiro </option>\n");
      out.write("                        <option id=\"outro\"> Outro</option>\n");
      out.write("                    <optgroup/>   \n");
      out.write("                    \n");
      out.write("                </select>   \n");
      out.write("                <label for=\"localdet\">Local de Trabalho:</label>  <input type=\"text\" id=\"localdet\"/>\n");
      out.write("                \n");
      out.write("                <label for=\"naturalidade\">Naturalidade:</label>  <input type=\"text\" id=\"natural\"/> <br/> <label for=\"residenciaP\">Residência:</label>  <input type=\"text\" id=\"residenciaP\" placeholder=\"Província\"/><input type=\"text\" id=\"bairro\" placeholder=\"Bairro\"/><input type=\"text\" id=\"rua/avenida\" placeholder=\"Rua/Avenida\"/><input type=\"text\" id=\"casan\" placeholder=\"Número da casa\"/>\n");
      out.write("                <label for=\"nomepai\">Filiação:</label> <input type=\"text\" placeholder=\"Nome do Pai\" id=\"nomepai\"/> <input type=\"text\" placeholder=\"Nome da Mãe\" id=\"nomemae\"/>\n");
      out.write("            </fieldset> \n");
      out.write("             <input type=\"submit\" id=\"registar\" value=\"Enviar\"/>\n");
      out.write("             \n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html> \n");
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
