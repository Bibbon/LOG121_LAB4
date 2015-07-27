package Controller;

import Model.Perspective;

public class ZoomInCommand implements ViewCommand{

	private Perspective perspective;
	
	private int minX;
	private int minY;
	private int maxX;
	private int maxY;
	private int centerX;
	private int centerY;

	private int newMinX;
	private int newMinY;
	private int newMaxX;
	private int newMaxY;
	private int newCenterX;
	private int newCenterY;
	
	private int scalingFactor = 2;
	
	public ZoomInCommand(Perspective perspective){
		
		this.perspective = perspective;

		minX = perspective.getTopLeftCorner().x;
		minY = perspective.getTopLeftCorner().y;
		maxX = perspective.getBottomRightCorner().x;
		maxY = perspective.getBottomRightCorner().y;
		
		centerX = maxX - minX;
		centerY = maxY - minY;

		newCenterX = centerX;
		newCenterY = centerY;

		calculateNewPosition();
	}
	
	//Used when the user zooms in on a particular point
	public ZoomInCommand(Perspective perspective, int x, int y){
		
		this.perspective = perspective;

		minX = perspective.getTopLeftCorner().x;
		minY = perspective.getTopLeftCorner().y;
		maxX = perspective.getBottomRightCorner().x;
		maxY = perspective.getBottomRightCorner().y;
		
		centerX = maxX - minX;
		centerY = maxY - minY;
		
		newCenterX = x;
		newCenterY = y;

		calculateNewPosition();
	}
	
	private void calculateNewPosition(){
		
		newMinX = newCenterX - ((centerX - minX)/scalingFactor);
		newMinY = newCenterY - ((centerY - minY)/scalingFactor);
		newMaxX = newCenterX + ((maxX - centerX)/scalingFactor);
		newMaxY = newCenterY + ((maxY - centerY)/scalingFactor);
		
	}
	
	public int getScalingFactor() {
		
		return scalingFactor;
	
	}

	public void setScalingFactor(int scalingFactor) {
	
		this.scalingFactor = scalingFactor;
	
	}

	public void execute(){
		
		perspective.setCoordinates(newMinX, newMinY, newMaxX, newMaxY);
	}
	
	public void undo(){
		
		perspective.setCoordinates(minX, minY, maxX, maxY);
	}
}
