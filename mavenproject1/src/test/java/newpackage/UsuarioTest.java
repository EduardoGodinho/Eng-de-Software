/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Dell Gamer
 */
public class UsuarioTest {
    
    public UsuarioTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of setNomeuser method, of class Usuario.
     */
    @Test
    public void testSetNomeuser() {
        System.out.println("setNomeuser");
        String Nomeuser = "";
        Usuario instance = new Usuario();
        instance.setNomeuser(Nomeuser);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNomeuser method, of class Usuario.
     */
    @Test
    public void testGetNomeuser() {
        System.out.println("getNomeuser");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getNomeuser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCPF method, of class Usuario.
     */
    @Test
    public void testSetCPF() {
        System.out.println("setCPF");
        int CPF = 0;
        Usuario instance = new Usuario();
        instance.setCPF(CPF);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCPF method, of class Usuario.
     */
    @Test
    public void testGetCPF() {
        System.out.println("getCPF");
        Usuario instance = new Usuario();
        int expResult = 0;
        int result = instance.getCPF();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPwaccess method, of class Usuario.
     */
    @Test
    public void testSetPwaccess() {
        System.out.println("setPwaccess");
        String Pwaccess = "";
        Usuario instance = new Usuario();
        instance.setPwaccess(Pwaccess);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPwaccess method, of class Usuario.
     */
    @Test
    public void testGetPwaccess() {
        System.out.println("getPwaccess");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getPwaccess();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
