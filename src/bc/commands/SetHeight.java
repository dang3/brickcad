package bc.commands;

import bc.Brick;
import mvc.Command;

public class SetHeight extends Command {
	private double newHeight;
	
	public SetHeight(double newHeight) {
		this.newHeight = newHeight;
	}
	
	@Override
	public void execute() {
		if(model instanceof Brick) {
			Brick brick = (Brick)model;
			brick.setHeight(newHeight);
		}
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
	}
}
