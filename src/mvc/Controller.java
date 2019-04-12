package mvc;

public class Controller {
	protected Model model;
	private static Controller con = null;
	private Controller() {}
	
	// The only public method to allow for singleton object
	public static Controller makeController() {
		if(con == null) con = new Controller();
		return con;
	}
	
	public void execute(Command c) {
		c.execute();
	}
}
