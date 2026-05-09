// class Solution {
//     public boolean canMeasureWater(int x, int y, int target) {
//         boolean valid = false;
//         int jug1 = 0;
//         int jug2 = 0;
//         if(x+y == target){
//             valid = true;
//         }else if(x+y<target){
//             valid = false;
//         }else{
//             jug2 = y;
//             if(jug2>x){
//                 jug1 = x;
//                 jug2 = jug2-jug1;
//             }else{
//                 jug1 = jug2;
//             }
//             jug1 = jug2;
//             jug2 = 0;
//             jug2 = y;
//             int temp = 0;
//             if(jug1<x){
//                 temp = jug2-jug1;
//                 temp = temp-jug1;
//                 jug1 = jug1 + temp;
//             }
//             jug2 = jug2 - temp;
//             if(jug1+jug2==target){
//                 valid = true;
//             }else if(jug2==target){
//                 valid = true;
//             }else{
//                 valid = false;
//             }
//         }
//         return valid;
//     }
// }

class Solution{
public int GCD(int a, int b){
    while(b != 0 ){
        int temp = b;
        b = a%b;
        a = temp;
    }
    return a;
}

public boolean canMeasureWater(int x, int y, int z) {
    if(x + y < z) return false;
    if( x == z || y == z || x + y == z ) return true;
    return z%GCD(x, y) == 0;
}
}