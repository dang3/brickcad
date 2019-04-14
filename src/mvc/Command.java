package mvc;

public abstract class Command {
	protected boolean undoable;
	protected Model model;
	protected Memento memento;
	
	protected void setModel(Model m) {
		model = m;
	}
	
	public void execute() {
		memento = model.makeMemento();
	}
	
	public void undo() {
		if(undoable) model.accept(memento);
		else Utilities.informUser("The last command cannot be undone");
	}
	
}
