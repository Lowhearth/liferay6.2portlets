<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>



<portlet:defineObjects />
<portlet:actionURL var="registerAction" name="registerMethod" />
<liferay-ui:error key="firstname.errorMsg.missing" message="Enter a real name. " />

<aui:form action="${registerAction}" method="post" >
	<aui:input type="text" name="name" label="Name" />
	<aui:input type="text" name="surname" label="Surname" />
	<aui:input type="text" name ="email" label="E-mail" />
	<aui:input type="text" name="phone" label="Phone Number" />
	<aui:input type="submit" name="submit" value="Submit" label ="" />
</aui:form>


