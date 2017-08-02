<%-- 
    Document   : chart
    Created on : 23 Jul, 2017, 7:04:23 PM
    Author     : AlokKumar
--%>

<%@page import="com.opensymphony.xwork2.util.ResolverUtil.Test"%>
<%@page import="java.net.URL"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
         <!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
              "http://www.w3.org/TR/html4/loose.dtd">

          <%@ page  import="java.awt.*" %>
            <%@ page  import="java.io.*" %>
               <%@ page  import="org.jfree.chart.*" %>
            <%@ page  import="org.jfree.chart.entity.*" %>
             <%@ page  import ="org.jfree.data.general.*"%>
              <%
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
              URL location = Test.class.getProtectionDomain().getCodeSource().getLocation();
                System.out.println(location.getFile());
              final File file1 = new File("C:\\Users\\AlokKumar\\Documents\\NetBeansProjects\\OnlineShoppingStrutsHibernate\\web\\res\\img.jpg");
              //out.println("<img src='C:\\Users\\AlokKumar\\Documents\\NetBeansProjects\\OnlineShoppingStrutsHibernate\\web\\res\\img.jpg'/>");
            ChartUtilities.saveChartAsPNG(
            file1, chart, 600, 400, info);
              } catch (Exception e) {
            out.println(e);
              }
           %>
            <html>
           <head>
             <meta http-equiv="Content-Type" 
             content="text/html; charset=UTF-8">
             <title>JSP Page</title>
            </head>
            <body>
             <IMG SRC="res\\img.jpg" WIDTH="600" HEIGHT="400" 
           BORDER="0" USEMAP="#chart">
           </body>
            </html> 