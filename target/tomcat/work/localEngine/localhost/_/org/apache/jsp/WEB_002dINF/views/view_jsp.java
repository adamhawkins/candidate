package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class view_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <title>Candidate</title>\n");
      out.write("\n");
      out.write("    <meta name=\"description\" content=\"Candiate test\">\n");
      out.write("    <meta name=\"author\" content=\"Adam Hawkins\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.8.2/jquery.min.js\"></script>    \n");
      out.write("    <link href=\"http://netdna.bootstrapcdn.com/twitter-bootstrap/2.1.1/css/bootstrap-combined.min.css\" rel=\"stylesheet\">\n");
      out.write("    <script src=\"http://netdna.bootstrapcdn.com/twitter-bootstrap/2.1.1/js/bootstrap.min.js\"></script>\n");
      out.write("<script>\n");
      out.write("\n");
      out.write("  var CANDIDATE = {\n");
      out.write("\t\t  clicked: function(ele){\n");
      out.write("\t\t\t  $(ele).button('loading');\n");
      out.write("\t\t\t  \n");
      out.write("\t\t\t  $.ajax({\n");
      out.write("\t\t\t\t  url: '/mvc/json',\n");
      out.write("\t\t\t\t  dataType:'json',\n");
      out.write("\t\t\t\t  success: function(res) {\n");
      out.write("\t\t\t\t\t  console.log(res);\n");
      out.write("\t\t\t        $('#movies tr:first-child').after(\"<tr><td>\" + res.name + \"</td></tr>\");\n");
      out.write("\t\t\t        $('#movies').find('tr:gt(10)').remove();\n");
      out.write("\t\t\t\t  },\n");
      out.write("\t\t\t\t  error: function(e, xhr, settings, exception) {\n");
      out.write("\t\t\t\t      var error = $('<div class=\"alert alert-error\">' + e.statusText + '</div>').insertBefore('#movies');\n");
      out.write("\t\t\t\t      setTimeout(function(){\n");
      out.write("\t\t\t\t    \t  error.slideUp(function(){\n");
      out.write("\t\t\t\t    \t\t  error.remove();\n");
      out.write("\t\t\t\t    \t  })\n");
      out.write("\t\t\t\t      },1000);\n");
      out.write("\t\t\t\t  },\n");
      out.write("\t\t\t\t  complete: function(){\n");
      out.write("\t\t\t\t\t  $(ele).button('reset');\n");
      out.write("\t\t\t\t  }\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t  }\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  $(function(){\n");
      out.write("\t  \n");
      out.write("  });\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"container-fluid\">\n");
      out.write("      <div class=\"row-fluid\">\n");
      out.write("      <button class=\"btn btn-primary\" data-loading-text=\"Loading..\" onclick=\"CANDIDATE.clicked(this)\" style=\"margin-top:10px;margin-bottom:10px\">Click me</button>\n");
      out.write("\n");
      out.write("      <table class=\"table table-bordered\" id=\"movies\" style=\"margin-top:10px  \">\n");
      out.write("        <tr><th>Movie title</th></tr>\n");
      out.write("      </table>\n");
      out.write("      \n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
