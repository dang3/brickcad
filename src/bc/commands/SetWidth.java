package bc.commands;

import bc.Brick;
import mvc.Command;

public class SetWidth extends Command {
	private double newWidth;
	
	public SetWidth(double newWidth) {
		this.newWidth = newWidth;
	}

	@Override
	public void execute() {
		if(model instanceof Brick) {
			Brick brick = (Brick)model;
			brick.setHeight(newWidth);
		}
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
	}
}
