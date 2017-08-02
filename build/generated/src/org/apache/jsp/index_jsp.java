package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_form_cssStyle_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_textfield_placeholder_name_cssClass_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_submit_value_cssClass_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_html_form_cssStyle_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_textfield_placeholder_name_cssClass_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_submit_value_cssClass_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_html_form_cssStyle_action.release();
    _jspx_tagPool_html_textfield_placeholder_name_cssClass_nobody.release();
    _jspx_tagPool_html_submit_value_cssClass_nobody.release();
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<title>shopping</title>\n");
      out.write("\t<style type=\"text/css\">\n");
      out.write("\t\n");
      out.write("\t\t\n");
      out.write("\t\tbody {\n");
      out.write("\t\t\tbackground: rgba(80,80,80,0.8);\n");
      out.write("\t\t}\n");
      out.write("\t\t.loginDiv\n");
      out.write("                {\n");
      out.write("\t\t\twidth: 300px;\n");
      out.write("\t\t\theight: 220px;\n");
      out.write("\t\t\tcolor: #ff000f;\n");
      out.write("\t\t\tfont-family: Corbel;;\n");
      out.write("\t\t\tmargin-top: 232px;\n");
      out.write("\t\t\tmargin-left: 128px;\n");
      out.write("\t\t\tfloat:left;\n");
      out.write("                        background: rgba(80,80,80,0);\n");
      out.write("\t\t\tborder-radius: 8px;\n");
      out.write("\t\t\tbox-shadow: 0 2px 20px 0 rgba(0, 0, 0, 0.2);\n");
      out.write("\t\t}\n");
      out.write("\t\t.submit:hover,.submit_log:hover {\n");
      out.write("    \t\tbackground-color: #45a049;\n");
      out.write("\t\t}\n");
      out.write("    .regDiv\n");
      out.write("\t\t{\n");
      out.write("      float: right;\n");
      out.write("\t\t\twidth: 500px;\n");
      out.write("\t\t\theight: 500px;\n");
      out.write("\t\t\tcolor: #ff000f;\n");
      out.write("\t\t\tfont-family: Corbel;\n");
      out.write("\t\t\tmargin:64px;\n");
      out.write("\t\t\ttext-align: center;\n");
      out.write("      align-content: center;\n");
      out.write("\t\t\tbackground: rgba(80,80,80,0);\n");
      out.write("\t\t\tborder-radius: 8px;\n");
      out.write("\t\t\tbox-shadow: 0 2px 20px 0 rgba(0, 0, 0, 0.2);\n");
      out.write("\t\t}\n");
      out.write("\t\t.inputfield_pass,.inputfield_user\n");
      out.write("\t\t{\n");
      out.write("\t\t\twidth: 90%;\n");
      out.write("\t\t\theight: 48px;\n");
      out.write("\t\t\tmargin: 12px;\n");
      out.write("\t\t\tpadding: 12px 20px;\n");
      out.write("\t\t\tborder: 1px solid #ccc;\n");
      out.write("\t\t\tborder-radius: 4px;\n");
      out.write("\t\t\tbox-sizing: border-box;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("  .submit_log\n");
      out.write("\t\t{\n");
      out.write("\t\t\twidth: 89%;\n");
      out.write("\t\t\theight: 42px;\n");
      out.write("\t\t\tbackground-color: #4caf50;\n");
      out.write("\t\t\tcolor: white;\n");
      out.write("\t\t\tpadding: 12px 20px;\n");
      out.write("\t\t\tmargin-top: 8px;\n");
      out.write("\t\t\tmargin-left: 16px;\n");
      out.write("\t\t\tborder:  none;\n");
      out.write("\t\t\tfloat:left;\n");
      out.write("\t\t\tborder-radius: 4px;\n");
      out.write("\t\t\tcursor: pointer;\n");
      out.write("\t\t}\n");
      out.write("\t</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("            <div class=\"loginDiv\"  >\n");
      out.write("                ");
      if (_jspx_meth_html_form_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "registration.jsp", out, false);
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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

  private boolean _jspx_meth_html_form_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:form
    org.apache.struts2.views.jsp.ui.FormTag _jspx_th_html_form_0 = (org.apache.struts2.views.jsp.ui.FormTag) _jspx_tagPool_html_form_cssStyle_action.get(org.apache.struts2.views.jsp.ui.FormTag.class);
    _jspx_th_html_form_0.setPageContext(_jspx_page_context);
    _jspx_th_html_form_0.setParent(null);
    _jspx_th_html_form_0.setAction("login");
    _jspx_th_html_form_0.setCssStyle("width:100%; align-content:center;");
    int _jspx_eval_html_form_0 = _jspx_th_html_form_0.doStartTag();
    if (_jspx_eval_html_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_form_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_form_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_form_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_html_textfield_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                ");
        if (_jspx_meth_html_textfield_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                ");
        if (_jspx_meth_html_submit_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_html_form_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_form_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_form_cssStyle_action.reuse(_jspx_th_html_form_0);
      return true;
    }
    _jspx_tagPool_html_form_cssStyle_action.reuse(_jspx_th_html_form_0);
    return false;
  }

  private boolean _jspx_meth_html_textfield_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_html_textfield_0 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _jspx_tagPool_html_textfield_placeholder_name_cssClass_nobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_html_textfield_0.setPageContext(_jspx_page_context);
    _jspx_th_html_textfield_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_textfield_0.setName("username");
    _jspx_th_html_textfield_0.setDynamicAttribute(null, "placeholder", new String("username"));
    _jspx_th_html_textfield_0.setCssClass("inputfield_user");
    int _jspx_eval_html_textfield_0 = _jspx_th_html_textfield_0.doStartTag();
    if (_jspx_th_html_textfield_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_textfield_placeholder_name_cssClass_nobody.reuse(_jspx_th_html_textfield_0);
      return true;
    }
    _jspx_tagPool_html_textfield_placeholder_name_cssClass_nobody.reuse(_jspx_th_html_textfield_0);
    return false;
  }

  private boolean _jspx_meth_html_textfield_1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_html_textfield_1 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _jspx_tagPool_html_textfield_placeholder_name_cssClass_nobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_html_textfield_1.setPageContext(_jspx_page_context);
    _jspx_th_html_textfield_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_textfield_1.setName("password");
    _jspx_th_html_textfield_1.setDynamicAttribute(null, "placeholder", new String("password"));
    _jspx_th_html_textfield_1.setCssClass("inputfield_pass");
    int _jspx_eval_html_textfield_1 = _jspx_th_html_textfield_1.doStartTag();
    if (_jspx_th_html_textfield_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_textfield_placeholder_name_cssClass_nobody.reuse(_jspx_th_html_textfield_1);
      return true;
    }
    _jspx_tagPool_html_textfield_placeholder_name_cssClass_nobody.reuse(_jspx_th_html_textfield_1);
    return false;
  }

  private boolean _jspx_meth_html_submit_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:submit
    org.apache.struts2.views.jsp.ui.SubmitTag _jspx_th_html_submit_0 = (org.apache.struts2.views.jsp.ui.SubmitTag) _jspx_tagPool_html_submit_value_cssClass_nobody.get(org.apache.struts2.views.jsp.ui.SubmitTag.class);
    _jspx_th_html_submit_0.setPageContext(_jspx_page_context);
    _jspx_th_html_submit_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_submit_0.setValue("login");
    _jspx_th_html_submit_0.setCssClass("submit_log");
    int _jspx_eval_html_submit_0 = _jspx_th_html_submit_0.doStartTag();
    if (_jspx_th_html_submit_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_submit_value_cssClass_nobody.reuse(_jspx_th_html_submit_0);
      return true;
    }
    _jspx_tagPool_html_submit_value_cssClass_nobody.reuse(_jspx_th_html_submit_0);
    return false;
  }
}
