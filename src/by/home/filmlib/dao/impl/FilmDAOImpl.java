package by.home.filmlib.dao.impl;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import by.home.filmlib.bean.Film;
import by.home.filmlib.dao.FilmDAO;
import by.home.filmlib.dao.exception.DAOException;
import by.home.filmlib.dao.util.FileUtil;

public class FilmDAOImpl implements FilmDAO {
	private static final String FILE_PATH = "C:\\Users\\denis\\Desktop\\FilmCollection.txt";

	@Override
	public void addFilm(Film film) throws DAOException {
		List<String> stringFilms = FileUtil.readData(FILE_PATH);
		
		//move in other method
		String lastFilm = stringFilms.get(stringFilms.size() - 1);
		String[] filmParams = lastFilm.split(",");
		Integer lastFilmId = Integer.parseInt(filmParams[0]);
		Integer nextFilmId = ++lastFilmId;
		//------------
		film.setId(nextFilmId);
				
		
		String nextFilmString = film.toString();
		
		stringFilms.add(nextFilmString);
		
		FileUtil.writeDataInFile(stringFilms, FILE_PATH);
	}

	@Override
	public void deleteFilm(Integer idFilm) throws DAOException {
		List<String> stringFilms = FileUtil.readData(FILE_PATH);
		List<Film> films = new ArrayList<Film>();
		for(String str : stringFilms){
			
			String[] filmParams = str.split(",");
			Integer filmId = Integer.parseInt(filmParams[0]);
			Integer year = Integer.parseInt(filmParams[1]);
			Film film = new Film(filmId, year, filmParams[2]);
			
			films.add(film);
		}
		
		for (Film film : films) {
			if(idFilm.equals(film.getId())){
				films.remove(film);
				break;
			}
		}
		FileUtil.writeDataInFile(films, FILE_PATH);
		
		
		
		//method2
		List<String> stringFilms2 = FileUtil.readData(FILE_PATH);
		for(String str : stringFilms2){
			String[] filmParams = str.split(",");
			if(filmParams[0].equals(idFilm)){
				stringFilms2.remove(str); //???????????
				break;
			}
		}
		FileUtil.writeDataInFile(stringFilms2, FILE_PATH);
		
	}

	@Override
	public void delete(Film film) throws DAOException {

	}

}
