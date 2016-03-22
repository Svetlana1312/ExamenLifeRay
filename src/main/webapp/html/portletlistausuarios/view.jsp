<%@page import="com.liferay.portal.model.User"%>
<%@page import="java.util.List"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<portlet:defineObjects />



<h2>Tabla de Usuarios del Portal</h2>
<table class="yui3-datatable-table table">
 <header>
 <aui:row> 
   <aui:column>ID</aui:column>
   <aui:column>NOMBRE</aui:column>
</aui:row>
 </header>
<c:forEach items="${users}" var="user" >
 <aui:row> 
   <aui:column><c:out value="${user.userId}" /></aui:column>
   <aui:column><c:out value="${user.fullName}" /></aui:column>
  
 </aui:row>
</c:forEach>
  
</table>




