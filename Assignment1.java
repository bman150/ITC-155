/*
 * Written by Alexander Baker on 4/18/2020
 * ITC-155 Assignment 1 Graphics
 * Program uses a DrawingPanel to draw a figure
 */

import java.awt.*; // for Graphics

public class Assignment1 {

	public static void main(String[] args) {
		// create a new DrawingPanel thats 220 pixels wide and 150 pixels tall
		DrawingPanel panel = new DrawingPanel(220, 150);
		panel.setBackground(Color.YELLOW);	// set background color
		Graphics g = panel.getGraphics();
		
		// draw tswo ovals
		g.setColor(Color.BLUE);
		g.fillOval(50, 25, 40, 40);
		g.fillOval(130, 25, 40, 40);
		
		// draw a square(rectangle)
		g.setColor(Color.RED);
		g.fillRect(70, 45, 80, 80);
		
		// draw a line
		g.setColor(Color.BLACK);
		g.drawLine(70, 85, 150, 85);
	}

}
