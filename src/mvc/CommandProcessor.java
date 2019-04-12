package mvc;

// Using singleton pattern, need only 1 command processor
public class CommandProcessor {
	private static CommandProcessor c = null;
	
	private CommandProcessor() {}
	
	public static CommandProcessor makeCommandProcessor() {
		if(c == null) c = new CommandProcessor();
		return c;
	}
	

	public void execute(Command cmd) {
		
	}
	
	public void undo() {
		
	}
	
	public void redo() {
		
	}
}
