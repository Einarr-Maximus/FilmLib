package by.home.filmlib.dao.impl;

import by.home.filmlib.bean.User;
import by.home.filmlib.dao.UserDAO;
import by.home.filmlib.dao.exception.DAOException;

public class UserDAOImpl implements UserDAO {
	
	@Override
	public void signIn(String login, char[] password) throws DAOException {
		// Проверка корректности логина и пароля
	}
	
	@Override
	public void registration(User user) throws DAOException {
		
	}

}
