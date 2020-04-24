/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modocompra;

import java.util.ArrayList;

/**
 *
 * @author nesto
 */

public class TipoFarmaco{ 
        
    public String tipo;

    /**
     *
     */
    public  ArrayList <String> medicamento;

    public TipoFarmaco(String tipo, ArrayList <String> medicamento) {
       this.tipo=tipo;
       this.medicamento= medicamento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ArrayList<String> getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(ArrayList<String> medicamento) {
        this.medicamento = medicamento;
    }

    
    }

    

   

