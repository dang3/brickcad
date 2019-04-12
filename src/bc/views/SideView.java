package bc.views;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.util.Observable;

import bc.Brick;
import mvc.Model;
import mvc.View;

public class SideView extends View {
	
	public SideView() {}

	public SideView(Model model) {
		super(model);
		// TODO Auto-generated constructor stub
	}
	
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		Brick b = (Brick) model;
		Rectangle2D rect = new Rectangle2D.Double(10, 20, b.getHeight(), b.getLength());
		g2.setColor(Color.RED);
		g2.fill(rect);
	}

	@Override
	public void update(Observable subject, Object msg) {
		this.repaint();
	}
}
