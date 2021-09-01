package com.green.biz;

import static org.junit.Assert.*;

import org.junit.Test;

public class SearchMaxTest {

	@Test
	public void testSearchMax() {
		int[] arr1 ={1, 3, 4, 2};
        int[] arr2 = {-12, -1, -3, -4, -2};
        
        assertEquals("Calculator max", 4, CalcUtil.searchMax(arr1));
        assertEquals("Calculator max", -1, CalcUtil.searchMax(arr2));
	}

}
