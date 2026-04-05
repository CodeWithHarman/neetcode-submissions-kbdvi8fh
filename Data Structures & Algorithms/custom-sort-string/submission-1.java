class Solution {
    public String customSortString(String order, String s) {
        Map<Character, Integer> freqMap = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()){
            freqMap.merge(ch, 1, Integer::sum);
        }

        for(char ch : order.toCharArray()){
            if(freqMap.containsKey(ch)){
                while(freqMap.get(ch) > 0){
                    sb.append(ch);
                    freqMap.put(ch, freqMap.get(ch)-1);
                }
            }
        }

        for(char ch : s.toCharArray()){
             if(freqMap.containsKey(ch)){
                while(freqMap.get(ch) > 0){
                    sb.append(ch);
                    freqMap.put(ch, freqMap.get(ch)-1);
                }
            }
        }
        return sb.toString();
    }
}