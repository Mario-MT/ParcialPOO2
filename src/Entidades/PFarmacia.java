/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Mario Mendoza
 */
public class PFarmacia extends Productos implements CalcPrecio{
    private double CalcTprecio;
    private double Precio;

    public PFarmacia(double CalcTprecio, double Precio, String TipoFarmaco, String Medicamento, double Cantidad) {
        super(TipoFarmaco, Medicamento, Cantidad);
        this.CalcTprecio = CalcTprecio;
        this.Precio = Precio;
    }





    @Override
    public double Tprecio(double Cantidad, double precio) {
        return Cantidad * precio;
    }


    public double getCalcTprecio() {
        return CalcTprecio;
    }

    public void setCalcTprecio(double CalcTprecio) {
        this.CalcTprecio = CalcTprecio;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }
    
    
    
}
