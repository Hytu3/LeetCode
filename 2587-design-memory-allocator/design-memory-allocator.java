class Allocator {

    int n;

    List<Integer> list = new ArrayList<>();


    public Allocator(int n) {
        this.n = n;
        populateList(n);  
    }

    
    public int allocate(int size, int mID) 
    {
        int consecutiveNulls = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == null) {
                consecutiveNulls++;
                
                // If we found a big enough gap
                if (consecutiveNulls == size) {
                    int startIdx = i - size + 1; // Calculate where the gap started
                    
                    // Fill the memory
                    for (int k = startIdx; k <= i; k++) {
                        list.set(k, mID);
                    }
                    return startIdx;
                }
            } else {
                // Gap was broken by a number, reset counter
                consecutiveNulls = 0;
            }
        }

        return -1; // Not enough memory found
    }
    
    public int freeMemory(int mID) 
    {
        int count = 0;
        
        for (int i = 0; i < list.size(); i++)
        {
            // Free memory
            if (list.get(i) != null && list.get(i) == mID)
            {
                list.set(i, null);
                count++;
            }
        }

        return count;
        
    }

    public void populateList(int n)
    {
        int length = n;

        while (length > 0)
        {
          list.add(null);
          length--;  
        }
        
    }
}

/**
 * Your Allocator object will be instantiated and called as such:
 * Allocator obj = new Allocator(n);
 * int param_1 = obj.allocate(size,mID);
 * int param_2 = obj.freeMemory(mID);
 */