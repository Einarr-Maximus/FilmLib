package by.home.filmlib.service.impl;

import by.home.filmlib.bean.User;
import by.home.filmlib.dao.UserDAO;
import by.home.filmlib.dao.exception.DAOException;
import by.home.filmlib.dao.factory.DAOFactory;
import by.home.filmlib.service.ClientService;
import by.home.filmlib.service.exception.ServiceException;

public class ClientServiceImpl implements ClientService {
	
	@Override
	public void signIn(String login, char[] password) throws ServiceException {
		// проверяем параметры
		if(login == null || login.isEmpty()) {
			throw new ServiceException("Incorrected login");
		}
		
		// функционал логинации
		try {
			DAOFactory daoObjectFactory = DAOFactory.getInstance();
			UserDAO userDAO = daoObjectFactory.getUserDAO();
			userDAO.signIn(login, password);
		} catch(DAOException e) {
			throw new ServiceException(e);
		}
	}
	
	@Override
	public void signOut(String login) throws ServiceException {
		
	}
	
	@Override
	public void registration(User user) throws ServiceException {
		
	}
	

}
