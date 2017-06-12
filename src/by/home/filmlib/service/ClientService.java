package by.home.filmlib.service;

import by.home.filmlib.bean.User;
import by.home.filmlib.service.exception.ServiceException;

public interface ClientService {
	void signIn(String login, char[] password) throws ServiceException;
	void signOut(String login) throws ServiceException;
	void registration(User user) throws ServiceException;
	static ClientService getClientService() {
		// TODO Auto-generated method stub
		return null;
	}

}
