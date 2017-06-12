package by.home.filmlib.service;

import by.home.filmlib.bean.Film;
import by.home.filmlib.service.exception.ServiceException;

public interface LibraryService {
	void addNewFilm(Film film) throws ServiceException;
	void addEditedFilm(Film film) throws ServiceException;

}
