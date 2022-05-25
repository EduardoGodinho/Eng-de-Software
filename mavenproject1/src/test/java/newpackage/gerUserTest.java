/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.List;
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
public class gerUserTest {
    
    public gerUserTest() {
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
     * Test of getBdUser method, of class gerUser.
     */
    @Test
    public void testGetBdUser() {
        System.out.println("getBdUser");
        gerUser instance = new gerUser();
        List<Usuario> expResult = null;
        List<Usuario> result = instance.getBdUser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cadUser method, of class gerUser.
     */
    @Test
    public void testCadUser() {
        System.out.println("cadUser");
        Usuario user = null;
        gerUser instance = new gerUser();
        Usuario expResult = null;
        Usuario result = instance.cadUser(user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of consCPFuser method, of class gerUser.
     */
    @Test
    public void testConsCPFuser() {
        System.out.println("consCPFuser");
        Usuario user = null;
        gerUser instance = new gerUser();
        Usuario expResult = null;
        Usuario result = instance.consCPFuser(user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of attUser method, of class gerUser.
     */
    @Test
    public void testAttUser() {
        System.out.println("attUser");
        Usuario user = null;
        gerUser instance = new gerUser();
        instance.attUser(user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeUser method, of class gerUser.
     */
    @Test
    public void testRemoveUser() {
        System.out.println("removeUser");
        Usuario user = null;
        gerUser instance = new gerUser();
        Usuario expResult = null;
        Usuario result = instance.removeUser(user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
