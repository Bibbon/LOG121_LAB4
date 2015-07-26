package Controller;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class ImageSelector {
	
	private JFileChooser imageChooser;
	private FileNameExtensionFilter imageFilter;
	private File imageFile;
	
	
	public ImageSelector(String filetype, String... extensions){
		this.imageChooser = new JFileChooser();
		this.imageFilter = new FileNameExtensionFilter(filetype, extensions);
		this.imageChooser.setFileFilter(imageFilter);
	}


	public JFileChooser getImageChooser() {
		return imageChooser;
	}


	public void setImageChooser(JFileChooser imageChooser) {
		this.imageChooser = imageChooser;
	}


	public FileNameExtensionFilter getImageFilter() {
		return imageFilter;
	}


	public void setImageFilter(FileNameExtensionFilter imageFilter) {
		this.imageFilter = imageFilter;
	}


	public File getImageFile() {
		return imageFile;
	}


	public void setImageFile(File imageFile) {
		this.imageFile = imageFile;
	}
	
	public void SelectImage(){
		
		imageChooser.showOpenDialog(null);
		this.imageFile = imageChooser.getSelectedFile();
	}
	
	public BufferedImage getBufferedImage(){
		
		SelectImage();
		BufferedImage img = null;
		
		try {
			img = ImageIO.read(imageFile);		
		} 
		
		catch (IOException e) {	
			e.printStackTrace();		
		}
		
		return img;
		
	}
	
	public String getImagePath(){
		
		SelectImage();
		return imageFile.getAbsolutePath();
		
	}

}
