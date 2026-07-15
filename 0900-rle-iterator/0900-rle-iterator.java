class RLEIterator {
    private int[] encoding;
    private int index;

    public RLEIterator(int[] encoding) {
        this.encoding = encoding;
        this.index = 0; // Tracks the current count element (always an even index)
    }
    
    public int next(int n) {
        
        while (index < encoding.length) {
            if (n > encoding[index]) {
                
                n -= encoding[index];
                index += 2; 
            } else {
                
                encoding[index] -= n;
                return encoding[index + 1];
            }
        }
        
        return -1;
    }
}