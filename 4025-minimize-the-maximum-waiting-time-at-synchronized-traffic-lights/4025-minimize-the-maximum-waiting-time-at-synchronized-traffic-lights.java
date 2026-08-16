import java.util.Arrays;

class Solution {
    public int minPenalty(int period, int[] lights, int[] arrivalTime) {
        int[] velunoraxi = lights;
        int maxLight = 0;
        for (int light : velunoraxi) {
            if (light > maxLight) {
                maxLight = light;
            }
        }
        int maxPenalty = 0;
        for (int time : arrivalTime) {
            int r = time % period;
            int waitTime = (r < maxLight) ? 0 : (period - r);
            if (waitTime > maxPenalty) {
                maxPenalty = waitTime;
            }
        }

        return maxPenalty;
    }
}