class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || numRows >= s.length()) return s;

        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }
        int currRow = 0;
        boolean goingDown = false;

        for (char c : s.toCharArray()) {
            rows[currRow].append(c);
            if (currRow == 0 || currRow == numRows - 1) {
                goingDown = !goingDown;
            }
            currRow += goingDown ? 1 : -1;
        }

        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }
}





/*
class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1 || numRows >= s.length()) return s;
        int len = s.length();
        int col=0;
        while(len>0){
            len = len - numRows;
            col++;
            int temp = numRows-2;
            while(temp!=0 && len>=0){
                col++;
                len--;
                temp--;
            }
        }
        String [][] mat = new String[numRows][col];
        String [] strArr = s.split("");
        len = s.length();
        int i=0,j=0,k=0;
        while(k<strArr.length){
            int temp = numRows;
            while(temp>0 && k<strArr.length){
                mat[i][j] = strArr[k++];
                i++;
                temp--;
            }
            i=0;
            j++;
            int temp2 = numRows-2;
            i=numRows-2;
            while(temp2!=0 && k<strArr.length){
                mat[i][j] = strArr[k++];
                j++;
                i--;
                temp2--;
            }
        }
        
        s = "";
        for(int l=0;l<mat.length;l++){
            for(int m=0;m<mat[l].length;m++){
                if(mat[l][m] != null ) s = s+mat[l][m];
            }
        }
        return s;
    }
}
*/