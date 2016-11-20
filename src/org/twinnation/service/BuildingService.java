package org.twinnation.service;

import org.twinnation.gui.CityUI;
import org.twinnation.landscape.Building;
import org.twinnation.util.GlobalConstants;
import org.twinnation.util.TwinUtilities;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;


public class BuildingService implements GlobalConstants {
	private static List<Building> listBuildings;


	public BuildingService() {
		System.out.println("BuildingService constructor has been called");
		listBuildings = generateBuildings(50);
	}

	private static List<Building> generateBuildings(int amount) {
		List<Building> temp = new ArrayList<Building>();
		while (amount --> 0) {
			temp.add(generateRandom());
		}
		return temp;
	}

	public static void init(Graphics g) {
		System.out.println("init is called");
		for (Building b : listBuildings) {
			g.drawRect(b.getPosX(), b.getPosY(), b.getWidth(), b.getHeight());
		}
	}


	public static Building generateRandom() {
		int width = TwinUtilities.randomInteger(10, 50);
		int height = TwinUtilities.randomInteger(10, 50);
		int length = TwinUtilities.randomInteger(10, 50);
		int posX = TwinUtilities.randomInteger(0, FRAME_WIDTH);
		int posY = TwinUtilities.randomInteger(0, FRAME_HEIGHT);
		while (height+posY>FRAME_HEIGHT || height+posY<0) {
			posY = TwinUtilities.randomInteger(0, FRAME_HEIGHT);
		}
		while (width+posX>FRAME_WIDTH || width+posX<0) {
			posX = TwinUtilities.randomInteger(0, FRAME_WIDTH);
		}
		return new Building(posX, posY, width, height, length);
	}

	public static void drawTest(Graphics g) {
		Building b = generateRandom();
		g.drawRect(b.getPosX(), b.getPosY(), b.getWidth(), b.getHeight());
	}
}
