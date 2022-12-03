package main;

import static org.junit.Assert.*;
import main.Main;

import org.junit.Test;
 
public class CorrecteurTest{
	
	@Test
	public void test_recherche_1(){
		String[] t= {};
		int resultatRecherche=Main.recherche("cfgh",t);
		assertEquals(-1,resultatRecherche);
	}
	
	@Test
	public void test_recherche_2(){
		String [] t= {"sfd"};
		int resultatRecherche=Main.recherche("wxfxd",t);
		assertEquals(-1,resultatRecherche);
	}
	
	@Test
	public void test_recherche_3(){
		String [] t= {"xdgf"};
		int resultatRecherche=Main.recherche("xdgf",t);
		assertEquals(0,resultatRecherche);
	}
	
	@Test
	public void test_recherche_4(){
		String[] t= {"rlf","syf","dsf"};
		int resultatRecherche=Main.recherche("syf",t);
		assertEquals(1,resultatRecherche);
	}
	
	@Test
	public void test_corriger_1(){
		String [] t1= {"toiture"};
		String [] d1= {"toiture"};
		boolean[] ct= Main.corriger(t1,d1);
		assertTrue(ct[0]);
	}
	
	@Test
	public void test_corriger_2(){
		String [] t1= {"toiture"};
		String [] d1= {"bateau"};
		boolean[] ct= Main.corriger(t1,d1);
		assertFalse(ct[0]);
	}
	
	@Test
	public void test_corriger_3(){
		String [] t1= {"toiture","sdfg"};
		String [] d1= {"toiture"};
		boolean[] ct= Main.corriger(t1,d1);
		assertTrue(ct[0]);
		assertFalse(ct[1]);
	}
	
	@Test
	public void test_corriger_4(){
		String [] t1= {"erzr","toiture"};
		String [] d1= {"toiture"};
		boolean[] ct= Main.corriger(t1,d1);
		assertFalse(ct[0]);
		assertTrue(ct[1]);
	}
	
	@Test
	public void test_corrigerDico_1(){
		String [] t1= {"je"};
		boolean[] ct= Main.corrigerDico(t1);
		assertTrue(ct[0]);
	}
	
	@Test
	public void test_corrigerDico_2(){
		String [] t1= {"fgff"};
		boolean[] ct= Main.corrigerDico(t1);
		assertFalse(ct[0]);
	}
	
	@Test
	public void test_corrigerDico_3(){
		String [] t1= {"voiture","fgff"};
		boolean[] ct= Main.corrigerDico(t1);
		assertTrue(ct[0]);
		assertFalse(ct[1]);
	}
	
	@Test
	public void test_corrigerDico_4(){
		String [] t1= {"sefe","voiture"};
		boolean[] ct= Main.corrigerDico(t1);
		assertFalse(ct[0]);
		assertTrue(ct[1]);
	}
	
	@Test
	public void test_rechercheRapide_1(){
		String[] t= {};
		int resultatRecherche=Main.rechercheRapide("cfgh",t);
		assertEquals(-1,resultatRecherche);
	}
	
	@Test
	public void test_rechercheRapide_2(){
		String [] t= {"sfd"};
		int resultatRecherche=Main.rechercheRapide("wxfxd",t);
		assertEquals(-1,resultatRecherche);
	}
	
	@Test
	public void test_rechercheRapide_3(){
		String [] t= {"xdgf"};
		int resultatRecherche=Main.rechercheRapide("xdgf",t);
		assertEquals(0,resultatRecherche);
	}
	
	@Test
	public void test_rechercheRapide_4(){
		String[] t= {"lsf","sef","dsf"};
		int resultatRecherche=Main.rechercheRapide("sef",t);
		assertEquals(1,resultatRecherche);
	}
	
	@Test
	public void test_corrigerRapide_1(){
		String [] t1= {"toiture"};
		String [] d1= {"toiture"};
		boolean[] ct= Main.corrigerRapide(t1,d1);
		assertTrue(ct[0]);
	}
	
	@Test
	public void test_corrigerRapide_2(){
		String [] t1= {"toiture"};
		String [] d1= {"bateau"};
		boolean[] ct= Main.corrigerRapide(t1,d1);
		assertFalse(ct[0]);
	}
	
	@Test
	public void test_corrigerRapide_3(){
		String [] t1= {"toiture","sdfg"};
		String [] d1= {"toiture"};
		boolean[] ct= Main.corrigerRapide(t1,d1);
		assertTrue(ct[0]);
		assertFalse(ct[1]);
	}
	
	@Test
	public void test_corrigerRapide_4(){
		String [] t1= {"erzr","toiture"};
		String [] d1= {"toiture"};
		boolean[] ct= Main.corrigerRapide(t1,d1);
		assertFalse(ct[0]);
		assertTrue(ct[1]);
	}
	
	@Test
	public void test_corrigerDicoRapide_1(){
		String [] t1= {"je"};
		boolean[] ct= Main.corrigerDicoRapide(t1);
		assertTrue(ct[0]);
	}
	
	@Test
	public void test_corrigerDicoRapide_2(){
		String [] t1= {"fgff"};
		boolean[] ct= Main.corrigerDicoRapide(t1);
		assertFalse(ct[0]);
	}
	
	@Test
	public void test_corrigerDicoRapide_3(){
		String [] t1= {"voiture","fgff"};
		boolean[] ct= Main.corrigerDicoRapide(t1);
		assertTrue(ct[0]);
		assertFalse(ct[1]);
	}
	
	@Test
	public void test_corrigerDicoRapide_4(){
		String [] t1= {"sefe","voiture"};
		boolean[] ct= Main.corrigerDicoRapide(t1);
		assertFalse(ct[0]);
		assertTrue(ct[1]);
	}
	
	@Test
	public void test_triDico_1(){
		String [] t1= {"afg"};
		String [] t1trie={"afg"};

		Main.triDico(t1);
		assertArrayEquals(t1trie, t1);
	}
	
	@Test
	public void test_triDico_2(){
		String [] t1= {"erf","asf"};
		String [] t1trie={"asf","erf"};

		Main.triDico(t1);
		assertArrayEquals(t1trie, t1);
	}
	
	@Test
	public void test_triDico_3(){
		String [] t1= {"ert","bnj","aze"};
		String [] t1trie={"aze","bnj","ert"};

		Main.triDico(t1);
		assertArrayEquals(t1trie, t1);
	}
	
	@Test
	public void test_triDico_4(){
		String [] t1= {"bnj","ert","aze"};
		String [] t1trie={"aze","bnj","ert"};

		Main.triDico(t1);
		assertArrayEquals(t1trie, t1);
	}
	
	@Test
	public void test_triDico_5(){
		String [] t1= {"aze","bnj","ert"};
		String [] t1trie={"aze","bnj","ert"};

		Main.triDico(t1);
		assertArrayEquals(t1trie, t1);
	}
	
	@Test
	public void test_triDico_6(){
		String [] t1= {"ert","ert","aze"};
		String [] t1trie={"aze","ert","ert"};

		Main.triDico(t1);
		assertArrayEquals(t1trie, t1);
	}
	
	@Test
	public void test_nbrDifference_1(){
		int resultat=Main.nbrDifference("vu","v");
		assertEquals(-1,resultat);
	}
	
	@Test
	public void test_nbrDifference_2(){
		int resultat=Main.nbrDifference("nt","nt");
		assertEquals(0,resultat);
	}
	
	@Test
	public void test_nbrDifference_3(){
		int resultat=Main.nbrDifference("bleu","blau");
		assertEquals(1,resultat);
	}
	
	@Test
	public void test_nbrDifference_4(){
		int resultat=Main.nbrDifference("voiture","monruti");
		assertEquals(5,resultat);
	}
	
	@Test
	public void test_proposerCorrection_1(){
		String[] resultat=Main.proposerCorrection("rateau");
		String[] t = {"bateau","radeau","rameau","râteau"};
		assertArrayEquals(t,resultat);
	}
}	
