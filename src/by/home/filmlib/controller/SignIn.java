package by.home.filmlib.controller;

import by.home.filmlib.service.ClientService;
import by.home.filmlib.service.exception.ServiceException;
import by.home.filmlib.service.factory.ServiceFactory;

public class SignIn implements Command {
	
	@Override
	public String execute(String request) {
		String login = null;
		char[] password = null;
		String responce = null;
		
		ServiceFactory serviveFactory = ServiceFactory.getInstance();
		ClientService clientService = ClientService.getClientService();
		try {
			clientService.signIn(login, password);
			responce = "Welcome";
		} catch(ServiceException e) {
			response = "Error duiring login procedure"; 
		}
		return responce;
		
	}

}
