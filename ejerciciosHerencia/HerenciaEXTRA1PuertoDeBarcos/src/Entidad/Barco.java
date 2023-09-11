/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *Un Barco se caracteriza por: su matrícula, su eslora en metros y
     * año de fabricación.
 * @author lu_co
 */
public class Barco {
    protected String matricula;
    protected int eslora;
    protected int anoDeFabricacion;

    public Barco() {
    }

    public Barco(String matricula, int eslora, int anoDeFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anoDeFabricacion = anoDeFabricacion;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public int getAnoDeFabricacion() {
        return anoDeFabricacion;
    }

    public void setAnoDeFabricacion(int anoDeFabricacion) {
        this.anoDeFabricacion = anoDeFabricacion;
    }

    @Override
    public String toString() {
        return "Barco{" + "matricula=" + matricula + ", eslora=" + eslora + ", anoDeFabricacion=" + anoDeFabricacion + '}';
    }
    
    
}
