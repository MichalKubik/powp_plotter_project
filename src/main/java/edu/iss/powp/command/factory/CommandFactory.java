package edu.iss.powp.command.factory;

import edu.iss.powp.command.CommandDrawLineToPosition;
import edu.iss.powp.command.CommandSetPosition;
import edu.iss.powp.command.ComplexCommand;

public class CommandFactory 
{
	public static ComplexCommand getDrawRectangleCommand(int x1, int y1, int x2, int y2)
	{
		ComplexCommand command = new ComplexCommand();
		
		command.add(new CommandSetPosition(x1, y1));
		command.add(new CommandDrawLineToPosition(x2, y1));
		command.add(new CommandDrawLineToPosition(x2, y2));
		command.add(new CommandDrawLineToPosition(x1, y2));
		command.add(new CommandDrawLineToPosition(x1, y1));
		
		return command;
	}
	
	public static ComplexCommand getDrawSquareCommand(int x, int y, int a)
	{
		ComplexCommand command = new ComplexCommand();
		
		command.add(new CommandSetPosition(x, y));
		command.add(new CommandDrawLineToPosition(x+a, y));
		command.add(new CommandDrawLineToPosition(x+a, y+a));
		command.add(new CommandDrawLineToPosition(x, y+a));
		command.add(new CommandDrawLineToPosition(x, y));
		
		return command;
	}

}
