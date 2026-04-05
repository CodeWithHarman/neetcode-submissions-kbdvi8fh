class StringIterator {
    String compressedString;
    int ptr = 0, num = 0;
    char ch = ' ';
    public StringIterator(String compressedString) {
        this.compressedString = compressedString;
    }

    public char next() {
        if(!hasNext()) return ' ';
        
        if (num == 0) {
            ch = compressedString.charAt(ptr++);

            num = 0;
            while (ptr < compressedString.length() && Character.isDigit(compressedString.charAt(ptr))) {
                num = num * 10 + (compressedString.charAt(ptr) - '0');
                ptr++;
            }
        }

        num--;
        return ch;
    }
    
    public boolean hasNext() {
        return ptr != compressedString.length() || num != 0;
    }
}

/**
 * Your StringIterator object will be instantiated and called as such:
 * StringIterator obj = new StringIterator(compressedString);
 * char param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
