package bc.views;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.util.Observable;

import bc.Brick;
import mvc.Model;
import mvc.View;

public class FrontView extends View {
	public FrontView() {}
	
	public FrontView(Model model) {
		super(model);
	}
	
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		Brick b = (Brick) model;
		Rectangle2D rect = new Rectangle2D.Double(10, 20, b.getWidth(), b.getLength());
		g2.setColor(Color.RED);
		g2.fill(rect);
	}

	@Override
	public void update(Observable subject, Object msg) {
		this.repaint();
	}
}
