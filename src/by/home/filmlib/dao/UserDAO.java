package by.home.filmlib.dao;

import by.home.filmlib.bean.User;
import by.home.filmlib.dao.exception.DAOException;

public interface UserDAO {
	void signIn(String login, char[] password) throws DAOException;
	void registration(User user) throws DAOException;

}
