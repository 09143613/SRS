/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.23
 * Generated at: 2017-07-01 12:01:12 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.content;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class transcript_jsp extends org.apache.jasper.runtime.HttpJspBase
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

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
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

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<!--[if IE 8]> <html lang=\"en\" class=\"ie8 no-js\"> <![endif]-->\n");
      out.write("<!--[if IE 9]> <html lang=\"en\" class=\"ie9 no-js\"> <![endif]-->\n");
      out.write("<!--[if !IE]><!-->\n");
      out.write("<html lang=\"en\" class=\"no-js\">\n");
      out.write("<!--<![endif]-->\n");
      out.write("<!-- BEGIN HEAD -->\n");
      out.write("<head>\n");
      out.write("<meta charset=\"utf-8\"/>\n");
      out.write("<title>选课系统</title>\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("<meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\"/>\n");
      out.write("<meta content=\"\" name=\"description\"/>\n");
      out.write("<meta content=\"\" name=\"author\"/>\n");
      out.write("<meta name=\"MobileOptimized\" content=\"320\">\n");
      out.write("<!-- BEGIN GLOBAL MANDATORY STYLES -->\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/plugins/font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/plugins/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/plugins/uniform/css/uniform.default.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<!-- END GLOBAL MANDATORY STYLES -->\n");
      out.write("<!-- BEGIN PAGE LEVEL STYLES -->\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/plugins/select2/select2_metro.css\"/>\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/plugins/data-tables/DT_bootstrap.css\"/>\n");
      out.write("<!-- END PAGE LEVEL STYLES -->\n");
      out.write("<!-- BEGIN THEME STYLES -->\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/css/style-metronic.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/css/style-responsive.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/css/plugins.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/css/themes/default.css\" rel=\"stylesheet\" type=\"text/css\" id=\"style_color\"/>\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/css/custom.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<!-- END THEME STYLES -->\n");
      out.write("\n");
      out.write("<link rel=\"shortcut icon\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/images/favicon.ico\"/>\n");
      out.write("</head>\n");
      out.write("<!-- END HEAD -->\n");
      out.write("<!-- BEGIN BODY -->\n");
      out.write("<body class=\"page-header-fixed\">\n");
      out.write("<!-- BEGIN HEADER -->\n");
      out.write("<div class=\"header navbar navbar-inverse navbar-fixed-top\">\n");
      out.write("\t<!-- BEGIN TOP NAVIGATION BAR -->\n");
      out.write("\t<div class=\"header-inner\">\n");
      out.write("\t\t<!-- BEGIN LOGO -->\n");
      out.write("\t\t<a class=\"navbar-brand\" href=\"/index\">\n");
      out.write("\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/img/logo.png\" alt=\"logo\" class=\"img-responsive\"/>\n");
      out.write("\t\t</a>\n");
      out.write("\t\t<!-- END LOGO -->\n");
      out.write("\t\t<!-- BEGIN RESPONSIVE MENU TOGGLER -->\n");
      out.write("\t\t<a href=\"javascript:;\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\n");
      out.write("\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/img/menu-toggler.png\" alt=\"\"/>\n");
      out.write("\t\t</a>\n");
      out.write("\t\t<!-- END RESPONSIVE MENU TOGGLER -->\n");
      out.write("\t\t<!-- BEGIN TOP NAVIGATION MENU -->\n");
      out.write("\t\t<ul class=\"nav navbar-nav pull-right\">\n");
      out.write("\t\t<!-- BEGIN USER LOGIN DROPDOWN -->\n");
      out.write("\t\t\t<li class=\"dropdown user\">\n");
      out.write("\t\t\t\t<a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" data-hover=\"dropdown\" data-close-others=\"true\">\n");
      out.write("\t\t\t\t\t<img alt=\"\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/img/avatar1_small.jpg\"/>\n");
      out.write("\t\t\t\t\t<span class=\"username\">\n");
      out.write("\t\t\t\t\t\t蒋宇森\n");
      out.write("\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t<i class=\"fa fa-angle-down\"></i>\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t\t<ul class=\"dropdown-menu\">\n");
      out.write("\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t<a href=\"extra_profile.html\"><i class=\"fa fa-user\"></i> 个人信息</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t<a href=\"inbox.html\"><i class=\"fa fa-envelope\"></i> 我的消息\n");
      out.write("\t\t\t\t\t\t<span class=\"badge badge-danger\">\n");
      out.write("\t\t\t\t\t\t\t3\n");
      out.write("\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t<a href=\"#\"><i class=\"fa fa-tasks\"></i> 我的任务\n");
      out.write("\t\t\t\t\t\t<span class=\"badge badge-success\">\n");
      out.write("\t\t\t\t\t\t\t7\n");
      out.write("\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li class=\"divider\">\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t<a href=\"login\"><i class=\"fa fa-key\"></i> 安全退出</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t\t<!-- END USER LOGIN DROPDOWN -->\n");
      out.write("\t\t</ul>\n");
      out.write("\t\t<!-- END TOP NAVIGATION MENU -->\n");
      out.write("\t</div>\n");
      out.write("\t<!-- END TOP NAVIGATION BAR -->\n");
      out.write("</div>\n");
      out.write("<!-- END HEADER -->\n");
      out.write("<div class=\"clearfix\">\n");
      out.write("</div>\n");
      out.write("<!-- BEGIN CONTAINER -->\n");
      out.write("<div class=\"page-container\">\n");
      out.write("\t<!-- BEGIN SIDEBAR -->\n");
      out.write("\t<div class=\"page-sidebar-wrapper\">\n");
      out.write("\t\t<div class=\"page-sidebar navbar-collapse collapse\">\n");
      out.write("\t\t\t<!-- BEGIN SIDEBAR MENU -->\n");
      out.write("\t\t\t<ul class=\"page-sidebar-menu\">\n");
      out.write("\t\t\t\t<li class=\"sidebar-toggler-wrapper\">\n");
      out.write("\t\t\t\t\t<!-- BEGIN SIDEBAR TOGGLER BUTTON -->\n");
      out.write("\t\t\t\t\t<div class=\"sidebar-toggler hidden-phone\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<!-- BEGIN SIDEBAR TOGGLER BUTTON -->\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li class=\"start\">\n");
      out.write("\t\t\t\t\t<a href=\"/index\">\n");
      out.write("\t\t\t\t\t<i class=\"fa fa-home\"></i>\n");
      out.write("\t\t\t\t\t<span class=\"title\">\n");
      out.write("\t\t\t\t\t\t学生选课\n");
      out.write("\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t<span class=\"selected\">\n");
      out.write("\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li class=\"active\">\n");
      out.write("\t\t\t\t\t<a href=\"/transcript\">\n");
      out.write("\t\t\t\t\t<i class=\"fa fa-bar-chart-o\"></i>\n");
      out.write("\t\t\t\t\t<span class=\"title\">\n");
      out.write("\t\t\t\t\t\t成绩查询\n");
      out.write("\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li class=\"\">\n");
      out.write("\t\t\t\t\t<a href=\"charts.html\">\n");
      out.write("\t\t\t\t\t<i class=\"fa fa-table\"></i>\n");
      out.write("\t\t\t\t\t<span class=\"title\">\n");
      out.write("\t\t\t\t\t\t教学计划\n");
      out.write("\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li class=\"\">\n");
      out.write("\t\t\t\t\t<a href=\"/professorManager\">\n");
      out.write("\t\t\t\t\t<i class=\"fa fa-user\"></i>\n");
      out.write("\t\t\t\t\t<span class=\"title\">\n");
      out.write("\t\t\t\t\t\t教师管理\n");
      out.write("\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li class=\"last \">\n");
      out.write("\t\t\t\t\t<a href=\"charts.html\">\n");
      out.write("\t\t\t\t\t<i class=\"fa fa-file-text\"></i>\n");
      out.write("\t\t\t\t\t<span class=\"title\">\n");
      out.write("\t\t\t\t\t\t课程管理\n");
      out.write("\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t\t<!-- END SIDEBAR MENU -->\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- END SIDEBAR -->\n");
      out.write("\t<!-- BEGIN CONTENT -->\n");
      out.write("\t<div class=\"page-content-wrapper\">\n");
      out.write("\t\t<div class=\"page-content\">\n");
      out.write("\t\t\n");
      out.write("\t\t\t<!-- BEGIN PAGE HEADER-->\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col-md-12\">\n");
      out.write("\t\t\t\t\t<!-- BEGIN PAGE TITLE & BREADCRUMB-->\n");
      out.write("\t\t\t\t\t<h3 class=\"page-title\">\n");
      out.write("\t\t\t\t\t 管理学院电子商务专业选课系统\n");
      out.write("\t\t\t\t\t</h3>\n");
      out.write("\t\t\t\t\t<ul class=\"page-breadcrumb breadcrumb\">\n");
      out.write("\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t<i class=\"fa fa-home\"></i>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"/index\">主页</a>\n");
      out.write("\t\t\t\t\t\t\t<i class=\"fa fa-angle-right\"></i>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"/transcript\">成绩查询</a>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<li class=\"pull-right\">\n");
      out.write("\t\t\t\t\t\t\t<div id=\"dashboard-report-range\" class=\"dashboard-date-range tooltips\" data-placement=\"top\" data-original-title=\"Change dashboard date range\">\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"fa fa-calendar\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t<span>\n");
      out.write("\t\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"fa fa-angle-down\"></i>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t<!-- END PAGE TITLE & BREADCRUMB-->\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!-- END PAGE HEADER-->\n");
      out.write("\t\t\t<!-- BEGIN DASHBOARD STATS -->\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col-md-12\">\n");
      out.write("\t\t\t\t\t<table id=\"table\"></table>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!-- END DASHBOARD STATS -->\n");
      out.write("\t\t\t<div class=\"clearfix\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div id=\"dialog\">\n");
      out.write("\t\t\t\t<table id=\"showSectionStudent\"></table>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- END CONTENT -->\n");
      out.write("</div>\n");
      out.write("<!-- END CONTAINER -->\n");
      out.write("<!-- BEGIN FOOTER -->\n");
      out.write("<div class=\"footer\">\n");
      out.write("\t<div class=\"footer-inner\">\n");
      out.write("\t\t 2017 &copy; 管理学院电子商务专业选课系统.\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"footer-tools\">\n");
      out.write("\t\t<span class=\"go-top\">\n");
      out.write("\t\t\t<i class=\"fa fa-angle-up\"></i>\n");
      out.write("\t\t</span>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("<!-- END FOOTER -->\n");
      out.write("<!-- BEGIN JAVASCRIPTS(Load javascripts at bottom, this will reduce page load time) -->\n");
      out.write("<!-- BEGIN CORE PLUGINS -->\n");
      out.write("<!--[if lt IE 9]>\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/plugins/respond.min.js\"></script>\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/plugins/excanvas.min.js\"></script> \n");
      out.write("<![endif]-->\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/plugins/jquery-1.10.2.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/plugins/jquery-migrate-1.2.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/plugins/bootstrap/js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/plugins/bootstrap-hover-dropdown/twitter-bootstrap-hover-dropdown.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/plugins/jquery-slimscroll/jquery.slimscroll.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/plugins/jquery.blockui.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/plugins/jquery.cokie.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/plugins/uniform/jquery.uniform.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<!-- END CORE PLUGINS -->\n");
      out.write("<!-- BEGIN PAGE LEVEL PLUGINS -->\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/plugins/select2/select2.min.js\"></script>\n");
      out.write("<!-- END PAGE LEVEL PLUGINS -->\n");
      out.write("<!-- BEGIN PAGE LEVEL SCRIPTS -->\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/scripts/app.js\"></script>\n");
      out.write("\n");
      out.write("<!-- Latest compiled and minified CSS -->\n");
      out.write("<link rel=\"stylesheet\" href=\"//cdnjs.cloudflare.com/ajax/libs/bootstrap-table/1.11.1/bootstrap-table.min.css\">\n");
      out.write("\n");
      out.write("<!-- Latest compiled and minified JavaScript -->\n");
      out.write("<script src=\"//cdnjs.cloudflare.com/ajax/libs/bootstrap-table/1.11.1/bootstrap-table.min.js\"></script>\n");
      out.write("\n");
      out.write("<!-- Latest compiled and minified Locales -->\n");
      out.write("<script src=\"//cdnjs.cloudflare.com/ajax/libs/bootstrap-table/1.11.1/locale/bootstrap-table-zh-CN.min.js\"></script>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("\tjQuery(document).ready(function() {    \n");
      out.write("\t   App.init(); // initlayout and core plugins\n");
      out.write("\t});\n");
      out.write("\t$(function(){\n");
      out.write("\t\t$('#table').bootstrapTable({\n");
      out.write("\t\t\turl:\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/queryTranscript\",\n");
      out.write("\t\t\tmethod:'post',\n");
      out.write("\t\t\tstriped:true,\t\t//隔行变色\n");
      out.write("\t\t\tsingleSelect:true,\t//禁止多选\n");
      out.write("\t\t\tclickToSelect:true,\t//点击行时，自动选择\n");
      out.write("\t\t\tshowToggle : true,\t//切换试图的图标\n");
      out.write("\t\t\tshowRefresh:true,\t//刷新按钮\n");
      out.write("\t\t\tpagination:true,\t//显示分页条\n");
      out.write("\t\t\tonlyInfoPagination:true,//仅显示总数据数\n");
      out.write("\t\t\tdataField : 'rows',\n");
      out.write("\t\t\ttotalField : 'total',\n");
      out.write("\t\t\tcolumns: [\n");
      out.write("\t\t        {field:'name',title:'课程名称',width:100,align:'center'},    \n");
      out.write("\t\t        {field:'grade',title:'成绩',width:100,align:'center'} ,\n");
      out.write("\t\t        {field:'time',title:'时间',width:100,align:'center'} ,\n");
      out.write("\t\t        {field:'credits',title:'绩点',width:100,align:'center'} \n");
      out.write("\t\t\t]\n");
      out.write("\t\t});\n");
      out.write("\t\n");
      out.write("\t})\n");
      out.write("</script>\n");
      out.write("<!-- END JAVASCRIPTS -->\n");
      out.write("</body>\n");
      out.write("<!-- END BODY -->\n");
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