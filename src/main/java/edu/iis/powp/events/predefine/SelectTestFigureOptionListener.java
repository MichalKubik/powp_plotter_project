package edu.iis.powp.events.predefine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.iis.client.plottermagic.preset.FiguresJoe;
import edu.iis.powp.app.Application;
import edu.iis.powp.app.DriverManager;

public class SelectTestFigureOptionListener implements ActionListener
{

	private String figureName;
	
	public SelectTestFigureOptionListener(String figure)
	{
		this.figureName = figure;
	}
	
    @Override
    public void actionPerformed(ActionEvent e)
    {
    	if(figureName.equals("Joe1"))
    		FiguresJoe.figureScript1(Application.getComponent(DriverManager.class).getCurrentPlotter());
    	else if(figureName.equals("Joe2"))
    		FiguresJoe.figureScript2(Application.getComponent(DriverManager.class).getCurrentPlotter());
    }
}
