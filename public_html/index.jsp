<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<c:set var="title" value="Index Page - demoing the title" />
<c:import url="jsp/head.jsp" />
<body>
<div id="wrap">

	<c:import url="jsp/header.jsp" />

	

	<div id="content">
		<h2>Unit 2 <span class="post-span"></span></h2>

		<ul>
		    <li><a href="/java112/linkingDemo.html">Linking Demo</a></li>
		    <li><a href="/java112/simple">Trivial Servlet</a></li>
		    <li><a href="/java112/simple-text">Simple Text Servlet</a></li>
		    <li><a href="/java112/simple-html">Simple HTML Servlet</a></li>
		</ul>
		<p>
		<h2>Unit 3<span class="post-span"></span></h2>
		<ul>
			<li><a href="/java112/demo.jsp">Demo JSP</a></li>
			<li><a href="/java112/requestDemo">HttpRequest Demo</a></li>
			<li><a href="/java112/attributeDemoV1">Attribute Demo</a></li>
			<li><a href="/java112/forward-demo">Forwarding Demo</a></li>
			<li><a href="/java112/redirect-demo">Redirect Demo</a></li>
			<li><a href="/java112/mvc-demo">MVC Demo</a></li>
		</ul>
		<p>

    <h2>Unit 4<span class="post-span"></span></h2>



		<ul>
			<li><a href="/java112/jstlDemo">JSTL Demo</a></li>
			<li><a href="/java112/jstlIfDemo.jsp">JSTL If Demo</a></li>
			<li><a href="/java112/jstlScopeDemo.jsp">JSTL Scope Demo</a></li>
			<li><a href="/java112/project4-session-lab">Session Lab</a></li>
			<li><a href="/java112/getting-session-attribute">Get Session Attribute Demo</a></li>
			<li><a href="/java112/getting-setting-attribute">Get & Set Session Attribute Demo</a></li>
			<li><a href="/java112/URLRewritingServlet">URL Rewriting Demo</a></li>
			<li><a href="/java112/cookieServlet">Cookie Demo</a></li>
			<li><a href="/java112/hiddenFormField.jsp">Hidden Field Demo</a></li>
			<li><a href="/java112/requestParam.jsp">Form Demo</a></li>

		</ul>
		
	</div>

	<c:import url="jsp/footer.jsp" />
</div>
</body>
</html>