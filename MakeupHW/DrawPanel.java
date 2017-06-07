package tr.ahmetturkmen.HW4;

import javax.swing.*;
import java.awt.*;
import java.util.Random;


public class DrawPanel extends JPanel {
	private final int LENGTH = 10;
	private final int GAP = 60;
	private Shape[] shapes;
	private Random randomNumbers= new Random();


	public DrawPanel() {
		shapes = new Shape[LENGTH];
	}

	public void paintComponent(Graphics graphics) {
		super.paintComponent(graphics);
		int index = 0;
		while (index < shapes.length) {
			graphics.setColor(Color.black);
			shapes[index].draw(graphics);
			index++;
		}


	}

	public void buildShape() {
		int random;
		int m = 0;
		while (m < shapes.length) {
			random = randomNumbers.nextInt(4);
			if ( random == 0 )
				shapes[m] = new Square(10 + GAP * m, 5 + GAP * m, 50, 50);
			if ( random == 1 )
				shapes[m] = new IShape(10 + GAP * m, 5 + GAP * m, 50, 50);
			if ( random == 2 )
				shapes[m] = new TShape(10 + GAP * m, 5 + GAP * m, 50, 50);
			if ( random == 3 )
				shapes[m] = new LShape(10 + GAP * m, 5 + GAP * m, 50, 50);
			m++;
		}
	}
}
	