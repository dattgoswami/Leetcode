package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class FindKClosestElements_658 {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		ArrayList<Integer> op = FindKClosestElements_658.findClosestElements(arr, 4, 3);
		System.out.println(op);
	}
	public static ArrayList<Integer> findClosestElements(int[] arr, int k, int x) {
		TreeMap<Integer, Integer> tMap = new TreeMap<>();
		for(int i : arr){
			tMap.put(i, Math.abs(i-x));
		}
		Map<Integer, Integer> sortedMap = tMap.entrySet().stream()
										.sorted(Entry.comparingByValue())
										.collect(Collectors.toMap(Entry::getKey, Entry::getValue,(e1, e2) -> e1, LinkedHashMap::new));
		ArrayList<Integer> op = new ArrayList<Integer>();
		Set<Integer> keySet = sortedMap.keySet();
		for(Integer i : keySet){
			if(k>0){
				op.add(i);
				k--;
			}
		}
		Collections.sort(op);
		return op;
    }
}
/*
Given a sorted array, two integers k and x, find the k closest elements to x in the array. The result should also be sorted in ascending order. If there is a tie, the smaller elements are always preferred.

Example 1:
Input: [1,2,3,4,5], k=4, x=3
Output: [1,2,3,4]
Example 2:
Input: [1,2,3,4,5], k=4, x=-1
Output: [1,2,3,4]
Note:
The value k is positive and will always be smaller than the length of the sorted array.
Length of the given array is positive and will not exceed 104
Absolute value of elements in the array and x will not exceed 104
*/