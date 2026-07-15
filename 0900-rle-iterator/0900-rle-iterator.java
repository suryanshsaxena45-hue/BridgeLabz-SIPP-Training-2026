class RLEIterator {
    private int[] encoding;
    private int index;

    public RLEIterator(int[] encoding) {
        this.encoding = encoding;
        this.index = 0; // Tracks the current count element (always an even index)
    }
    
    public int next(int n) {
        // Walk through the encoded array while there are elements left to process
        while (index < encoding.length) {
            if (n > encoding[index]) {
                // Exhaust the entire current run and subtract its capacity from n
                n -= encoding[index];
                index += 2; 
            } else {
                // Deduct remaining n from the current run and return its value
                encoding[index] -= n;
                return encoding[index + 1];
            }
        }
        // Return -1 if all elements are exhausted before completing the step
        return -1;
    }
}