<%-- 
    Document   : menu
    Created on : 5 Jul, 2017, 10:09:22 AM
    Author     : AlokKumar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="html" %>
<html>
        <head>
                <style type="text/css">
<!--
body {
        font-family: Verdana, Arial, Helvetica, sans-serif;
        margin: 0;
        font-size: 80%;
        font-weight: bold;
        background: #F3FAFF;
        }

ul {
        list-style: none;
        margin: 0;
        padding: 0;
        }

/* =-=-=-=-=-=-=-[Menu Nine]-=-=-=-=-=-=-=- */

#menu9 {
        width: 160px;
        margin-top: 10px;
        }

#menu9 li a {
          height: 32px;
          voice-family: "\"}\"";
          voice-family: inherit;
          height: 24px;
        text-decoration: none;
        }


#menu9 li a:link, #menu9 li a:visited {
        color: #E5E8D4;
        display: block;
        background: url(menu9.gif);
        padding: 8px 0 0 10px;
        }

#menu9 li a:hover, #menu9 li #current {
        color: #725033;
        background: url(menu9.gif) 0 -32px;
        padding: 8px 0 0 10px;
        }

#menu9 li a:active {
        color: #fff;
        background: url(menu9.gif) 0 -64px;
        padding: 8px 0 0 10px;
        }
-->
</style>
<script>
    function func(var type)
    {
    }
</script>
        </head>

        <body>
                <div id="menu9">
                        <ul>
                                <!-- CSS Tabs -->
                                
<li><a href="ItemsList.jsp">Home</a></li>
<li><a href="MyCart.jsp">MyCart</a></li>
<li><a href="sortbyprice.jsp" onclick="func('p')">Sort by Price</a></li>
<li><a href="sortbyname.jsp" onclick="func('n')">Sort by Name</a></li>
<li><a href="OrderList.jsp">Order</a></li>
<li><a href="News.html">News</a></li>
<li><a href="About.html">About</a></li>

                        </ul>
                </div>
        </body>
</html>