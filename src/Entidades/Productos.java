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
public abstract class Productos {

    private String TipoFarmaco;
    private String Medicamento;
    private double Cantidad;

    public Productos(String TipoFarmaco, String Medicamento, double Cantidad) {
        this.TipoFarmaco = TipoFarmaco;
        this.Medicamento = Medicamento;
        this.Cantidad = Cantidad;

    }

    public String getTipoFarmaco() {
        return TipoFarmaco;
    }

    public void setTipoFarmaco(String TipoFarmaco) {
        this.TipoFarmaco = TipoFarmaco;
    }

    public String getMedicamento() {
        return Medicamento;
    }

    public void setMedicamento(String Medicamento) {
        this.Medicamento = Medicamento;
    }

    public double getCantidad() {
        return Cantidad;
    }

    public void setCantidad(double Cantidad) {
        this.Cantidad = Cantidad;
    }

}
