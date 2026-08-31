class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        
        ListNode prev = head;
        ListNode curr = head.next;
        
        int index = 1;
        int first = -1;
        int last = -1;
        int minDistance = Integer.MAX_VALUE;
        
        while (curr.next != null) {
            
            // Check if current node is a critical point
            if ((curr.val > prev.val && curr.val > curr.next.val) ||
                (curr.val < prev.val && curr.val < curr.next.val)) {
                
                // First critical point
                if (first == -1) {
                    first = index;
                } else {
                    // Minimum distance between consecutive critical points
                    minDistance = Math.min(minDistance, index - last);
                }
                
                // Update last critical point
                last = index;
            }
            
            prev = curr;
            curr = curr.next;
            index++;
        }
        
        // Less than 2 critical points
        if (first == -1 || first == last) {
            return new int[]{-1, -1};
        }
        
        int maxDistance = last - first;
        
        return new int[]{minDistance, maxDistance};
    }
}