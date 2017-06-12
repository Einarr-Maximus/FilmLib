package by.home.filmlib.service.factory;

import by.home.filmlib.service.ClientService;
import by.home.filmlib.service.LibraryService;
import by.home.filmlib.service.impl.ClientServiceImpl;
import by.home.filmlib.service.impl.LibraryServiceImpl;

public final class ServiceFactory {
	
	private static final ServiceFactory instance = new ServiceFactory();
	
	private final ClientService clientService = new ClientServiceImpl();
	
	private final LibraryService libraryService = new LibraryServiceImpl();
	
	private ServiceFactory() {
		
	}
	
	public static ServiceFactory getInstance() {
		return instance;
	}
	
	public ClientService getClientService() {
		return clientService;
	}
	
	public LibraryService getLibraryService() {
		return libraryService;
	}

}
