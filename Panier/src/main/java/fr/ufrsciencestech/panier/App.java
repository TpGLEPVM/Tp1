package fr.ufrsciencestech.panier;

import javax.swing.JButton;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws OrangeNegException
    {
        
        Panier p = new Panier();
        p.ajoute(new Orange(0.8,"France"));
        p.ajoute(new Orange(0.8,"France"));
        p.ajoute(new Orange(0.9,"France"));
        //System.out.println(p.quantite());
        p.boycotteOrigine("France");
        System.out.println(p.toString());
        
        VueGSwing vue = new VueGSwing(); 
        vue.setVisible(true);
        
        
        MControler controler=new MControler(p,vue);
        p.addObserver(vue);
        vue.addControleur(controler);
        vue.update(p, args);
        
        
        

    }
}
