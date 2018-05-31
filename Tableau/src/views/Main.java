package views;

import java.util.Scanner;

public class Main {
	private static final int VIDE = -1; // constante
	private static int monTableau[] = { 5, 8, 7, 2, 14, 23, VIDE, VIDE };
	static private Scanner saisie = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//// 1) afficher le contenu du tableau avec un séparateur ",
		System.out.println("Le tableau de base est : ");
		models.Methode.AffichageTab(monTableau);
		System.out.println("");

		//// 2) Inverser le contenu du tableau dans un nouveau tableau,
		//// afficher les 2 tableaux (face à face)
		System.out.println("Inversion du tableau : ");
		int[] monTableauTemp = new int[monTableau.length];
		models.Methode.InversionTableau(monTableauTemp, monTableau);

		// 3) afficher le contenu du tableau 2 avec un séparateur ","
		System.out.println("Tableau inversé avec un séparateur : ");
		models.Methode.AffichageTab(monTableauTemp);
		System.out.println("");

		// 4) additionner les éléments du tableau et afficher le resultat
		int somme = models.Methode.SommeEleTab(monTableau);
		System.out.println("La somme des éléments du tableau : " + somme);

		// 5) Saisir une valeur et la rajouter au premier emplacement VIDE, Afficher
		// tableau
		System.out.println("Saisissez une valeur pour la rajouter au premier emplacement vide : ");
		int Valeur = models.Methode.SaisiInt(saisie);
		models.Methode.rajout(monTableau, Valeur, VIDE);
		models.Methode.AffichageTab(monTableau);
		System.out.println("");

		// 6) Saisir la position d'un élément du tableau 1 à Supprimer (remplacer la
		// valeur par
		// VIDE), Afficher le tableau
		System.out.println("quelle est la cellule que vous souhaitez supprimer  ? ");
		int Indice = models.Methode.SaisiInt(saisie);
		models.Methode.SupressionEle(monTableau, Indice, VIDE);
		System.out.println("");
		models.Methode.AffichageTab(monTableau);

		saisie.close();
	}

}
