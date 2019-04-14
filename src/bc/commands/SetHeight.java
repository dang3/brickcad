package bc.commands;

import bc.Brick;
import bc.BrickMemento;
import mvc.Command;
import mvc.Model;

public class SetHeight extends Command {
	private double newHeight;
	
	public SetHeight(double newHeight, Model m) {
		this.newHeight = newHeight;
		setModel(m);
		undoable = true;
	}
	
	@Override
	public void execute() {
		super.execute();
		if(model instanceof Brick) {
			Brick brick = (Brick)model;
			brick.setHeight(newHeight);
		}
	}

}
