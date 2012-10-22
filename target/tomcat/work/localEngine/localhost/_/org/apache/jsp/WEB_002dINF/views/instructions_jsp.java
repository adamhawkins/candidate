package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class instructions_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"container-fluid\">\n");
      out.write("      <div class=\"row-fluid\">\n");
      out.write("      \n");
      out.write("      <h2>Instructions</h2>\n");
      out.write("      <h4>Complete as many steps as you can.</h4>\n");
      out.write("      \n");
      out.write("      <h3>Step 1 - Unix & Maven</h3>\n");
      out.write("      <p>ssh to the linux server using<p>\n");
      out.write("      <pre>ssh -i ~/id_rsa_delegate ec2-user@[hostname]</pre>\n");
      out.write("      <p>where [hostname] is the hostname provided in the email & id_rsa_delegate is:</p>\n");
      out.write("      \n");
      out.write("<pre>-----BEGIN RSA PRIVATE KEY-----\n");
      out.write("MIIEoQIBAAKCAQEAoDe+xGakqsuyvEXyCDst4pcWdeWY/Mlljwe7ktMUQq0c4Y9J\n");
      out.write("cft5610tdahTWwI3q/u0y0tZrin2CfsFApCrWi+/VOi4JYL9t1BClO7g/RMImQ2Y\n");
      out.write("24M+657htDRxtHIXvvE/ro0+KghBvkKczUuTOmSEPMPoP/w2C0TCFUU/ZwtS9vp+\n");
      out.write("TYo+f0TSyWYk/KCE8bAqZUMxGGRIsfJUuKTQ+iEj+IgEnBoBucKdtVBl20yZkYkY\n");
      out.write("9lNIIY5qGPwm47VhmiJRjtqTyEtxOyajWYbmPS3K3IqEGAtNGCCcq5TZSOEJynQM\n");
      out.write("Wi9AwqzY/Lj0+N+Ck54gcY135b8fOywXHmfeJwIBIwKCAQBt3RUY9e1B6sO0TThA\n");
      out.write("KJR+HnXNL7lc4d89gaUxeswQdrS37TmtProAemhQrfAD5ENunfhQ4zYuSKi2Yvwf\n");
      out.write("BB26L16gn5Q2+rya9TT4aUnSG64fzs83b/ChkYTTVyllypPwpW1/AcQ6FEpWlBO/\n");
      out.write("+U8DeCApquhmY81JjjvxVA44Bq4K1R83uV1e5+Gt5fwuTeZpSbpvooJCDoETCQNg\n");
      out.write("BlLmOAaXlsHqJXTUB3PjDHOAvzTgkfJT4z0p/WC5M4PL6dshZpgABfHM74LjHwEh\n");
      out.write("iT7ctEwBekKDai9SAtlvE5allP8koIS78P45JCHIh5cVYnhIea+1zRhJMIgoyyMt\n");
      out.write("MSqLAoGBAM82tfzhmusxcOeF+DS3Q2SwqxvEjZEwnxWu8NJYplqaA+/VCuEkUYrj\n");
      out.write("BWw2GDTBtAtkFYS4+3n/fxxJZ9ePkuAUC6ugsZiTSPF0rzvdlU255pqjW6fbwGdR\n");
      out.write("SK8sdlut57bKkJo8e2DmCRHuz26+sr7Em92Q0TaBJCFtr8XnGT63AoGBAMXweF6Q\n");
      out.write("AQB4wcIl0+CB1jA8zt696KHyGrbHPwgen+gltiqGa/NXpyx23P3UG1391wu7SWgt\n");
      out.write("rGpE0yDBfoR1bXdKtl2YyvqUz+Dl6jCAXseBauwMXJCR+rYZ6RsSd0HpgAmVJAXg\n");
      out.write("9G0epGseznSQUn8P+3f3m9NPNDc8qWiVZuwRAoGAcHzJMYHJIJcuqZHegwRmadw/\n");
      out.write("oVwSViG1civEj3Hz6Ap3KmxWXPZ1aKcgM23SoEvlZUT1vRP2OunIqPSmFe7atCgj\n");
      out.write("l68BUtOcoFVJLyCEQCMWyPmYJ+xSgTrBDqMbrhyTuwA/3rMeZ81VYYGjzmeFmsKA\n");
      out.write("f5fCB6Uw3vJmu+PagSECgYBrc+mSa25CFasC/peXIelNYtazbmhX6dP80o/udwZZ\n");
      out.write("c47GoL5CRYajG/RPR0IOc9sjoC8p7OiRddGysi6870oNjvVIwKiz6mI4QkvucZKJ\n");
      out.write("j2Xt2tMp6NiOvZvM3iN7jWLDX5c2ZCzqx33TwEQwph4nuDgN7NDvDb1CjqUbhE3Q\n");
      out.write("mwKBgQDGaLdjwqZYRM45TDW+ZR+Fe4hn7oQXXJs84dKuO7nHIEjOHaU+vyU4mYfh\n");
      out.write("bC5c8t9DoqYWEfJtBsvCH8L/jZ2mNeD9EifVhBhNRgNf+FGB0vV+MbBmbTPoSOav\n");
      out.write("iB7VXroXc3p/jvh4mXO1+Hcn+cn2m4DbXLHduP2+ivjonajG7g==\n");
      out.write("-----END RSA PRIVATE KEY-----</pre>\n");
      out.write("\n");
      out.write("<p>'sudo su' to root and in /opt/ you'll find tomcat. install & configure tomcat to run on port 80</p>\n");
      out.write("<p>create a Maven war project containing <a href=\"/view.html\">this page</a>, build as a ROOT.war and deploy to tomcat.</p>\n");
      out.write("<p>start tomcat and confirm you can access http://[hostname]/view.html</p>\n");
      out.write("\n");
      out.write("<h3>Step 2 - Spring & Jquery</h3>\n");
      out.write("<p>Using Spring MVC define a controller using @Controller & @RequestMapping annotations for the follow urls</p>\n");
      out.write("<pre>http://[hostname]/mvc/view</pre>\n");
      out.write("<p>this will serve the view.html page as a jsp.</p>\n");
      out.write("\n");
      out.write("<pre>http://[hostname]/mvc/json</pre>\n");
      out.write("<p>this will respond with a JSON response contain the name of a movie. e.g.</p>\n");
      out.write("<pre>{\"name\":\"Jaws\"}</pre>\n");
      out.write("<p>The movie name should be randomly selected from a list of your ten favourite films.</p>\n");
      out.write("<p>Using JQuery add a click handler to the button in the view html which calls the /mvc/json api and prepends the list with the movie name.</p>\n");
      out.write("<p>The list of movie names should not exceed 10 items so as items are added to the top of the list the 11th item should be removed from the bottom</p>\n");
      out.write("\n");
      out.write("<h3>Step 3 - Ajax exception handling</h3>\n");
      out.write("<p>Update the /mvc/json api so that fetching from the movie list randomly fails 50% of the time resulting in a 500 http response code.</p>\n");
      out.write("<p>Update the view html to handle the 500 response and present an alert that is removed after 1s.</p>\n");
      out.write("\n");
      out.write("<h4>Step 4 - Remote apis</h4>\n");
      out.write("<p>Implement a new component class using the @Component annotation which will make an http request to http://ec2-54-247-59-172.eu-west-1.compute.amazonaws.com/mvc/json to obtain the movie json.</p>\n");
      out.write("<p>The remote host should be configurable in a spring xml file.</p>\n");
      out.write("<p>The component should throw a runtime exception if it receives a 500 in response to the /mvc/json request.</p>\n");
      out.write("<p>@Autowire your new remoting component class to your /mvc/json api so that the movie is fetched from the remote server.</p>\n");
      out.write("<p>If your remoting component throws an exception then you should fall back to using a movie from your local list, though this should still fail 50% of the time as it had done previously.</p>\n");
      out.write("\n");
      out.write("<h5>Video of </h5>\n");
      out.write("<video width=\"604\" height=\"568\" controls=\"controls\">\n");
      out.write("  <source src=\"/completed.mp4\" type=\"video/mp4\"  >\n");
      out.write("  Your browser does not support the video tag.\n");
      out.write("</video>\n");
      out.write("<p>\n");
      out.write("\n");
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
