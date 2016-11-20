package org.twinnation.gui;

import org.twinnation.service.BuildingService;
import org.twinnation.constant.GlobalConstants;

import javax.swing.*;
import java.awt.*;

/**
 * This is a temporary 2D representation, will be modified later
 */
public class CityUI extends JFrame implements GlobalConstants {
	private JFrame frame = new JFrame();
	private JPanel panel;

	public CityUI() {
		frame.setTitle("City");
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		panel = new GPanel();
		frame.add(panel);
		frame.setVisible(true);
	}

	class GPanel extends JPanel {
		public GPanel() {
			super.setPreferredSize(new Dimension(FRAME_WIDTH, FRAME_HEIGHT));
		}

		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawRect(1, 1, FRAME_WIDTH+1, FRAME_HEIGHT+1);
			BuildingService.init(g);
			//BuildingService.drawTest(g);


		}
	}
}
