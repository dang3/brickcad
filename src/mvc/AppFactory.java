package mvc;

import java.util.List;

public interface AppFactory {
	public Model makeModel();
	public View makeView(String viewType);
	public Command makeCommand(String commandType);
	public List<String> getViews();
	public List<String> getCommands();
	public String getTitle();
	public String getHelp();
	public String about();
}
