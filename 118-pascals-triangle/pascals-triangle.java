class Solution 
{
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        if (numRows == 0) return triangle;
        
        // Base case: Row 0 (always [1])
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);
        
        // Build subsequent rows
        for (int row = 1; row < numRows; row++) {
            List<Integer> prev = triangle.get(row - 1);  // Get previous row
            List<Integer> current = new ArrayList<>();   // Create new current row
            
            current.add(1);  // First element is always 1
            
            // Middle elements: sum of two elements above
            for (int col = 1; col < row; col++) {
                int sum = prev.get(col - 1) + prev.get(col);
                current.add(sum);
            }
            
            current.add(1);  // Last element is always 1
            triangle.add(current);
        }
        
        return triangle;
    }

}