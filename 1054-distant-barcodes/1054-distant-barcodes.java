class Solution {
    static class Pair implements Comparable<Pair>{
        int val;
        int freq;
        public Pair(int val,int freq){
            this.val=val;
            this.freq=freq;
        }
        @Override
        public int compareTo(Pair p2){
            if(this.freq!=p2.freq){
                return p2.freq-this.freq;
            }else{
               return  p2.val-this.val;
            }
        }
    }
     public int[] rearrangeBarcodes(int[] barcodes) {
        int freq[]=new int[10001];
        int n=barcodes.length;
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for(int i=0;i<n;i++){
            freq[barcodes[i]]++;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]>0){
                pq.add(new Pair(i,freq[i]));
            }
        }
        int idx=0;
        int ans[]=new int[n];
        while(pq.size()>1 && idx<n){
            Pair curr=pq.remove();
            Pair sec=pq.remove();
            ans[idx]=curr.val;
            ans[idx+1]=sec.val;
            idx=idx+2;
           if(curr.freq-1>0){
            pq.add(new Pair(curr.val,curr.freq-1));
           }if(sec.freq-1>0){
            pq.add(new Pair(sec.val,sec.freq-1));
        }
        }
        while(!pq.isEmpty()&& idx<n){
        ans[idx]=pq.remove().val;
        idx++;
        }
        return ans;
    }
}