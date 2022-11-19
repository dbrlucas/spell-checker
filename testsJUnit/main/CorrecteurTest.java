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
		String[] t= {"dsf","sdf","dsf"};
		int resultatRecherche=Main.recherche("sdf",t);
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
		int resultatRecherche=Main.recherche("cfgh",t);
		assertEquals(-1,resultatRecherche);
	}
	
	@Test
	public void test_rechercheRapide_2(){
		String [] t= {"sfd"};
		int resultatRecherche=Main.recherche("wxfxd",t);
		assertEquals(-1,resultatRecherche);
	}
	
	@Test
	public void test_rechercheRapide_3(){
		String [] t= {"xdgf"};
		int resultatRecherche=Main.recherche("xdgf",t);
		assertEquals(0,resultatRecherche);
	}
	
	@Test
	public void test_rechercheRapide_4(){
		String[] t= {"dsf","sdf","dsf"};
		int resultatRecherche=Main.recherche("sdf",t);
		assertEquals(1,resultatRecherche);
	}
	
	@Test
	public void test_corrigerRapide_1(){
		String [] t1= {"toiture"};
		String [] d1= {"toiture"};
		boolean[] ct= Main.corriger(t1,d1);
		assertTrue(ct[0]);
	}
	
	@Test
	public void test_corrigerRapide_2(){
		String [] t1= {"toiture"};
		String [] d1= {"bateau"};
		boolean[] ct= Main.corriger(t1,d1);
		assertFalse(ct[0]);
	}
	
	@Test
	public void test_corrigerRapide_3(){
		String [] t1= {"toiture","sdfg"};
		String [] d1= {"toiture"};
		boolean[] ct= Main.corriger(t1,d1);
		assertTrue(ct[0]);
		assertFalse(ct[1]);
	}
	
	@Test
	public void test_corrigerRapide_4(){
		String [] t1= {"erzr","toiture"};
		String [] d1= {"toiture"};
		boolean[] ct= Main.corriger(t1,d1);
		assertFalse(ct[0]);
		assertTrue(ct[1]);
	}
}	
