package edu.iss.powp.command;

import edu.iis.client.plottermagic.IPlotter;

public class ComplexCommand implements PlotterCommand 
{
	private PlotterCommand commands[];
	
	public void add(PlotterCommand command)
	{
		commands[commands.length] = command;
	}
	
	@Override
	public void execute(IPlotter driver) 
	{
		// TODO Auto-generated method stub
		int n = commands.length;
		for(int i=0;i<n;i++)
			commands[i].execute(driver);
	}

}
