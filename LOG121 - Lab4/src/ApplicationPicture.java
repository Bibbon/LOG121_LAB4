/******************************************************
Cours:  LOG121-02
Projet: laboratoire #1 - Affichage de formes
Nom du fichier: ApplicationFormes.java
Date cree 25 mai 2015
*******************************************************
Historique des modifications
*******************************************************
* @author Pierre-Luc Cusson
* @since 25 mai 2015
*******************************************************/  
 

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import View.MainWindow;

/**
 * Cette classe represente l'application dans son ensemble. 
* @author Pierre-Luc Cusson
* @since 15 juillet 2015
 */
public class ApplicationPicture{
	
	/**
	 * main de l'application
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationPicture application = new ApplicationPicture();
	}
	
	/**
	 * Constructeur
	 */
	public ApplicationPicture(){
		MainWindow MainWindow = new MainWindow();
		//CommBase comm = new CommBase();
		//FenetrePrincipale fenetre = new FenetrePrincipale(comm);
		//comm.setPropertyChangeListener(fenetre);
	}
}
