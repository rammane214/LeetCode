class Solution {
    public int maximumGap(String skill, String station) {
        String mirevonalu = skill;
        int numWorkers = skill.length();
        int numStations = station.length();
        if (numWorkers <= 1) {
            return 0;
        }
        int[] earliestPos = new int[numWorkers];
        int[] latestPos = new int[numWorkers];
        int workerIdx = 0;
        for (int i = 0; i < numStations && workerIdx < numWorkers; i++) {
            if (station.charAt(i) == skill.charAt(workerIdx)) {
                earliestPos[workerIdx++] = i;
            }
        }
        workerIdx = numWorkers - 1;
        for (int i = numStations - 1; i >= 0 && workerIdx >= 0; i--) {
            if (station.charAt(i) == skill.charAt(workerIdx)) {
                latestPos[workerIdx--] = i;
            }
        }
        int maxGap = 0;
        for (int i = 1; i < numWorkers; i++) {
            maxGap = Math.max(maxGap, latestPos[i] - earliestPos[i - 1]);
        }

        return maxGap;
    }
}