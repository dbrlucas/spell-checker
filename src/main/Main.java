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
	
	public static boolean[] corrigerDicoRapide(String[] texte){
		return corrigerRapide(texte,dico);
	}
	
	public static String[] triDico(String[] t) {
		for(int i = 1;i<t.length;i++) {
			if(t[i].compareTo(t[i-1])<0) {
				int j = i;
				while((j>0)&&(t[j].compareTo(t[j-1])<0)) {
					String a = t[j];
					t[j] = t[j-1];
					t[j-1] = a;
					j -= 1;
				}
			}
		} 
		return t;
	}
	
	static String[] dico= triDico(ACX.lectureDico("lib/dico.txt"));
	
	public static int nbrDifference(String s1,String s2) {
		int dif = 0;
		if(s1.length() == s2.length()) {
			for(int i = 0;i<s1.length();i++) {
				if(s1.charAt(i) != s2.charAt(i)) {
					dif++;
				}
			}
			return dif;
		}
		return -1;
	}
	
	public static String[] proposerCorrection(String m) {
		int nbrM = 0;
		String k = "";
		for(int i = 0;i<dico.length;i++) {
			if(nbrDifference(dico[i],m) == 1 && dico[i].compareTo(k) != 0) {
				nbrM++;
				k = dico[i];
			}
		}
		String[] t = new String[nbrM];
		int j = 0;
		k = "";
		for(int i = 0;i<dico.length;i++) {
			if(nbrDifference(dico[i],m) == 1 && dico[i].compareTo(k) != 0) {
				t[j] = dico[i];
				j++;
				k = dico[i];
			}
		}
		return t;
	}
	
	public static void main(String[] args){
		ACX.interfaceCorrection("corrigerDicoRapide","proposerCorrection");
	}
}