package by.home.filmlib.controller;

import java.util.HashMap;
import java.util.Map;

final class CommandProvider {
	
	private final Map<CommandName, Command> repository = new HashMap<>();
	
	CommandProvider() {
		repository.put(Command.SIGN_IN, new SignIn());
		repository.put(Command.REGISTRATION, new Register());
		repository.put(Command.ADD_FILM, new AddFilm());
		repository.put(Command.WRONG_REQUEST, new WrongRequest());		
	}
	
	Command getCommand(String name) {
		CommandName commandName = null;
		Command command = null;
		
		try {
			commandName = CommandName.valueOf(name.toUpperCase());
			command = repository.get(commandName);
		} catch (IllegalArgumentException | NullPointerException e) {
			//write log
			command = repository.get(CommandName.WRONG_REQUEST);
		}
		
		return command;
	}

}
