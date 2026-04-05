class Solution {

    public String encode(List<String> strs) {
        StringBuilder str = new StringBuilder();
        for(String s : strs){
            str.append(s.length()).append("#").append(s);
        }
        return str.toString();
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        int i=0;
        while(i < str.length()){
            int delimiterIndex = str.indexOf('#', i);
            int length = Integer.parseInt(str.substring(i, delimiterIndex));
            int startIndex = delimiterIndex + 1;
            String original = str.substring(startIndex, startIndex + length);
            list.add(original);
            i = startIndex + length;
        }
        return list;
    }
}
