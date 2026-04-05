class Solution {
    public int findLonelyPixel(char[][] picture) {
        int row = picture.length;
        int col = picture[0].length;
        int rowCount[] = new int[row];
        int colCount[] = new int[col];
        int result = 0;

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(picture[i][j] == 'B'){
                    rowCount[i]++;
                    colCount[j]++;
                }
            }
        }

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(picture[i][j] == 'B' && rowCount[i] == 1 && colCount[j] == 1){
                    result++;
                }
            }
        }
        return result;
    }
}
