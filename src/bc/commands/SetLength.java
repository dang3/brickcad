package bc.commands;

import bc.Brick;
import mvc.Command;
import mvc.Model;

public class SetLength extends Command {
	private double newLength;
	
	public SetLength(double newLength, Model m) {
		this.newLength = newLength;
		setModel(m);
		undoable = true;
	}

	@Override
	public void execute() {
		super.execute();
		if(model instanceof Brick) {
			Brick brick = (Brick)model;
			brick.setLength(newLength);
		}
	}
}
