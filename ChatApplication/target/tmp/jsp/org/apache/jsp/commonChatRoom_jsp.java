/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.4.7.v20170914
 * Generated at: 2018-10-17 08:59:16 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class commonChatRoom_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<link href = \"CSS/semantic.min.css\" rel = \"stylesheet\" type = \"text/css\">\r\n");
      out.write("<link href = \"CSS/chatPage.css\" rel = \"stylesheet\" type = \"text/css\">\r\n");
      out.write("<link href = \"CSS/flag.min.css\" rel = \"stylesheet\" type = \"text/css\">\r\n");
      out.write("<link href = \"CSS/icon.min.css\" rel = \"stylesheet\" type = \"text/css\">\r\n");
      out.write("<script type =\"text/javascript\" src = \"JS/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"https://js.pusher.com/4.1/pusher.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src = \"JS/procMsg.js\"></script>\r\n");
      out.write("<script type =\"text/javascript\" src = \"JS/semantic.min.js\"></script>\r\n");
      out.write("<script type = \"text/javascript\" src = \"JS/chatDesign.js\"></script>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Chat window</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body> \r\n");
      out.write("\t\r\n");
      out.write("\t<div class= \"ui conteiner\" id = \"mainChatConteiner\">\r\n");
      out.write("\t\t<div class = \"ui conteiner-fluid\" id = \"chatWindow\">\r\n");
      out.write("\t\t<!--  \r\n");
      out.write("\t\t\t<div class = \"chat self\">\r\n");
      out.write("\t\t\t\t<p class = \"timeStampSelf\">Date</p>\r\n");
      out.write("\t\t\t\t<p class = \"selfId\">Me:</p>\r\n");
      out.write("\t\t\t\t<p class = \"selfMessage\">message</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class = \"chat participants\">\r\n");
      out.write("\t\t\t\t<p class = \"timeStampParticipant\" >Date</p>\r\n");
      out.write("\t\t\t\t<p class = \"participantId\" >Name:</p>\r\n");
      out.write("\t\t\t\t<p class = \"chatMessageParticipant\">message</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t-->\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class = \"ui input\" id = \"inputElements\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<input type = \"text\"\r\n");
      out.write("\t\t\tplaceholder = \"Enter message here...\" \r\n");
      out.write("\t\t\tid = \"textField\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<i class = \"blue big paper plane icon\" \r\n");
      out.write("\t\t\tid = \"sendIcon\"></i> \r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div> \r\n");
      out.write("\t\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
