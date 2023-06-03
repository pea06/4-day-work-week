import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> hashMap = new HashMap<>();

        for (String a : participant) {
            hashMap.put(a, hashMap.getOrDefault(a, 0) + 1);
        }
        
        for (String a : completion) {
            hashMap.put(a, hashMap.get(a) -1);
        }

        String[] ketSet = hashMap.keySet().toArray(String[]::new);

        for (int i = 0; i < ketSet.length; i++) {
            if(hashMap.get(ketSet[i]) != 0)  {
                return ketSet[i];
            }
        }
        
        return null;
    }
}