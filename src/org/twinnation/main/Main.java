package org.twinnation.main;

import org.twinnation.gui.CityUI;
import org.twinnation.landscape.Building;
import org.twinnation.service.BuildingService;

public class Main {
	public static void main(String[] args) {
		new BuildingService();
		CityUI gui = new CityUI();
		BuildingService.init(gui.getGraphics());

	}
}
