/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;
import fr.ufrsciencestech.panier.OrangeNegException;
/**
 *
 * @author vb394093
 */
public class Orange {
    private double prix;
    private String origine;
    
    public Orange()
    {
        this.prix=1.0;
        this.origine = "France";
    }
    
    public Orange(double prix,String origine) throws OrangeNegException {
        if(prix<=0){
            throw new OrangeNegException();
        }
        this.prix=prix;
        this.origine=origine;
    }
    public double getPrix(){
        return prix;
    }
    public String getOrigine(){
        return origine;
    }
    /**
     * @param prix the prix to set
     */
    public void setPrix(double prix) {
        this.prix = prix;
    }

    /**
     * @param origine the origine to set
     */
    public void setOrigine(String origine) {
        this.origine = origine;
    }
    public String toString(){
        String s="";
        s+="Orange :\n";
        s+="Prix : "+Double.toString(this.prix)+"\n";
        s+="Origine : "+this.origine+"\n\n";
        return s;
    }
    
}
