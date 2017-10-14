package medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class MaximumLengthOfPairChain_646 {

	public static void main(String[] args) {
		int[][] pairs = {{1,2}, {2,3}, {3,4}};
		System.out.println(findLongestChain(pairs));
	}
	
	public static int findLongestChain(int[][] pairs) {
		Set<Pair> originalSet = new LinkedHashSet<Pair>();
		for(int i=0; i<pairs.length; i++){
			Pair temp = new Pair(pairs[i][0], pairs[i][1]);
			originalSet.add(temp);
		}
		Set<Set<Pair>> powerSet = powerSet(originalSet);
		int maxChainLen = 0;
		for(Set<Pair> p : powerSet){
			int currChainLen = 0;
			int prevB = -1;
			for(Pair pair : p){
//				System.out.println(pair.a + " " + pair.b);
				if(prevB == -1){
					prevB = pair.b;
					currChainLen++;
					if(maxChainLen < currChainLen){
						maxChainLen = currChainLen;
					}
				}else if(prevB < pair.a){
						prevB = pair.b;
						currChainLen++;
						if(maxChainLen < currChainLen){
							maxChainLen = currChainLen;
						}
				}else{
					break;
				}
			}
		}
		return maxChainLen;
    }
	public static Set<Set<Pair>> powerSet(Set<Pair> origSet) {
        Set<Set<Pair>> sets = new HashSet<Set<Pair>>();
        if (origSet.isEmpty()) {
            sets.add(new HashSet<Pair>());
            return sets;
        }
        ArrayList<Pair> list = new ArrayList<Pair>(origSet);
        Pair head = list.get(0);
        Set<Pair> rest = new HashSet<Pair>(list.subList(1, list.size()));
        for (Set<Pair> set : powerSet(rest)) {
            Set<Pair> newSet = new HashSet<Pair>();
            newSet.add(head);
            newSet.addAll(set);
            sets.add(newSet);
            sets.add(set);
        }
        return sets;
    }
	
	public static class Pair{
		public int a;
		public int b;
		public Pair(int x, int y){
			this.a = x;
			this.b = y;
		}
	}
	//simpler solution
		/*
		public int findLongestChain(int[][] pairs) {
		    if (pairs == null || pairs.length == 0) return 0;
		     Arrays.sort(pairs, (a, b) -> (a[0] - b[0]));
		     int[] dp = new int[pairs.length];
		     Arrays.fill(dp, 1);
		     for (int i = 0; i < dp.length; i++) {
		     	for (int j = 0; j < i; j++) {
		        	dp[i] = Math.max(dp[i], pairs[i][0] > pairs[j][1]? dp[j] + 1 : dp[j]);
		        }
		     }
		     return dp[pairs.length - 1];
		}
		 */
}
/*
You are given n pairs of numbers. In every pair, the first number is always smaller than the second number.

Now, we define a pair (c, d) can follow another pair (a, b) if and only if b < c. Chain of pairs can be formed in this fashion.

Given a set of pairs, find the length longest chain which can be formed. You needn't use up all the given pairs. You can select pairs in any order.

Example 1:
Input: [[1,2], [2,3], [3,4]]
Output: 2
Explanation: The longest chain is [1,2] -> [3,4]
Note:
The number of given pairs will be in the range [1, 1000].
*/