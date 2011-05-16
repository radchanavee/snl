package snl;

import java.awt.Point;
import java.awt.Rectangle;

public class BoardCell {
	private String number;
	private Point startLocation;
	private Rectangle box;

	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public Point getStartLocation() {
		return startLocation;
	}
	public void setStartLocation(Point startLocation) {
		this.startLocation = startLocation;
	}
	public Rectangle getBox() {
		return box;
	}
	public void setBox(Rectangle box) {
		this.box = box;
	}

}
