package bc.views;

import java.awt.Graphics;
import java.util.Observable;

import mvc.Model;
import mvc.View;

public class SideView extends View {
	
	public SideView() {}

	public SideView(Model model) {
		super(model);
		// TODO Auto-generated constructor stub
	}
	
	public void paintComponent(Graphics g) {
		
	}

	@Override
	public void update(Observable subject, Object msg) {
		this.repaint();
		
	}

}