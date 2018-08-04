package com.validator;

import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.JavaConstants;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;

import com.validator.RegistrationBean;

/**
 * Portlet implementation class ValidatorPortlet
 */
public class ValidatorPortlet extends MVCPortlet {

	public void registerMethod(ActionRequest actionRequest, ActionResponse actionResponse) {
			String name = ParamUtil.getString(actionRequest, "name");
			String surname = ParamUtil.getString(actionRequest, "surname");
			String phone = ParamUtil.getString(actionRequest, "phone");
			String email = ParamUtil.getString(actionRequest, "email");
			System.out.println(name + surname+ phone+ email);
			
			RegistrationBean user = new RegistrationBean(name, surname, phone, email);
			
			if(user.validate(user, actionRequest)) {
				System.out.println("Registered");
				
			}
			else {
				System.out.println("Failed");
				//Disables the "Your request failed" message.
				PortletConfig portletConfig = (PortletConfig)actionRequest.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
				SessionMessages.add(actionRequest,  portletConfig.getPortletName() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
			}
		
	}
 

}
