/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

import java.util.Observable;
import java.util.Observer;
import javax.swing.JButton;

/**
 *
 * @author vb394093
 */
public interface VueGraphique extends Observer {
    public void update(Observable m,Object o);
    public JButton getBtn1();
    public JButton getBtn2();
}
