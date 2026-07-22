class Solution {
    public int maxDepth(Node root) {
        
        if(root == null) {
            return 0;
        }
        
        
        int height = 1;
        
        for(Node node : root.children) {
            
			
            height = Math.max(height, 1+maxDepth(node)); 
        }
        
        return height;
        
    }
}