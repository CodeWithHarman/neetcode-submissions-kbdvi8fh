class Solution {
    public int maxSumDistinctTriplet(int[] x, int[] y) {
        Map<Integer, Integer> bestYForX = new HashMap<>();

        // For each distinct x, keep the maximum y
        for (int i = 0; i < x.length; i++) {
            bestYForX.put(x[i], Math.max(bestYForX.getOrDefault(x[i], Integer.MIN_VALUE), y[i]));
        }

        // If fewer than 3 distinct x-values exist, no valid triplet
        if (bestYForX.size() < 3) return -1;

        // Collect best y-values
        List<Integer> bestYs = new ArrayList<>(bestYForX.values());

        // Sort descending
        bestYs.sort(Collections.reverseOrder());

        // Sum top 3
        return bestYs.get(0) + bestYs.get(1) + bestYs.get(2);
    }
}

