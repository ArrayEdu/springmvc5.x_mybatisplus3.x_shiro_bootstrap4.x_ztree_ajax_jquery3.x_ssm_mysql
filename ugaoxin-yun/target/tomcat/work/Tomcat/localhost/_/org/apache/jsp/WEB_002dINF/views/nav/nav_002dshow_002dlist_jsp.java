/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-01-20 05:01:39 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.nav;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.util.*;
import java.util.*;

public final class nav_002dshow_002dlist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/WEB-INF/views/nav/../../../index/../index/common.jsp", Long.valueOf(1536824037932L));
    _jspx_dependants.put("/WEB-INF/views/nav/../../../index/header.jsp", Long.valueOf(1539054546891L));
    _jspx_dependants.put("/WEB-INF/views/nav/../../../index/aside.jsp", Long.valueOf(1539069913886L));
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

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
      out.write("    <!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta name=\"description\" content=\"Vali is a responsive and free admin theme built with Bootstrap 4, SASS and PUG.js. It's fully customizable and modular.\">\r\n");
      out.write("    <!-- Twitter meta-->\r\n");
      out.write("    <meta property=\"twitter:card\" content=\"summary_large_image\">\r\n");
      out.write("    <meta property=\"twitter:site\" content=\"@pratikborsadiya\">\r\n");
      out.write("    <meta property=\"twitter:creator\" content=\"@pratikborsadiya\">\r\n");
      out.write("    <!-- Open Graph Meta-->\r\n");
      out.write("    <meta property=\"og:type\" content=\"website\">\r\n");
      out.write("    <meta property=\"og:site_name\" content=\"Vali Admin\">\r\n");
      out.write("    <meta property=\"og:title\" content=\"Vali - Free Bootstrap 4 admin theme\">\r\n");
      out.write("    <meta property=\"og:url\" content=\"http://pratikborsadiya.in/blog/vali-admin\">\r\n");
      out.write("    <meta property=\"og:image\" content=\"http://pratikborsadiya.in/blog/vali-admin/hero-social.png\">\r\n");
      out.write("    <meta property=\"og:description\" content=\"Vali is a responsive and free admin theme built with Bootstrap 4, SASS and PUG.js. It's fully customizable and modular.\">\r\n");
      out.write("    <title>导航菜单列表</title>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    \r\n");
      out.write("  </head>\r\n");
      out.write("  <body class=\"app sidebar-mini rtl\">\r\n");
      out.write("    <!-- Navbar--> \r\n");
      out.write("    ");
      out.write('\r');
      out.write('\n');
      out.write(' ');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("<!-- ");
      out.print(basePath);
      out.write(" -->\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("    <script src=\"");
      out.print(basePath);
      out.write("/static/js/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.print(basePath);
      out.write("/static/main/js/popper.min.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.print(basePath);
      out.write("/static/main/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.print(basePath);
      out.write("/static/main/js/main.js\"></script>\r\n");
      out.write("    <!-- The javascript plugin to display page loading on top-->\r\n");
      out.write("    <script src=\"");
      out.print(basePath);
      out.write("/static/main/js/plugins/pace.min.js\"></script>\r\n");
      out.write("    <!-- Page specific javascripts-->\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("/static/main/js/plugins/chart.js\"></script>\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("     <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(basePath);
      out.write("/static/main/css/main.css\">");
      out.write("\r\n");
      out.write(" <header class=\"app-header\"><a class=\"app-header__logo\" href=\"index.jsp\"></a>\r\n");
      out.write("      <!-- Sidebar toggle button--><a class=\"app-sidebar__toggle\" href=\"#\" data-toggle=\"sidebar\" aria-label=\"Hide Sidebar\"></a>\r\n");
      out.write("      <!-- Navbar Right Menu-->\r\n");
      out.write("      <ul class=\"app-nav\">\r\n");
      out.write("        <li class=\"app-search\">\r\n");
      out.write("          <input class=\"app-search__input\" type=\"search\" placeholder=\"Search\">\r\n");
      out.write("          <button class=\"app-search__button\"><i class=\"fa fa-search\"></i></button>\r\n");
      out.write("        </li>\r\n");
      out.write("        <!--Notification Menu-->\r\n");
      out.write("        <li class=\"dropdown\"><a class=\"app-nav__item\" href=\"#\" data-toggle=\"dropdown\" aria-label=\"Show notifications\"><i class=\"fa fa-bell-o fa-lg\"></i></a>\r\n");
      out.write("          <ul class=\"app-notification dropdown-menu dropdown-menu-right\">\r\n");
      out.write("            <li class=\"app-notification__title\">You have 4 new notifications.</li>\r\n");
      out.write("            <div class=\"app-notification__content\">\r\n");
      out.write("              <li><a class=\"app-notification__item\" href=\"javascript:;\"><span class=\"app-notification__icon\"><span class=\"fa-stack fa-lg\"><i class=\"fa fa-circle fa-stack-2x text-primary\"></i><i class=\"fa fa-envelope fa-stack-1x fa-inverse\"></i></span></span>\r\n");
      out.write("                  <div>\r\n");
      out.write("                    <p class=\"app-notification__message\">Lisa sent you a mail</p>\r\n");
      out.write("                    <p class=\"app-notification__meta\">2 min ago</p>\r\n");
      out.write("                  </div></a></li>\r\n");
      out.write("              <li><a class=\"app-notification__item\" href=\"javascript:;\"><span class=\"app-notification__icon\"><span class=\"fa-stack fa-lg\"><i class=\"fa fa-circle fa-stack-2x text-danger\"></i><i class=\"fa fa-hdd-o fa-stack-1x fa-inverse\"></i></span></span>\r\n");
      out.write("                  <div>\r\n");
      out.write("                    <p class=\"app-notification__message\">Mail server not working</p>\r\n");
      out.write("                    <p class=\"app-notification__meta\">5 min ago</p>\r\n");
      out.write("                  </div></a></li>\r\n");
      out.write("              <li><a class=\"app-notification__item\" href=\"javascript:;\"><span class=\"app-notification__icon\"><span class=\"fa-stack fa-lg\"><i class=\"fa fa-circle fa-stack-2x text-success\"></i><i class=\"fa fa-money fa-stack-1x fa-inverse\"></i></span></span>\r\n");
      out.write("                  <div>\r\n");
      out.write("                    <p class=\"app-notification__message\">Transaction complete</p>\r\n");
      out.write("                    <p class=\"app-notification__meta\">2 days ago</p>\r\n");
      out.write("                  </div></a></li>\r\n");
      out.write("              <div class=\"app-notification__content\">\r\n");
      out.write("                <li><a class=\"app-notification__item\" href=\"javascript:;\"><span class=\"app-notification__icon\"><span class=\"fa-stack fa-lg\"><i class=\"fa fa-circle fa-stack-2x text-primary\"></i><i class=\"fa fa-envelope fa-stack-1x fa-inverse\"></i></span></span>\r\n");
      out.write("                    <div>\r\n");
      out.write("                      <p class=\"app-notification__message\">Lisa sent you a mail</p>\r\n");
      out.write("                      <p class=\"app-notification__meta\">2 min ago</p>\r\n");
      out.write("                    </div></a></li>\r\n");
      out.write("                <li><a class=\"app-notification__item\" href=\"javascript:;\"><span class=\"app-notification__icon\"><span class=\"fa-stack fa-lg\"><i class=\"fa fa-circle fa-stack-2x text-danger\"></i><i class=\"fa fa-hdd-o fa-stack-1x fa-inverse\"></i></span></span>\r\n");
      out.write("                    <div>\r\n");
      out.write("                      <p class=\"app-notification__message\">Mail server not working</p>\r\n");
      out.write("                      <p class=\"app-notification__meta\">5 min ago</p>\r\n");
      out.write("                    </div></a></li>\r\n");
      out.write("                <li><a class=\"app-notification__item\" href=\"javascript:;\"><span class=\"app-notification__icon\"><span class=\"fa-stack fa-lg\"><i class=\"fa fa-circle fa-stack-2x text-success\"></i><i class=\"fa fa-money fa-stack-1x fa-inverse\"></i></span></span>\r\n");
      out.write("                    <div>\r\n");
      out.write("                      <p class=\"app-notification__message\">Transaction complete</p>\r\n");
      out.write("                      <p class=\"app-notification__meta\">2 days ago</p>\r\n");
      out.write("                    </div></a></li>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <li class=\"app-notification__footer\"><a href=\"#\">See all notifications.</a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </li>\r\n");
      out.write("        <!-- User Menu-->\r\n");
      out.write("        <li class=\"dropdown\"><a class=\"app-nav__item\" href=\"#\" data-toggle=\"dropdown\" aria-label=\"Open Profile Menu\"><i class=\"fa fa-user fa-lg\"></i></a>\r\n");
      out.write("          <ul class=\"dropdown-menu settings-menu dropdown-menu-right\">\r\n");
      out.write("            <li><a class=\"dropdown-item\" href=\"page-user.html\"><i class=\"fa fa-cog fa-lg\"></i> Settings</a></li>\r\n");
      out.write("            <li><a class=\"dropdown-item\" href=\"sys/personalData\"><i class=\"fa fa-user fa-lg\"></i> Profile</a></li>\r\n");
      out.write("            <li><a class=\"dropdown-item\" href=\"page-login.html\"><i class=\"fa fa-sign-out fa-lg\"></i> Logout</a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </li>\r\n");
      out.write("      </ul>\r\n");
      out.write("      \r\n");
      out.write("    </header>\r\n");
      out.write("\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write(" <!-- Sidebar menu-->\r\n");
      out.write("    <div class=\"app-sidebar__overlay\" data-toggle=\"sidebar\"></div>\r\n");
      out.write("    <aside class=\"app-sidebar\">\r\n");
      out.write("      <div class=\"app-sidebar__user\">\r\n");
      out.write("        <div>\r\n");
      out.write("          <p class=\"app-sidebar__user-name\">John Doe</p>\r\n");
      out.write("          <p class=\"app-sidebar__user-designation\">Frontend Developer</p>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <ul class=\"app-menu\" id=\"show\">\r\n");
      out.write("        \r\n");
      out.write("      </ul>\r\n");
      out.write("       <script>\r\n");
      out.write("    $(function(){\r\n");
      out.write("\t     $.ajax({\r\n");
      out.write("\t\t\turl: '");
      out.print(basePath);
      out.write("yun/left/getLeftMenus',\r\n");
      out.write("\t \t\tdata:{},\r\n");
      out.write("\t\t\ttype: 'get',\r\n");
      out.write("\t\t\tdataType: 'json',\r\n");
      out.write("\t\t\tsuccess: function(jsonDataResult) {\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tvar curPathName = window.location.pathname;\r\n");
      out.write("\t\t\t\tvar item=\"\";\r\n");
      out.write("\t\t\t\tvar curIsExpandIdx = 0;\r\n");
      out.write("\t\t\t\tjsonDataResult.forEach(function(curObj,index){\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\titem += \" <li class='treeview'><a class='app-menu__item' href='#' data-toggle='treeview'><i class='app-menu__icon fa \"+curObj.menuIcon+\"'></i><span class='app-menu__label'>\"+curObj.menuName+\"</span><i class='treeview-indicator fa fa-angle-right'></i></a>\";\r\n");
      out.write("\t\t\t\t\titem +=\"<ul class='treeview-menu' >\";\r\n");
      out.write("\t\t\t\t\tif(curObj.children&& curObj.children.length>0){\r\n");
      out.write("\t\t\t\t\t\t(function(argIdx){\r\n");
      out.write("\t\t\t\t\t\t\tcurObj.children.forEach(function(innerObj,innerIdx){\r\n");
      out.write("\t\t\t\t\t\t\t\tif(innerObj.menuUrl&&innerObj.menuUrl!=\"\" && (curPathName.toString().indexOf(innerObj.menuUrl.toString())!=-1)){\r\n");
      out.write("\t\t\t\t\t\t\t\t\tcurIsExpandIdx=argIdx;\r\n");
      out.write("\t\t\t\t\t\t\t\t\titem += \"<li><a class='treeview-item active' href='");
      out.print(basePath);
      out.write("\"+innerObj.menuUrl+\"'><i class='icon fa \"+innerObj.menuIcon+\"'></i> \"+innerObj.menuName+\"</a></li>\";\r\n");
      out.write("\t\t\t\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\t\t\t\titem += \"<li><a class='treeview-item' href='");
      out.print(basePath);
      out.write("\"+innerObj.menuUrl+\"'><i class='icon fa \"+innerObj.menuIcon+\"'></i> \"+innerObj.menuName+\"</a></li>\";\r\n");
      out.write("\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t})\r\n");
      out.write("\t\t\t\t\t\t})(index)\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\titem +=\" </ul>\";\r\n");
      out.write("\t\t\t\t\titem +=\"</li>\"\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t\t$('#show').append(item);\r\n");
      out.write("\t\t\t\t \r\n");
      out.write("\t\t\t\tconsole.log(curIsExpandIdx);\r\n");
      out.write("\t\t\t\t$(\"#show >li\").eq(curIsExpandIdx).addClass(\"is-expanded\");\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t$(document).on('click', '#show>li', function(){\r\n");
      out.write("\t\t\t\t\tif($(this).hasClass('is-expanded')){\r\n");
      out.write("\t\t\t\t\t\t$(this).removeClass(\"is-expanded\");\r\n");
      out.write("\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\t$(this).addClass(\"is-expanded\");\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t})\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\t   error: function(XMLHttpRequest, textStatus, errorThrown) {\r\n");
      out.write("\t\t\t\t   alert(XMLHttpRequest.status);\r\n");
      out.write("\t\t\t\t   alert(XMLHttpRequest.readyState);\r\n");
      out.write("\t\t\t\t   alert(textStatus);\r\n");
      out.write("\t\t\t\t     }\r\n");
      out.write("\t\t})\r\n");
      out.write("    \t\r\n");
      out.write("    })\r\n");
      out.write("</script> \r\n");
      out.write("    </aside>\r\n");
      out.write("   \r\n");
      out.write("   ");
      out.write(" \r\n");
      out.write("     \r\n");
      out.write("    <main class=\"app-content\">\r\n");
      out.write("      <div class=\"app-title\">\r\n");
      out.write("        <div>\r\n");
      out.write("          <h1><i class=\"fa fa-th-list\"></i>导航菜单管理</h1>\r\n");
      out.write("          <p>通用云平台的列表展示</p>\r\n");
      out.write("        </div>\r\n");
      out.write("        <ul class=\"app-breadcrumb breadcrumb side\">\r\n");
      out.write("          <li class=\"breadcrumb-item\"><i class=\"fa fa-home fa-lg\"></i></li>\r\n");
      out.write("          <li class=\"breadcrumb-item\">Tables</li>\r\n");
      out.write("          <li class=\"breadcrumb-item active\"><a href=\"#\">Bootstrap Table TreeGrid</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("    <div class=\"row-fluid\">\r\n");
      out.write("    <div class=\"pull-right\">\r\n");
      out.write("       \r\n");
      out.write("    </div>\r\n");
      out.write("       <div class=\"row\">\r\n");
      out.write("        <form id=\"queryForm\" action=\"");
      out.print(path);
      out.write("/yun/role/showRolesList\" method=\"post\">\r\n");
      out.write("            <div  style=\"display: inline-block;margin:13px;\">\r\n");
      out.write("                <input type=\"text\" id=\"keyword\" name=\"keyword\" class=\"form-control input-sm\"\r\n");
      out.write("                    placeholder=\"请输入要检索的内容\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <button type=\"button\" class=\"btn btn-primary btn-sm\" id=\"query\">\r\n");
      out.write("             <i class=\"fa fa-search\"></i> 检索\r\n");
      out.write("            </button>\r\n");
      out.write("        </form>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    <div class=\"row\" id=\"list\"> \r\n");
      out.write("      \r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("        <div class=\"col-md-12\">\r\n");
      out.write("          <div class=\"tile\">\r\n");
      out.write("            <div class=\"tile-body\">\r\n");
      out.write("            \r\n");
      out.write("\t\t<table id=\"mytab\" class=\"table table-hover\" data-toggle=\"table\" data-pagination=\"true\" data-search=\"true\" data-advanced-search=\"true\" data-id-table=\"advancedTable\" ></table>\r\n");
      out.write("\t\t  \t<div id=\"toolbar\" class=\"btn-group pull-right\" style=\"margin-right: 20px;\">\r\n");
      out.write("\t            <button id=\"btn-edit\" type=\"button\" class=\"btn btn-primary btn-sm\" style=\"display: none; border-radius: 0\">\r\n");
      out.write("\t                <span class=\"glyphicon glyphicon-pencil\" aria-hidden=\"true\" ></span>修改\r\n");
      out.write("\t            </button>\r\n");
      out.write("\t            <button id=\"btn-delete\" type=\"button\" class=\"btn btn-primary btn-sm\" style=\"display: none;\">\r\n");
      out.write("\t                <span class=\"glyphicon glyphicon-remove\" aria-hidden=\"true\"></span>删除\r\n");
      out.write("\t            </button>\r\n");
      out.write("\t            <button id=\"btn-add\" type=\"button\" class=\"btn btn-primary btn-sm\">\r\n");
      out.write("\t                <span class=\"glyphicon glyphicon-plus\" aria-hidden=\"true\"></span>新增\r\n");
      out.write("\t            </button>\r\n");
      out.write("        \t</div>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("\t\t<div class=\"popup_de xycenter\">\r\n");
      out.write("\t\t\t<div class=\"popup_box\">\r\n");
      out.write("\t\t\t\t<span class=\"popup_close\" value=\"关闭\">×</span>\r\n");
      out.write("\t\t\t    <span class=\"show_msg\">确定要删除该权限吗？</span>\r\n");
      out.write("\t\t\t    <div class=\"btn_box\">\r\n");
      out.write("\t\t\t\t    <div class=\"popup_btn btn_submit\" value=\"确定\">确定</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"popup_btn btn_cancel\" value=\"取消\">取消</div>\r\n");
      out.write("\t\t\t    </div>\r\n");
      out.write("\t\t\t</div>\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t         </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </main>\r\n");
      out.write("\t</body>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- Main CSS-->\r\n");
      out.write("\t  <link rel=\"stylesheet\" href=\"");
      out.print(basePath);
      out.write("static/bootstrap/bootstrap-3.3.7-dist/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\t  <link href=\"");
      out.print(basePath);
      out.write("static/bootstrap/bootstrap-table/bootstrap-table.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\t  <link href=\"");
      out.print(basePath);
      out.write("static/bootstrap/font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\t  <link href=\"");
      out.print(basePath);
      out.write("static/css/nav.css\" rel=\"stylesheet\">\r\n");
      out.write("\t  <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(basePath);
      out.write("/static/main/css/main.css\">\r\n");
      out.write("    <!-- Font-icon css-->\r\n");
      out.write("     <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(basePath);
      out.write("static/css/jquery.treegrid.css\">\r\n");
      out.write("     \r\n");
      out.write("     \r\n");
      out.write("     \r\n");
      out.write("\t \r\n");
      out.write("    <script src=\"");
      out.print(basePath);
      out.write("static/main/js/jquery-3.2.1.min.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.print(basePath);
      out.write("static/bootstrap/bootstrap-3.3.7-dist/js/bootstrap.min.js\"></script> \r\n");
      out.write("    <script src=\"");
      out.print(basePath);
      out.write("static/js/jquery.cookie.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.print(basePath);
      out.write("static/bootstrap/bootstrap-table/bootstrap-table.min.js\"></script>  \r\n");
      out.write("    <script src=\"");
      out.print(basePath);
      out.write("static/bootstrap/bootstrap-table/locale/bootstrap-table-zh-CN.min.js\"></script> \r\n");
      out.write("    <script src=\"");
      out.print(basePath);
      out.write("static/bootstrap/bootstrap-table/extensions/export/bootstrap-table-export.min.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.print(basePath);
      out.write("static/bootstrap/bootstrap-table/extensions/export/tableExport.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.print(basePath);
      out.write("static/js/setBootstrapTableTreeGrid.js\"></script>  \r\n");
      out.write("    \r\n");
      out.write("    <script src=\"");
      out.print(basePath);
      out.write("static/bootstrap/bootstrap-table/extensions/treegrid/bootstrap-table-treegrid.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <script src=\"");
      out.print(basePath);
      out.write("static/bootstrap/jquery.treegrid/jquery.treegrid.min.js\"></script>\r\n");
      out.write("   ");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("   \r\n");
      out.write("<script>\r\n");
      out.write("     $(function(){\r\n");
      out.write("    // 初始化为false\r\n");
      out.write("    document.getElementById(\"allChecked\").checked = false;\r\n");
      out.write("    //全选\r\n");
      out.write("    $(\"#allChecked\").click(function(){\r\n");
      out.write("        if (this.checked) {\r\n");
      out.write("            $(\"#list :checkbox\").prop(\"checked\",true); \r\n");
      out.write("        }else{\r\n");
      out.write("            $(\"#list :checkbox\").prop(\"checked\",false);\r\n");
      out.write("        }\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    $(\"#selectAll\").click(function(){\r\n");
      out.write("        $(\"#list :checkbox,#all\").prop(\"checked\",true);\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    $(\"#unSelect\").click(function(){\r\n");
      out.write("        $(\"#list :checkbox,#all\").prop(\"checked\",false);\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    $(\"#reverse\").click(function(){\r\n");
      out.write("        $(\"#list :checkbox\").each(function(){\r\n");
      out.write("            $(this).prop(\"checked\",!$(this).prop(\"checked\"));\r\n");
      out.write("        });\r\n");
      out.write("        allCheck();\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    $(document).on('click','#list :checkbox', function(){ \r\n");
      out.write("        allCheck(); \r\n");
      out.write("    });\r\n");
      out.write("    //设置全选复选框 \r\n");
      out.write("    /* $(\"#list :checkbox\").click(function(){ \r\n");
      out.write("        allCheck(); \r\n");
      out.write("    });  */\r\n");
      out.write("\r\n");
      out.write("    $(\"#delByIds\").click(function(){\r\n");
      out.write("    \t\r\n");
      out.write("    \tswal({\r\n");
      out.write("      \t\ttitle: \"Are you sure?\",\r\n");
      out.write("      \t\ttext: \"You will not be able to recover this imaginary file!\",\r\n");
      out.write("      \t\ttype: \"warning\",\r\n");
      out.write("      \t\tshowCancelButton: true,\r\n");
      out.write("      \t\tconfirmButtonText: \"Yes, delete it!\",\r\n");
      out.write("      \t\tcancelButtonText: \"No, cancel plx!\",\r\n");
      out.write("      \t\tcloseOnConfirm: false,\r\n");
      out.write("      \t\tcloseOnCancel: false\r\n");
      out.write("      \t}, function(isConfirm) {\r\n");
      out.write("      \t\tif (isConfirm) {\r\n");
      out.write("      \t\t\t\r\n");
      out.write("      \t\t\tvar roles=\"\";\r\n");
      out.write("      \t        var valArr = new Array;\r\n");
      out.write("      \t        $(\"#list input[name='mId']\").each(function(i){\r\n");
      out.write("      \t            if($(this).prop(\"checked\")){\r\n");
      out.write("      \t                valArr[i]=$(this).val();\r\n");
      out.write("      \t                roles+=$(this).val()+\",\";\r\n");
      out.write("      \t            }\r\n");
      out.write("      \t        });\r\n");
      out.write("      \t        var vals = valArr.join(',');\r\n");
      out.write("      \t       \r\n");
      out.write("      \t        $.ajax({\r\n");
      out.write("      \t           \turl:\"delRolesByIds/\"+roles,\r\n");
      out.write("      \t               async:true,\r\n");
      out.write("      \t               type:\"GET\",\r\n");
      out.write("      \t               dataType:\"json\",\r\n");
      out.write("      \t               data:{ },\r\n");
      out.write("      \t               cache:false,    //不允许缓存\r\n");
      out.write("      \t               success: function(data){\r\n");
      out.write("      \t                   var obj = eval(data);\r\n");
      out.write("      \t                   if(obj.code==1)\r\n");
      out.write("      \t                   {   \r\n");
      out.write("      \t                \t   /* alert(\"删除已选成功！\"); */\r\n");
      out.write("      \t                \t   swal(\"Deleted!\", \"删除成功\", \"success\");\r\n");
      out.write("      \t                       window.location.reload();\r\n");
      out.write("      \t                   }\r\n");
      out.write("      \t                   else\r\n");
      out.write("      \t                   {\r\n");
      out.write("      \t                       /* alert(\"删除失败\"); */\r\n");
      out.write("      \t                \t swal(\"Cancelled\", \"你取消了操作\", \"error\");\r\n");
      out.write("      \t                   }\r\n");
      out.write("\r\n");
      out.write("      \t               }\r\n");
      out.write("      \t    \t   });\r\n");
      out.write("      \t\t} else {\r\n");
      out.write("      \t\t\tswal(\"Cancelled\", \"你取消了操作 :)\", \"error\");\r\n");
      out.write("      \t\t}\r\n");
      out.write("      \t});\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \t\r\n");
      out.write("        //alert(vals);\r\n");
      out.write("        \r\n");
      out.write("    })\r\n");
      out.write("\r\n");
      out.write("    function allCheck(){\r\n");
      out.write("        var count = $(\"#list :checkbox\").length;\r\n");
      out.write("        var cut = 0;\r\n");
      out.write("        $(\"#list :checkbox\").each(function(){\r\n");
      out.write("            if ($(this).prop(\"checked\") == true) {\r\n");
      out.write("                cut++;\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("        /* alert(\"cut=\"+cut);\r\n");
      out.write("        alert(\"count\"+count); */\r\n");
      out.write("        if (cut <= count) {\r\n");
      out.write("        \tdocument.getElementById(\"allChecked\").checked = false;\r\n");
      out.write("            //$(\"#allChecked\").prop(\"checked\",true);\r\n");
      out.write("        }else{\r\n");
      out.write("        \tdocument.getElementById(\"allChecked\").checked = true;\r\n");
      out.write("            //$(\"#allChecked\").prop(\"checked\",false);\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("})\r\n");
      out.write("    \r\n");
      out.write("</script>\r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write("    <script>\r\n");
      out.write("       function del(id) {\r\n");
      out.write("    \t  \r\n");
      out.write("    \t   $.ajax({\r\n");
      out.write("           \turl:\"delRoleById/\"+id,\r\n");
      out.write("               async:true,\r\n");
      out.write("               type:\"GET\",\r\n");
      out.write("               dataType:\"json\",\r\n");
      out.write("               cache:false,    //不允许缓存\r\n");
      out.write("               success: function(data){\r\n");
      out.write("                   var obj = eval(data);\r\n");
      out.write("                   if(obj.code==1)\r\n");
      out.write("                   {   alert(\"删除成功！\");\r\n");
      out.write("                       window.location.reload();\r\n");
      out.write("                   }\r\n");
      out.write("                   else\r\n");
      out.write("                   {\r\n");
      out.write("                       alert(\"删除失败\");\r\n");
      out.write("                   }\r\n");
      out.write("\r\n");
      out.write("               }\r\n");
      out.write("    \t   });\r\n");
      out.write("       }\r\n");
      out.write("    </script> \r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("       $(\"#btn-add\").click(function(){\r\n");
      out.write("    \t//清空cookie \r\n");
      out.write("    \t// $.cookie('rolestoUpdate', '', { expires: -1 }); \r\n");
      out.write("    \t//$.removeCookie('rolestoUpdate');\r\n");
      out.write("    \t$.cookie('navDoType', \"add\");\r\n");
      out.write("      window.location.href=\"saveOrUp\";\r\n");
      out.write("                    \r\n");
      out.write("    })\r\n");
      out.write("    \r\n");
      out.write("   \r\n");
      out.write("       $(\"#btn-edit\").click(function(){\r\n");
      out.write("    \t   \r\n");
      out.write("    \t//获取选中的Id\r\n");
      out.write("    \t\r\n");
      out.write("    \t        var ids=\"\";\r\n");
      out.write("      \t        var valArr = new Array;\r\n");
      out.write("      \t        $(\"#list input[name='btSelectItem']\").each(function(i){\r\n");
      out.write("      \t            if($(this).prop(\"checked\")){\r\n");
      out.write("      \t                valArr[i]=$(this).val();\r\n");
      out.write("      \t                ids+=$(this).val()+\",\";\r\n");
      out.write("      \t            }\r\n");
      out.write("      \t        });\r\n");
      out.write("    \t    \r\n");
      out.write("    \t$.cookie('navDoType', ids+\"\");\r\n");
      out.write("    \t\r\n");
      out.write("      window.location.href=\"saveOrUp\";\r\n");
      out.write("                    \r\n");
      out.write("    })\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("   \r\n");
      out.write("     // 跳转到更新页面\r\n");
      out.write("      function toUpdate(roles){ \r\n");
      out.write("    \t   \r\n");
      out.write("    \t   var json= JSON.stringify(roles);  \r\n");
      out.write("    \t   $.cookie('navDoType', json);\r\n");
      out.write("            window.location.href=\"saveOrUp\";  \r\n");
      out.write("                    \r\n");
      out.write("       }\r\n");
      out.write("    \r\n");
      out.write("    </script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.print(basePath);
      out.write("static/main/js/plugins/sweetalert.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("      $('#demoNotify').click(function(){\r\n");
      out.write("      \t$.notify({\r\n");
      out.write("      \t\ttitle: \"Update Complete : \",\r\n");
      out.write("      \t\tmessage: \"Something cool is just updated!\",\r\n");
      out.write("      \t\ticon: 'fa fa-check' \r\n");
      out.write("      \t},{\r\n");
      out.write("      \t\ttype: \"info\"\r\n");
      out.write("      \t});\r\n");
      out.write("      });\r\n");
      out.write("      $('#demoSwal').click(function(){\r\n");
      out.write("      \tswal({\r\n");
      out.write("      \t\ttitle: \"Are you sure?\",\r\n");
      out.write("      \t\ttext: \"You will not be able to recover this imaginary file!\",\r\n");
      out.write("      \t\ttype: \"warning\",\r\n");
      out.write("      \t\tshowCancelButton: true,\r\n");
      out.write("      \t\tconfirmButtonText: \"Yes, delete it!\",\r\n");
      out.write("      \t\tcancelButtonText: \"No, cancel plx!\",\r\n");
      out.write("      \t\tcloseOnConfirm: false,\r\n");
      out.write("      \t\tcloseOnCancel: false\r\n");
      out.write("      \t}, function(isConfirm) {\r\n");
      out.write("      \t\tif (isConfirm) {\r\n");
      out.write("      \t\t\tswal(\"Deleted!\", \"Your imaginary file has been deleted.\", \"success\");\r\n");
      out.write("      \t\t} else {\r\n");
      out.write("      \t\t\tswal(\"Cancelled\", \"Your imaginary file is safe :)\", \"error\");\r\n");
      out.write("      \t\t}\r\n");
      out.write("      \t});\r\n");
      out.write("      });\r\n");
      out.write("    </script>\r\n");
      out.write("</html>\r\n");
      out.write("      ");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}