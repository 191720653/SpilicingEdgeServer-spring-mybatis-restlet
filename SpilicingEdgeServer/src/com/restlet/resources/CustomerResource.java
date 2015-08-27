package com.restlet.resources;

import org.restlet.data.MediaType;
import org.restlet.representation.Representation;
import org.restlet.representation.StringRepresentation;
import org.restlet.resource.ResourceException;
import org.restlet.resource.ServerResource;

import com.restlet.dao.ICustomerDao;
import com.restlet.entity.Users;

public class CustomerResource extends ServerResource {

	String customerId = "";

	private ICustomerDao customerDao;

	@Override
	protected void doInit() throws ResourceException {
		// TODO Auto-generated method stub
		super.doInit();
		customerId = (String) getRequestAttributes().get("customerId");
		System.out.println(customerId);
	}

	protected Representation get(Representation entity)
			throws ResourceException {
		// TODO Auto-generated method stub
		return post(entity);
	}

	protected Representation post(Representation entity)
			throws ResourceException {
		// TODO Auto-generated method stub
		System.out.println("coming here!");
		Users user = new Users();
		user.setName("555555555555");
		user.setPassword("55555555555");
		user.setAddress("555555555555");
		System.out.println(customerDao.getAllUser().size()
				+ "+++++++++++++++++");
		// String userMsg = customerDao.getCustomerId();
		Representation representation = new StringRepresentation(
				"welcome to server! + userMsg", MediaType.TEXT_PLAIN);
		System.out.println(customerId);
		return representation;
	}

	public void setCustomerDao(ICustomerDao customerDao) {
		this.customerDao = customerDao;
	}
}
