/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Service.ServiceDiscountC;
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
    
    ServiceDiscountC sDC;
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        sDC = new ServiceDiscountC();
    }
    
    @After
    public void tearDown() {
    }
    
    

    // Todos los test van a ser publicos, void 
    //@Test
    //public void deberiaHacerAlgo(){
    // comandos de junit
    //}
}
