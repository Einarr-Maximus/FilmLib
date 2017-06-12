package by.home.filmlib.dao.factory;

import by.home.filmlib.dao.FilmDAO;
import by.home.filmlib.dao.UserDAO;
import by.home.filmlib.dao.impl.FilmDAOImpl;
import by.home.filmlib.dao.impl.UserDAOImpl;

public final class DAOFactory {
	
	private static final DAOFactory instance = new DAOFactory();
	
	private final FilmDAO txtFilmImpl = new FilmDAOImpl();
	private final UserDAO txtUserImpl = new UserDAOImpl();
	
	private DAOFactory() {
		
	}
	
	public static DAOFactory getInstance() {
		return instance;
	}
	
	public FilmDAO getFilmDAO() {
		return txtFilmImpl;
	}
	
	public UserDAO getUserDAO() {
		return txtUserImpl;
	}
	

}
