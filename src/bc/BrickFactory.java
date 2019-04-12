package bc;

import java.util.ArrayList;
import java.util.List;

import bc.views.*;
import mvc.AppFactory;
import mvc.Command;
import mvc.Model;
import mvc.View;

public class BrickFactory implements AppFactory {
	private double defaultLength = 50;
	private double defaultWidth = 30;
	private double defaultHeight = 20;
	private List<String> views;
	
	public BrickFactory() {
		views = new ArrayList<>();
		views.add("Front View");
		views.add("Side View");
		views.add("Top View");
		views.add("Dimensions View");
	}

	@Override
	public Model makeModel() {
		return new Brick(defaultLength, defaultWidth, defaultHeight);
	}

	@Override
	public View makeView(String viewType) {
		View v = null;
		if(viewType.equals("Front View")) v = new FrontView();
		else if(viewType.contentEquals("Dimensions View")) v = new DimensionsView();
		else if(viewType.contentEquals("Side View")) v = new SideView();
		else if(viewType.contentEquals("Top View")) v = new TopView();
		return v;
	}

	@Override
	public Command makeCommand(String commandType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getHelp() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<String> getViews() {
		return views;
	}

	@Override
	public List<String> getCommands() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTitle() {
		return "Brick CAD";
	}

	@Override
	public String about() {
		return "BrickCad 1.0, all rights reserved";
	}

}
