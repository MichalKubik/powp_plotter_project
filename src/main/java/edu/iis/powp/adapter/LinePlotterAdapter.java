package edu.iis.powp.adapter;

import edu.iis.client.plottermagic.IPlotter;
import edu.kis.powp.drawer.panel.DrawPanelController;
import edu.kis.powp.drawer.shape.ILine;

public class LinePlotterAdapter implements IPlotter
{ 
	private int startX = 0, startY = 0;
	private DrawPanelController drawPanelController;
	private ILine lineType;
	
    public LinePlotterAdapter(DrawPanelController drawPanelController, ILine lineType) {
		this.drawPanelController = drawPanelController;
		this.lineType = lineType;
	}
    
	@Override
    public void setPosition(int x, int y)
    {
        this.startX = x;
        this.startY = y;
    }

    @Override
    public void drawTo(int x, int y)
    {
    	lineType.setStartCoordinates(this.startX, this.startY);
        lineType.setEndCoordinates(x, y);
        
		drawPanelController.drawLine(lineType);
		setPosition(x, y);
    }

    @Override
    public String toString()
    {
        return "Line Plotter Simulator - " + lineType.toString();
    }
}