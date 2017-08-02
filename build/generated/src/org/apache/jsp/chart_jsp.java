package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.awt.*;
import java.io.*;
import org.jfree.chart.*;
import org.jfree.chart.entity.*;
import org.jfree.data.general.*;

public final class chart_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("         <!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("              \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("          \n");
      out.write("            \n");
      out.write("               \n");
      out.write("            \n");
      out.write("             \n");
      out.write("              ");

            final DefaultPieDataset data = new DefaultPieDataset();
             data.setValue("one", new Double(50.0));
             data.setValue("two", new Double(50.0));
//            data.setValue("three", new Double(27.5));
//               data.setValue("four", new Double(17.5));
//             data.setValue("five", new Double(11.0));
//             data.setValue("six", new Double(19.4));

              JFreeChart chart = ChartFactory.createPieChart
              ("Pie Chart ", data, true, false, false);

              try {
              final ChartRenderingInfo info = new 
                   ChartRenderingInfo(new StandardEntityCollection());

              final File file1 = new File("C:\\Users\\AlokKumar\\Documents\\NetBeansProjects\\OnlineShoppingStrutsHibernate\\web\\res\\img.jpg");
              //out.println("<img src='C:\\Users\\AlokKumar\\Documents\\NetBeansProjects\\OnlineShoppingStrutsHibernate\\web\\res\\img.jpg'/>");
            ChartUtilities.saveChartAsPNG(
            file1, chart, 600, 400, info);
              } catch (Exception e) {
            out.println(e);
              }
           
      out.write("\n");
      out.write("            <html>\n");
      out.write("           <head>\n");
      out.write("             <meta http-equiv=\"Content-Type\" \n");
      out.write("             content=\"text/html; charset=UTF-8\">\n");
      out.write("             <title>JSP Page</title>\n");
      out.write("            </head>\n");
      out.write("            <body>\n");
      out.write("             <IMG SRC=\"res\\\\img.jpg\" WIDTH=\"600\" HEIGHT=\"400\" \n");
      out.write("           BORDER=\"0\" USEMAP=\"#chart\">\n");
      out.write("           </body>\n");
      out.write("            </html> ");
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
