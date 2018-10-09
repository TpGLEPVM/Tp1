/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 *
 * @author vb394093
 */
public class PanierTest {
    Panier pvide,p1,p2,pplein;
    Orange o1,o2;
    public PanierTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() throws OrangeNegException {
        pvide=new Panier(4);
        p1=new Panier(4);
        p2=new Panier(4);
        pplein=new Panier(4);
        o1=new Orange();
        o2=new Orange(0.5,"Espagne");
        p1.ajoute(o1);
        p2.ajoute(o2);
        p2.ajoute(o2);
        pplein.ajoute(o1);
        pplein.ajoute(o1);
        pplein.ajoute(o1);
        pplein.ajoute(o1);
        
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testOrangeNull(){
        Orange onull=null;
        p1.ajoute(onull);
        assertTrue(p1.quantite()==1);
    }
    @Test 
    public void testPrixPanierA2Orange(){
        Orange omock1=mock(Orange.class);
        Orange omock2=mock(Orange.class);
        when(omock1.getPrix()).thenReturn(1.0);
        when(omock2.getPrix()).thenReturn(0.5);
        
        pvide.ajoute(omock1);
        pvide.ajoute(omock2);
        assertTrue(pvide.getPrix()==1.5);verify(omock1,times(1)).getPrix();
        assertTrue(pvide.quantite()==2);verify(omock2,times(1)).getPrix();
    }

    @Test
    public void testAjoutDansPanierPlein(){
        pplein.ajoute(o1);
        assertTrue(pplein.quantite()==4);
    }
    @Test
    public void testAjoutDansPanierVide(){
        pvide.ajoute(o1);
        assertTrue(pvide.quantite()==1);
    }
    /**
     * Test of quantite method, of class Panier.
     */
    @Test
    public void testQuantite() {
        System.out.println("quantite");
        Panier instance = new Panier();
        int expResult = 0;
        int result = instance.quantite();
        assertEquals(expResult, result);
    }

    /**
     * Test of estPlein method, of class Panier.
     */
    @Test
    public void testEstPlein() {
        System.out.println("estPlein");
        Panier instance = new Panier(1);
        Orange omock1 = mock(Orange.class);
        instance.ajoute(omock1);
        boolean expResult = true;
        boolean result = instance.estPlein();
        assertEquals(expResult, result);
        
        Panier instance2 = new Panier(1);
        boolean expResult2 = false;
        boolean result2 = instance2.estPlein();
        assertEquals(expResult2, result2);
    }

    /**
     * Test of estVide method, of class Panier.
     */
    @Test
    public void testEstVide() {
        System.out.println("estVide");
        Panier instance = new Panier(1);
        boolean expResult = true;
        boolean result = instance.estVide();
        assertEquals(expResult, result);
        
        Orange omock1 = mock(Orange.class);
        instance.ajoute(omock1);
        boolean expResult2 = false;
        boolean result2 = instance.estVide();
        assertEquals(expResult2, result2);
    }

    /**
     * Test of toString method, of class Panier.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Panier instance = new Panier();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        
        String expResult2 = "Orange :\nPrix : "+"1.0"+"\nOrigine : "+"France"+"\n\n" + "Orange :\nPrix : "+"2.0"+"\nOrigine : "+"Espagne"+"\n\n";
       Orange mock1 = mock(Orange.class);
        when(mock1.toString()).thenReturn("Orange :\nPrix : "+"1.0"+"\nOrigine : "+"France"+"\n\n");
        Orange mock2 = mock(Orange.class);
        when(mock2.toString()).thenReturn("Orange :\nPrix : "+"2.0"+"\nOrigine : "+"Espagne"+"\n\n");
        
        instance.ajoute(mock1);
        instance.ajoute(mock2);
        
        assertEquals(expResult2,instance.toString());
        
    }

    /**
     * Test of equals method, of class Panier.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Panier p = null;
        Panier instance = new Panier();
        Panier instance2 = new Panier();
        Panier instance3 = new Panier();
        
        Orange omock1 = mock(Orange.class);
        Orange omock2 = mock(Orange.class);
        
        instance.ajoute(omock1);
        instance2.ajoute(omock2);
        
        boolean expResult = true;
        boolean expResult2 = false;
        
        boolean result = instance.equals(instance2);
        boolean result2 = instance.equals(instance3);
        
        assertEquals(expResult, result);
        assertEquals(expResult2, result2);
    }

    /**
     * Test of ajoute method, of class Panier.
     */
    @Test
    public void testAjoute_0args() {
        System.out.println("ajoute");
        Panier instance = new Panier();
        instance.ajoute();
        assertTrue(instance.quantite()==1);
        assertTrue(instance.getPrix()==1.0);
        instance.ajoute();
        assertTrue(instance.quantite()==2);
    }

    /**
     * Test of ajoute method, of class Panier.
     */
    @Test
    public void testAjoute_Orange() {
        System.out.println("ajoute");
        Orange o = null;
        Orange oo2 = mock(Orange.class);
        Panier instance = new Panier();
        instance.ajoute(o);
        assertTrue(instance.quantite()==0);
        instance.ajoute(oo2);
        instance.ajoute(oo2);
        assertTrue(instance.quantite()==2);
    }

    /**
     * Test of retire method, of class Panier.
     */
    @Test
    public void testRetire() {
        System.out.println("retire");
        Panier instance = new Panier();
        instance.retire();
        //assertTrue(instance.quantite()==0);
        Orange o=new Orange();
        instance.ajoute(o);
        instance.retire();
        assertTrue(instance.quantite()==0);
    }

    /**
     * Test of getPrix method, of class Panier.
     */
    @Test
    public void testGetPrix() {
        System.out.println("getPrix");
        Panier instance = new Panier();
        Orange mo1=mock(Orange.class);
        Orange mo2=mock(Orange.class);
        when(mo1.getPrix()).thenReturn(1.0);
        when(mo2.getPrix()).thenReturn(2.0);
        instance.ajoute(mo1);
        instance.ajoute(mo2);
        double expResult = 3.0;
        double result = instance.getPrix();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of boycotteOrigine method, of class Panier.
     */
    @Test
    public void testBoycotteOrigine() {
        System.out.println("boycotteOrigine");
        String pays = "France";
        Panier instance = new Panier();
        Orange mo1=mock(Orange.class);
        Orange mo2=mock(Orange.class);
        when(mo1.getOrigine()).thenReturn("France");
        when(mo2.getOrigine()).thenReturn("Espagne");
        instance.ajoute(mo1);
        instance.ajoute(mo2);
        
        instance.boycotteOrigine(pays);
        
        assertTrue(instance.quantite()==1);
    }
    
}
