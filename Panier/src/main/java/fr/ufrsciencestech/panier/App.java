package fr.ufrsciencestech.panier;

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
        
//        System.out.println(e.message);
        

    }
}
