/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package example;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nuria
 */
public class MiclaseTest {
    
    public MiclaseTest() {
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
     * Test of burbuja method, of class Miclase.
     */
    @Test
    public void Miclase() {
        System.out.println("burbuja");
        int[] ArrayN = {9,3,7,5};
        Miclase instance = new Miclase();
        int[] expResult = {3,5,7,9};
        int[] result = instance.Miclase(ArrayN);
        assertEquals(Arrays.toString(expResult), Arrays.toString(result));
        
    }
    
}
