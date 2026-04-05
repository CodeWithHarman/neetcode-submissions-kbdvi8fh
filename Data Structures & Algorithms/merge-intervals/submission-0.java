class Solution {

    public int[][] merge(int[][] intervals) {

        // Step 1: sort intervals by start time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> merged = new ArrayList<>();

        // Step 2: add first interval
        merged.add(intervals[0]);

        // Step 3: process remaining intervals
        for (int i = 1; i < intervals.length; i++) {

            int[] current = intervals[i];
            int[] lastMerged = merged.get(merged.size() - 1);

            int currentStart = current[0];
            int currentEnd = current[1];

            int lastMergedEnd = lastMerged[1];

            // overlap case
            if (currentStart <= lastMergedEnd) {
                lastMerged[1] = Math.max(lastMergedEnd, currentEnd);
            }
            // no overlap case
            else {
                merged.add(current);
            }
        }

        // Step 4: convert list to array
        return merged.toArray(new int[merged.size()][]);
    }
}

