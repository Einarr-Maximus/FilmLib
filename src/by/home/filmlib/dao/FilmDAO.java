package by.home.filmlib.dao;

import by.home.filmlib.bean.Film;
import by.home.filmlib.dao.exception.DAOException;


public interface FilmDAO {
	void addFilm(Film film) throws DAOException;
	void deleteFilm(Integer idFilm) throws DAOException;
	void delete(Film film) throws DAOException;
	

}
