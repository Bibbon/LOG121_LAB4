package Controller;

import java.util.*;

public class CommandManager {

	private CommandManager instance = null;
	private List<ViewCommand> history = new ArrayList<ViewCommand>();
	
	private CommandManager(){

	}
	
	public CommandManager getInstance(){
		if(instance == null) {
			instance = new CommandManager();
		}
		return instance;
	}
	
	public void storeAndExecute (ViewCommand cmd){
		this.history.add(cmd);
		cmd.execute();
	}
	
	public ViewCommand getLastCommand (){
		return this.history.get(history.size() - 1);
	}
	
	public ViewCommand removeLastCommand (){
		return this.history.remove(history.size() - 1);
	}
}
