<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />
<b>This is Greeting Page to <%=renderRequest.getParameter("name") %> from MVC</b>