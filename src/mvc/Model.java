package mvc;

import java.io.Serializable;
import java.util.Observable;

public abstract class Model extends Observable implements Serializable {
	protected String fileName;
	protected boolean unsavedChanges;
	
	public void changed() {
		// need setChanged for else notifyObservers does nothing
		this.setChanged();
		this.notifyObservers();
	}
	
	public abstract Memento makeMemento();
	public abstract void accept(Memento m);
	public String getFileName() {return fileName;}
	public boolean hasUnsavedChanges() { return unsavedChanges;}
	public void setUnsavedChanges(boolean b) { unsavedChanges = b;}
	public void setFileName(String str) {fileName = str;}
}
