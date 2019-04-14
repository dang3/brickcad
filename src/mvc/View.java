package mvc;

import java.util.Observer;

import javax.swing.JPanel;


abstract public class View extends JPanel implements Observer {
	private static final long serialVersionUID = -7029244421755449199L;
	protected Model model;
	private Boolean packable;
	
	public View() {
		super();
		packable = false;
		setOpaque(false);
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