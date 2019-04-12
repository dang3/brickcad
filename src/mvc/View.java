package mvc;

import javax.swing.*;
import java.util.Observer;


abstract public class View extends JPanel implements Observer {
	
	protected Model model;
	
	private Boolean packable;
	
	public View() {
		super();
		packable = false;
	}

	public View(Model model) {
		super();
		this.model = model;
		model.addObserver(this);
		this.update(model, null);
		packable = false;
	}
	
	public Boolean getPackable() {
		return packable;
	}

	public void setPackable(Boolean packable) {
		this.packable = packable;
	}


	public Model getModel() {
		return model;
	}
	
	public void setModel(Model model) {
		this.model = model;
		model.addObserver(this);
		this.update(model, null);
	}
}