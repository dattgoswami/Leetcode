package helper;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class PowerSet{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> orig = new HashSet<Integer>();
		for(int i=0; i<3; i++){
			orig.add(i);
		}
		Set<Set<Integer>> op = powerSet(orig);
		System.out.println(op);
	}

	public static Set<Set<Integer>> powerSet(Set<Integer> originalSet) {
        Set<Set<Integer>> sets = new HashSet<Set<Integer>>();
        if (originalSet.isEmpty()) {
            sets.add(new HashSet<Integer>());
            return sets;
        }
        ArrayList<Integer> list = new ArrayList<Integer>(originalSet);
        Integer head = list.get(0);
        Set<Integer> rest = new HashSet<Integer>(list.subList(1, list.size()));
        for (Set<Integer> set : powerSet(rest)) {
            Set<Integer> newSet = new HashSet<Integer>();
            newSet.add(head);
            newSet.addAll(set);
            sets.add(newSet);
            sets.add(set);
        }
        return sets;
    }
}

