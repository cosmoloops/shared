package models;

import java.util.Scanner;

public class Methode {

	
	
	
	
	public static void InversionTableau(int [] temp,int Tab[]) {
		for(int i = 0; i < Tab.length ; i++)
		{
		    
		    temp[i] = Tab[Tab.length - i - 1];
		    Tab[Tab.length - i - 1] = temp[i];
		    System.out.println(Tab[i] + " => " + temp[i]);
		}
	}
	public static void rajout(int[] Tab , int Valeur,int VIDE) {
		for (int i=0;i<Tab.length;i++) {
			if(Tab[i]==VIDE) {Tab[i]=Valeur;break;}
			
		}


	}
	public static int SommeEleTab(int[] Tab) {
		int somme=0;
		for(int i = 0; i < Tab.length ; i++)
		{
		    
		    somme  = somme + Tab[i];
		    
		}
		return somme;
	}
	
	public static void SupressionEle(int[] Tab ,int Index, int VIDE) {
		Tab[Index]=VIDE;	

		}

	
	
	
	
	
	
}
