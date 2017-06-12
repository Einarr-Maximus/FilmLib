package by.home.filmlib.service;

import by.home.filmlib.bean.Film;
import by.home.filmlib.service.exception.ServiceException;
import by.home.filmlib.service.factory.ServiceFactory;

public class App {
	
	private static LibraryService filmService = ServiceFactory.getInstance().getLibraryService();

	public static void main(String[] args) {
		//set film year
		String year = "2017";
		//input film title
		String title = "test1";
		Film film = new Film(Integer.parseInt(year), title);
		try {
			filmService.addNewFilm(film);
		} catch (ServiceException e) {
			e.printStackTrace();
		}

	}

}
