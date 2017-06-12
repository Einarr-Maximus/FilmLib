package by.home.filmlib.controller;

public final class Controller {
	
	private final CommandProvider provider = new CommandProvider();
	
	private final char paramDelimeter = ' ';
	
	public String executeTask(String request) {
		String commandName;
		Command executionCommand;
		
		commandName = request.substring(0, request.indexOf(paramDelimeter));
		executionCommand = provider.getCommand(commandName);
		
		String responce;
		responce = executionCommand.execute(request);
		
		return responce;
	}

}
