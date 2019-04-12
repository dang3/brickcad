package bc.commands;

import bc.Brick;
import mvc.Command;

public class SetLength extends Command {
	private double newLength;
	
	public SetLength(double newLength) {
		this.newLength = newLength;
	}

	@Override
	public void execute() {
		if(model instanceof Brick) {
			Brick brick = (Brick)model;
			brick.setLength(newLength);
		}
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
	}
}
