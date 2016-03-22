package com.telefonica.liferay.examen;

import java.io.IOException;
import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.User;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class PortletListaUsuarios
 */
public class PortletListaUsuarios extends MVCPortlet {
 
@Override
public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
		throws IOException, PortletException {
	try {
		List<User> users = UserLocalServiceUtil.getUsers(0, UserLocalServiceUtil.getUsersCount() - 1);
		renderRequest.setAttribute("users", users);
	  
		include(viewTemplate, renderRequest, renderResponse);
		
	} catch (SystemException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

    
	
	
}
}
