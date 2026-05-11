// class Solution {
//     public int minimumDeletions(String s) {
//         int bCount = 0;  
//         int deletions = 0;

//         for (char c : s.toCharArray()) {
//             if (c == 'b') {
//                 bCount++;
//             } else {
//                 deletions = Math.min(deletions + 1, bCount);
//             }
//         }
//         return deletions;
//     }
// }

class Solution {
    public int minimumDeletions(String s) {
        int a=0,b=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='b'){
                b++;
                continue;
            }else if(s.charAt(i)=='a'){
                if(b>a){
                    a++;
                }
            }
        }
        return a;
    }
}