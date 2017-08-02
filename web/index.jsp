<%-- 
    Document   : index
    Created on : 1 Jul, 2017, 9:38:03 AM
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
		.loginDiv
                {
			width: 300px;
			height: 220px;
			color: #ff000f;
			font-family: Corbel;;
			margin-top: 232px;
			margin-left: 128px;
			float:left;
                        background: rgba(80,80,80,0);
			border-radius: 8px;
			box-shadow: 0 2px 20px 0 rgba(0, 0, 0, 0.2);
		}
		.submit:hover,.submit_log:hover {
    		background-color: #45a049;
		}
    .regDiv
		{
      float: right;
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
		.inputfield_pass,.inputfield_user
		{
			width: 90%;
			height: 48px;
			margin: 12px;
			padding: 12px 20px;
			border: 1px solid #ccc;
			border-radius: 4px;
			box-sizing: border-box;
		}

  .submit_log
		{
			width: 89%;
			height: 42px;
			background-color: #4caf50;
			color: white;
			padding: 12px 20px;
			margin-top: 8px;
			margin-left: 16px;
			border:  none;
			float:left;
			border-radius: 4px;
			cursor: pointer;
		}
	</style>
</head>
<body>
            <div class="loginDiv"  >
                <html:form action="login" cssStyle="width:100%; align-content:center;" >
				<html:textfield name="username" placeholder="username" cssClass="inputfield_user"  />
                                <html:textfield name="password" placeholder="password"  cssClass="inputfield_pass"/>
                                <html:submit value="login" cssClass="submit_log"/>
		</html:form>

		</div>
    <jsp:include page="registration.jsp"/>
</body>
</html>

