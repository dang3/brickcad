package bc;

import mvc.Memento;
import mvc.Model;

public class Brick extends Model {
	private double length, width, height;

	public Brick(double width, double height, double leng) {
		this.width = width;
		this.height = height;
		this.length = leng;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
		changed();
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
		changed();
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
		changed();
	}

	@Override
	public Memento makeMemento() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void accept(Memento m) {
		// TODO Auto-generated method stub
		
	}
	
}
