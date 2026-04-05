class Solution {
    public String stringShift(String s, int[][] shift) {
        LinkedList<Character> list = new LinkedList<>();

        for(char ch : s.toCharArray()){
            list.add(ch);
        }

        for(int[] move : shift){
            if(move[0] == 0){
                while(move[1] != 0){
                    char ch = list.removeFirst();
                    list.addLast(ch);
                    move[1]--;
                }
            }else{
                while(move[1] != 0){
                    char ch = list.removeLast();
                    list.addFirst(ch);
                    move[1]--;
                }
            }
        }

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<list.size(); i++){
            sb.append(list.get(i));
        }

        return sb.toString();
    }
}
