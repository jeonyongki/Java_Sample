package com;

import java.util.ArrayList;

public class Example01 {

	public static void main(String[] args) {
		System.out.println(-+10);
		System.out.println(-10);
		System.out.println("-10");
		ArrayList<int[]> arr = new ArrayList<>();
		
		arr.add(new int[] {11,12,13});
		arr.add(new int[] {21,22,23});
		arr.add(new int[] {31,32,33});
		
		for(int i=0; i<arr.size(); i++) {
			for(int j=0; j<arr.get(i).length; j++) {
				System.out.print(arr.get(i)[j]+" ");
			}
			System.out.println();
		}
	}

}
