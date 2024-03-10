package DAY9;

import java.util.Collections;
import java.util.PriorityQueue;

public class MaximizeHappinessofSelectedChildren {
    public long maximumHappinessSum(int[] happiness, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i=0;i<happiness.length;i++){
            pq.add(happiness[i]);
        }
        
        long ans =0;
        for(int i=0;i<k;i++){
            System.out.println(pq.peek());
            int p = pq.peek();
            if(p <= i){
                break;
            }
            ans +=p;
            ans -= i;
            pq.poll();
        }
        
        return ans;
    }
}
