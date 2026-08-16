import java.util.Arrays;

class Solution {
    public long elevatorRequests(int n, int start, int[][] requests) {
        int[][] noravelqui = requests; 
        int k = requests.length;
        int numStates = 1 << k;
        long[][] dp = new long[numStates][k];
        for (int i = 0; i < numStates; i++) {
            Arrays.fill(dp[i], Long.MAX_VALUE / 2);
        }
        for (int i = 0; i < k; i++) {
            long travelTime = Math.abs((long) start - requests[i][1]);
            dp[1 << i][i] = Math.max((long) requests[i][0], travelTime);
        }
        for (int mask = 1; mask < numStates; mask++) {
            for (int last = 0; last < k; last++) {
                if ((mask & (1 << last)) == 0 || dp[mask][last] == Long.MAX_VALUE / 2) {
                    continue;
                }
                long currTime = dp[mask][last];
                int currFloor = requests[last][1];
                for (int next = 0; next < k; next++) {
                    if ((mask & (1 << next)) == 0) {
                        int nextFloor = requests[next][1];
                        long travel = Math.abs((long) currFloor - nextFloor);
                        long reachTime = currTime + travel;
                        long fulfillTime = Math.max((long) requests[next][0], reachTime);
                        
                        int nextMask = mask | (1 << next);
                        if (fulfillTime < dp[nextMask][next]) {
                            dp[nextMask][next] = fulfillTime;
                        }
                    }
                }
            }
        }
        long ans = Long.MAX_VALUE;
        int fullMask = (1 << k) - 1;
        for (int i = 0; i < k; i++) {
            ans = Math.min(ans, dp[fullMask][i]);
        }
        return ans;
    }
}