/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modocompra;

/**
 *
 * @author nesto
 */
public class ReFarmaco {
   
    
    public String Tipo,nom,carga;
    public int cantidad;
    public double precioU, Tinversion;

    public ReFarmaco(String Tipo,String nom,String carga, int cantidad, double precioU, double Tinversion) {
        this.Tipo = Tipo;
        this.nom= nom;
        this.carga= carga;
        this.cantidad = cantidad;
        this.precioU = precioU;
        this.Tinversion = Tinversion;
    }

  
    
}
