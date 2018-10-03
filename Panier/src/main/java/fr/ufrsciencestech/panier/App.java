package fr.ufrsciencestech.panier;

import javax.swing.JButton;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    private VueGraphique vueg;
        
    public VueGraphique getVueg()
    {
        return vueg;
    }
    public void setVueg(VueGraphique vueg)
    {
        this.vueg=vueg;
    }
        
    public static void main( String[] args ) throws OrangeNegException
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        App app = (App)context.getBean("App");
        
        Panier p = new Panier();
        p.ajoute(new Orange(0.8,"France"));
        p.ajoute(new Orange(0.8,"France"));
        p.ajoute(new Orange(0.9,"France"));
        //System.out.println(p.quantite());
        p.boycotteOrigine("France");
        System.out.println(p.toString());
        
        /*
        //VueGSwing vue = new VueGSwing(); 
        VueGAWT vue = new VueGAWT();
        vue.setVisible(true);
        
        
        MControler controler=new MControler(p,vue);
        p.addObserver(vue);
        vue.addControleur(controler);
        vue.update(p, args);
        */
        
        
        
        

    }
}
