class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
        int minDistance = Integer.MAX_VALUE;
        int bestIndex = -1;

        for (int i = 0; i < drones.length; i++) {
            int dx = Math.abs(drones[i][0] - target[0]);
            int dy = Math.abs(drones[i][1] - target[1]);
            int dist = dx + dy;
            int range = drones[i][2];

            // Check if the drone can reach the target
            if (dist <= range) {
                // If this drone is strictly closer than any valid drone seen before
                if (dist < minDistance) {
                    minDistance = dist;
                    bestIndex = i;
                }
            }
        }

        return bestIndex;
    }
}