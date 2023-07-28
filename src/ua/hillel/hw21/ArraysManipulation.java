package ua.hillel.hw21;

import java.util.ArrayList;


public class ArraysManipulation {
	
	
//	public static void main(String[] args) {
//		int [] array = {5,8,4,2,4,5,1,23,56,7,1,2};
//		
//		int [] array2 = {1,2,3,4,5};
//		
//		int [] arrayAfter4 = arrayAfter4(array);
//		
//		System.out.println(Arrays.toString(arrayAfter4));
//		
//		System.out.println(check4And1(array2));
//	}

	public static int[] arrayAfter4(int[] array) {
		
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for( int i: array) {
			list.add(i);
		}
		if(list.isEmpty() || !list.contains(4)) {
			throw new RuntimeException("Array is empty or do not contains 4");
		}

		return list.subList(list.lastIndexOf(4) + 1, list.size()).stream().mapToInt(a -> a).toArray();

	}
	
	
	public static boolean check4And1 (int[] array) {
		boolean answer;
		int count4 = 0;
		int count1 = 0;
		for( int i: array) {
			if(i == 1) {
				count1++;
			}
			
			if(i == 4) {
				count4++;
			}
		}
		if(count1 == 0 || count4 == 0) {
			answer = false;
		} else {
			answer = true;
		}
		return answer;
	}
}
