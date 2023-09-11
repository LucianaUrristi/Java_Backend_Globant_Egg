/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e2jutemperatura;

/**
 *
 * @author lu_co
 */
public class TemperatureConverter {
    public TemperatureConverter converterC(){
        TemperatureConverter tC = new TemperatureConverter();
        return tC;
    }
    public double converterC(double temperatura){
        double temperaturaC = temperatura * 1.0;
        return temperaturaC;        
    }
    public double converterF(double temperatura){
        double temperaturaF = ((temperatura * 9/5) + 32.0);
        return temperaturaF;        
    }
    public double converterK(double temperatura){
        double temperaturaK = (temperatura + 273.15);
        return temperaturaK;        
    }
}
