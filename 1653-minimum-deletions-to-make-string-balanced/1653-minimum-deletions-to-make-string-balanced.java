class Solution {
    public int minimumDeletions(String s) {
        int countA = 0,countB=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a')
                countA++;
        }
        if(countA==0) return 0;
        int ans = countA;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a')
                countA--;
            else
                countB++;
            ans = Math.min(ans,countA+countB);
        }
        return ans;
        
    }
}