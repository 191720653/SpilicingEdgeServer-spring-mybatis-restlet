package com.restlet.test;

import org.restlet.data.Form;
import org.restlet.representation.Representation;
import org.restlet.resource.ClientResource;

/***
 * 
 * @author zehao
 * 
 */
public class Client {
	public static void main(String[] args) {
		Client client = new Client();
		client.student_post();
	}

	public void student_post() {
		try {
			Form queryForm = new Form();
			queryForm.add("name", "spring");
			queryForm.add("id", "12");
			queryForm.add("password", "asd");
			queryForm.add("address", "asd");
			ClientResource client = new ClientResource(
					"http://localhost:8080/SpilicingEdgeServer/resources/customers/99");
			Representation representation = client.post(queryForm
					.getWebRepresentation());
			System.out.println(representation.getText());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
