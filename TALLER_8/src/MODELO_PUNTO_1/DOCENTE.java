/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO_PUNTO_1;

/**
 *
 * @author Help Desk
 */
public class DOCENTE implements I_TRABJADOR
        
{
    private int horasDictadas;
    private double pagoPorHora;

    public DOCENTE () {
    }

    public DOCENTE (int horasDictadas) {
        this.horasDictadas = horasDictadas;
        this.pagoPorHora = 120;
    }

    public int getHorasDictadas() {
        return horasDictadas;
    }

    public void setHorasDictadas(int horasDictadas) {
        this.horasDictadas = horasDictadas;
    }

    public double getPagoPorHora() {
        return pagoPorHora;
    }

    public void setPagoPorHora(double pagoPorHora) {
        this.pagoPorHora = pagoPorHora;
    }

    @Override
    public double obtenerSueldo() {
        return this.horasDictadas * this.pagoPorHora;
    }

    @Override
    public double obtenerBonificacion() {
        return this.obtenerSueldo() * 0.7;
    
}
}