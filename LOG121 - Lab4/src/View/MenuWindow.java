package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuWindow extends JMenuBar
{

	JMenu menuFile = new JMenu("File");
	JMenuItem fileOpenImage = new JMenuItem("Open Image");
	JMenuItem fileOpenProject = new JMenuItem("Open Project");
	JMenuItem fileSave = new JMenuItem("Save");
		
	JMenu menuZoom = new JMenu("Zoom");
	JMenuItem zoomIn = new JMenuItem("Zoom In");
	JMenuItem zoomOut = new JMenuItem("Zoom Out");
	
	JMenu menuAction = new JMenu("Action");
	JMenuItem actionNewThumbnail = new JMenuItem("New Thumbnail");
	JMenuItem actionUndo = new JMenuItem("Undo");
	JMenuItem actionRedo = new JMenuItem("Redo");
		

	public MenuWindow(){

		initMenu();

	}

	
	/**
	 * Initialise Menu
	 */
	private void initMenu(){


		fileOpenImage.addActionListener(new MenuListener());
		menuFile.add(fileOpenImage);
		fileOpenProject.addActionListener(new MenuListener());
		menuFile.add(fileOpenProject);	
		fileSave.addActionListener(new MenuListener());
		menuFile.add(fileSave);
		add(menuFile);
		
		/*
		zoomIn.addActionListener(new MenuListener());
		menuZoom.add(zoomIn);
		zoomOut.addActionListener(new MenuListener());
		menuZoom.add(zoomOut);
		add(menuZoom);
		*/
		
		actionNewThumbnail.addActionListener(new MenuListener());
		menuAction.add(actionNewThumbnail);
		actionUndo.addActionListener(new MenuListener());
		menuAction.add(actionUndo);
		actionRedo.addActionListener(new MenuListener());
		menuAction.add(actionRedo);
		add(menuAction);

		
	}

	
	/**
	 * Listener for the buttons
	 */
	private class MenuListener implements ActionListener {

		public void actionPerformed(ActionEvent arg0) {




		}
	}
}