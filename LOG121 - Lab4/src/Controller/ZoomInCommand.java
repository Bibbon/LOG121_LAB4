package Controller;

import java.awt.Point;
import Model.Perspective;

public class ZoomInCommand implements ViewCommand{

	private Perspective perspective;
	private int scalingFactor = 2;
	
	public ZoomInCommand(Perspective perspective){
		this.perspective = perspective;
	}
	
	public void execute(){
		int minX = perspective.getTopLeftCorner().x;
		int minY = perspective.getTopLeftCorner().y;
		int maxX = perspective.getBottomRightCorner().x;
		int maxY = perspective.getBottomRightCorner().y;
		int centerX = maxX - minX;
		int centerY = maxY - minY;

		int newMinX = centerX - ((centerX - minX)/scalingFactor);
		int newMinY = centerY - ((centerY - minY)/scalingFactor);
		int newMaxX = centerX + ((maxX - centerX)/scalingFactor);
		int newMaxY = centerY + ((maxY - centerY)/scalingFactor);
		
		perspective.setCoordinates(newMinX, newMinY, newMaxX, newMaxY);
	}
	
	public void undo(){
		int minX = perspective.getTopLeftCorner().x;
		int minY = perspective.getTopLeftCorner().y;
		int maxX = perspective.getBottomRightCorner().x;
		int maxY = perspective.getBottomRightCorner().y;
		int centerX = maxX - minX;
		int centerY = maxY - minY;

		int newMinX = centerX - ((centerX - minX)*scalingFactor);
		int newMinY = centerY - ((centerY - minY)*scalingFactor);
		int newMaxX = centerX + ((maxX - centerX)*scalingFactor);
		int newMaxY = centerY + ((maxY - centerY)*scalingFactor);
		
		perspective.setCoordinates(newMinX, newMinY, newMaxX, newMaxY);
	}
}
