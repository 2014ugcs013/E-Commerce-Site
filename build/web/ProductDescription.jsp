<%-- 
    Document   : ProductDescription
    Created on : 5 Jul, 2017, 11:57:18 AM
    Author     : AlokKumar
--%>

<%@page import="bean.Item"%>
<%@page import="Dao.GetDescription"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@taglib uri="/struts-tags" prefix="html" %>
        <title>About</title>
        <style>
			div.about
			{
				
				margin-left:360px;
				margin-top: 48px;
			}
			div.title
			{
				width: 80%;
				height: 48px;
				background-color: #ffffff;
				box-shadow: 2px 2px 4px 0 rgba(0,0,0,0.3);
				border: 1px solid white;
				float: left;
				margin-bottom: 8px;
                                font-size:24px;
                                font-family: Consolas;
                                padding: 8px 0px 0px 4px;
			}
			div.app
			{
				width: 80%;
				height: auto;
				background-color: #ffffff;
				box-shadow: 2px 2px 4px 0 rgba(0,0,0,0.3);
				border: 1px solid white;
				float: left;
			}
			div.description
			{
				margin-top:24px;
				float:left;
				width:60%;
				padding-left:8px;
                                font-size:16px;
                                font-family: Consolas;
			}
			div#pic
			{
				height:360px;
				width:180px;
			}
		</style>
    </head>
    <body>
        <%  
            Integer id = Integer.parseInt((String)request.getParameter("id").trim());
            System.out.println("id : "+id);
            GetDescription gd = new GetDescription();
            Item it = gd.getItem(id);
            String name = it.getName();
            int price  = it.getPrice();
            System.out.println("Item Name : "+name);
            System.out.println("Item Price : "+price);
        %>
        <div class="about">
				<div class="title"><% out.println(it.getName());%></div>
				<div class="app">
                                    <div class="description"><jsp:include page="res/ac_2007.txt"/>
					</div>
					<div class="screenshot" style="float:right">
						<img id="pic" src="<% out.println(it.getImgUrl());%>" style="float: right;width: 280px;height: 360px;border: 1px solid rgba(80,80,80,0.1);padding: 8px;"/>
					</div>
				</div>
			</div>
<!--        public String imgUrl;
    public String name;
    public String seller;
    public int price;
    public String about;-->
    </body>
</html>
