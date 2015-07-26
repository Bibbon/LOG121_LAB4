package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class MainImage extends JPanel{

	private JPanel panelImage = new JPanel();
	
	/*
	 * constructor
	 */
	public MainImage(){
		super();
		initMainImage();
	}
	
	
	
	private void initMainImage() {
		
		setBackground(Color.BLUE);
		//panelImage.setPreferredSize(new Dimension(640, 480));

		ImageIcon image = new ImageIcon("image/pic1.jpg");
		JLabel imageLabel = new JLabel("", image, JLabel.CENTER);
		
		panelImage.add( imageLabel, BorderLayout.CENTER );
		
		add(panelImage);
		
	}



	
	
	private class ListenerImage implements ActionListener {

		public void actionPerformed(ActionEvent arg0) {
			
		}
		
	}

}
