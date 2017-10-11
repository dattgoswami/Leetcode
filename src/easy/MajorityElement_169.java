package easy;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.swing.text.html.HTMLDocument.Iterator;


public class MajorityElement_169 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {1,1,1,12,2,2,3,4,5,1,1,1};
		System.out.println(majorityElement(num));
	}
	public static int majorityElement(int[] nums) {
		HashMap<Integer, Integer> intensityMap = new LinkedHashMap();
		int max = 0;
		int value = -1;
		for(int i=0; i<nums.length; i++){
			if(intensityMap.containsKey(nums[i])){
				int count = intensityMap.get(nums[i]);
				count++;
				intensityMap.remove(nums[i]);
				intensityMap.put(nums[i], count);
			}else{
				intensityMap.put(nums[i], 1);
			}
		}
		
		for (Map.Entry<Integer, Integer> entry : intensityMap.entrySet()) {
			if(max < entry.getValue()){
				max = entry.getValue();
				value = entry.getKey();
			}
//		    System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		}
		
//		System.out.println(intensityMap);
		return value;
    }
	/*Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

	You may assume that the array is non-empty and the majority element always exist in the array.
*/
}

/*
There are several ways of iterating over a Map in Java. Let's go over the most common methods and review their advantages and disadvantages. Since all maps in Java implement the Map interface, the following techniques will work for any map implementation (HashMap, TreeMap, LinkedHashMap, Hashtable, etc.)

Method #1: Iterating over entries using a For-Each loop.

This is the most common method and is preferable in most cases. It should be used if you need both map keys and values in the loop.

Map<Integer, Integer> map = new HashMap<Integer, Integer>();
for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
    System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
}
Note that the For-Each loop was introduced in Java 5, so this method is working only in newer versions of the language. Also a For-Each loop will throw NullPointerException if you try to iterate over a map that is null, so before iterating you should always check for null references.

Method #2: Iterating over keys or values using a For-Each loop.

If you need only keys or values from the map, you can iterate over keySet or values instead of entrySet.

Map<Integer, Integer> map = new HashMap<Integer, Integer>();

// Iterating over keys only
for (Integer key : map.keySet()) {
    System.out.println("Key = " + key);
}

// Iterating over values only
for (Integer value : map.values()) {
    System.out.println("Value = " + value);
}
This method gives a slight performance advantage over entrySet iteration (about 10% faster) and is more clean.

Method #3: Iterating using Iterator.

Using Generics:

Map<Integer, Integer> map = new HashMap<Integer, Integer>();
Iterator<Map.Entry<Integer, Integer>> entries = map.entrySet().iterator();
while (entries.hasNext()) {
    Map.Entry<Integer, Integer> entry = entries.next();
    System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
}
Without Generics:

Map map = new HashMap();
Iterator entries = map.entrySet().iterator();
while (entries.hasNext()) {
    Map.Entry entry = (Map.Entry) entries.next();
    Integer key = (Integer)entry.getKey();
    Integer value = (Integer)entry.getValue();
    System.out.println("Key = " + key + ", Value = " + value);
}
You can also use same technique to iterate over keySet or values.

This method might look redundant, but it has its own advantages. First of all, it is the only way to iterate over a map in older versions of Java. The other important feature is that it is the only method that allows you to remove entries from the map during iteration by calling iterator.remove(). If you try to do this during For-Each iteration you will get "unpredictable results" according to Javadoc.

From a performance point of view this method is equal to a For-Each iteration.

Method #4: Iterating over keys and searching for values (inefficient).

Map<Integer, Integer> map = new HashMap<Integer, Integer>();
for (Integer key : map.keySet()) {
    Integer value = map.get(key);
    System.out.println("Key = " + key + ", Value = " + value);
}
This might look like a cleaner alternative for method #1, but in practice it is pretty slow and inefficient as getting values by a key might be time-consuming (this method in different Map implementations is 20%-200% slower than method #1). If you have FindBugs installed, it will detect this and warn you about inefficient iteration. This method should be avoided.

Conclusion:

If you need only keys or values from the map, use method #2. If you are stuck with older version of Java (less than 5) or planning to remove entries during iteration, you have to use method #3. Otherwise use method #1.

*/
