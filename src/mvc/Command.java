package mvc;

public abstract class Command {
	private boolean undoable;
	protected Model model;
	public abstract void execute();
	public abstract void undo();
}
