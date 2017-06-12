package by.home.filmlib.service.impl;

import by.home.filmlib.bean.Film;
import by.home.filmlib.dao.FilmDAO;
import by.home.filmlib.dao.exception.DAOException;
import by.home.filmlib.dao.factory.DAOFactory;
import by.home.filmlib.service.LibraryService;
import by.home.filmlib.service.exception.ServiceException;

public class LibraryServiceImpl implements LibraryService {
	
	private FilmDAO filmDao;
	
	
	
	public LibraryServiceImpl() {
		super();
		filmDao = DAOFactory.getInstance().getFilmDAO();
	}

	@Override
	public void addNewFilm (Film film) throws ServiceException {
		
		try {
			filmDao.addFilm(film);
		} catch (DAOException e) {
			throw new ServiceException(e);
		}
	}
	
	@Override
	public void addEditedFilm (Film film) throws ServiceException {
		
	}

}
