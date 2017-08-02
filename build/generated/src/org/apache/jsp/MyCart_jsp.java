package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import bean.ItemAndCount;
import bean.MyCart;
import Dao.GetCartItems;
import java.util.List;
import Dao.GetItems;

public final class MyCart_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 String id = null; 
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_ht_form_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_ht_submit_value_cssClass_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_ht_form_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_ht_submit_value_cssClass_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_ht_form_action.release();
    _jspx_tagPool_ht_submit_value_cssClass_nobody.release();
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    String username = (String)session.getAttribute("name");
    GetCartItems rs = new GetCartItems();
    List<ItemAndCount> list = rs.getCartItems(username);
    int siz = list.size();
    System.out.println("printing size : "+siz);
    
      out.write("\n");
      out.write("    \n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>shopping items</title>\n");
      out.write("<style>\n");
      out.write("    body\n");
      out.write("    {\n");
      out.write("        font-size: 14px;\n");
      out.write("        background-color: #f3f3f3;\n");
      out.write("        color: #212121;\n");
      out.write("        line-height: 1.4;\n");
      out.write("        padding:48px;\n");
      out.write("        font-family: arial,sans-serif;\n");
      out.write("    }\n");
      out.write("    div.ItemList,div.item\n");
      out.write("    {\n");
      out.write("        font-family: arial,sans-serif;\n");
      out.write("    }\n");
      out.write("    div#title\n");
      out.write("    {\n");
      out.write("        width: 70%;\n");
      out.write("        height: 32px;\n");
      out.write("        background-color: #ffffff;\n");
      out.write("        box-shadow: 2px 2px 4px 0 rgba(0,0,0,0.3);\n");
      out.write("        border: 1px solid white;\n");
      out.write("        float: left;\n");
      out.write("    }\n");
      out.write("    div#user\n");
      out.write("    {\n");
      out.write("        width: 10%;\n");
      out.write("        height: fit-content;\n");
      out.write("        float: right;\n");
      out.write("    }\n");
      out.write("    divb2 > p\n");
      out.write("    {\n");
      out.write("        width: 120px;\n");
      out.write("        height: 120px;\n");
      out.write("        background-color: #ffffff;\n");
      out.write("        box-shadow: 2px 2px 4px 0 rgba(0,0,0,0.3);\n");
      out.write("        border: 1px solid white;\n");
      out.write("        border-radius: 16px;\n");
      out.write("    }\n");
      out.write("    div#username\n");
      out.write("    {\n");
      out.write("        width: auto;\n");
      out.write("        height: 24px;\n");
      out.write("        background-color: #ffffff;\n");
      out.write("        box-shadow: 2px 2px 4px 0 rgba(0,0,0,0.3);\n");
      out.write("        border: 1px solid white;\n");
      out.write("        text-transform: capitalize;\n");
      out.write("        border-radius: 4px;\n");
      out.write("        \n");
      out.write("    }\n");
      out.write("    div.item\n");
      out.write("    {\n");
      out.write("        width: 100%;\n");
      out.write("        height: 180px;\n");
      out.write("        background-color: #ffffff;\n");
      out.write("        box-shadow: 2px 2px 4px 0 rgba(0,0,0,0.3);\n");
      out.write("        margin-top: 2px;\n");
      out.write("        margin-left: 1px;\n");
      out.write("        float:left;\n");
      out.write("    }\n");
      out.write("    div.imag\n");
      out.write("    {\n");
      out.write("        height: auto;\n");
      out.write("        width: 120px;\n");
      out.write("        padding: 8px;\n");
      out.write("        align-content: center;\n");
      out.write("        float: left;\n");
      out.write("    }\n");
      out.write("    div.description\n");
      out.write("    {\n");
      out.write("      width: auto;\n");
      out.write("      padding-left: 12px;\n");
      out.write("      height: inherit;\n");
      out.write("    }\n");
      out.write("    p#name\n");
      out.write("    {\n");
      out.write("        font-family:Consolas;\n");
      out.write("        font-size: 16px;\n");
      out.write("    }\n");
      out.write("    p#about,p#seller,p#price\n");
      out.write("    {\n");
      out.write("        font-family: Candara;\n");
      out.write("        font: 8px;\n");
      out.write("    }\n");
      out.write("    #submit1,.logout\n");
      out.write("    {\n");
      out.write("        height: 20px;\n");
      out.write("        width: 72px;\n");
      out.write("        border: none; \n");
      out.write("        background-color: rgba(0,0,200,0.4); \n");
      out.write("        color: white;\n");
      out.write("        padding-left:  4px;\n");
      out.write("        border-radius: 2px;\n");
      out.write("    }\n");
      out.write("    #submit2\n");
      out.write("    {\n");
      out.write("        height: 20px;\n");
      out.write("        width: 72px;\n");
      out.write("        border: none; \n");
      out.write("        background-color: rgba(0,0,200,0.4); \n");
      out.write("        color: white;\n");
      out.write("        margin-left: 8px;\n");
      out.write("        padding-left:  4px;\n");
      out.write("        border-radius: 2px; \n");
      out.write("    }\n");
      out.write("    a\n");
      out.write("    {\n");
      out.write("        color: #764444;\n");
      out.write("        text-decoration: none; \n");
      out.write("    }\n");
      out.write("    a:hover\n");
      out.write("    { \n");
      out.write("        color: #b56f6f;\n");
      out.write("    }\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"menu\" style=\"float:left; margin-right: 8px;\">\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "menu.jsp", out, false);
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div id=\"title\">\n");
      out.write("                  <p style=\"font-family: Consolas; padding-left: 24px;\">My Cart</p>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"user\" >\n");
      out.write("                <center>\n");
      out.write("                <div id=\"userimg\">\n");
      out.write("                    <img src=\"res\\\\user.png\" style=\"width: 120px; height: 120px; padding: 2px;  border-radius: 8px\"> \n");
      out.write("                </div>\n");
      out.write("                <div id=\"username\" style=\"\n");
      out.write("                                            font-family: Consolas; \n");
      out.write("                                            font-size: 14px;\n");
      out.write("                                            padding-left: 2px;\n");
      out.write("                                            vertical-align: bottom;\n");
      out.write("                                            text-align: center;\"\n");
      out.write("                                            > hello\n");
      out.write("                      ");
 out.println(username); 
      out.write("!\n");
      out.write("                </div> \n");
      out.write("                <div id=\"logout\" style=\"margin:12px;align-content: center;\">\n");
      out.write("                      ");
      if (_jspx_meth_ht_form_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                </div>\n");
      out.write("                </center>\n");
      out.write("            </div>\n");
      out.write("                <div class=\"ItemList\" style=\"width:70%;float:left\">\n");
      out.write("                    ");

                for(ItemAndCount it : list)
                {
                    
      out.write("\n");
      out.write("                    <div class=\"item\" >\n");
      out.write("                          <div class=\"imag\">\n");
      out.write("                              <img src=\"");
 out.println(it.getImgUrl()); 
      out.write(" \" style=\"padding:8px; height: 160px;width: 120px;\">\n");
      out.write("                          </div>\n");
      out.write("                          <div class=\"description\" style=\"padding-left:160px\">\n");
      out.write("                            <p id=\"name\">");
 out.println(it.getName()); 
      out.write("</p>\n");
      out.write("                            <p id=\"count\" style=\"float:right;padding-right:8px;margin-top:-36px;\">Quantity : ");
out.println(it.getCount()); 
      out.write("</p>\n");
      out.write("                            <p id=\"about\">");
 out.println(it.getAbout()); 
      out.write("</p>\n");
      out.write("                            <p id=\"seller\">");
 out.println(it.getSeller()); 
      out.write("</p>\n");
      out.write("                            <p id=\"price\">price: ₹ ");
 out.println(it.getPrice()); 
      out.write("</p>\n");
      out.write("                            <form action=\"remove\" style=\"float:left;\">\n");
      out.write("                                <input type=\"hidden\" name=\"id\" value=\"");
 out.println(it.getId()); 
      out.write("\"/>\n");
      out.write("                                <input type=\"submit\" value=\"remove\"  id=\"submit1\"/>\n");
      out.write("                            </form>\n");
      out.write("                            <form action=\"product\" style=\"float:left;\">\n");
      out.write("                                <input type=\"hidden\" name=\"id\" value=\"");
 out.println(it.getId()); 
      out.write("\"/>\n");
      out.write("                                <input type=\"submit\" value=\"about\" name=\"submit\" id=\"submit2\"/>\n");
      out.write("                            </form>\n");
      out.write("                      </div>\n");
      out.write("                    </div>\n");
      out.write("            ");
 }
        
      out.write("</div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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

  private boolean _jspx_meth_ht_form_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ht:form
    org.apache.struts2.views.jsp.ui.FormTag _jspx_th_ht_form_0 = (org.apache.struts2.views.jsp.ui.FormTag) _jspx_tagPool_ht_form_action.get(org.apache.struts2.views.jsp.ui.FormTag.class);
    _jspx_th_ht_form_0.setPageContext(_jspx_page_context);
    _jspx_th_ht_form_0.setParent(null);
    _jspx_th_ht_form_0.setAction("logout");
    int _jspx_eval_ht_form_0 = _jspx_th_ht_form_0.doStartTag();
    if (_jspx_eval_ht_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_ht_form_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_ht_form_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_ht_form_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                          ");
        if (_jspx_meth_ht_submit_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_ht_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                      ");
        int evalDoAfterBody = _jspx_th_ht_form_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_ht_form_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_ht_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_ht_form_action.reuse(_jspx_th_ht_form_0);
      return true;
    }
    _jspx_tagPool_ht_form_action.reuse(_jspx_th_ht_form_0);
    return false;
  }

  private boolean _jspx_meth_ht_submit_0(javax.servlet.jsp.tagext.JspTag _jspx_th_ht_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ht:submit
    org.apache.struts2.views.jsp.ui.SubmitTag _jspx_th_ht_submit_0 = (org.apache.struts2.views.jsp.ui.SubmitTag) _jspx_tagPool_ht_submit_value_cssClass_nobody.get(org.apache.struts2.views.jsp.ui.SubmitTag.class);
    _jspx_th_ht_submit_0.setPageContext(_jspx_page_context);
    _jspx_th_ht_submit_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ht_form_0);
    _jspx_th_ht_submit_0.setValue("logout");
    _jspx_th_ht_submit_0.setCssClass("logout");
    int _jspx_eval_ht_submit_0 = _jspx_th_ht_submit_0.doStartTag();
    if (_jspx_th_ht_submit_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_ht_submit_value_cssClass_nobody.reuse(_jspx_th_ht_submit_0);
      return true;
    }
    _jspx_tagPool_ht_submit_value_cssClass_nobody.reuse(_jspx_th_ht_submit_0);
    return false;
  }
}
