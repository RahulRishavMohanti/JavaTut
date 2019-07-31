package com.visa.prj.util;

import java.util.Arrays;
import java.util.HashMap;

public class ArrayUtil {
	public static int getSum(int[] elems) {
		int sum=0;
		for (int i = 0; i < elems.length; i++) {
			sum+=elems[i];
		}
		return sum;
	}
	public static int getCount(int[] elems,int no) {
		int ctr=0;
		for (int i = 0; i < elems.length; i++) {
			if(elems[i]==no)
			{
				ctr++;
			}
		}
		return ctr;
        
	}
	public static void sort(int[] elems) {
		for (int i = 0; i < elems.length; i++) {
			for (int j = i+1; j < elems.length; j++) {
				if(elems[i]>elems[j])
				{
					int temp = elems[i];
					elems[i] = elems[j];
					elems[j] = temp;
				}
			}
		}
	}
}
