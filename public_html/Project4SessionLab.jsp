<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<c:set var="title" value="Project 4 - Session Lab" />
<c:import url="jsp/head.jsp" />
<body>
<div id="wrap">

  <c:import url="jsp/header.jsp" />

  <div id="content">
    <h2>
      Project 4 - Session Lab
    </h2>
    <p>Session Count: ${project4SessionCounter}</p>
  </div>
      
  <c:import url="jsp/footer.jsp" />
      
      </div>
  </body>
</html>

