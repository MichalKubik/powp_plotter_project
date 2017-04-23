package edu.iss.powp.command;

import java.util.ArrayList;

import edu.iis.client.plottermagic.IPlotter;

public class ComplexCommand implements PlotterCommand 
{
	private ArrayList<PlotterCommand> commands;
	
	public ComplexCommand()
	{
		commands = new ArrayList<PlotterCommand>();
	}
	
	public void add(PlotterCommand command)
	{
		commands.add(command);
	}
	
	@Override
	public void execute(IPlotter driver) 
	{
		// TODO Auto-generated method stub
		int n = commands.size();
		for(int i=0;i<n;i++)
			commands.get(i).execute(driver);
	}

}
