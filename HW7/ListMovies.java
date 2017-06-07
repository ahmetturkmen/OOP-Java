import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import java.awt.event.ItemListener;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
import java.awt.event.ItemEvent;

public class ListMovies extends JFrame {

	private JPanel contentPane;
	private DircMovie d1 = new DircMovie();
	private String completeNamesOfMovies = "";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListMovies frame = new ListMovies();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ListMovies() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 454, 358);
		setTitle("List Movies of Given Directories");
		
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		JTextPane textPane = new JTextPane();
		textPane.setBounds(231, 21, 185, 247);
		
		contentPane.add(textPane);
		textPane.setEditable(false);
		textPane.setVisible(true);
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setSelectedItem(0);
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				if (comboBox.getSelectedIndex() == 0) {
					completeNamesOfMovies = "";           // For each selection of ComboBox Directory this variable must be empty
					for (int i = 1; i <= 4; i++)
						completeNamesOfMovies += d1.getName(i) + "\n";  // Take movies according to their index in the Array in DircMovie Class
					textPane.setText(completeNamesOfMovies);
				} else if (comboBox.getSelectedIndex() == 1) {
					completeNamesOfMovies = "";
					for (int i = 6; i <= 10; i++)
						completeNamesOfMovies += d1.getName(i) + "\n";
					textPane.setText(completeNamesOfMovies);
				} else if (comboBox.getSelectedIndex() == 2) {
					completeNamesOfMovies = "";
					for (int i = 12; i < 13; i++)
						completeNamesOfMovies += d1.getName(i) + "\n";
					textPane.setText(completeNamesOfMovies);
				}else if (comboBox.getSelectedIndex()==3){
					completeNamesOfMovies = "";
					for (int i = 14; i <= 16; i++)
						completeNamesOfMovies += d1.getName(i) + "\n";
					textPane.setText(completeNamesOfMovies);
				}

			}
		});
		
		// Setting ComboBox Directories
		
		comboBox.addItem(d1.getName(0));
		comboBox.addItem(d1.getName(5));
		comboBox.addItem(d1.getName(11));
		comboBox.addItem(d1.getName(13));
		comboBox.setBounds(47, 97, 133, 20);
		contentPane.add(comboBox);

	}
}
