package easy;

import java.util.HashMap;
import java.util.Map;

public class NumberOfBoomerangs_447 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public int numberOfBoomerangs(int[][] points) {
	        //For every i, we capture the number of points equidistant from i. Now for this i, we have to calculate all 
	        //possible permutations of (j,k) from these equidistant points.
	        //Total number of permutations of size 2 from n different points is nP2 = n!/(n-2)! = n * (n-1)
	        int res = 0;
	        Map<Integer, Integer> map = new HashMap<>();
	        for(int i=0; i<points.length; i++) {
	            for(int j=0; j<points.length; j++) {
	                if(i == j)
	                    continue;
	            int d = getDistance(points[i], points[j]);                
	            map.put(d, map.getOrDefault(d, 0) + 1);
	            }
	            for(int val : map.values()) {
	                res += val * (val-1);
	            }            
	            map.clear();
	        }
	        return res;
	    }
	    private static int getDistance(int[] a, int[] b) {
	        int dx = a[0] - b[0];
	        int dy = a[1] - b[1];
	        return dx*dx + dy*dy;
	    }
}
