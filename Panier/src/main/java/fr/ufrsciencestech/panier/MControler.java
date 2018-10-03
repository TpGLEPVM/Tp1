/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author vb394093
 */
public class MControler implements ActionListener{
    
    private Panier modele;
    private VueGraphique vue;
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton bouton = (JButton)e.getSource();

        if(bouton==vue.getBtn1()){  
            modele.ajoute();
        }
        else if(bouton==vue.getBtn2()){
            modele.retire();
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public MControler(){}
    public MControler(Panier p,VueGraphique v){
        this.modele=p;
        this.vue=v;
    }

    public void setModele(Panier p){
        this.modele=p;
    }
    public void setVue(VueGSwing v){
        this.vue=v;
    }
    
    
}
