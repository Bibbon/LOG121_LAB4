package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuListener implements ActionListener  {

	// Memorise the title of a bouton
	private String bouton;

	public void actionPerformed(ActionEvent arg0) {

		//Memorise the value of the click bouton
		bouton = arg0.getActionCommand();

		if(bouton.equals("Open Image")){				



			//APPELLE L ACTION QUI DOIT ETRE TRAITER DANS LE MODELE



		}
		else if(bouton.equals("Open Project")){				



			//APPELLE L ACTION QUI DOIT ETRE TRAITER DANS LE MODELE



		}
		else if(bouton.equals("Save")){				



			//APPELLE L ACTION QUI DOIT ETRE TRAITER DANS LE MODELE



		}
		else if(bouton.equals("Zoom In")){				



			//APPELLE L ACTION QUI DOIT ETRE TRAITER DANS LE MODELE



		}
		else if(bouton.equals("Zoom Out")){				



			//APPELLE L ACTION QUI DOIT ETRE TRAITER DANS LE MODELE



		}
		else if(bouton.equals("New Thumbnail")){				



			//APPELLE L ACTION QUI DOIT ETRE TRAITER DANS LE MODELE



		}
		else if(bouton.equals("Undo")){				



			//APPELLE L ACTION QUI DOIT ETRE TRAITER DANS LE MODELE



		}
		else if(bouton.equals("Redo")){				



			//APPELLE L ACTION QUI DOIT ETRE TRAITER DANS LE MODELE



		}


	} // END actionPerformed()
}
