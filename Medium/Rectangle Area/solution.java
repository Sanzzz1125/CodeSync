// class Solution {
//     public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
//         int AREA = 0;
//         int area1 = (ax2-ax1) * (ay2-ay1);
//         int area2 = (bx2-bx1) * (by2-by1);
//         int y1 = Math.min(ay1,by1);
//         int x1 = Math.min(ax1,bx1);

//         int y2 = Math.max(ay2,by2);
//         int x2 = Math.max(ax2,bx2);
//         AREA = Math.max(0, (y2-y1) * (x2-x1));
//         return area1 + area2 - AREA;
//     }
// }

class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        //     int A1 = (ax2 - ax1)*(ay2 - ay1);
        //     int A2 = (bx2 - bx1)*(by2 - by1);

        //     int overlapLength = max(0, min(ax2, bx2) - max(ax1, bx1));
        //     int overlapBreadth = max(0, min(ay2, by2) - max(ay1, by1));

        //     int overlap = overlapLength * overlapBreadth;

        //     return A1 + A2 - overlap;
        // }
        // public int max(int a, int b){
        //     return a>b? a: b;
        // }
        // public int min(int a, int b){
        //     return a<b? a: b;

        int area = ((ax2 - ax1) * (ay2 - ay1)) + ((bx2 - bx1) * (by2 - by1));
        int l = Math.min(ax2, bx2) - Math.max(ax1, bx1);
        int b = Math.min(ay2, by2) - Math.max(ay1, by1);
        int merge = 0;
        if (l > 0 && b > 0) {
            merge = l * b;
        }
        return area - merge;
    }
}