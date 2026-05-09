// import java.math.BigInteger;
class Solution {
    public int trailingZeroes(int n) {
        // BigInteger cnt = new BigInteger("0");
        // int temp = n;
        // BigInteger fact = new BigInteger("1");
        // int rem = 0;
        // if(n==0){
        //     cnt = cnt.add(BigInteger.ZERO);
        // }
        // while(temp!=0){
        //     fact = fact.multiply(BigInteger.valueOf(temp));
        //     temp--;
        // }
        // while(!fact.equals(BigInteger.ZERO)){
        //     rem = fact.mod(BigInteger.TEN).intValue();
        //     if(rem == 0){
        //         cnt = cnt.add(BigInteger.ONE);
        //     }if(rem!=0){
        //         break;
        //     }
        //     fact = fact.divide(BigInteger.TEN);
        // }
        // System.out.print(cnt);
        // return cnt.intValueExact();
        int res = 0;
        int k=5;
        while(k<=n){
            res+=n/k;
            k=k*5;
        }
        return res;
    }
}