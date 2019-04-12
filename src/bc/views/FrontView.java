package bc.views;

import java.awt.Graphics;
import java.util.Observable;

import mvc.Model;
import mvc.View;

public class FrontView extends View {

	public FrontView() {}
	
	public FrontView(Model model) {
		super(model);
		// TODO Auto-generated constructor stub
	}
	
	public void paintComponent(Graphics g) {
		g.drawRect(10, 10, 50, 50);
	}

	@Override
	public void update(Observable subject, Object msg) {
		this.repaint();
		
	}

}
