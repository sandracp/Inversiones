package org.pena.sandra;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Util {
	public int[] generateVectorFromFile(String path) throws FileNotFoundException, IOException {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		File file = new File(path);
		FileInputStream fis = new FileInputStream(file);
		 
		//Construct BufferedReader from InputStreamReader
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
	 
		String line = null;
		while ((line = br.readLine()) != null) {
			numbers.add(Integer.parseInt(line));
		}
	 
		br.close();
		return convertIntegers(numbers);
    }
	
	public int[] convertIntegers(List<Integer> integers)
	{
	    int[] ret = new int[integers.size()];
	    Iterator<Integer> iterator = integers.iterator();
	    for (int i = 0; i < ret.length; i++)
	    {
	        ret[i] = iterator.next().intValue();
	    }
	    return ret;
	}
	
	public static void printVector(int[] v) {
		System.out.println("");
		for (int i = 0; i < 10; i += 1) {
            System.out.print(" " + v[i]);
        }
		System.out.println("");
	}
}
