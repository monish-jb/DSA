class RecentCounter {
    Queue<Integer> a;

    public RecentCounter() {
        a = new ArrayDeque<>();
    }

    public int ping(int t) {
        a.offer(t);

        while (a.peek() < t - 3000) {
            a.poll();
        }

        return a.size();
    }
}