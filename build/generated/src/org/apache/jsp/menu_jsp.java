package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menu_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"en\" lang=\"en\">\n");
      out.write("        <head>\n");
      out.write("                <title>Free Menu Designs - e-lusion.com</title>\n");
      out.write("                <meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\" />\n");
      out.write("                <meta name=\"author\" content=\"Ian Main\" />\n");
      out.write("                <meta name=\"Copyright\" content=\"Creative Commons - http://creativecommons.org/licenses/by/2.0/\" />\n");
      out.write("                <style type=\"text/css\">\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("        </head>\n");
      out.write("\n");
      out.write("        <body>\n");
      out.write("                <div id=\"menu9\">\n");
      out.write("                        <ul>\n");
      out.write("                                <!-- CSS Tabs -->\n");
      out.write("<li><a id=\"current\" href=\"Home.html\">Home</a></li>\n");
      out.write("<li><a href=\"Products.html\">Products</a></li>\n");
      out.write("<li><a href=\"Services.html\">Services</a></li>\n");
      out.write("<li><a href=\"Support.html\">Support</a></li>\n");
      out.write("<li><a href=\"Order.html\">Order</a></li>\n");
      out.write("<li><a href=\"News.html\">News</a></li>\n");
      out.write("<li><a href=\"About.html\">About</a></li>\n");
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("                </div>\n");
      out.write("        </body>\n");
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
