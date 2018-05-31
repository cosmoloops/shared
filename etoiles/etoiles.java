package etoiles;


import java.util.Scanner;


public class etoiles {

	
	public static void main(String[] arg) {
		//initialisation saisie
		Scanner phrase2= new Scanner(System.in);
		
		String Phrase="";
		int N=0;
		System.out.println("Veuillez rentrez une première phrase : ");
			Phrase=Saisie_Phrase(phrase2);
			N=Phrase.length();
		Affichage_Final(N,Phrase);
	
// 2nd partie : 
		
		Phrase="";
		N=0;
		System.out.println("Veuillez rentrez une autre phrase : ");
			Phrase=Saisie_Phrase(phrase2);
			N=Phrase.length();
		Affichage_Final(N,Phrase);
	phrase2.close();
	}

//----------------Fonctions : ----------------------
// Fonctions affichage etoiles 
public static String Affichage_Etoile(int N) {
	String etoile="*";
	// Définition du nombres d'étoile en fct du nombres de caractère dans la chaine
		for(int i=0; i<(N+3);i++) {
				etoile=etoile +"*";
				
		}
		return etoile;
}
//Fonction Saisie Phrase Utilisateur :
public static String Saisie_Phrase(Scanner scan) {
	//Scanner phrase2= new Scanner(System.in);
	String string3 = scan.nextLine();
	
	return string3;
	
}
public static void Affichage_Final(int N, String Phrase ) {	

	System.out.println(Affichage_Etoile(N));
	System.out.println("* " +Phrase+ " *") ;
	System.out.println(Affichage_Etoile(N));

}
}