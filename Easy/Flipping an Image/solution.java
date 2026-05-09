class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        for(int i=0;i<n;i++){
            int l=0,h=image[i].length-1;
            while(l<h){
                int temp = image[i][l];
                image[i][l] = image[i][h];
                image[i][h] = temp;
                if(image[i][l]==0) image[i][l] = 1;
                else image[i][l] = 0;
                if(image[i][h]==0) image[i][h] = 1;
                else image[i][h] = 0;
                l++;
                h--;
            }
            if(l==h){
                if(image[i][l]==0) image[i][l] = 1;
                else image[i][l] = 0;
            }
        }
        return image;
    }
}