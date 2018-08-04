<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>

<portlet:defineObjects />


<portlet:actionURL var="myaction" name="MyActionMethod">
</portlet:actionURL>


<portlet:renderURL var="myRenderURL">
	<portlet:param name="mvcPath" value="/html/firstmvcdemo/greeting.jsp"/>
</portlet:renderURL>


<aui:form action="${myaction}" method="POST">
	
	<aui:input type="text" name ="name"/> 
	<aui:input type="text" name="surname" label="Surname"/> 
	<aui:input type="submit" value = "SUBMIT" name="submit" label=""></aui:input>
	
</aui:form>
<a href="${myRenderURL}">Click for Greetings</a>
