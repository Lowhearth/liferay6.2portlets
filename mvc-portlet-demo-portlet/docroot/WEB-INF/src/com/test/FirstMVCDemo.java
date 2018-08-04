package com.test;

import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.ProcessAction;
/**
 * Portlet implementation class FirstMVCDemo
 */
public class FirstMVCDemo extends MVCPortlet {
	
	@ProcessAction(name="MyActionMethod")
		public void MyActionMethod(ActionRequest request, ActionResponse response) throws PortletException, IOException{
			String name = (String) request.getParameter("name");
			String surname = (String) request.getParameter("surname");
			System.out.println("The name is" + name+ surname);
			response.setRenderParameter("jspPage", "/html/firstmvcdemo/greeting.jsp");
			
	}

	
	

}
