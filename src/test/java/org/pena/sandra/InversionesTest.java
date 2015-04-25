package org.pena.sandra;

import java.io.FileNotFoundException;
import java.io.IOException;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class InversionesTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public InversionesTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( InversionesTest.class );
    }

    public void testLote01() throws FileNotFoundException, IOException
    {
    	Inversiones inv = new Inversiones();
    	Util util = new Util();
    	int[] v1 = util.generateVectorFromFile("lotes/lote01.txt");
    	long expected = Long.parseLong("15629915671");
    	long result = inv.getInvCount(v1, v1.length);
        assertEquals(expected, result);
    }
    
    public void testLote02() throws FileNotFoundException, IOException
    {
    	Inversiones inv = new Inversiones();
    	Util util = new Util();
    	int[] v2 = util.generateVectorFromFile("lotes/lote02.txt");
    	long expected = Long.parseLong("62362226209");
    	long result = inv.countSplitInversion(v2);
        assertEquals(expected, result);
    }
    
    public void testLote03() throws FileNotFoundException, IOException
    {
    	Inversiones inv = new Inversiones();
    	Util util = new Util();
    	int[] v3 = util.generateVectorFromFile("lotes/lote03.txt");
    	long result = inv.countSplitInversion(v3);
    	long expected = Long.parseLong("250043652369");
        assertEquals(expected, result);
    }
    
    public void testLoteFixed() throws FileNotFoundException, IOException
    {
    	Inversiones inv = new Inversiones();
    	int[] v1 = {3, 5, 2, 7, 6, 8};
    	long expected = inv.getInvCount(v1, v1.length);
    	long result = inv.countSplitInversion(v1);
        assertEquals(expected, result);
    }
    
    public void testLoteFixed2() throws FileNotFoundException, IOException
    {
    	Inversiones inv = new Inversiones();
    	int[] v1 = {3, 5, 2, 7, 6, 8, 1};
    	long expected = inv.getInvCount(v1, v1.length);
    	long result = inv.countSplitInversion(v1);
        assertEquals(expected, result);
    }
}
