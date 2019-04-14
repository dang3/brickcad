package mvc;

// Using singleton pattern, need only 1 command processor
public class CommandProcessor {
	private static CommandProcessor c = null;
	private Command lastCommand = null;
	
	private CommandProcessor() {}
	
	public static CommandProcessor makeCommandProcessor() {
		if(c == null) c = new CommandProcessor();
		return c;
	}
	

	public void execute(Command cmd) {
		lastCommand = cmd;
		cmd.execute();
	}
	
	public void undo() {
		if(lastCommand == null) displayRedoUndoError();
		else lastCommand.undo();
	}
	
	private void displayRedoUndoError() {
		Utilities.informUser("Please perform a command before undoing");
	}
	
	public void redo() {
		if(lastCommand == null) displayRedoUndoError();
		else lastCommand.execute();
	}
}
