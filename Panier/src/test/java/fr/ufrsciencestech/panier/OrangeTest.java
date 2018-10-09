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

/**
 *
 * @author vb394093
 */
public class OrangeTest {
    
    public OrangeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    /**
     * Test of getPrix method, of class Orange.
     * @throws fr.ufrsciencestech.panier.OrangeNegException
     */
    @Test(expected=OrangeNegException.class)
    public void testPrixNegatif() throws OrangeNegException {
        System.out.println("Prix négatif");        
        Orange instance2 = new Orange(-1.0,"France");
        
    }

    /**
     * Test of getPrix method, of class Orange.
     */
    @Test
    public void testGetPrix() {
        System.out.println("getPrix");
        Orange instance = new Orange();
        double expResult = 1.0;
        double result = instance.getPrix();
        assertEquals(expResult, result,0.0);
        
    }

    /**
     * Test of getOrigine method, of class Orange.
     */
    @Test
    public void testGetOrigine() throws OrangeNegException {
        System.out.println("getOrigine");
        String pays = "Espagne";
        
        Orange instance = new Orange();
        Orange instance2 = new Orange(1.0, pays);
        
        String expResult = "France";
        String expResult2 = pays;
        
        String result = instance.getOrigine();
        String result2 = instance2.getOrigine();
        
        assertEquals(expResult, result);
        assertEquals(expResult2, result2);
    }

    /**
     * Test of setPrix method, of class Orange.
     */
    @Test
    public void testSetPrix() throws OrangeNegException {
        System.out.println("setPrix");
        double prix = 1.0;
        Orange instance = new Orange();
        instance.setPrix(prix);
        double result=instance.getPrix();
        
        Orange instance2 = new Orange(2.5,"Espagne");
        instance2.setPrix(prix);
        double result2=instance2.getPrix();
        assertTrue(prix==result2);
    }

    /**
     * Test of setOrigine method, of class Orange.
     */
    @Test
    public void testSetOrigine() {
        System.out.println("setOrigine");
        String origine = "";
        Orange instance = new Orange();
        instance.setOrigine(origine);

        assertEquals(origine,instance.getOrigine());
    }

    /**
     * Test of toString method, of class Orange.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Orange instance = new Orange();
        String expResult = "Orange :\nPrix : "+"1.0"+"\nOrigine : "+"France"+"\n\n";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
