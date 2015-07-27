package View;


import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
 

public class MainWindow extends JFrame
{
	
	

	public MainWindow()
	{	
		setLayout(new BorderLayout());
		
		MenuWindow menu = new MenuWindow();
		add(menu, BorderLayout.NORTH);
		ImagePanel mainImage = new ImagePanel();
		add(mainImage, BorderLayout.CENTER);
		
		Thumbnail subImage = new Thumbnail();
		add(subImage, BorderLayout.SOUTH);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);
		
	}
	
}