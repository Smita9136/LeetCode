class Solution {
    public int findMaxValueOfEquation(int[][] points, int k) {
  int maxVal = Integer.MIN_VALUE;
    Deque<int[]> deque = new LinkedList<>();

    for (int[] point : points) {
        // Remove elements from the deque if they are out of the allowed distance k
        while (!deque.isEmpty() && point[0] - deque.peekFirst()[0] > k) {
            deque.pollFirst();
        }

        // Calculate the value of the equation with the current point
        if (!deque.isEmpty()) {
            maxVal = Math.max(maxVal, point[0] + point[1] + deque.peekFirst()[1] - deque.peekFirst()[0]);
        }

        // Maintain the deque to always have the max y - x value at the front
        while (!deque.isEmpty() && point[1] - point[0] >= deque.peekLast()[1] - deque.peekLast()[0]) {
            deque.pollLast();
        }

        // Add the current point to the deque
        deque.offerLast(point);
    }

    return maxVal;
}
        
    
}