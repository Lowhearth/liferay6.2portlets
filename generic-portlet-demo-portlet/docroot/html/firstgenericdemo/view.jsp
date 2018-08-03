<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />


<portlet:actionURL var="myaction" name="MyActionMethod">
</portlet:actionURL>


<portlet:renderURL var="myRenderURL">
	<portlet:param name="redirect" value="greeting"/>
</portlet:renderURL>


<form action="${myaction}" method="POST">
	
	Name: 	<input type="text" name ="name"/> <br>
	Surname:<input type="text" name="surname"/> <br>
	<input type="submit" value = "SUBMIT">
	
</form>
<a href="${myRenderURL}">Click for Greetings</a>
