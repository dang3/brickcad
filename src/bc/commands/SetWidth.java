package bc.commands;

import bc.Brick;
import mvc.Command;
import mvc.Model;

public class SetWidth extends Command {
	private double newWidth;
	
	public SetWidth(double newWidth, Model m) {
		this.newWidth = newWidth;
		setModel(m);
		undoable = true;
	}

	@Override
	public void execute() {
		super.execute();
		if(model instanceof Brick) {
			Brick brick = (Brick)model;
			brick.setWidth(newWidth);
		}
	}

}
