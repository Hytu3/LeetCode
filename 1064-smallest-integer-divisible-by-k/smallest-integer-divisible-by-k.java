import java.math.BigInteger;

class Solution {
    public int smallestRepunitDivByK(int k) {
        // If k is divisible by 2 or 5 then it is impossible to have a number
        if (k % 2 == 0 || k % 5 == 0) return -1;

        // Convert n and k to both be big integers to properly do math
        BigInteger n = BigInteger.ONE;  
        
        BigInteger bigK = BigInteger.valueOf(k);

        // Keep adding a 1 everytime until number is divisible is found
        while (!n.mod(bigK).equals(BigInteger.ZERO)) 
        {
            // n = n * 10 + 1
            n = n.multiply(BigInteger.TEN).add(BigInteger.ONE);
        }

        // Smallest number that is found will be returned as its strings size
        return n.toString().length();
    }
}
