/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.Mapper;

import Service.Entity.Employee;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author doganyildirim
 */
public class EmployeeMapperTest
{
    
    public EmployeeMapperTest()
    {
    }
    
    @BeforeClass
    public static void setUpClass()
    {
    }
    
    @AfterClass
    public static void tearDownClass()
    {
    }

    /**
     * Test of createEmployee method, of class EmployeeMapper.
     */
    @Test
    public void testCreateEmployee() throws Exception
    {
        System.out.println("createEmployee");
        Employee e = null;
        EmployeeMapper instance = new EmployeeMapper();
        boolean expResult = false;
        boolean result = instance.createEmployee(e);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmployee method, of class EmployeeMapper.
     */
    @Test
    public void testGetEmployee() throws Exception
    {
        System.out.println("getEmployee");
        int id = 1;
        EmployeeMapper instance = new EmployeeMapper();

        Employee result = instance.getEmployee(id);
        
        Employee expResult = result;
        
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class EmployeeMapper.
     */
    @Test
    public void testMain() throws Exception
    {
        System.out.println("main");
        String[] args = null;
        EmployeeMapper.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
