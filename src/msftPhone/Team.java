package msftPhone;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Team{
    ArrayList<Person> people;
    public String mostUsedAttribute(){
        Map<String, Integer> hashMap = new HashMap<String, Integer>();
        String result = null;
        //list people n
        //list of attributes  m
        //O(mxn)+O(n)+O(n) = O(mxn)
        for(int i = 0; i<people.size() ; i++){
            for(int j = 0; j<people.get(i).attributes.size() ; j++){
                if(!hashMap.containsKey(people.get(i).attributes.get(j))){
                    //inserting it for the first time
                    hashMap.put(people.get(i).attributes.get(j), 1);
                }else{
                    //get count and increment it 
                    int count = hashMap.get(people.get(i).attributes.get(j));
                    count++;
                    hashMap.remove(people.get(i).attributes.get(j));
                    hashMap.put(people.get(i).attributes.get(j),count);
                }
            }
        }
        
        //number of values  in people list
        //O(n)
        Set<Map.Entry<String, Integer>> entrySet = hashMap.entrySet();
        int max = 0;
        for (Map.Entry<String, Integer> entry: entrySet){
             int val = entry.getValue();
             if(max < val){
                 max = val;
             }
        }
        //O(n)
        for (Map.Entry<String, Integer> entry: entrySet){
            int val = entry.getValue();
            if(max == val){
                result = entry.getKey();
            }
        }
        return result;
    }

}



//Object of 
//Team called t invokes this method
//in main
//as 
//string s = t.mostUsedAttribute();
//person1: a
//person2: b, c, d
//person3: e, f, g
//person4: a
//person5: b, c, f, g
//person6: b












