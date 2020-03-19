package com.tawbin;

import java.util.Arrays;

public class SortArray {
	public static int[] bubbleSort(int[] num) {
		int temp = 0;
		
		for(int i=0; i<num.length-1; i++) {
			for(int j=0; j<num.length-1-i;j++ ) {
				if(num[j]>num[i+1]) {
					temp = num[j];
					num[j] = num[j+1];
					num[j+1] = temp;
				}
			}
		}
		return num;
		
	}
	

	public static void main(String[] args) {
		
}
}

/*
 * select col1, col2 from table1 RIGHT JOIN table2 on table1.id = table2.id
 * where table1.col1 = 'NJ';
 * 
 * select col1, col2 from table2 LEFT JOIN table1 on table1.id = table2.id where
 * table1.col1 = 'NJ';
 */