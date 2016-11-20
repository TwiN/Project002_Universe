package org.twinnation.landscape;

public class Building {
	private int width;
	private int height;
	private int length;
	private int posX;
	private int posY;

	public Building(int posX, int posY, int width, int height, int length) {
		System.out.println("Building created with -> POS("+posX+","+posY+") SIZE("+width+","+height+","+length+")");
		this.posX = posX;
		this.posY = posY;
		this.width = width;
		this.height = height;
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}


}
