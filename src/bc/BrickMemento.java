package bc;

import mvc.Memento;
import mvc.Model;

public class BrickMemento implements Memento {
	private double length, width, height;
	
	public BrickMemento(double length, double width, double height) {
		this.length = length;
		this.width = width;
		this.height = height;
	}
	
	public double getLength() {
		return length;
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getHeight() {
		return height;
	}
	
}
