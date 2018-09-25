/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

/**
 *
 * @author vb394093
 */
public class OrangeNegException extends Exception{
    public String message;
    public OrangeNegException(){
        super("Orange avec un prix négatif !!");
        message="Orange avec un prix négatif !!";
    }
    
    
}
