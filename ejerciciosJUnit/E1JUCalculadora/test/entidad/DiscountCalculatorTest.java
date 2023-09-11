/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

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
public class DiscountCalculatorTest {
    
    public DiscountCalculatorTest() {
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

    /**
     * Test of getPrecio method, of class DiscountCalculator.
     */
    @Test
    public void testGetPrecio() {
        System.out.println("getPrecio");
        DiscountCalculator instance = new DiscountCalculator();
        double expResult = 0.0;
        double result = instance.getPrecio();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getDescuento method, of class DiscountCalculator.
     */
    @Test
    public void testGetDescuento() {
        System.out.println("getDescuento");
        DiscountCalculator instance = new DiscountCalculator();
        double expResult = 0.0;
        double result = instance.getDescuento();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setPrecio method, of class DiscountCalculator.
     */
    @Test
    public void testSetPrecio() {
        System.out.println("setPrecio");
        double precio = 0.0;
        DiscountCalculator instance = new DiscountCalculator();
        instance.setPrecio(precio);
    }

    /**
     * Test of setDescuento method, of class DiscountCalculator.
     */
    @Test
    public void testSetDescuento() {
        System.out.println("setDescuento");
        double descuento = 0.0;
        DiscountCalculator instance = new DiscountCalculator();
        instance.setDescuento(descuento); 
    }
    
}
