class PrefixTree {
    private TreeSet<String> words;
    public PrefixTree() {
         words = new TreeSet<>();
    }

    public void insert(String word) {
        words.add(word);
    }

    public boolean search(String word) {
        return words.contains(word);
    }

    public boolean startsWith(String prefix) {
        String candidate = words.ceiling(prefix);
        return candidate != null && candidate.startsWith(prefix);
    }
}
