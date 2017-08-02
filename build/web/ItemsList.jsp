<%-- 
    Document   : ItemsList
    Created on : 4 Jul, 2017, 6:36:46 PM
    Author     : AlokKumar
--%>

<%@page import="java.util.List"%>
<%@page import="Dao.GetItems"%>
<%@page import="bean.Item"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  uri="/struts-tags" prefix="ht" %>
<%
    
    String username = (String)session.getAttribute("username");
    GetItems rs = new GetItems();
    List<Item> list = rs.getItems();
    int siz = list.size();
    %>
    
<!DOCTYPE html>
<html>
<head>
<title>shopping items</title>
<style>
    body
    {
        font-size: 14px;
        background-color: #f3f3f3;
        color: #212121;
        line-height: 1.4;
        padding:48px;
        font-family: arial,sans-serif;
    }
    div.ItemList,div.item
    {
        font-family: arial,sans-serif;
    }
    div#title
    {
        width: 70%;
        height: 32px;
        background-color: #ffffff;
        box-shadow: 2px 2px 4px 0 rgba(0,0,0,0.3);
        border: 1px solid white;
        float: left;
    }
    div#user
    {
        width: 10%;
        height: fit-content;
        float: right;
    }
    divb2 > p
    {
        width: 120px;
        height: 120px;
        background-color: #ffffff;
        box-shadow: 2px 2px 4px 0 rgba(0,0,0,0.3);
        border: 1px solid white;
        border-radius: 16px;
    }
    div#username
    {
        width: auto;
        height: 24px;
        background-color: #ffffff;
        box-shadow: 2px 2px 4px 0 rgba(0,0,0,0.3);
        border: 1px solid white;
        text-transform: capitalize;
        border-radius: 4px;
        
    }
    div.item
    {
        width: 49.9%;
        height: 180px;
        background-color: #ffffff;
        box-shadow: 2px 2px 4px 0 rgba(0,0,0,0.3);
        margin-top: 2px;
        margin-left: 1px;
        float:left;
    }
    div.imag
    {
        height: auto;
        width: 120px;
        padding: 8px;
        align-content: center;
        float: left;
    }
    div.description
    {
      width: auto;
      padding-left: 12px;
      height: inherit;
      float: left;
    }
    p#name
    {
        font-family:Consolas;
        font-size: 16px;
    }
    p#about,p#seller,p#price
    {
        font-family: Candara;
        font: 8px;
    }
    #submit1,.logout
    {
        height: 20px;
        width: 72px;
        border: none; 
        background-color: rgba(0,0,200,0.4); 
        color: white;
        padding-left:  4px;
        border-radius: 2px;
    }
    #submit2
    {
        height: 20px;
        width: 72px;
        border: none; 
        background-color: rgba(0,0,200,0.4); 
        color: white;
        margin-left: 8px;
        padding-left:  4px;
        border-radius: 2px; 
    }
    a
    {
        color: #764444;
        text-decoration: none; 
    }
    a:hover
    { 
        color: #b56f6f;
    }
</style>
</head>
    <body>
        <%! String id = null; %>
        <div class="container">
            <div class="menu" style="float:left; margin-right: 8px;">
                <jsp:include page="menu.jsp"/>
            </div>
            <div id="title">
                  <p style="font-family: Consolas; padding-left: 24px;">Shopping List</p>
            </div>
            <div id="user" >
                <center>
                <div id="userimg">
                    <img src="res\\user.png" style="width: 120px; height: 120px; padding: 2px;  border-radius: 8px"> 
                </div>
                <div id="username" style="
                                            font-family: Consolas; 
                                            font-size: 14px;
                                            padding-left: 2px;
                                            vertical-align: bottom;
                                            text-align: center;"
                                            > hello
                      <% out.println(username); %>!
                </div> 
                <div id="logout" style="margin:12px;align-content: center;">
                      <ht:form action="logout" >
                          <ht:submit  value="logout" cssClass="logout"/>
                      </ht:form>
                </div>
                </center>
            </div>
                <div class="ItemList" style="width:70%;float:left">
                    <%
                for(Item it : list)
                {
                    %>
                    <div class="item" >
                          <div class="imag">
                              <img src="<% out.println(it.getImgUrl()); %> " style="padding:8px; height: 160px;width: 120px;">
                          </div>
                      <div class="description">
                            <p id="name"><% out.println(it.getName()); %></p>
                            <p id="about"><% out.println(it.getAbout()); %></p>
                            <p id="seller"><% out.println(it.getSeller()); %></p>
                            <p id="price">price: ₹ <% out.println(it.getPrice()); %></p>
                          
                            <form action="add" style="float:left;">
                                <input type="hidden" name="id" value="<% out.println(it.getId()); %>"/>
                                <input type="submit" value="add to cart"  id="submit1"/>
                            </form>
                            <form action="product" style="float:left;">
                                <input type="hidden" name="id" value="<% out.println(it.getId()); %>"/>
                                <input type="submit" value="about" name="submit" id="submit2"/>
                            </form>
                      </div>
                    </div>
            <% }
        %></div>
        </div>
    </body>
</html>
