package main;

import util.ACX;

public class Main {
	
	public static int recherche(String cherche, String[] t){
		for (int e = 0;e < t.length;e++) {
			if (t[e].compareTo(cherche)==0) {
				return e;
			}
		}
		return -1;
	}
	
	public static boolean[] corriger(String[] texte, String[] dico){
		boolean[] tab = new boolean[texte.length];
		for (int i = 0;i<texte.length;i++) {
			if (recherche(texte[i].toLowerCase(),dico) != -1) {
				tab[i] = true;
			}
		}
		return tab;
	}
	
	public static boolean[] corrigerDico(String[] texte){
		return corriger(texte,dico);
	}
	
	public static int rechercheRapide(String cherche, String[] t){
		int debut=0;
		int fin=t.length-1;
		boolean trouve=false;
		int milieu= (debut+fin)/2;
		while(!trouve && debut<=fin){
			if (t[milieu].compareTo(cherche)==0){
				trouve=true;
			}else if (t[milieu].compareTo(cherche)>0){
				fin=milieu-1;
			}else { debut=milieu+1;
					}
			milieu= (debut+fin)/2;
			
		}
		if (trouve) return milieu;
		else return -1;
	}
	
	public static boolean[] corrigerRapide(String[] texte, String[] dico){
		boolean[] tab = new boolean[texte.length];
		for (int i = 0;i<texte.length;i++) {
			if (rechercheRapide(texte[i].toLowerCase(),dico) != -1) {
				tab[i] = true;
			}
		}
		return tab;
	}
	
	static String[] dico= ACX.lectureDico("lib/dico.txt");
	
	public static void main(String[] args){
		ACX.interfaceCorrection("corrigerDico");
	}
}