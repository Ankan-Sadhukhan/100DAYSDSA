package DAY21;

import java.util.*;

public class FIndelementthatappearstwice {
    public int singleNonDuplicate(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int el = arr[i];
            if(map.containsKey(el)){
                int of = map.get(el);
                map.put(el, of+1);
            }else{
                map.put(el, 1);
            }
        }

        for(int i=0;i<arr.length;i++){
            if(map.get(arr[i]) <2){
                return arr[i];
            }
        }

        return -1;
    }
}
