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

    /**
     * Rigourous Test :-)
     * @throws IOException 
     * @throws FileNotFoundException 
     */
    public void testLote01() throws FileNotFoundException, IOException
    {
    	int[] v1 = Util.generateVectorFromFile("lotes/lote01.txt");
    	Util.printVector(v1);
    	int result = Inversiones.countSplitInversion(v1);
        assertEquals(result, (int)1549953513);
    }
    
    /**
     * Rigourous Test :-)
     * @throws IOException 
     * @throws FileNotFoundException 
     */
    public void testLote02() throws FileNotFoundException, IOException
    {
    	int[] v2 = Util.generateVectorFromFile("lotes/lote02.txt");
    	int result = Inversiones.countSplitInversion(v2);
        assertEquals(2062283231, result);
    }
    
    /**
     * Rigourous Test :-)
     * @throws IOException 
     * @throws FileNotFoundException 
     */
    public void testLote03() throws FileNotFoundException, IOException
    {
    	int[] v3 = Util.generateVectorFromFile("lotes/lote03.txt");
    	int result = Inversiones.countSplitInversion(v3);
        assertEquals(935549201, result);
    }
}
