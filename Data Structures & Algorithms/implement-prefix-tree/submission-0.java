class PrefixTree {
    private List<String> list;
    public PrefixTree() {
         list = new ArrayList<>();
    }

    public void insert(String word) {
        list.add(word);
    }

    public boolean search(String word) {
        for(String str : list){
            if(str.equals(word)){
                return true;
            }
        }
        return false;
    }

    public boolean startsWith(String prefix) {
        for(String str : list){
            if(str.startsWith(prefix)){
                return true;
            }
        }
        return false;
    }
}
