package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

	/*
	 Given a non-empty array of integers, return the k most frequent elements.

	For example,
	Given [1,1,1,2,2,3] and k = 2, return [1,2].

	Note: 
	You may assume k is always valid, 1 ≤ k ≤ number of unique elements.
	Your algorithm's time complexity must be better than O(n log n), where n is the array's size.
	Subscribe to see which companies asked this question

	 */
//Final answer
public class TopKFrequentElements {
    public static ArrayList<Integer> topKFrequent(int[] nums, int k) {
         HashMap<Integer,Integer> map = new HashMap();
				ArrayList<Integer> list = new ArrayList();
				Set<Integer> set = new HashSet();
				for(int i=0; i< nums.length; i++){
					if(map.containsKey(nums[i])){
						int count = map.get(nums[i]);
						count++;
						map.remove(nums[i]);
						map.put(nums[i],count);
					}else{
						map.put(nums[i], 1);
					}
				}
				int array[] = new int[20000];
				int j = 0;
				for (Entry<Integer, Integer> entry : map.entrySet()) {
					array[j] = entry.getValue();	
					j++;
				}
				Arrays.sort(array);
				j = 19999;
				int count = 0;
				for(int i=0; i<k; i++){
					for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
						if(array[j-i] == entry.getValue()){
							set.add(entry.getKey());
						}
					}
				}
				list.addAll(set);
				return list;
    }
}

/* Testing
	public class Solution {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int nums[] = {1,1,1,2,4,5,1,2,3};
			topKFrequent(nums,2);
		}

		 public static void topKFrequent(int[] nums, int k) {
		         HashMap<Integer,Integer> map = new HashMap();
						ArrayList<Integer> list = new ArrayList();
						Set<Integer> set = new HashSet();
						for(int i=0; i< nums.length; i++){
							if(map.containsKey(nums[i])){
								int count = map.get(nums[i]);
								count++;
								map.remove(nums[i]);
								map.put(nums[i],count);
							}else{
								map.put(nums[i], 1);
							}
						}
						int array[] = new int[20000];
						int j = 0;
						for (Entry<Integer, Integer> entry : map.entrySet()) {
							array[j] = entry.getValue();	
							j++;
						}
						Arrays.sort(array);
						j = 19999;
						int count = 0;
						for(int i=0; i<k; i++){
							for (Entry<Integer, Integer> entry : map.entrySet()) {
								if(array[j-i] == entry.getValue()){
									set.add(entry.getKey());
								}
							}
						}
						list.addAll(set);
						System.out.println(list);
		    }
		
		
//		public static ArrayList topKFrequent(int[] nums, int k) {
//		        HashMap<Integer,Integer> map = new HashMap();
//				ArrayList<Integer> list = new ArrayList();
//				for(int i=0; i< nums.length; i++){
//					if(map.containsKey(nums[i])){
//						int count = map.get(nums[i]);
//						count++;
//						map.remove(nums[i]);
//						map.put(nums[i],count);
//					}else{
//						map.put(nums[i], 1);
//					}
//				}
////				System.out.println(map);
//				int array[] = new int[10];
//				int j = 0;
//				for (Entry<Integer, Integer> entry : map.entrySet()) {
////					System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
//					array[j] = entry.getValue();	
//					j++;
//				}
////				for(int i=0; i<array.length;i++){
////				System.out.print(array[i]+ " " );}
//				Arrays.sort(array);
////				System.out.println();
////				for(int i=0; i<array.length;i++){
////					System.out.print(array[i]+ " " );}
//				j = 9;
//				int count = 0;
//				for(int i=0; i<k; i++){
//					for (Entry<Integer, Integer> entry : map.entrySet()) {
//						if(array[j-i] == entry.getValue()){
//							System.out.println("count " + count++);
//							list.add(entry.getKey());
//						}
//					}
//				}
////				System.out.println();
////				for(int i=0; i<array.length;i++){
////				System.out.print(array[i]+ " ");}
////		        
//				return list;
//		}
		

	} */



