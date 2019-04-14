package bc;

import mvc.Memento;
import mvc.Model;

public class Brick extends Model {
	private static final long serialVersionUID = 262396202739789545L;
	private double length, width, height;

	public Brick(double leng, double width, double height) {
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
		unsavedChanges = true;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
		changed();
		unsavedChanges = true;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
		changed();
		unsavedChanges = true;
	}

	@Override
	public Memento makeMemento() {
		return new BrickMemento(length, width, height);
	}

	@Override
	public void accept(Memento m) {
		BrickMemento b = (BrickMemento) m;
		length = b.getLength();
		width = b.getWidth();
		height = b.getHeight();
		changed();
	}
	
	public String toString() {
		return length + " " + width + " " + height;
	}
	
}
