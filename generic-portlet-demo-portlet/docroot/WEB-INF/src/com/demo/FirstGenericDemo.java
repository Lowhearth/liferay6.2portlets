package com.demo;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.GenericPortlet;
import javax.portlet.PortletException;
import javax.portlet.PortletRequestDispatcher;
import javax.portlet.ProcessAction;
import javax.portlet.RenderMode;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;

/**
 * Portlet implementation class FirstGenericDemo
 */
public class FirstGenericDemo extends GenericPortlet {

    public void init() {
        viewTemplate = getInitParameter("view-template");
    }
    
    @RenderMode(name="VIEW")
    public void myView( RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException {
    	 String redirect = ParamUtil.getString(renderRequest,"redirect");
    	 
    	 if(redirect.equalsIgnoreCase("greeting")) {
    		include("/html/firstgenericdemo/greeting.jsp", renderRequest, renderResponse);
    		
    	 }
    	
    	 else {
    		include(viewTemplate, renderRequest, renderResponse);
    	 }


    }
    
    /*
    @Override
    //This method is called every time that any <portlet:actionURL/> is triggered
    //if Override, this  will be the only method that process all the actions
    //this method is called as defined on the interface every time response is used.
    
    public void processAction(ActionRequest request, ActionResponse response ) throws IOException, PortletException {
    	String name = (String) request.getParameter("name");
    	String surname = (String) request.getParameter("surname");
    	System.out.println("Generic action the name is "+ name +" " + surname);
   
    }
    */
    
    @ProcessAction(name="MyActionMethod")	
    //This method is called when a <portlet:actionURL name="MyActionMethod"/> if processAction is not override
    public void MyActionMethod(ActionRequest request, ActionResponse response ) throws IOException, PortletException {
    	String name = (String) request.getParameter("name");
    	String surname = (String) request.getParameter("surname");
    	System.out.println("Especific Action the name is "+ name +" " + surname);
    	
    }
    
    

    protected void include(
            String path, RenderRequest renderRequest,
            RenderResponse renderResponse)
        throws IOException, PortletException {

        PortletRequestDispatcher portletRequestDispatcher =
            getPortletContext().getRequestDispatcher(path);

        if (portletRequestDispatcher == null) {
            _log.error(path + " is not a valid include");
        }
        else {
            portletRequestDispatcher.include(renderRequest, renderResponse);
        }
    }
 
    protected String viewTemplate;

    private static Log _log = LogFactoryUtil.getLog(FirstGenericDemo.class);

}
