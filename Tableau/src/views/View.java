package views;

import java.util.Scanner;

public class View {
	// affichage tableau
	public static void AffichageTab(int Tab[]) {
		for (int i = 0; i < Tab.length; i++) {
			if (i == 0) {
				System.out.print(Tab[i]);
			} else {
				System.out.print(" , " + Tab[i]);
			}
		}

	}

	///////////////////////////////////////////////////////////////
	// ----------------------- SAISI ---------------------------//
	//////////////////////////////////////////////////////////////

	/**
	 * Controle de saisie --> reel en sortie !
	 * 
	 * @param Scan(entrée
	 *            scanner)
	 * @return Retour (int)
	 */
	public static int SaisiInt(Scanner Scan) {

		int Retour = 0; // variable de retour d'int
		int rep = 1; // variable de test d'erreur, si 1 alors on boucle si =0 alors fin de la methode
		do {
			try {
				System.out.println("Veuillez rentrer un nombre entier : ");
				int UserIn = Scan.nextInt();
				// System.out.println("UserIn = " + UserIn + "boucle ok");
				rep = 0;
				Retour = UserIn;

			}
			// catch erreur de type de saisie
			catch (Exception e) {
				System.out.println("Vous n'avez pas entré un entier !");
				System.out.println("Veuillez recommencer :");
				rep = 1;
				// flash du buffer clavier
				Scan.next();

			}
		} while (rep == 1);

		// Scan.close();

		return Retour;

	}
public static int ControleBorneEtInt(Scanner Scan,int[]tab ) {
	int nb=0;
	
	nb=SaisiControleBorne(Scan, tab);
	
	return nb;
}
	/**
	 * Controle de borne tab int[]
	 * 
	 * @param Scan(valeur
	 *            scanner entrée)
	 * @param sentence(taille
	 *            phrase a vérifier)
	 * @return (int compris entre 0 et taille phrase)
	 */
	public static int SaisiControleBorne(Scanner Scan, int[] tab) {
		
		int ok = 0;
		int UserIn=0;
		boolean controle = false;
		
		do {
			System.out.println("Veuillez rentrer un nombre entier compris dans les bornes  : ");
			UserIn=SaisiInt(Scan);// appel methode de controle saisie d'int
			if (UserIn < 0 || UserIn > tab.length) {
				System.out.println("Erreur de Saisi ! Out of bound ! ");
				System.out.println("Saisissez a nouveau une valeur ");
				Scan.next();
				UserIn = Scan.nextInt();
	
			}
	
			else {
				ok = UserIn;
				controle = true;
			}
		} while (controle == false);
	
		return ok;
	}
}
