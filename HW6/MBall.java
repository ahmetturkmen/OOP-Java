
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class MBall extends JPanel {

	private int hitCount = 0;

	private static JLabel lblNewLabel = new JLabel();
	private final int radius=30;
	private Random randomNumbers = new Random();
	private double xCoordinate =52, yCoordinate =672; // for 45 degree , coordinates should be 52 and 645 
	
	private float red,green,blue;             
	private Color randomColor=Color.BLACK ;

	// initial color is black as described in HW and after the ball hits a wall its color changes randomly

	private int directionSpeedOnCardx =1 ;
	private int directionSpeedOnCardY =-1;  // This value must be -1 to move the ball to North East direction. 

	public static void main(String[] args) throws InterruptedException {

		JFrame jframe = new JFrame("Moving Ball");
		MBall ball = new MBall();

		jframe.setResizable(false); // This is needed to do not confuse functions during moving ball
		jframe.add(ball);
		jframe.setSize(700, 700);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setVisible(true);
		
		while (ball instanceof MBall) {

			ball.moveBall();
			ball.repaint(); // repaint is a built-in method and it removes and
							// repaints with a tiny delay.

			Thread.sleep(10);  // when sleep time is small then the speed of the ball is high.
								// The reverse case its speed is low.

			//lblNewLabel.setText("Hint : " + ball.getCount()+" X :"+ ball.getxCoordinate()+" Y: "+ball.getyCoordinate());  // This also shows X and Y coordinates.
			
			lblNewLabel.setText("Hint : " + ball.getCount());

		}

	}

	public double getxCoordinate() {
		return xCoordinate;
	}
	public double getyCoordinate() {
		return yCoordinate;
	}
	public void setRandomColor(Color randomColor) {
		this.randomColor = randomColor;
	}
	public int getCount() {
		return hitCount;
	}

	private void moveBall() {


		if (xCoordinate + directionSpeedOnCardx < radius) { // Which represent left wall of the
										// program
				arrengeColor();
			directionSpeedOnCardx = 2;
			hitCount++;
			setRandomColor(randomColor);
			
		}

		if (yCoordinate + directionSpeedOnCardY <radius) { // Upper wall of the code
			arrengeColor();
			directionSpeedOnCardY = 5;
			hitCount++;
			setRandomColor(randomColor);
		// System.out.println("Upper wall is hitted"+" "+ System.currentTimeMillis()); /* This is just needed to be sure that the ball angle is 45 and its direction is  NE. */

		}

		if (xCoordinate + directionSpeedOnCardx > getWidth()) { // which represent right
			arrengeColor();										// wall of the program
			directionSpeedOnCardx = -4;
			hitCount++;
			setRandomColor(randomColor);
		//System.out.println("Right wall is hitted"+" "+ System.currentTimeMillis()); /* This is just needed to be sure that the ball angle is 45 and its direction is NE. */

		}

		if (yCoordinate + directionSpeedOnCardY > getHeight()) { // Bottom wall
			arrengeColor();
			directionSpeedOnCardY = -1;
			hitCount++;
			setRandomColor(randomColor);
		}

		/*
		 * >>>>>>>> IMPORTANT <<<<<<<<<<<
		 *  I added print() statements with System.currentmilisecond() to upper and right side walls' situation 
		 *  because when the ball goes with 45 degree and to the NE, 
		 *  the ball must hit both walls, which are upper and right walls, because of its radius.
		
		 *  Since there is no specific info in HW description, I just adjusted initial
		 * angle as 45 degree and to NE after it hits upper and right walls, it
		 * acts differently to provide different path when it moves within
		 * fragment.In addition, I assigned the dimension of fragment W = 700 &
		 * H = 700
		 *
		 * 
		 */

		xCoordinate += directionSpeedOnCardx;
		yCoordinate += directionSpeedOnCardY;

	}

	public MBall() {
		// TODO Auto-generated constructor stub
		add(lblNewLabel);
		
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		
		g.setColor(randomColor);
		
		g.fillOval((int) xCoordinate-radius, (int) yCoordinate-radius, radius, radius);
		
	}
	
	private void arrengeColor(){
		red=randomNumbers.nextFloat();
		green=randomNumbers.nextFloat();
		blue=randomNumbers.nextFloat();
		randomColor = new Color(red,green,blue);
	}



}
