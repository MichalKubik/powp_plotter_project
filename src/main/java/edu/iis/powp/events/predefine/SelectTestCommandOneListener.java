package edu.iis.powp.events.predefine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.iis.powp.app.Application;
import edu.iis.powp.app.DriverManager;
import edu.iss.powp.command.ComplexCommand;
import edu.iss.powp.command.factory.CommandFactory;

public class SelectTestCommandOneListener implements ActionListener
{
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		ComplexCommand rectangleCommand = CommandFactory.getDrawRectangleCommand(-120, -120, 250, 100);
		rectangleCommand.execute(Application.getComponent(DriverManager.class).getCurrentPlotter());
	}
}
