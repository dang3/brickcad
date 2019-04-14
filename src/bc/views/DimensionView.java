package bc.views;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;

import javax.swing.JTextField;

import bc.Brick;
import bc.commands.*;
import mvc.CommandProcessor;
import mvc.Model;
import mvc.Utilities;
import mvc.View;

public class DimensionView extends View {
	private static final long serialVersionUID = -3710035590081463009L;
	private final int NUMFIELDS = 3;
	private JTextField textFields[] = new JTextField[NUMFIELDS];
	// If user modifies dimensions of the brick, use this to execute the commands
	private CommandProcessor commandProcessor;	
	
	public DimensionView() {
		commandProcessor = CommandProcessor.makeCommandProcessor();
	}

	public DimensionView(Model model) {
		super(model);
	}
	
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.drawString("Length",25,40);
		g2.drawString("Width",92,40);
		g2.drawString("Height",152,40);
	}
	
	public void setModel(Model model) {
		super.setModel(model);
		for(int i = 0; i < NUMFIELDS; i++) {
			textFields[i] = new JTextField(5);
			this.add(textFields[i]);
		}
		
		// Set text fields with default values
		setTextFields();
		
		// Action listener for changing length field
		textFields[0].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input = textFields[0].getText();
				if(Utilities.isNumeric(input))
					commandProcessor.execute(new SetLength(Double.parseDouble(input), model));
				else Utilities.invalidNumMsg(input);	
			}
		});
		
		// Action listener for changing width field
		textFields[1].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input = textFields[1].getText();
				if(Utilities.isNumeric(input))
					commandProcessor.execute(new SetWidth(Double.parseDouble(input), model));
				else Utilities.invalidNumMsg(input);	
			}
		});
		
		// Action listener for changing height field
		textFields[2].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input = textFields[2].getText();
				if(Utilities.isNumeric(input))
					commandProcessor.execute(new SetHeight(Double.parseDouble(input), model));
				else Utilities.invalidNumMsg(input);	
			}
		});
	}
	
	private void setTextFields() {
		Brick brick = (Brick) model;
		textFields[0].setText(Double.toString(brick.getLength()));
		textFields[1].setText(Double.toString(brick.getWidth()));
		textFields[2].setText(Double.toString(brick.getHeight()));
	}
	
	private boolean hasNullFields() {
		for(int i = 0; i < NUMFIELDS; i++) {
			if(textFields[i] == null) return true;
		}
		return false;
	}

	@Override
	public void update(Observable subject, Object msg) {
		if(hasNullFields()) return;
		setTextFields();
	}
}
