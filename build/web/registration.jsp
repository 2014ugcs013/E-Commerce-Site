<%-- 
    Document   : registration
    Created on : 1 Jul, 2017, 1:51:20 PM
    Author     : AlokKumar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  uri="/struts-tags" prefix="html" %>
<!DOCTYPE html>
<html>
<head>
	<title>shopping</title>
	<style type="text/css">
	
		
		body {
			background: rgba(80,80,80,0.8);
		}
		
		.submit:hover,.submit_log:hover {
    		background-color: #45a049;
		}
                .regDiv
		{
			width: 500px;
			height: 500px;
			color: #ff000f;
			font-family: Corbel;
			margin:64px;
			text-align: center;
                        align-content: center;
			background: rgba(80,80,80,0);
			border-radius: 8px;
			box-shadow: 0 2px 20px 0 rgba(0, 0, 0, 0.2);
		}
                .inputfield
		{
			width: 80%;
			padding: 12px 20px;
			margin: 8px 0px;
			display:  inline-block;
			border: 1px solid #ccc;
			border-radius: 4px;
			box-sizing: border-box;
		}
		.submit
		{
			width: 79%;
			background-color: #4caf50;
			color: white;
			padding: 14px 20px;
			margin: 8px 48px;
			border:  none;
			border-radius: 4px;
			cursor: pointer;
		}
	
	</style>
</head>
<body>
<center>
                <div class="regDiv">
        <p style="font-family:Bradley Hand ITC; color: #831919; font-size: 250%; margin-bottom:24px;">Register</p>
                    <html:form action="reg" cssStyle="width:100%; align-content:center;">
				<html:textfield name="username" placeholder="username" cssClass="inputfield"  />
                                <html:textfield name="name" placeholder="name"  cssClass="inputfield"/>
                                <html:textfield name="password" placeholder="password"  cssClass="inputfield"/>
                                <html:textfield name="email" placeholder="email" cssClass="inputfield"/>
                                <html:textarea name="address"  placeholder="address" cssClass="inputfield"/>
                                <html:submit value="register" cssClass="submit"/>
		</html:form>
		</div>
    </center>
</body>
</html>

