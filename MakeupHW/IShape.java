	package tr.ahmetturkmen.HW4;

	import java.awt.*;
	import java.util.Random;


	public class IShape extends Shape {
		Random randomNumbers = new Random();
		Color randomColor;

		public IShape(int x, int y, int w, int h) {
			super(x, y, w, h);

		}

		@Override
		public void draw(Graphics graphics) {
			// I used float here because Color class' constructor does not accept
			// double
			// RGB is main colors for computer display
			float red = randomNumbers.nextFloat();
			float green = randomNumbers.nextFloat();
			float blue = randomNumbers.nextFloat();
			randomColor = new Color(red, green, blue);
			while (red == 0 && green == 0 && blue == 0) {
				red = randomNumbers.nextFloat();
				green = randomNumbers.nextFloat();
				blue = randomNumbers.nextFloat();
			}

			graphics.setColor(randomColor);
			graphics.fillRect(super.getX(), super.getY(), super.getW(), super.getH());
			graphics.setColor(Color.black);
			graphics.drawRect(super.getX(), super.getY(), super.getW(), super.getH());

			graphics.setColor(randomColor);
			graphics.fillRect(super.getX(), super.getY() + 50, super.getW(), super.getH());
			graphics.setColor(Color.black);
			graphics.drawRect(super.getX(), super.getY() + 50, super.getW(), super.getH());

			graphics.setColor(randomColor);
			graphics.fillRect(super.getX(), super.getY() + 100, super.getW(), super.getH());
			graphics.setColor(Color.black);
			graphics.drawRect(super.getX(), super.getY() + 100, super.getW(), super.getH());

			graphics.setColor(randomColor);
			graphics.fillRect(super.getX(), super.getY() + 150, super.getW(), super.getH());
			graphics.setColor(Color.black);
			graphics.drawRect(super.getX(), super.getY() + 150, super.getW(), super.getH());

		}
	}
