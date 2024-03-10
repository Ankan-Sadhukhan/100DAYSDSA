package DAY9;

import java.util.HashSet;
import java.util.Set;

public class  IntersectionofTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> ans = new HashSet<>();
        
        for (int num : nums1) set.add(num);
        for (int num : nums2) if (set.contains(num)) ans.add(num);
        
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }
}
