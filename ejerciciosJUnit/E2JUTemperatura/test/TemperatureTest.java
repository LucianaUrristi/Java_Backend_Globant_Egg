/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import e2jutemperatura.TemperatureConverter;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lu_co
 */
public class TemperatureTest {
    
    public TemperatureTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testCelsius(){
        System.out.println("prueba de celsius");
        TemperatureConverter tC = new TemperatureConverter();
        double result = tC.converterC(10.0);
        System.out.println(result);
        assertEquals(10.0, result, 0);        
    }

   @Test
   public void testFahrenheit() {
       System.out.println("prueba de fahrenheit");
       TemperatureConverter tC = new TemperatureConverter();
       double result = tC.converterF(10.0);
       System.out.println(result);
       assertEquals(50.0, result, 0);   
   }
   @Test
   public void testKelvin() {
       System.out.println("prueba de kelvin");
       TemperatureConverter tC = new TemperatureConverter();
       double result = tC.converterK(10.0);
       System.out.println(result);
       assertEquals(283.15, result, 0);   
   }
}
