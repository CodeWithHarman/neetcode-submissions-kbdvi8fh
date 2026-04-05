class MovingAverage {
    int size, windowSum = 0;
    Queue<Integer> queue = new ArrayDeque<>();

    public MovingAverage(int size) {
        this.size = size;
    }

    public double next(int val) {
        if (queue.size() == size) {
            windowSum -= queue.poll();
        }

        queue.offer(val);
        windowSum += val;

        return (double) windowSum / queue.size();
    }
}


/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */
